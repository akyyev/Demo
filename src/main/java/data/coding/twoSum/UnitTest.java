package data.coding.twoSum;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTest {

    @Test
    void test1() {
        var result = TwoSumTarget.getTwoSumTarget(new int[]{1,3,5,7,9}, 10);
        Assert.assertEquals(result, new int[]{0, 4});
    }


    @Test
    void test2() {
        var result = TwoSumTarget.getTwoSumTarget(new int[]{1,3,5,7,9}, 4);
        Assert.assertEquals(result, new int[]{0, 1});
    }


    @Test
    void test3() {
        var result = TwoSumTarget.getTwoSumTarget(new int[]{1,3,5,7,9}, 2);
        Assert.assertEquals(result, new int[]{0, 0});
    }


    @Test
    void test4() {
        var result = TwoSumTarget.getTwoSumTarget(new int[]{1,3,5,7,9}, 18);
        Assert.assertEquals(result, new int[]{4, 4});
    }


    @Test(expectedExceptions = RuntimeException.class,
            expectedExceptionsMessageRegExp = "Sum of two numbers will never be target number!")
    void test5() {
        TwoSumTarget.getTwoSumTarget(new int[]{1,3,5,7,9,10}, 21);
    }


    @Test(expectedExceptions = RuntimeException.class,
            expectedExceptionsMessageRegExp = "Sum of two numbers will never be target number!")
    void test6() {
        TwoSumTarget.getTwoSumTarget(new int[]{2,4,6,8,10}, 5);
    }

    @Test
    void test7() {
        var result = TwoSumTarget.getTwoSumTarget(new int[]{1,3,5,7,9,11,13,8,23}, 24);
        Assert.assertEquals(result, new int[]{0, 8});
    }

}

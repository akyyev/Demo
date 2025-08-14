package com.demo.Interview_Questions;

public class CreditCartValidator {
    
    public boolean isValid(String cardNumber) {
        if (cardNumber == null || cardNumber.length() < 13 || cardNumber.length() > 19) {
            return false; // Invalid length
        }

        int sum = 0;
        boolean alternate = false;

        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            char c = cardNumber.charAt(i);
            if (!Character.isDigit(c)) {
                return false; // Non-digit character found
            }

            int digit = c - '0';

            if (alternate) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9; // Subtract 9 if the result is greater than 9
                }
            }

            sum += digit;
            alternate = !alternate; // Toggle the alternate flag
        }

        return sum % 10 == 0; // Valid if the sum is a multiple of 10
    }
}


class CreditCartTest {
    public static void main(String[] args) {
        CreditCartValidator validator = new CreditCartValidator();
        System.out.println(validator.isValid("123456789012345")); // Invalid
        System.out.println(validator.isValid("12345678901234567")); // Invalid
        System.out.println(validator.isValid("1234567890123456789")); // Invalid
        System.out.println(validator.isValid("1234567890123456")); // Invalid
        System.out.println(validator.isValid("4539148803436467")); // Valid
        System.out.println(validator.isValid("6011111111111000")); // Valid
    }
}

package data.javaconcepts;

import lombok.Data;

public class CourseNotifier {
    
    public static void main(String[] args) {
        final Course course = new Course("Multithreded Programming");

        new Thread( () ->  {

            synchronized(course) {
                System.out.println(Thread.currentThread().getName() + " is waiting for the course: " + course.getTitle());
                try {
                    course.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " the course: " + course.getTitle() + " is now completed");
                course.notify();
            }

        }, "Student 1:").start();

        new Thread( () ->  {
            synchronized(course) {
                System.out.println(Thread.currentThread().getName() + " is waiting for the course: " + course.getTitle());
                try {
                    course.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " the course: " + course.getTitle() + " is now completed");
                course.notify();
            }

        }, "Student 2:").start();

        new Thread( () ->  {
            synchronized(course) {
                System.out.println(Thread.currentThread().getName() + " is starting preparing " + course.getTitle());

                try {
                    Thread.sleep(4000);
                    course.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " the course: " + course.getTitle() + " is now published");
            }

        }, "Instructer 3:").start();
    }

}

@Data
class Course {
    private String title;
    private String completed;

    public Course(String title) {
        this.title = title;
    }
}
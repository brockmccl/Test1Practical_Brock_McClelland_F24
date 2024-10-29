package PracticalTest;

import java.util.Scanner;
public class App {
    private int currentIndex = 0;
    private Course[] courseList = new Course[100];
    private Scanner input = new Scanner(System.in);
    private String menu = ""
            + "----------------\n"
            + " 1. Add a Course\n"
            + " 2. Edit a Course\n"
            + " 3. List Courses\n";

    public void run(){
        while(true) {
            printMenu();

            int choice = input.nextInt();

            if (choice == 1) {
                Course newCourse = addCourse();
                courseList[currentIndex] = newCourse;
                currentIndex += 1;
            } else if (choice == 2) {
                editCourse();
            }
            else if(choice == 3){
                listCourses();
            }
        }
    }

    public void printMenu(){
        System.out.println(menu);
    }

    public Course addCourse(){
        input.nextLine();
        System.out.println("Enter Course Name: ");
        String name = input.nextLine();
        System.out.println("Enter Course Code: ");
        String code = input.nextLine();
        System.out.println("Enter Course Start Date (ex. 01/09/2024): ");
        String date = input.nextLine();
        System.out.println("Enter Number of Students in Course: ");
        int numofstudents = input.nextInt();

        Course newCourse = new Course(name, code, date, numofstudents);

        return newCourse;

    }
    public void editCourse(){
        listCourses();
        System.out.println("Which Course Would You Like To Edit?");
        int index = input.nextInt() - 1;

        Course edited = addCourse();

        courseList[index] = edited;

    }

    public void listCourses(){
        for(int i = 0; i < courseList.length; i++){
            if(courseList[i] != null) {
                System.out.println((i + 1) + ". " + courseList[i].toString());
            }
        }
    }
}

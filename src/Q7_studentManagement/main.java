package studentManagementSystem;

import java.util.*;
class Student{
    private int sroll;
    private String sname;


    private int grades;

    private float average;


    public Student(int sroll, String sname, String subject, int grades) {
        this.sroll = sroll;
        this.sname = sname;
        this.subject = subject;
        this.grades = grades;
    }


    public int getSroll(){
        return sroll;
    }
    public String getEname(){
        return sname;
    }
    public String getSubject(){
        return subject;
    }

    public float getAverage() {
        return average;
    }

    public int getGrades(){
        return grades;
    }


    @Override
    public String toString() {
        return "Student{" +
                "sroll=" + sroll +
                ", sname='" + sname + '\'' +
                ", subject='" + subject + '\'' +
                ", grades=" + grades +
                ", average=" + average +
                '}';
    }
}

    class intrface {
        public static void main(String[] args) {
            Collection<Student> c =new ArrayList<Student>();
            Scanner scn = new Scanner(System.in);
            Scanner scn1 = new Scanner(System.in);
            int ch;
            do {
                System.out.println("1. Add Student");
                System.out.println("2. Display");
                System.out.println("3. Search");
                System.out.println("4. Delete");
                System.out.println("5. Update");
                System.out.println("6. Calculate Average: ");
                System.out.println("Enter your choice: ");
                 ch = scn.nextInt();

                switch (ch){
                    case 1:
                        System.out.println("Enter the Student Roll No: ");
                        int sroll = scn.nextInt();
                        System.out.println("Enter the Student Name: ");
                        String sname = scn1.nextLine();
                        System.out.println("Enter the Subjects: ");
                        String subject=scn1.nextLine();
                        System.out.println("Enter the Subjects: ");
                        int grades =scn1.nextInt();
                        c.add(new Student(sroll, sname, subject, grades));
                        break;

                    case 2:
                        System.out.println("-----------------------------------");
                        Iterator<Student> i = c.iterator();
                        while (i.hasNext()){
                            Student s1=i.next();
                            System.out.println(s1);
                        }
                        System.out.println("-----------------------------------");
                        break;

                    case 3:
                        boolean found = false;
                        System.out.println("Enter Student Roll no to Search: ");
                         int Sroll = scn.nextInt();
                        System.out.println("-----------------------------------");
                        i = c.iterator();
                        while (i.hasNext()){
                            Student s1=i.next();
                            if(s1.getSroll() == Sroll){
                                System.out.println(s1);
                                found = true;
                            }
                        }
                        if(!found){
                            System.out.println("Record not found");
                        }
                        System.out.println("-----------------------------------");
                        break;

                    case 4:
                        found = false;
                        System.out.println("Enter Student Roll no to Delete: ");
                        Sroll = scn.nextInt();
                        System.out.println("-----------------------------------");
                        i = c.iterator();
                        while (i.hasNext()){
                            Student s1=i.next();
                            if(s1.getSroll() == Sroll){
                                i.remove();
                                found = true;
                            }
                        }
                        if(!found){
                            System.out.println("Record Not Found");
                        }else {
                            System.out.println("Record is Deleted Successfully...!");
                        }
                        System.out.println("-----------------------------------");
                        break;

                    case 5:
                        found = false;
                        System.out.println("Enter Student Roll no to Update: ");
                        Sroll = scn.nextInt();
                        System.out.println("-----------------------------------");
                        ListIterator<Student> li = ((ArrayList<Student>) c).listIterator();
                        i = c.iterator();
                        while (li.hasNext()){
                            Student s1=i.next();
                            if(s1.getSroll() == Sroll){
                                System.out.println("Enter the new roll No.");
                                sroll= scn.nextInt();
                                System.out.println("Enter new Name: ");
                                sname =scn1.nextLine();
                                System.out.println("Enter new Subject: ");
                                subject = scn1.nextLine();
                                System.out.println("Enter new Grades: ");
                                grades = scn.nextInt();
                                li.set(new Student(sroll, sname, subject, grades));
                                found = true;
                            }
                        }
                        if(!found){
                            System.out.println("Record Not Found");
                        }else {
                            System.out.println("Record is Updated Successfully...!");
                        }
                        System.out.println("-----------------------------------");
                        break;
                    case 6:

                }

            }while (ch!=0);
        }
    }

    import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks[] = new int[5];
        int sum = 0;
        float average;

        System.out.println("Enter the marks of 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i+1) + ": ");
            marks[i] = input.nextInt();
            sum += marks[i];
        }

        average = (float) sum / 5;

        System.out.println("The average marks is " + average);
    }
}

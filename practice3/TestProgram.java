package practice3;

import java.util.HashSet;
import java.util.Scanner;

public class TestProgram {

	public static void main(String[] args) {
		HashSet<Person> people = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		while(true) {
            System.out.println("1 - Add Student");
            System.out.println("2 - Add Staff");
            System.out.println("3 - Show all");
            System.out.println("4 - Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice==1) {
            	System.out.println("Name ");
            	String name = sc.nextLine();
            	
            	System.out.print("Address: ");
            	String address = sc.nextLine();
            	
                System.out.print("Program: ");
                String program = sc.nextLine();
                
                System.out.print("Year: ");
                int year = sc.nextInt();
                
                System.out.print("Fee: ");
                double fee = sc.nextDouble();
                
                people.add(new Student(name,address,program,year,fee));
            }
            else if(choice==2) {
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Address: ");
                String address = sc.nextLine();

                System.out.print("School: ");
                String school = sc.nextLine();

                System.out.print("Pay: ");
                double pay = sc.nextDouble();
                
                people.add(new Staff(name,address,school,pay));
          
            }
            else if(choice==3) {
            	for(Person p:people) {
            		System.out.println(p);
            	}
            }
            else {
            	break;
            }
            
		}

	}

}

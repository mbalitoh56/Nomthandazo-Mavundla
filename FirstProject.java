/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstproject;

/**
 *
 * @author Lenovo
 */
public class FirstProject {
    
     public static void main(String[] args) {
     String Fname = "Nomthandazo";
     String Sname = "Mavundla";
     Integer Snumber = 222890657;
     String school= "CPUT";
     String course = "PostGrad Diploma in ICT";
     Integer age = 25; 
    
     System.out.println("   Student Information   "+'\n'+'\n'+"NAME: "+Fname+'\n'+"SURNAME: "+Sname+'\n'+"AGE: "+age+"STUDENT NO: "+Snumber+'\n'+"SCHOOL: "+school+'\n'+"COURSE: "+course+'\n');
     
    Scanner scanner = new Scanner(System.in);
        System.out.println("    SIMPLE CALCULATOR   "+'\n');
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return;
        }
        System.out.println("The result is: " + result);
    }
    }
   

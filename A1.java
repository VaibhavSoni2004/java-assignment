
Assignment 1
1. Write a Java program to change temperature from Celsius to Fahrenheit and vice versa. 
import java.util.Scanner;
public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in celsius: ");
        int  temp = sc.nextInt();
        double fahrenheit = (temp * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } 
}
output-Enter temperature in Celsius: 25
       Enter temperature in Fahrenheit: 77

2. Write a Java Program to check if a number is Positive or Negative. 
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (num > 0) {
            System.out.println("The number is Positive.");
        } else if (num < 0) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }
    }
}
output-Temperature in Fahrenheit: 77.0
       Temperature in Celsius: 25.0


3. Write a Java program to find maximum of three numbers. 
    import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        int max = Math.max(num1, Math.max(num2, num3));
        System.out.println("The maximum number is: " + max);
    }
}
4. Write a Java program to swap two numbers. 
    import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        // Swapping without a temporary variable
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        
        System.out.println("After swapping: ");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
    }
}

5. Write a Java program to convert miles to kilometers. 
    import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter distance in miles: ");
        double miles = sc.nextDouble();
        
        double kilometers = miles * 1.60934;
        System.out.println("Distance in kilometers: " + kilometers);
    }
}
6. Write a Java program to check whether a year is leap year or not. 
    import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
7. Write a Java program for following grading system. Note:   
Percentage>=90%  : Grade A  
Percentage>=80% : Grade B 
Percentage>=70% : Grade C  
Percentage>=60% : Grade D  
Percentage>=40% : Grade E 
Percentage<40% : Grade F .
    
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter percentage: ");
        double percentage = sc.nextDouble();
        
        if (percentage >= 90) {
            System.out.println("Grade A");
        } else if (percentage >= 80) {
            System.out.println("Grade B");
        } else if (percentage >= 70) {
            System.out.println("Grade C");
        } else if (percentage >= 60) {
            System.out.println("Grade D");
        } else if (percentage >= 40) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
        }
    }
}
8. Write a Java program to check whether a number is divisible by a number given by user.
    
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        if (num1 % num2 == 0) {
            System.out.println(num1 + " is divisible by " + num2);
        } else {
            System.out.println(num1 + " is not divisible by " + num2);
        }
    }
}
9. Write a Java program to calculate factorial of 12. 
10. Write a Java program for Fibonacci series. 
11. Write a Java program to reverse a number. 
12. Admission to a professional course is subject to the following conditions: 
(a) marks in Mathematics >= 60 
(b) marks in Physics >=50 
(c) marks in Chemistry >=40 
(d) Total in all 3 subjects >=200 
(Or) Total in Maths & Physics>=150 Given the marks in the 3 subjects of n (user input) 
students, write a program to process the applications to list the eligible candidates. 
13. Write a Java program to calculate the sum of natural numbers up to a certain range. 
14. Write a Java program to print all multiple of 10 between a given interval. 
15. Write a Java program to generate multiplication table. 
16. Write a Java program to find HCF of two Numbers. 
17. Write a Java program to find LCM of two Numbers. 
18. Write a Java program to count the number of digits of an integer 
19. Write a Java program to check whether a number is palindrome or not. 
20. Write a Java program to check whether a number is prime or not. 
21. Write a Java program to convert a Binary Number to Decimal and Decimal to Binary. 
22. Write a Java program to find median of a set of numbers. 
23. Write Java programs for the patterns given bellow: 
(a) 1     
2 3 4 
        5 6 7 8 9 
(b)      1 
         2 1 2 
      3 2 1 2 3 
4 3 2 1 2 3 4 
24. Write a Java program to calculate Sum & Average of an integer array. 
25. Write a Java program to implement stack using array. 
26. Write a Java program to implement Queue using array. 
27. Write a Java program to enter n elements in an array and find smallest number among 
them. 
28. Write Java program to find the sum of all odd numbers in a array.  
29. Write a Java program to find duplicate elements in a 1D array and find their frequency of 
occurrence. 
30. Write a Java program to print every alternate number of a given array 
31. Write a Java program to show 0-arguments constructor. 
32. Write a Java program to show parameterized constructor. 
33. Write a class, Commission, which has an instance variable, sales; an appropriate 
constructor; and a method, commission() that returns the commission.Now write a demo class 
to test the Commission class by reading a sale from the user, using it to create a Commission 
object after validating that the value is not negative. Finally, call the commission() method to 
get and print the commission. If the sales are negative, your demo should print the message 
“Invalid Input”. 
 
 
 
 
 
 
 
 
 






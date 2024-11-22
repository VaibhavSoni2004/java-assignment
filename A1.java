
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

  OUTPUT- Enter temperature in Celsius: 25
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

  OUTPUT- Enter a number: -5
          The number is Negative

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

  OUTPUT- Enter first number: 10
          Enter second number: 20
          Enter third number: 5
          The maximum number is: 20

4. Write a Java program to swap two numbers. 
    
   import java.util.Scanner;

   public class A1 {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        
          System.out.print("Enter first number: ");
          int num1 = sc.nextInt();
          System.out.print("Enter second number: ");
          int num2 = sc.nextInt();
        
    
          num1 = num1 + num2;
          num2 = num1 - num2;
          num1 = num1 - num2;
        
          System.out.println("After swapping: ");
          System.out.println("First number: " + num1);
          System.out.println("Second number: " + num2);
      }
    }

  OUTPUT- Enter first number: 5
          Enter second number: 10
          Before swapping: a = 5, b = 10
          After swapping: a = 10, b = 5

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

  OUTPUT- Enter distance in miles: 5
          Distance in kilometers: 8.0467

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

  OUTPUT- Enter a year: 2024
          2024 is a leap year.

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

  OUTPUT- Enter your percentage: 85
          Grade: B

8. Write a Java program to check whether a number is divisible by a number given by user.
    
   import java.util.Scanner;

   class A1 {
         public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter the number to check divisibility:");
         int num1 = scanner.nextInt();

         System.out.println("Enter the divisor:");
         int num2 = scanner.nextInt();

         if (num1 % num2 == 0) {
             System.out.println(num1 + " is divisible by " + num2);
         } else {
             System.out.println(num1 + " is not divisible by " + num2);
         }

         scanner.close();
        }
    }

    OUTPUT- Enter the number: 20
            Enter the divisor: 4
            20 is divisible by 4

9. Write a Java program to calculate factorial of 12. 
    
   class A1 {
       public static void main(String[] args) {
           int num = 12;
           long factorial = 1;

           for (int i = 1; i <= num; i++) {
               factorial *= i;
           }

           System.out.println("Factorial of 12 is: " + factorial);
       }
   }

   OUTPUT- The factorial of 12 is: 479001600
    
10. Write a Java program for Fibonacci series. 

    class A1 {
    public static void main(String[] args) {
        int n = 10;  
        int a = 0, b = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            }
        }
    }

    OUTPUT- Enter the number of terms: 6
            Fibonacci Series: 0 1 1 2 3 5


11. Write a Java program to reverse a number. 

    import java.util.Scanner;

    class A1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a number to reverse:");
            int num = scanner.nextInt();
            int reversed = 0;

            while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
            }

            System.out.println("Reversed number: " + reversed);

            scanner.close();
        }
   }

   OUTPUT- Enter a number: 12345
           Reversed number: 54321


12. Admission to a professional course is subject to the following conditions: 
    (a) marks in Mathematics >= 60 
    (b) marks in Physics >=50 
    (c) marks in Chemistry >=40 
    (d) Total in all 3 subjects >=200 
    (Or) Total in Maths & Physics>=150 Given the marks in the 3 subjects of n (user input) 
    students, write a program to process the applications to list the eligible candidates. 

    import java.util.Scanner;

    class A1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the number of students:");
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println("Enter marks for student " + (i+1));
                System.out.print("Mathematics: ");
                int math = scanner.nextInt();
                System.out.print("Physics: ");
                int physics = scanner.nextInt();
                System.out.print("Chemistry: ");
                int chemistry = scanner.nextInt();

                int total = math + physics + chemistry;

                if ((math >= 60 && physics >= 50 && chemistry >= 40 && total >= 200) || (math + physics >= 150)) {
                    System.out.println("Student " + (i+1) + " is eligible for admission.");
                } else {
                    System.out.println("Student " + (i+1) + " is not eligible for admission.");
                }
            }

            scanner.close();
        }
    }

    OUTPUT- Enter marks in Mathematics: 65
            Enter marks in Physics: 60
            Enter marks in Chemistry: 55
            Total marks in all subjects: 180
            The candidate is eligible for admission.

13. Write a Java program to calculate the sum of natural numbers up to a certain range. 

    import java.util.Scanner;

    class A1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a number:");
            int n = scanner.nextInt();
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println("Sum of natural numbers up to " + n + " is: " + sum);

            scanner.close();
        }
    }

    OUTPUT- Enter the range: 5
            Sum of natural numbers up to 5: 15

14. Write a Java program to print all multiple of 10 between a given interval. 

    import java.util.Scanner;

    class A1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the starting number:");
            int start = scanner.nextInt();
            System.out.println("Enter the ending number:");
            int end = scanner.nextInt();

            System.out.println("Multiples of 10 between " + start + " and " + end + " are:");
            for (int i = start; i <= end; i++) {
                if (i % 10 == 0) {
                    System.out.println(i);
            }

            scanner.close();
        }
    }
    OUTPUT- Enter lower bound: 10
            Enter upper bound: 50
            Multiples of 10 between 10 and 50 are: 10 20 30 40 50

15. Write a Java program to generate multiplication table. 

    import java.util.Scanner;

    class A1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
 
            System.out.println("Enter a number to generate multiplication table:");
            int num = scanner.nextInt();

            System.out.println("Multiplication table for " + num + " is:");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }

            scanner.close();
        }
  }

  OUTPUT- Enter a number for multiplication table: 5
          Multiplication Table of 5:
          5 x 1 = 5
          5 x 2 = 10
          5 x 3 = 15
          5 x 4 = 20
          5 x 5 = 25
          5 x 6 = 30
          5 x 7 = 35
          5 x 8 = 40
          5 x 9 = 45
          5 x 10 = 50

16. Write a Java program to find HCF of two Numbers. 

    import java.util.Scanner;

    class A1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter two numbers:");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            int hcf = 1;
            int min = Math.min(num1, num2);

            for (int i = 1; i <= min; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    hcf = i;
                }
            }

            System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);

             scanner.close();
        }
  }

  OUTPUT- Enter first number: 12
          Enter second number: 18
          The HCF of 12 and 18 is: 6


17. Write a Java program to find LCM of two Numbers. 

    import java.util.Scanner;
 
    class A1 {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Enter two numbers:");
          int num1 = scanner.nextInt();
          int num2 = scanner.nextInt();

          int max = Math.max(num1, num2);
          int lcm = max;

          while (lcm % num1 != 0 || lcm % num2 != 0) {
              lcm += max;
          }

          System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

          scanner.close();
      }
  }

  OUTPUT- Enter first number: 12
          Enter second number: 18
          The LCM of 12 and 18 is: 36


18. Write a Java program to count the number of digits of an integer 

    import java.util.Scanner;

    class A1 {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

           System.out.println("Enter a number:");
           int num = scanner.nextInt();
          int count = 0;

           while (num != 0) {
               num /= 10;
               count++;
           }

           System.out.println("The number of digits is: " + count);

           scanner.close();
       }
   }

    OUTPUT- Enter an integer: 12345
            The number of digits in 12345 is: 5


19. Write a Java program to check whether a number is palindrome or not. 

    import java.util.Scanner;

    class A1 {
        public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

           System.out.println("Enter a number:");
           int num = scanner.nextInt();
           int originalNum = num;
           int reversed = 0;

           while (num != 0) {
              int digit = num % 10;
              reversed = reversed * 10 + digit;
              num /= 10;
           } 

           if (originalNum == reversed) {
              System.out.println(originalNum + " is a palindrome.");
          } else {
              System.out.println(originalNum + " is not a palindrome.");
          }

          scanner.close();
      }
   }

   OUTPUT- Enter a number: 121
           The number 121 is a palindrome.


20. Write a Java program to check whether a number is prime or not. 

    import java.util.Scanner;

    class A1 {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

           System.out.println("Enter a number:");
           int num = scanner.nextInt();
           boolean isPrime = true;

           for (int i = 2; i <= num / 2; i++) {
               if (num % i == 0) {
                   isPrime = false;
                   break;
               }
           }

           if (isPrime && num > 1) {
               System.out.println(num + " is a prime number.");
           } else {
               System.out.println(num + " is not a prime number.");
           }

           scanner.close();
       }
   }

   OUTPUT- Enter a number: 29
           The number 29 is prime.

21. Write a Java program to convert a Binary Number to Decimal and Decimal to Binary. 

    import java.util.Scanner;

    class A1 {
       public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Enter 1 to convert Binary to Decimal or 2 for Decimal to Binary:");
          int choice = scanner.nextInt();

          if (choice == 1) {
              System.out.println("Enter a binary number:");
              String binary = scanner.next();
              int decimal = Integer.parseInt(binary, 2);
              System.out.println("Decimal equivalent: " + decimal);
          } else if (choice == 2) {
              System.out.println("Enter a decimal number:");
              int decimal = scanner.nextInt();
              String binary = Integer.toBinaryString(decimal);
              System.out.println("Binary equivalent: " + binary);
          } else {
              System.out.println("Invalid choice.");
          }

          scanner.close();
      }
   }

    OUTPUT- Enter a binary number: 1011
            The decimal equivalent of binary 1011 is: 11

            Enter a decimal number: 11
            The binary equivalent of decimal 11 is: 1011


22. Write a Java program to find median of a set of numbers. 

    import java.util.Arrays;
    import java.util.Scanner;

    class A1 {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

           System.out.println("Enter the number of elements:");
           int n = scanner.nextInt();
           int[] numbers = new int[n];

           System.out.println("Enter the numbers:");
           for (int i = 0; i < n; i++) {
               numbers[i] = scanner.nextInt();
           }

           Arrays.sort(numbers);

           double median;
           if (n % 2 == 0) {
               median = (numbers[n / 2 - 1] + numbers[n / 2]) / 2.0;
           } else {
               median = numbers[n / 2];
           }

           System.out.println("The median is: " + median);

           scanner.close();
       }
   }  

   OUTPUT- Enter the number of elements: 5
           Enter the elements: 3 5 7 9 11
           The median is: 7

23. Write Java programs for the patterns given bellow: 
(a) 1     
    2 3 4 
    5 6 7 8 9 
    
      class A1 {
      public static void main(String[] args) {
          int num = 1;

          for (int i = 1; i <= 3; i++) {
              for (int j = 1; j <= (2 * i - 1); j++) {
                  System.out.print(num + " ");
                  num++;
              }
              System.out.println();
           }
      }
  }

(b) 1 
    2 1 2 
    3 2 1 2 3 
    4 3 2 1 2 3 4 

      class A1 {
      public static void main(String[] args) {
          int n = 4; 

          for (int i = 1; i <= n; i++) {
            
             for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
              }
              
              for (int j = i; j >= 1; j--) {
                  System.out.print(j + " ");
              }
              for (int j = 2; j <= i; j++) {
                  System.out.print(j + " ");
              }

              System.out.println();
          }
      }
  }

    
24. Write a Java program to calculate Sum & Average of an integer array. 

    import java.util.Scanner;

    class A1 {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

           System.out.println("Enter the number of elements in the array:");
           int n = scanner.nextInt();
           int[] numbers = new int[n];

           System.out.println("Enter the elements of the array:");
           int sum = 0;
           for (int i = 0; i < n; i++) {
               numbers[i] = scanner.nextInt();
               sum += numbers[i];
           }

           double average = (double) sum / n;

           System.out.println("Sum of the array elements: " + sum);
           System.out.println("Average of the array elements: " + average);

           scanner.close();
       }
   }

   OUTPUT- Enter the number of elements in the array:
           5
           Enter the elements of the array:
           10 20 30 40 50
           Sum of the array elements: 150
           Average of the array elements: 30.0

25. Write a Java program to implement stack using array. 

    import java.util.Scanner;

    class A1 {
      static int top = -1;
      static int maxSize = 5;
      static int[] stack = new int[maxSize];

      public static void push(int x) {
          if (top == maxSize - 1) {
              System.out.println("Stack Overflow");
          } else {
              stack[++top] = x;
              System.out.println(x + " pushed into stack");
          }
      }

      public static void pop() {
          if (top == -1) {
              System.out.println("Stack Underflow");
          } else {
              System.out.println(stack[top--] + " popped from stack");
          }
      }

      public static void peek() {
          if (top == -1) {
              System.out.println("Stack is empty");
          } else {
              System.out.println("Top element is: " + stack[top]);
          }
      }

      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Stack Operations:");
          System.out.println("1. Push");
          System.out.println("2. Pop");
          System.out.println("3. Peek");

          while (true) {
              System.out.println("Enter your choice (1/2/3):");
              int choice = scanner.nextInt();
            
              if (choice == 1) {
                  System.out.println("Enter number to push:");
                  int num = scanner.nextInt();
                  push(num);
              } else if (choice == 2) {
                  pop();
              } else if (choice == 3) {
                  peek();
              } else {
                  System.out.println("Invalid choice");
              }
          }
      }
   }

   OUTPUT- Stack Operations:
           1. Push
           2. Pop
           3. Peek
           Enter your choice (1/2/3):
           1
           Enter number to push:
           10
           10 pushed into stack
           Enter your choice (1/2/3):
           1
           Enter number to push:
           20
           20 pushed into stack
           Enter your choice (1/2/3):
           3
           Top element is: 20
           Enter your choice (1/2/3):
           2
           20 popped from stack


26. Write a Java program to implement Queue using array. 

    import java.util.Scanner;

    class A1 {
      static int front = -1, rear = -1;
      static int maxSize = 5;
      static int[] queue = new int[maxSize];

      public static void enqueue(int x) {
          if (rear == maxSize - 1) {
              System.out.println("Queue Overflow");
          } else {
              if (front == -1) {
                  front = 0;
              }
              queue[++rear] = x;
              System.out.println(x + " enqueued into queue");
          }
      }

      public static void dequeue() {
          if (front == -1) {
               System.out.println("Queue Underflow");
          } else {
              System.out.println(queue[front++] + " dequeued from queue");
              if (front > rear) {
                  front = rear = -1;
              }
          }
      }

      public static void peek() {
          if (front == -1) {
              System.out.println("Queue is empty");
          } else {
              System.out.println("Front element is: " + queue[front]);
        }
      }

      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Queue Operations:");
          System.out.println("1. Enqueue");
          System.out.println("2. Dequeue");
          System.out.println("3. Peek");

          while (true) {
              System.out.println("Enter your choice (1/2/3):");
              int choice = scanner.nextInt();
            
              if (choice == 1) {
                  System.out.println("Enter number to enqueue:");
                  int num = scanner.nextInt();
                  enqueue(num);
              } else if (choice == 2) {
                  dequeue();
              } else if (choice == 3) {
                  peek();
              } else {
                  System.out.println("Invalid choice");
              }
          }
      }
   }

   OUYPUT- Queue Operations:
          1. Enqueue
          2. Dequeue
          3. Peek
          Enter your choice (1/2/3):
          1
          Enter number to enqueue:
          10
          10 enqueued into queue
          Enter your choice (1/2/3):
          1
          Enter number to enqueue:
          20
          20 enqueued into queue
          Enter your choice (1/2/3):
          3
          Front element is: 10
          Enter your choice (1/2/3):
          2
          10 dequeued from queue


27. Write a Java program to enter n elements in an array and find smallest number among them.

    
    import java.util.Scanner;

    class A1 {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Enter the number of elements:");
          int n = scanner.nextInt();
          int[] numbers = new int[n];

          System.out.println("Enter the elements:");
          for (int i = 0; i < n; i++) {
              numbers[i] = scanner.nextInt();
          }
 
          int min = numbers[0];
          for (int i = 1; i < n; i++) {
              if (numbers[i] < min) {
                  min = numbers[i];
              }
          }  

          System.out.println("Smallest number in the array: " + min);

          scanner.close();
      }
   }

   OUTPUT- Enter the number of elements:
           5
           Enter the elements:
           50 10 20 30 40
           Smallest number in the array: 10


28. Write Java program to find the sum of all odd numbers in a array.  

    import java.util.Scanner;

    class A1 {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Enter the number of elements in the array:");
          int n = scanner.nextInt();
          int[] numbers = new int[n];

          System.out.println("Enter the elements:");
          for (int i = 0; i < n; i++) {
              numbers[i] = scanner.nextInt();
          }

          int sum = 0;
          for (int i = 0; i < n; i++) {
              if (numbers[i] % 2 != 0) {
                  sum += numbers[i];
              }
          }

          System.out.println("Sum of all odd numbers in the array: " + sum);

          scanner.close();
      }
   }

   OUTPUT- Enter the number of elements in the array:
           6
           Enter the elements:
           1 2 3 4 5 6
           Sum of all odd numbers in the array: 9


29. Write a Java program to find duplicate elements in a 1D array and find their frequency of 
    occurrence. 

    import java.util.Scanner;
    import java.util.HashMap;

    class A1 {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Enter the number of elements in the array:");
          int n = scanner.nextInt();
          int[] numbers = new int[n];

          System.out.println("Enter the elements:");
          for (int i = 0; i < n; i++) {
               numbers[i] = scanner.nextInt();
          }
 
          HashMap<Integer, Integer> frequency = new HashMap<>();
        
          for (int num : numbers) {
              frequency.put(num, frequency.getOrDefault(num, 0) + 1);
          }

          System.out.println("Duplicate elements and their frequencies:");
          for (int num : frequency.keySet()) {
              if (frequency.get(num) > 1) {
                  System.out.println(num + " appears " + frequency.get(num) + " times.");
              }
          }
 
          scanner.close();
      }
   }

   OUTPUT- Enter the number of elements in the array:
           6
           Enter the elements:
           1 2 2 3 4 4
           Duplicate elements and their frequencies:
           2 appears 2 times.
           4 appears 2 times.

30. Write a Java program to print every alternate number of a given array 

   import java.util.Scanner;

   class A1 {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Enter the number of elements in the array:");
          int n = scanner.nextInt();
          int[] numbers = new int[n];

          System.out.println("Enter the elements:");
          for (int i = 0; i < n; i++) {
              numbers[i] = scanner.nextInt();
          }

          System.out.println("Every alternate number from the array:");
          for (int i = 0; i < n; i += 2) {
              System.out.print(numbers[i] + " ");
          }

          scanner.close();
      }
   }

   OUTPUT- Enter the number of elements in the array:
           6
           Enter the elements:
           1 2 3 4 5 6
           Every alternate number from the array:
           1 3 5


31. Write a Java program to show 0-arguments constructor. 

    class A1 {
    A1() {
          System.out.println("0-Arguments Constructor is called.");
      }

      public static void main(String[] args) {
          A1 obj = new A1();
      }
   }

   OUTPUT- 0-Arguments Constructor is called.


32. Write a Java program to show parameterized constructor. 

    class A1 {
    A1(int a, int b) {
          System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
      }

      public static void main(String[] args) {
          A1 obj = new A1(5, 10);
      }
   }

   OUTPUT- Sum of 5 and 10 is: 15


33. Write a class, Commission, which has an instance variable, sales; an appropriate 
    constructor; and a method, commission() that returns the commission.Now write a demo class 
    to test the Commission class by reading a sale from the user, using it to create a Commission 
    object after validating that the value is not negative. Finally, call the commission() method to 
    get and print the commission. If the sales are negative, your demo should print the message 
    “Invalid Input”. 

    import java.util.Scanner;

    class Commission {
       private double sales;

       public Commission(double sales) {
           if (sales < 0) {
               System.out.println("Invalid Input");
               this.sales = -1;
           } else {
               this.sales = sales;
           }
       }

       public double commission() {
           if (sales == -1) {
               return 0;
           }
           return sales * 0.1;  
       }
   }

   class A1 {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

           System.out.println("Enter sales amount:");
           double sales = scanner.nextDouble();

           Commission commission = new Commission(sales);

           if (sales >= 0) {
               System.out.println("The commission is: " + commission.commission());
           }

           scanner.close();
       }
   }

   OUTPUT- Enter sales amount:
           5000
           The commission is: 500.0


 
 
 
 
 
 
 






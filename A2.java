1. Given are two one-dimensional arrays A & B, which are sorted in ascending order. Write 
   a Java program to merge them into single sorted array C that contains every item from 
   arrays A & B, in ascending order. 

   import java.util.Arrays;

   public class A2 {
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7};
        int[] B = {2, 4, 6, 8};
        int[] C = new int[A.length + B.length];
        
        int i = 0, j = 0, k = 0;
        
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }
        
        while (i < A.length) {
            C[k++] = A[i++];
        }
        
        while (j < B.length) {
            C[k++] = B[j++];
        }
        
        System.out.println("Merged and Sorted Array: " + Arrays.toString(C));
    }
   }

   OUTPUT - Merged and Sorted Array: [1, 2, 3, 4, 5, 6, 7, 8]

2. Write a Java program to show 0-arguments constructor. 
  
   public class A2 {
    public A2() {
        System.out.println("Zero-arguments constructor called");
    }

    public static void main(String[] args) {
        new A2();
    }
  }

  OUTPUT - Zero-arguments constructor called

3. Write a Java program to show parameterized constructor. 
  
   public class A2 {
    private int x, y;

    public A2(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        new A2(5, 10);
    }
   }

   OUTPUT - x = 5, y = 10

4. Write a Java program to show constructor overloading. 
  
   public class A2 {
    public A2() {
        System.out.println("No-arg constructor");
    }

    public A2(int a) {
        System.out.println("Constructor with one argument: " + a);
    }

    public A2(int a, int b) {
        System.out.println("Constructor with two arguments: " + a + ", " + b);
    }

    public static void main(String[] args) {
        new A2();
        new A2(5);
        new A2(5, 10);
    }
   }

   OUTPUT - No-arg constructor
            Constructor with one argument: 5
            Constructor with two arguments: 5, 10

5. Write a Java program to implement the concept of inheritance. 
   class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
   }

   class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
   }

   OUTPUT - Dog barks

6. Write a Java program to show method overloading. 
   public class A2 {
    public void display(int a) {
        System.out.println("Integer: " + a);
    }

    public void display(String a) {
        System.out.println("String: " + a);
    }

    public static void main(String[] args) {
        A2 obj = new A2();
        obj.display(10);
        obj.display("Hello");
    }
   }
   OUTPUT - Integer: 10
            String: Hello

7. Write a Java program to show method overriding. 

   class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
   }

   class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
    }
   }

   OUTPUT - Dog barks

8. Write a Java program to show method hiding. 
     
   class Parent {
    public static void display() {
        System.out.println("Parent class");
    }
   }

   class Child extends Parent {
    public static void display() {
        System.out.println("Child class");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.display();
    }
   }

   OOUTPUT - Parent class

9. Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and 
   Cone from it. The class ThreeDObject has methods wholeSurfaceArea ( ) and volume (). 
   Override these two methods in each of the derived classes to calculate the volume and 
   whole surface area of each type of three-dimensional objects. The dimensions of the 
   objects are to be taken from the users and passed through the respective constructors of 
   each derived class. Write a main method to test these classes. 

   import java.util.Scanner;

   class ThreeDObject {
    public void wholeSurfaceArea() {}
    public void volume() {}
   }

   class Box extends ThreeDObject {
    private double length, width, height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void wholeSurfaceArea() {
        double area = 2 * (length * width + width * height + height * length);
        System.out.println("Surface Area of Box: " + area);
    }

    public void volume() {
        double vol = length * width * height;
        System.out.println("Volume of Box: " + vol);
    }
   }

   class Cube extends Box {
    public Cube(double side) {
        super(side, side, side);
    }
   }

   class Cylinder extends ThreeDObject {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void wholeSurfaceArea() {
        double area = 2 * Math.PI * radius * (radius + height);
        System.out.println("Surface Area of Cylinder: " + area);
    }

    @Override
    public void volume() {
        double vol = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder: " + vol);
    }
   }

   class Cone extends ThreeDObject {
    private double radius, height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void wholeSurfaceArea() {
        double area = Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
        System.out.println("Surface Area of Cone: " + area);
    }

    public void volume() {
        double vol = (1.0 / 3) * Math.PI * radius * radius * height;
        System.out.println("Volume of Cone: " + vol);
    }
   }

   public class A2 {
    public static void main(String[] args) {
        Box box = new Box(2, 3, 4);
        box.wholeSurfaceArea();
        box.volume();

        Cube cube = new Cube(5);
        cube.wholeSurfaceArea();
        cube.volume();

        Cylinder cylinder = new Cylinder(3, 7);
        cylinder.wholeSurfaceArea();
        cylinder.volume();

        Cone cone = new Cone(3, 5);
        cone.wholeSurfaceArea();
        cone.volume();
    }
   }

   OUTPUT - Surface Area of Box: 52.0
            Volume of Box: 24.0
            Surface Area of Cube: 150.0
            Volume of Cube: 125.0
            Surface Area of Cylinder: 188.49555921538757
            Volume of Cylinder: 197.92033717615698
            Surface Area of Cone: 150.7362072929702
            Volume of Cone: 141.3716694115407

10. Write a program to create a class named Vehicle having protected instance variables 
    regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a 
    vehicle class”. Inherit the Vehicle class into subclasses named Bus and Car having 
    individual private instance variables routeNumber in Bus and manufacturerName in Car 
    and both of them having showData ( ) method showing all details of Bus and Car 
    respectively with content of the super class’s showData ( ) method. 
  
    class Vehicle {
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;

    public void showData() {
        System.out.println("This is a Vehicle class");
    }
   }

   class Bus extends Vehicle {
    private String routeNumber;

    public Bus(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Bus details: Route Number: " + routeNumber);
    }
   }

   class Car extends Vehicle {
    private String manufacturerName;

    public Car(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Car details: Manufacturer: " + manufacturerName);
    }
   }

   public class A2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.showData();

        Bus bus = new Bus("Route 45");
        bus.showData();

        Car car = new Car("Toyota");
        car.showData();
    }
   }

   OUTPUT - This is a Vehicle class
            This is a Vehicle class
            Bus details: Route Number: Route 45
            This is a Vehicle class
            Car details: Manufacturer: Toyota

11. Write a Java program which creates a base class Num and contains an integer number 
    along with a method shownum() which displays the number. Now create a derived class 
    HexNum which inherits Num and overrides shownum() which displays the hexadecimal 
    value and octal value of the number. Demonstrate the working of the classes. 
  
    class A2 {
    static class Num {
        int number;

        public Num(int number) {
            this.number = number;
        }

        public void shownum() {
            System.out.println("Number: " + number);
        }
    }

    static class HexNum extends Num {

        public HexNum(int number) {
            super(number);
        }

        @Override
        public void shownum() {
            System.out.println("Hexadecimal: " + Integer.toHexString(number));
            System.out.println("Octal: " + Integer.toOctalString(number));
        }
    }

    public static void main(String[] args) {
        HexNum hexNum = new HexNum(100);
        hexNum.shownum();
    }
   }

   OUTPUT - Hexadecimal: 64
            Octal: 144

12. Create a base class Distance which stores the distance between two locations in miles and 
    a method travelTime(). The method prints the time taken to cover the distance when the 
    speed is 60 miles per hour. Now in a derived class DistanceMKS, override travelTime() 
    so that it prints the time assuming the distance is in kilometers and the speed is 100 km 
    per second. Demonstrate the working of the classes. 
  
    class A2 {
    static class Distance {
        double miles;

        public Distance(double miles) {
            this.miles = miles;
        }

        public void travelTime() {
            double time = miles / 60;
            System.out.println("Time to cover " + miles + " miles at 60 mph: " + time + " hours");
        }
    }

    static class DistanceMKS extends Distance {

        public DistanceMKS(double miles) {
            super(miles);
        }

        @Override
        public void travelTime() {
            double kilometers = miles * 1.60934;
            double time = kilometers / 100;
            System.out.println("Time to cover " + kilometers + " kilometers at 100 km/s: " + time + " seconds");
        }
    }

    public static void main(String[] args) {
        Distance distance = new Distance(120);
        DistanceMKS distanceMKS = new DistanceMKS(120);

        distance.travelTime();
        distanceMKS.travelTime();
    }
   }

   OUTPUT - Time to cover 120.0 miles at 60 mph: 2.0 hours
            Time to cover 193.1208 kilometers at 100 km/s: 1.931208 seconds

13. Write a Java program to explain “multilevel inheritance.” 
  
    class A2 {
    static class Animal {
        public void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        public void sound() {
            System.out.println("Dog barks");
        }
    }

    static class Puppy extends Dog {
        public void sound() {
            System.out.println("Puppy whines");
        }
    }

    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.sound();
    }
   }

   OUTPUT - Puppy whines

14. Write a program to define a class Employee to accept emp_id, emp _name, basic_salary 
    from the user and display the gross_salary. 
  
    import java.util.Scanner;

    class A2 {
    static class Employee {
        int emp_id;
        String emp_name;
        double basic_salary;

        public Employee(int emp_id, String emp_name, double basic_salary) {
            this.emp_id = emp_id;
            this.emp_name = emp_name;
            this.basic_salary = basic_salary;
        }

        public double calculateGrossSalary() {
            double HRA = basic_salary * 0.20;
            double DA = basic_salary * 0.10; 
            double gross_salary = basic_salary + HRA + DA;
            return gross_salary;
        }

        public void displaySalary() {
            double gross_salary = calculateGrossSalary();
            System.out.println("Employee ID: " + emp_id);
            System.out.println("Employee Name: " + emp_name);
            System.out.println("Gross Salary: " + gross_salary);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int emp_id = sc.nextInt();
        sc.nextLine();  
        System.out.print("Enter Employee Name: ");
        String emp_name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basic_salary = sc.nextDouble();

        Employee employee = new Employee(emp_id, emp_name, basic_salary);
        employee.displaySalary();
    }
   }

   OUTPUT - Enter Employee ID: 101
            Enter Employee Name: John Doe
            Enter Basic Salary: 50000.0
            Employee ID: 101
            Employee Name: John Doe
            Gross Salary: 60000.0

15. Write a program to demonstrate use of 'this' keyword. 
  
    class A2 {
    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name; 
            this.age = age;  
        }

        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        person.display();
    }
   }
 
   OUTPUT - Name: Alice
   Age: 30

16. Write a program to demonstrate use of 'static' keyword. 
  
    class A2 {
    static class Counter {
        static int count = 0;

        public Counter() {
            count++;
        }

        public static void displayCount() {
            System.out.println("Count: " + count);
        }
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter.displayCount(); 
    }
   }

   OUTPUT - Count: 3

17. Write program, which finds the sum of numbers formed by consecutive digits. 
    Input : 2415 
    output : 24+41+15=80. 
  
    import java.util.Scanner;

    class A2 {
    static class SumConsecutiveDigits {
        public void calculateSum(String input) {
            int totalSum = 0;

            for (int i = 0; i < input.length() - 1; i++) {
                int number = Integer.parseInt(input.substring(i, i + 2));
                totalSum += number;
            }

            System.out.println("Output: " + totalSum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.nextLine();

        SumConsecutiveDigits sumObj = new SumConsecutiveDigits();
        sumObj.calculateSum(input);
    }
   }

   OUTPUT - Enter a number: 2415
   Output: 80

18. Create three interfaces, each with two methods. Inherit a new interface from the three, 
    adding a new method. Create a class by implementing the new interface and also 
    inheriting from a concrete class. Now write four methods, each of which takes one of the 
    four interfaces as an argument. In main ( ), create an object of your class and pass it to 
    each of the methods. 
  
    interface A {
    void methodA();
    void methodB();
   }

   interface B {
    void methodC();
    void methodD();
   }

   interface C {
    void methodE();
    void methodF();
   }

   interface D extends A, B, C {
    void methodG();
   }

   class A2 implements D {
    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() {
        System.out.println("Method B");
    }

    public void methodC() {
        System.out.println("Method C");
    }

    public void methodD() {
        System.out.println("Method D");
    }

    public void methodE() {
        System.out.println("Method E");
    }

    public void methodF() {
        System.out.println("Method F");
    }

    public void methodG() {
        System.out.println("Method G");
    }

    public static void main(String[] args) {
        A2 obj = new A2();
        obj.methodA();
        obj.methodB();
        obj.methodC();
        obj.methodD();
        obj.methodE();
        obj.methodF();
        obj.methodG();
    }
   }

   OUTPUT - Method A
            Method B
            Method C
            Method D
            Method E
            Method F
            Method G

19. Write a Java program to show the use of all keywords for exception handling. 
   
    class A2 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }

        try {
            String[] arr = new String[2];
            System.out.println(arr[5]);  
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
   }

   OUTPUT - Caught ArithmeticException: / by zero
            Finally block executed
            Caught ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 2

20. Write a Java program using try and catch to generate NegativeArrayIndex Exception and 
    Arithmetic Exception. 
  
    class A2 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[-1]);  
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught NegativeArrayIndexException: " + e.getMessage());
        }

        try {
            int result = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
   }

   OUTPUT - Caught NegativeArrayIndexException: Index -1 out of bounds for length 5
            Caught ArithmeticException: / by zero

21. Write a program that outputs the name of the capital of the country entered at the 
    command line. The program should throw a “NoMatchFoundException” when it fails to 
    print the capital of the country entered at the command line. 
    import java.util.Scanner;

    class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
   }

   class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a country name: ");
        String country = sc.nextLine();

        try {
            if (country.equalsIgnoreCase("India")) {
                System.out.println("Capital: New Delhi");
            } else if (country.equalsIgnoreCase("USA")) {
                System.out.println("Capital: Washington DC");
            } else {
                throw new NoMatchFoundException("Capital not found for " + country);
            }
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }
   }
   OUTPUT - Enter a country name: France
   Capital not found for France

22. Write a java program to create an custom Exception that would handle at least 2 kind of 
    Arithmetic Exceptions while calculating a given equation 
  
    class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
   }

   class A2 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; 
            throw new CustomArithmeticException("Arithmetic Exception occurred");
        } catch (CustomArithmeticException e) {
            System.out.println("Caught CustomArithmeticException: " + e.getMessage());
        }
    }
   }

   OUTPUT - Caught CustomArithmeticException: Arithmetic Exception occurred

23. Create two user-defined exceptions named “TooHot” and “TooCold” to check the 
    temperature (in Celsius) given by the user passed through the command line is too hot or 
    too cold. 
    If temperature > 35, throw exception “TooHot”. 
    If temperature <5, throw exception “TooCold”. 
    Otherwise, print “Normal” and convert it to Farenheit. 
  
    import java.util.Scanner;

    class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
   }

   class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
   }

   class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double temp = sc.nextDouble();

        try {
            if (temp > 35) {
                throw new TooHot("Temperature is too hot!");
            } else if (temp < 5) {
                throw new TooCold("Temperature is too cold!");
            } else {
                System.out.println("Temperature is normal.");
                double fahrenheit = (temp * 9/5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            }
        } catch (TooHot | TooCold e) {
            System.out.println(e.getMessage());
        }
    }
   }

   OUTPUT - Enter temperature in Celsius: 36
            Temperature is too hot!

24. Consider an Employee recruitment system that prints the candidate name based on the 
    age criteria. The name and age of the candidate are taken as Input.Create two user-defined 
    exceptions named “TooOlder” and “TooYounger” 
    If age>45, throw exception “TooOlder”. 
    If age<20, throw exception “TooYounger”. 
    Otherwise, print “Eligible” and print the name of the candidate. 
     
    import java.util.Scanner;

    class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
   }

   class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
   }

   class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter candidate name: ");
        String name = sc.nextLine();
        System.out.print("Enter candidate age: ");
        int age = sc.nextInt();

        try {
            if (age > 45) {
                throw new TooOlder("Candidate is too old.");
            } else if (age < 20) {
                throw new TooYounger("Candidate is too young.");
            } else {
                System.out.println("Eligible candidate: " + name);
            }
        } catch (TooOlder | TooYounger e) {
            System.out.println(e.getMessage());
        }
    }
   }
 
   OUTPUT - Enter candidate name: John
            Enter candidate age: 50
            Candidate is too old.

25. Write a program to raise a user defined exception if username is less than 6 characters and 
    password does not match. 
  
    class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
   }

   class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
   }

   class A2 {
    public static void main(String[] args) {
        String username = "abc";
        String password = "12345";

        try {
            if (username.length() < 6) {
                throw new InvalidUsernameException("Username must be at least 6 characters long.");
            } else if (!password.equals("password123")) {
                throw new InvalidPasswordException("Password does not match.");
            } else {
                System.out.println("Username and password are correct.");
            }
        } catch (InvalidUsernameException | InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
   }

   OUTPUT - Username must be at least 6 characters long.

26. Write a program to input name and age of a person and throw a user-defined exception, if 
    the entered age is negative
    class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
   }

   class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            if (age < 0) {
                throw new NegativeAgeException("Age cannot be negative.");
            } else {
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
            }
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        }
    }
   }

   OUTPUT - Enter your name: Alice
            Enter your age: -5
            Age cannot be negative.


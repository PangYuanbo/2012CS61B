// Author: Yuanbo Pang -CIS 35A
// Description: This code demonstrates method overloading in Java. Method overloading allows a class to have more than one method with the same name, as long as their parameter lists are different.

public class OverloadingExample {
    public static void main(String[] args) {
        OverloadingExample t = new OverloadingExample();
        t.methodX(5, 9, 2.2);
        t.methodX(5, 9, "Hi");
        t.methodX(5, 9, 2);
        t.methodX(5, 9);
        t.methodX(5); // calling the overloaded method with one parameter
        t.methodX("Hello", 7); // calling the new overloaded method with String and int parameters
    }


    public void methodX(int a) {
        System.out.println("This is the method X with 1 parameter!");
    }


    public void methodX(int a, int b) {
        System.out.println("This is the method X with 2 parameters!");
    }


    public void methodX(int a, int b, int c) {
        System.out.println("This is the method X with 3 parameters!");
    }


    public void methodX(int a, int b, double c) {
        System.out.println("This is the method X with 3 parameters, but the last is a double!");
    }


    public void methodX(int a, int b, String c) {
        System.out.println("This is the method X with 3 parameters, but the last is a string!");
    }

    // New overloaded method with String and int parameters
    public void methodX(String a, int b) {
        System.out.println("This is the new method X with a String and an int parameter!");
    }
}

/*
Your result:
This is the method X with 3 parameters, but the last is a double!
This is the method X with 3 parameters, but the last is a string!
This is the method X with 3 parameters!
This is the method X with 2 parameters!
This is the method X with 1 parameter!
This is the new method X with a String and an int parameter!
*/

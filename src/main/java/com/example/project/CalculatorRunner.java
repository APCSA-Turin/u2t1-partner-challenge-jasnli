package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {

        //test your program here
        //1. create an instance of the calculator class
        Calculator calc = new Calculator("TI84");
        //2. call any methods of that class to test

        // OPERATION
        System.out.println("5+7");
        System.out.println(calc.performOperation("+", 5, 7));
        System.out.println("5-7");
        System.out.println(calc.performOperation("-", 5, 7));
        System.out.println("5*7");
        System.out.println(calc.performOperation("*", 5, 7));
        System.out.println("5/7");
        System.out.println(calc.performOperation("/", 5, 7));
        System.out.println("NO OPERAND");
        System.out.println(calc.performOperation("j", 5, 7));
        
        // DIVISIBLE CHECK
        System.out.println("10 is divisble by 5:");
        System.out.println(calc.divisibleBy(10,5)); 
        System.out.println("7 is divisble by 3:");
        System.out.println(calc.divisibleBy(7,3)); 

        // COORDINATE PAIR
        System.out.println(calc.coordinatePair(2, 4));

        
        // ABS VL
        System.out.println("ABS of 8 - 8");
        System.out.println(calc.absoluteValue(8, 4)); 
        System.out.println("ABS of -3 - 8");
        System.out.println(calc.absoluteValue(-3, 8)); 

        // MODEL
        System.out.println(calc.info());

    }
}

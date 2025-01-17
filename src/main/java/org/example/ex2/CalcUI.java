package org.example.ex2;

import java.util.Scanner;

public class CalcUI {

    Calculator calculator;

    public CalcUI(Calculator calculator) {
        this.calculator = calculator;
    }

    public void startUI() {

        System.out.println(Calculator.key);


        Scanner scanner = new Scanner(System.in);

        System.out.println("num1");

        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("num2");

        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.println(calculator.add(num1, num2));

    }

    }

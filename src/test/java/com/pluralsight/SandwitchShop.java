package com.pluralsight;
import java.util.Scanner;
public class SandwitchShop {

    public static void main(String[] args) {
    int size = getSize();
    int age = getAge();
    showCost(size,age);
    }

    //display questions
    public static int getSize(){
     Scanner keyboard = new Scanner(System.in);
    int size;
        System.out.println("1. Regular: $5.45");
        System.out.println("2. Large: $8.95");
        System.out.print("Pick yo sammy: ");
        size = keyboard.nextInt();

    return size;
    }//end getSize

    public static int getAge(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your age? ");
        int age = keyboard.nextInt();
            return age;
    }

    public static void showCost(int size, int age){

        double price = 0;
        double discountStudent;
        double discountSenior = .2;

        if(size == 1)
        {
            price = 5.45;
        }
        else if(size == 2)
        {
            price = 8.95;
        }

        if(age <= 17)
        {
            discountStudent = price * .1;
            price = price - discountStudent;
            System.out.print("The price of your sandwich with student discount is: $" + price);
        }
        else if(age >= 65){

            discountSenior = price * .2;
            price = price - discountSenior;
            System.out.print("The price of your sandwich with senior discount is: $" + price);
        }
        else System.out.print("The price of your sandwich without discount is: $" + price);


    }

}

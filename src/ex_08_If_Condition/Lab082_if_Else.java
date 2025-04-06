package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_if_Else {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter age");
        int age = scanner.nextInt();
        System.out.println(age);
        if(age>18){
            System.out.println("yes you can vote");
        }else {
            System.out.println( "you can not vote");
        }

    }
}

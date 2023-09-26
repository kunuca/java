package Lessen2;

import java.util.Scanner;

/*Напишите метод, который принимает на вход строку (String) и определяет является
        ли строка палиндромом (возвращает boolean значение).*/
public class ThirdTask {
    public static void main(String[] args){
        Scanner name= new Scanner(System.in);
        StringBuilder notReverse= new StringBuilder(name.nextLine());
        //StringBuilder reverse = new StringBuilder(notReverse.reverse());
        boolean equals=notReverse.toString().equals(notReverse.reverse.toString());
        if(equals){
            System.out.println("Полендром");}
        else{
            System.out.println("Не полендром");}
        }
    }


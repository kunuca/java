package Lessen2;

import java.util.Scanner;
/*Напишите метод, который сжимает строку.
        Пример: вход aaaabbbcdd.*/



public class SecondTask {
    String input;
    boolean repeated;

    public SecondTask(){
        Scanner in=new Scanner(System.in);
        input=in.next();
        in.close();

    }
    public void getUniqSequence(){
        StringBuilder stringBuilder=new StringBuilder();

        for (int i = 0; i <input.length() ; i++) {
            repeated=false;
            char firstiter=input.charAt(i);
            for (int j = i+1; j <input.length() ; j++) {
                char secondIter=input.charAt(i);
                if (firstiter==secondIter){
                    repeated=true;
                    break;
                }

            }
            if (!repeated){
                stringBuilder.append(firstiter);
            }

        }
        System.out.println(stringBuilder);
    }
}

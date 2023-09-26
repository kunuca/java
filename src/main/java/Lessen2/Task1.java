package Lessen2;

import java.util.Scanner;

/*Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N, которая состоит
        из чередующихся символов c1 и c2, начиная с c1.*/
public class Task1 {
    int n;
    char a;
    char b;

    public Task1(){
        Scanner in=new Scanner(System.in);
        System.out.println("Введите четное число");
        n=in.nextInt();
        System.out.println("Ввеите два символа");
        a=in.next().charAt(0);
        b=in.next().charAt(0);

    }
    public Task1(int n, char a, char b){
        this.n=n;
        this.a=a;
        this.b=b;

    public String getResult(){
        StringBuilder stringBuilder=new StringBuilder();
        if(isOdd(n)){
            int cnt=0;
            while (n !=cnt){
                stringBuilder.append(a).append(b);
                cnt=cnt+2;
            }
        }
        System.out.println(stringBuilder);
        }
}
}

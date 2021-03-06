package com.company;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Введите размер количество чисел -");
            int k=sc.nextInt();
            int n=k/2;
            System.out.println("Введите последовательность чисел -");
            double[] a=new double[2*n];
            for (int i=0; i<a.length;i++) {
                a[i]=sc.nextDouble();
            }
            sc.close();
            int first = 0;
            int last = 2*n-1;
            double max=a[first]+a[last] ;
            while (++first < --last) {
                if (a[first]+a[last]>max) max=a[first]+a[last];
            }
            System.out.println(max);

            }
        catch (InputMismatchException e) {
            System.out.println("Введено не корректное число/символ");
        }
    }
}

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
               // System.out.println(a[i]);
            }
            sc.close();
            int first = 0;
            int last = 2*n-1;
            double max=a[first]+a[last] ;
            while (++first < --last) {
                if (a[first]+a[last]>max) max=a[first]+a[last];
            }
            System.out.println(max);





           // double[] f = new double[n];
            //int i;
           // double x = (double) a;

            //for (i = 0; i < n; i++) {
              //  f[i] = Math.tan((2*x))-3;
               // System.out.printf("Значение функции %f Аргумент %.0f%n", f[i], x);
               // x += (double) h;

            }
        catch (InputMismatchException e) {
            System.out.println("Введено не корректное число/символ");
        }
    }
}

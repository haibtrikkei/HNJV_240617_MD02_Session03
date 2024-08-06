package mang_1_chieu;

import java.util.Random;
import java.util.Scanner;

public class MangTuDong {
    public static void main(String[] args) {
        Random r = new Random();

//        System.out.println(r.nextInt(100)); //sinh so ngau nhien tu 0 den 99
//
//        //Sinh so ngau nhien tu 30 - 40?
//        int number = 30 + r.nextInt(11);
//        System.out.println(number);

        int mang[];
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        n = sc.nextInt();
        mang = new int[n];

        for(int i=0;i<n;i++){
            mang[i] = r.nextInt(50);
        }
        System.out.println("Mang ban dau: ");
        for(int i=0;i<n;i++){
            System.out.print(mang[i]+"\t");
            if((i+1)%25==0)
                System.out.println();
        }
        System.out.println();
    }
}

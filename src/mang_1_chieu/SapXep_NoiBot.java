package mang_1_chieu;

import java.util.Scanner;

public class SapXep_NoiBot {
    public static void main(String[] args) {
        int[] mang;
        int n;

        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap so phan tu cua mang: ");
            n = sc.nextInt();
            if(n<1)
                System.out.println("Nhap lai ");
            else
                break;
        }while(true);

        mang = new int[n];
        for(int i = 0;i<n;i++){
            System.out.println("Nhap phan tu thu "+(i+1));
            mang[i] = sc.nextInt();
        }

        System.out.println("\nMang ban dau: ");
        for(int i=0;i<n;i++){
            System.out.print(mang[i]+"\t");
            if((i+1)%25==0)
                System.out.println();
        }
        System.out.println("\nSap xep mang tang dan bang thuat toan noi bot: ");
        for(int i =0;i<n-1;i++){
            for(int j=n-1;j>i;j--){
                if(mang[j]<mang[j-1]){
                    int tg = mang[j];
                    mang[j] = mang[j-1];
                    mang[j-1] = tg;
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(mang[i]+"\t");
            if((i+1)%25==0)
                System.out.println();
        }
    }
}

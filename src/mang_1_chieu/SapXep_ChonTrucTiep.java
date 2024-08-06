package mang_1_chieu;

import java.util.Scanner;

public class SapXep_ChonTrucTiep {
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
        System.out.println("\nSap xep mang tang dan bang thuat toan chon truc tiep: ");
        for(int i =0;i<n-1;i++){
            int k = i;
            for(int j=i+1;j<n;j++){
                if(mang[j]<mang[k]){
                    k = j;
                }
            }

            if(k!=i){
                int tg = mang[k];
                mang[k] = mang[i];
                mang[i] = tg;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(mang[i]+"\t");
            if((i+1)%25==0)
                System.out.println();
        }
    }
}

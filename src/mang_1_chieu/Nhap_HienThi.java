package mang_1_chieu;

import java.util.Scanner;

public class Nhap_HienThi {
    public static void main(String[] args) {
        //Nhap va hien thi mang co n phan tu la so nguyen
        int[] mang;
        int n;

        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap so phan tu cua mang: ");
            n = sc.nextInt();
            if(n<1)
                System.out.println("Phai nhap n nguyen duong lon hon 1");
            else
                break;
        }while(true);

        mang = new int[n];

        for(int i = 0; i<n;i++){
            System.out.println("Nhap phan tu thu "+(i+1));
            mang[i] = sc.nextInt();
        }

        System.out.println("\nCac phan tu cua mang: ");
        for(int i =0;i<n;i++){
            System.out.print(mang[i]+"\t");
            if((i+1)%10==0){
                System.out.println(); //In het 10 phan tu tren 1 dong thi xuong dong
            }
        }
        System.out.println(); //Dau nhac cuoi cung xuong dong
    }
}

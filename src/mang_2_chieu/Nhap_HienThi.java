package mang_2_chieu;

import java.util.Scanner;

public class Nhap_HienThi {
    public static void main(String[] args) {
        int mang[][];
        int row,column;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dong: ");
        row = sc.nextInt();
        System.out.println("Nhap so cot: ");
        column = sc.nextInt();

        mang = new int[row][column];
        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.println("Nhap phan tu mang["+i+","+j+"]=");
                mang[i][j] = sc.nextInt();
            }
        }

        System.out.println("Mang ban dau: ");
        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(mang[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println();
    }
}

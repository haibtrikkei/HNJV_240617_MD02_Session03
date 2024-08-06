package mang_2_chieu;

public class NhanMaTran {
    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[][] B = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        if(A[0].length==B.length){
            System.out.println("Hai ma tran nay nhan duoc voi nhau: ");
            int[][] C = new int[A.length][B[0].length];

            for(int i=0;i<A.length;i++){
                for(int j=0;j<B[0].length;j++){
                    C[i][j] = 0; //khoi tao gia tri ban dau cua mang tich
                    for(int k=0;k<A[0].length;k++){
                        C[i][j] = C[i][j] + A[i][k]*B[k][j];
                    }
                }
            }
            System.out.println("Ma tran tich: ");
            for(int i=0;i<C.length;i++){
                for(int j=0;j<C[0].length;j++){
                    System.out.print(C[i][j]+"\t");
                }
                System.out.println();
            }
            System.out.println();
        }else{
            System.out.println("Hai ma tran khong nhan duoc voi nhau");
        }

    }
}

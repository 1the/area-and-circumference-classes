import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //1D
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the size :");
        int s=input.nextInt();
        int [] arr1=new int[s];
        //in
        for(int i=0;i<s;i++)
        {
            int z= input.nextInt();
            arr1[i]=z;
        }
        //out
        for(int i=0;i<s;i++)
            System.out.print(arr1[i]+" ");
        System.out.println();

        //2D
        System.out.print("Enter num of rows: ");
        int x=input.nextInt();
        System.out.print("\n Enter num of columns: ");
        int y=input.nextInt();
        int [][] arr2= new int[x][y];
        //in
        for(int j=0; j<x; j++)
        {
            for(int k=0;k<y;k++)
            {
                int in=input.nextInt();
                arr2[j][k]=in;
            }
        }
        //out
        for(int j=0; j<x; j++)
        {
            for(int k=0;k<y;k++)
                System.out.print(arr2[j][k]+" ");
            System.out.println();
        }

    }
}
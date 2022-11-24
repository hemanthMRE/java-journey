 import java.util.*;
    public class Darr{
        public static boolean search(int matrix[][], int key){
        for(int i = 0; i<matrix.length; i++){
            for (int j = 0 ; j < matrix[0].length; j++){
                if(key == matrix[i][j]){
                    System.out.println(" key is at cell of"+i+" "+j);
                    return true;
                }
            } 
        }
        System.out.println("key not found");
        return false;
        }
        public static void main(String args[]){
             int matrix[][]= new int [3][3];
             int n =3,m =3;
             Scanner sc = new Scanner(System.in);
             int key = 8;
             for(int i =0; i<n; i++){
                for (int j = 0; j<m;j++){
                    matrix[i][j]= sc.nextInt();
                }
             }
             for(int i =0; i<n; i++){
                for (int j = 0; j<m;j++){
             System.out.print(matrix[i][j]+ " ");
                }
                
                System.out.println();
             }
            search(matrix,key);
             
        
    }
    }
 
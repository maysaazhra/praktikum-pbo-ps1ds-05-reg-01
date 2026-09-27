/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided;
public class Guided01 {
    public static void main(String[] args) {
        //Array 1 dimensi
        //Cara 1
        int[] varArray1;
        varArray1 = new int[5];
        varArray1[0] = 11;
        varArray1[1] = 22;
        varArray1 [2] = 33;
        
        //Cara 2
        int[] varArray2 = new int[5];
        
        //Cara 3
        int[] varArray3 = {1,2,3,4,5};
        
        System.out.println(varArray3[3]);
        
        //Array 2 dimensi
        int[][] arr2d = new int [2][2];
        arr2d[0][0] = 10;
        arr2d[0][1] = 20;
        arr2d[1][0] = 30;
        arr2d[1][1] = 40;
        System.out.println("Nilai baris 1 dan kolomn 2: " + arr2d [0][1]);
        
    }
}

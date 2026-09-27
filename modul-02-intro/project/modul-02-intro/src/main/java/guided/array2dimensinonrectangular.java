/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided;

/**
 *
 * @author ASUS
 */
public class array2dimensinonrectangular {
    public static void main(String[] args) {
        int twoDim[][] = new int[2][];
        twoDim[0] = new int[2];
        twoDim[1] = new int[3];

        twoDim[0][0] = 1;
        twoDim[0][1] = 4;
        twoDim[1][0] = 1;
        twoDim[1][1] = 4;
        twoDim[1][2] = 4;
        System.out.println(twoDim[0][0]);
        System.out.println(twoDim[0][1]);
        System.out.println(twoDim[1][0]);
        System.out.println(twoDim[1][1]);
        System.out.println(twoDim[1][2]);
    }
}

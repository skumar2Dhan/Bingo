/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
import java.util.ArrayList;

public class Bingo {

    public static void main(String[] args) {
        int num = 0;
        int random = 0;

        boolean bool = false;
        boolean boola = false;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[][] arr = new int[][]{};
        int[][] arr1 = new int[][]{};
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("Write the Maximum number you want on the card: \n"
                + "options are: 25,50,or 75:   ");
        num = Keyboard.nextInt();

        if (num == 25) {
            arr = new int[3][3];
            arr1 = new int[3][3];
            int[] boo = new int[9];
        } else if (num == 50 || num == 75) {  //check for num==75 
            arr = new int[5][5];
            arr1 = new int[5][5];
            int[] boo = new int[25];
        } else {
            arr = new int[7][7];
            arr1 = new int[7][7];
            int[] boo = new int[49];
        }
        /*int[] boo;
        for (int u=0;u<boo.length;u++)*/

        System.out.println("Array Size: " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int z = 0; z < arr.length; z++) {
                arr[i][z] = (int) (Math.random() * num + 1);
                arr1[i][z] = (int) (Math.random() * num + 1);
            }
        }
        /*for (int i = 0; i < arr.length; i++) {
            for (int z = 0; z < arr.length; z++) {
                System.out.println("computer"+arr[i][z] ); 
                for (int k= 0; k < arr.length; k++) {
                System.out.println("Computer"+arr1[i][k] );
                }
            }
        }*/

        //System.out.println("\n"+Arrays.toString(arr)); 
        System.out.print("Computer:  ");
        System.out.print("                                                          Player: \n");

        /*for (int[] z : arr) {
            System.out.println(Arrays.toString(z));

        }
        for (int[] y : arr1) {

            System.out.println("                                                         " + Arrays.toString(y));

        }*/
        for (int a = 0; a < num; a++) {

            random = (int) (Math.random() * num + 1);
            list.add(random);
            System.out.println("The number is: " + random);
            //System.out.println("-----"+list);

            for (int[] z : arr) {
                System.out.println(Arrays.toString(z));

            }
            for (int[] y : arr1) {

                System.out.println("                                                         " + Arrays.toString(y));

            }
            /*for(int z=0;z<arr.length;z++){
                for (int y=0;y<arr.length;y++){
                    System.out.print(arr[z][y]);
                }
                for (int g=0;g<arr1.length;g++)  {
                    System.out.print(arr[z][g]);
                
                }  
                
                }*/

 /* for (int[] z : arr) {
                System.out.println(Arrays.toString(z));

            }
            for (int[] y : arr1) {

                System.out.println("                                                         " + Arrays.toString(y));

            }*/
            //System.out.println("The Next number is: " + random);
            for (int b : list) {
                if (list.get(a) == b) {
                    random = (int) (Math.random() * num + 1);
                }
            }
            for (int n = 0; n < arr.length; n++) {
                for (int c = 0; c < arr.length; c++) {
                    if (arr[n][c] == random) {
                        arr[n][c] = 0;

                    }
                    if (arr1[n][c] == random) {
                        arr1[n][c] = 0;
                    }

                }
            }

            for (int d = 0; d < arr.length; d++) {
                for (int e = 0; e < arr.length; e++) {
                    if (arr[d][e] == 0) {
                        bool = true;

                    } else {
                        bool = false;

                    }
                    if (arr1[d][e] == 0) {
                        boola = true;

                    } else {
                        boola = false;

                    }
                }

            }
/* for (int[] z : arr) {
                System.out.println(Arrays.toString(z));

            }
            for (int[] y : arr1) {

                System.out.println("                                                         " + Arrays.toString(y));

            }*/
            if (bool == true || boola == true) {
                break;
            }

        }
        /*for (int d = 0; d < arr.length; d++) {
            for (int e = 0; e < arr.length; e++) {
                if (arr[d][e] == 0) {
                    bool = true;

                } else {
                    bool = false;

                }
                if (arr1[d][e] == 0) {
                    boola = true;

                } else {
                    boola = false;

                }
            }
        }*/

 /*if (bool==true){
             System.out.println("Computer wins! ");   
                
            }
            if (boola==true){
             System.out.println("You win! ");   
                
            }*/
        if (bool == true) {
            System.out.println("Computer wins! ");

        }
        if (boola == true) {
            System.out.println("You win! ");
        }
        /*if (bool==true){
             System.out.println("Computer wins! ");   
                
            }
            if (boola==true){
             System.out.println("You win! ");   
                
            }*/
        
        for (int w = 0; w < arr.length; w++) {
            for (int q = 0; q < arr.length; q++) {
                arr[w][q] = 0;

            }
        }
        /*if (bool==true){
             System.out.println("Computer wins! ");   
                
            }
            if (boola==true){
             System.out.println("You win! ");   
                
            }*/
        for (int[] y : arr) {

                System.out.println("                                                         " + Arrays.toString(y));

            }
        
        /*for (int d = 0; d < arr.length; d++) {
            for (int e = 0; e < arr.length; e++) {
                if (arr[d][e] == 0) {
                    bool = true;

                } else {
                    bool = false;

                }
                if (arr1[d][e] == 0) {
                    boola = true;

                } else {
                    boola = false;

                }
            }
        }*/
        
        
        /*for (int d = 0; d < arr.length; d++) {
            for (int e = 0; e < arr.length; e++) {
                if (arr[d][e] == 0) {
                    bool = true;

                } else {
                    bool = false;

                }
                if (arr1[d][e] == 0) {
                    boola = true;

                } else {
                    boola = false;

                }
            }
        }*/
        
        /*for (int d = 0; d < arr.length; d++) {
            for (int e = 0; e < arr.length; e++) {
                if (arr[d][e] == 0) {
                    bool = true;

                } else {
                    bool = false;

                }
                if (arr1[d][e] == 0) {
                    boola = true;

                } else {
                    boola = false;

                }
            }
        }*/
    }
}

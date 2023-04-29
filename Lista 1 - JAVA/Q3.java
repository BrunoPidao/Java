/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class b {
    public static void main (String[] args) {
      Scanner leia = new Scanner(System.in);{
        System.out.println("Digite um valor: ");
        int x = leia.nextInt();  
            for(int i = 1; i <= 10 && (x >= 1 && x <= 10); i++){
                System.out.println(x +" X "+ i +" = "+ x * i );
            }
        }
   }
}

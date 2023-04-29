
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cliente
 */
public class Q13 {
    /*13. Escreva um algoritmo que leia um número do teclado até que encontre um
número menor ou igual a 1.*/
    public static void main(String[] args) {
       int num;
        do{
            Scanner arm = new Scanner(System.in);{
            System.out.println("Insira um número: ");
            num = arm.nextInt();
            }
        }
    while(num > 1);
        }
}

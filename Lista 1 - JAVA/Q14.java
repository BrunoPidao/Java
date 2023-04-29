
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cliente
 */
public class Q14 {
    /**/
    public static void main(String[] args) {
        int num, soma=0;
     do{
        Scanner arm = new Scanner(System.in);{
         System.out.println("Insira um número: ");
         num = arm.nextInt();
         soma = soma + num;
     }
    }
     while(num !=0);
     System.out.println("Total: "+soma);
    }
}


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cliente
 */
public class Q11 {
    /*11. Faça um programa que peça ao usuário um número entre 12 e 20. Se a
pessoa digitar um número diferente, mostrar a mensagem "entrada inválida" e
solicitar o número novamente. Se digitar correto mostrar o número digitado.*/
    public static void main(String[] args) {
        int num, rept=0;
            Scanner arm = new Scanner(System.in);{
            System.out.println("Insira um número entre 12 e 20: ");
            num = arm.nextInt();
            while(num < 12 || num > 20){
              System.out.println("Entrada inválida!");
              System.out.println("Insira um número entre 12 e 20: ");
              num = arm.nextInt();
            }
        if(num >= 12 || num <= 20){
            System.out.println(num);
        }
                }
    }
}

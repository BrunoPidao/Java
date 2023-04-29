
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cliente
 */
public class Q6 {
    // 6. Utilizando a estrutura de repetição for, faça um programa que receba 10 números e conte quantos deles estão no intervalo [10,20] e quantos deles estão fora do intervalo, 
    //escrevendo estas informações.//
    public static void main(String[] args) {
        int entre = 0, fora = 0;
        for(int i = 0; i < 10; i++){
            Scanner arm = new Scanner(System.in);{
            System.out.println("Digite um número: ");
            int num = arm.nextInt();
            if (num >= 10 && num <= 20){
                entre++;
            }
            if (num < 10 || num > 20){
                fora++;
            }
        }
        }
        System.out.println("Entre os 10 números inseridos, "+entre+" estão entre 10 e 20 e "+fora+" estão fora.");
    }
}


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cliente
 */
public class Q5 {
    // 5. Ler 10 números e imprimir quantos são pares e quantos são ímpares.//
    public static void main(String[] args) {
        int par=0, impar=0;
        for(int i = 0; i <10; i++){
            Scanner arm = new Scanner(System.in);{
            System.err.println("Digite um número: ");
            int num = arm.nextInt();
                if(num %2 == 0){
                    par++;
                }
                if( num %2 != 0){
                impar++;
            } 
        }
        }
            System.err.println("Entre os 10 números "+par+" são par e "+impar+" são impar");
    }
}

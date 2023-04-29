
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cliente
 */
public class Q10 {
    //10. Faça um programa que mostre a tabuada de um número N (N será lido do teclado). //
    public static void main(String[] args) {
        int tabuada, rept=0, num;
        Scanner a = new Scanner(System.in);{
            System.out.println("Insisra um número: ");
            num = a.nextInt();
                while(rept <=10){
                    tabuada = num * rept;
                    System.out.println(num+" x "+rept+" = "+tabuada);
                    rept++;
        }   
        }
        
    }
}

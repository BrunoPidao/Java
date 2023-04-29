
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cliente
 */
public class Q9 {
    // 9. Crie um programa para ler 3 notas e mostrar a média delas.//
    public static void main(String[] args) {
        int rept = 1;
        float nota, media, nota_total = 0;
        while(rept <=3){
            Scanner arm = new Scanner(System.in);{
            System.out.println("Digite a "+rept+"° nota: ");
            nota = arm.nextFloat();
            nota_total = nota_total + nota;
            rept++;
        }
        }
        media = nota_total/3;
        System.out.println(media+" de média");
    }
}

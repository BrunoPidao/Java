
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cliente
 */
public class Q4 {
// 4. Leia várias idades e calcule a média entre as idades (usar uma variável para idade).//
    public static void main(String[] args) {
       int total_idade=0, media;
        Scanner c = new Scanner(System.in);{
            System.out.println("Quantas idades deseja comparar: ");
            int n_idade = c.nextInt();
                for(int i = 1; i <= n_idade; i++){
                    Scanner id = new Scanner(System.in);{
                    System.err.println("Informe a "+ i+"° idade:");
                    int idade = id.nextInt();
                       total_idade = total_idade + idade;
        }            
    }
                media = total_idade/n_idade; 
                System.err.println("A média das idades é: "+media);
        
        }
    }
}

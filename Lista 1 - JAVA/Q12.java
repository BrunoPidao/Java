
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cliente
 */
public class Q12 {
    /*12. Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados 
    os dados de idade, sexo (M/F) e salário. Faça um programa que calcule e mostre:
a) A média dos salários do grupo;
b) A maior e a menor idade do grupo;
c) A quantidade de mulheres na região;
d) A idade e o sexo da pessoa que possui o menor salário;
    Finalize a entrada de dados ao ser digitada uma idade negativa.*/
    public static void main(String[] args) {
        float salario, menor_salario = 999999999, media = 0, soma_salario = 0;
        int idade, maior_idade = 0, menor_idade = 200, masc= 0, femi= 0, grupo, rept = 1;
        char sexo, sexo_menorsalario = ' ';
        Scanner arm = new Scanner(System.in);{
        System.out.println("Quantas pessoas tem na região: ");
        grupo = arm.nextInt();
        while(rept <= grupo){ 
            Scanner alt = new Scanner(System.in);{
            System.out.println("Quanto elx recebe de salário: ");
            salario = alt.nextFloat();
            soma_salario = soma_salario + salario;
            media= soma_salario/grupo;
                if(salario < menor_salario){
                    menor_salario = salario;
                }
            System.out.println("Quantos anos elx tem: ");
            idade = alt.nextInt();
                if(idade < 0){
                break;
                }
                if(idade < menor_idade){
                    menor_idade = idade;
                }
                if(idade > maior_idade){
                    maior_idade = idade;
                }
            System.out.println("Qual o sexo: M para masculino e F para feminino ");
             sexo = alt.next().charAt(0);
             if(sexo =='F'){
                 femi++;
             }
             if(sexo =='M'){
                 masc++;
             }
             if(salario > menor_salario){
                sexo_menorsalario = sexo;
             }
             rept++;
        }
            
        }
    }
        System.out.println("A média de salário é "+media+" reais.");
        System.out.println("A maior idade do grupo é "+maior_idade+" e a menor idade é "+ menor_idade+".");
        System.out.println("tem "+femi+" mulheres no grupo");
        System.out.println("A pessoa mais nova do grupo tem "+menor_idade+" é do sexo "+sexo_menorsalario+" e tem o menor salário, recebendo "+ menor_salario+" reais.");
        
    }
}

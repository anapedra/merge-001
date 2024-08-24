package org.anapedra;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Modofiquei o codigo!


        int opcao = 1;

       while (opcao != 0){

        System.out.println("\nDigite os dias da semana : " +
                "\nEscolha uma opção de 1 a 7. Onde 1  é domigo e assim por diante, zero para sair\n" +
                "1 - Domogo\n" +
                "2 - Segunda\n" +
                "3 - Terça\n" +
                "4 - Quarta\n" +
                "5 - Qinta\n" +
                "6 - Sexta\n" +
                "7 - Sabadp\n");
         opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Domogo");
                break;

            case 2:
                System.out.println("Segunda");
                break;

            case 3:
                System.out.println("Terça");
                break;

            case 4:
                System.out.println("Quarta");
                break;

            case 5:
                System.out.println("Quinta");
                break;

            case 6:
                System.out.println("Sexta");
            case 7:
                System.out.println("Sabado");
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção invalida!");
                break;


        }
    }
    }












    /*







        int cont = 0;

        for ( int i=0; i < 12 ; i++){
           cont++;
        }

        System.out.println(cont);

        System.out.println("============================");



        while (cont < 10){
            cont++;

        }

        System.out.println(cont-2);







        System.out.println("Digite o primeiro numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = sc.nextInt();
        int result;


        int calc = 0;
        if(numero1 > numero2){
            calc = numero1 - numero2;

        }
        else {
            calc = numero1 + numero2;
        }
        System.out.println("Processo if/else: " +calc);

        result = numero1 > numero2 ?   numero1 - numero2 :  numero1 + numero2;

 */





}











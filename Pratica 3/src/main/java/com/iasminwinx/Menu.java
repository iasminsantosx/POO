package com.iasminwinx;
import java.util.Scanner;

public class Menu {
        ContaCorrente c1 = new ContaCorrente("Jon Snow",012,00.00);
        Scanner input = new Scanner(System.in);
        Scanner  v = new Scanner(System.in);
        public void Menu(){

            while(true){
                System.out.println("Conta Corrente\n" +
                        "================\n"+
                        "1. Saque\n"+
                        "2. Depósito\n"+
                        "3. Saldo\n"+
                        "4. Extrato\n"+
                        "5. Sair\n"+
                        "Digite uma opção _");
                int opção=input.nextInt();
                if(opção==5){
                    break;
                }
                else{
                    if (opção == 1){
                        System.out.println("Digite o valor que deseja sacar:");
                        double valor = v.nextDouble();
                        c1.saque(valor);
                    }
                    if(opção==2){
                        System.out.println("Digite o valor que deseja depositar:");
                        double valor = v.nextDouble();
                        c1.deposito(valor);
                    }
                    if(opção==3){

                        System.out.printf("Seu saldo é:",c1.getSaldo());

                    }
                    if(opção==4){

                        System.out.println(c1.extrato());

                    }

                }

            }

        }


}

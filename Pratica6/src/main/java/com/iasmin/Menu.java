package com.iasmin;

import java.util.Scanner;

public class Menu {

    ContaCorrente c1 = new ContaCorrente("Jon Snow",012,00.00);

    Scanner input = new Scanner(System.in);
    Scanner  v = new Scanner(System.in);
    public void Menu(){

        while(true){
            try{
                System.out.println("Conta Corrente\n" +
                        "================\n"+
                        "1. Saque\n"+
                        "2. Depósito\n"+
                        "3. Saldo\n"+
                        "4. Extrato\n"+
                        "5. Sair\n"+
                        "Digite uma opção _\n");

                int opção=input.nextInt();
                if(opção==5){
                    break;
                }
                else {
                    if (opção == 1) {
                        System.out.println("Digite o valor que deseja sacar:\n");
                        double valor = v.nextDouble();
                        System.out.println(c1.saque(valor));
                    }
                    if (opção == 2) {
                        System.out.println("Digite o valor que deseja depositar:\n");
                        double valor = v.nextDouble();
                        System.out.println(c1.deposito(valor));
                    }
                    if (opção == 3) {

                        Double saldo = c1.getSaldo();
                        System.out.println("Seu saldo é:\n"+saldo);

                    }
                    if (opção == 4) {

                        System.out.println(c1.extrato());

                    }
                }

            } catch (EntradaInvalidaException e){
                System.out.println("Entrada não numérica !");
            } catch (QuantiaNegativaException e) {
                System.out.println("Valor negativo!");
            }catch (SaldoInsuficienteException e){
                System.out.println("Saldo insuficiente!");
            }

        }

    }

}

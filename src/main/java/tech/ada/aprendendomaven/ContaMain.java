package tech.ada.aprendendomaven;

import java.math.BigDecimal;

public class ContaMain {
    public static void main(String[] args){
        BigDecimal saldo = new BigDecimal(453789);

        // Construtores implementados automaticamente
        Conta conta2 = new Conta();
        Conta conta = new Conta(saldo, 390453, 56347890);

        //Getters implementados automaticamente
        conta.getAgencia();
        conta.getNumero();
        conta.getSaldo();

        //Setters implementados automaticamente
        conta.setAgencia();
        conta.setNumero();
        conta.setSaldo();

    }
}

package org.example;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    String name;
    List<String> accountHolder;
    int totalBalance;
    {
        System.out.println("Kriti kumari");
    }
    public Bank(String bankName, List<String> accountHolder, int totalBalance){
        System.out.println("Parameterized");
    }

    public Bank(){
        //Un parameterized
        this("SBI", new ArrayList<>(), 100);
    }

    public void takeDeposit(int amount){

    }

    public void giveLoan(int amount){

    }
    public void createAccount(String accountName){

    }
}

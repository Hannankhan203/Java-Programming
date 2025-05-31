package com.myapp.accountbalance; // Declare the package at the top

class Balance { 
    String name; 
    double bal;

    Balance(String n, double b) { 
        name = n;   
        bal = b;
    } 

    void show() { 
        if(bal < 0) 
            System.out.print("--> ");   
        System.out.println(name + ": $" + bal); 
    } 
} 

public class AccountBalance {
    public static void main(String args[]) {
        Balance current[] = new Balance[3];
        current[0] = new Balance("Hannan, Taha, and Rafay", 112.2);
        current[1] = new Balance("Maham", 132.02);
        current[2] = new Balance("Maryam", -11.33); 
        
        for(int i = 0; i < 3; i++) 
            current[i].show();
    }
}

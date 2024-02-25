package org.example;

import java.util.ArrayList;

public class Wallet {
    String ownerName;
    double uangCash;
    ArrayList<String> listKartu;

    public Wallet(String ownerName, double uangCash, ArrayList<String> listKartu) {
        this.ownerName = ownerName;
        this.uangCash = uangCash;
        this.listKartu = listKartu;
    }

    public void withdraw(double amount) {
        if (this.uangCash < amount) {
            throw new Error("Uang tidak mencukupi");
        }
        this.uangCash = this.uangCash - amount;
    }

    public void deposit(double amount) {
        this.uangCash = this.uangCash + amount;
    }

    public void addCard(String idCard) {
        this.listKartu.add(idCard);
    }

    public void removeCard(String idCard) {
        boolean isDeleted = this.listKartu.remove(idCard);
        if (!isDeleted) {
            throw new Error("Kartu tidak ditemukan!");
        }
    }
}

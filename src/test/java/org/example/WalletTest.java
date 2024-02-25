package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WalletTest {

    @Test
    void testWithdrawSufficentCash() {
        Wallet wallet = new Wallet("joko" ,123, new ArrayList<>());
        wallet.withdraw(10);
        assertEquals(113, wallet.uangCash);

//        assertThrows(Error.class, () -> {
//            wallet.withdraw(10);
//            wallet.removeCard("something");
//        });
//        assertEquals(103, wallet.uangCash);
    }

    @Test
    void testWithdrawInsufficentCash() {
        final double UANG_AWAL = 123;
        Wallet wallet = new Wallet("joko" , UANG_AWAL, new ArrayList<>());
        assertThrows(Error.class, () -> {
            wallet.withdraw(999999);
        });
        assertEquals(UANG_AWAL, wallet.uangCash);
    }

    @Test
    void testDeposit() {
//        String a = "something";
//        String b = "something";
        String a = new String("something");
        String b = new String("something");

//        Wallet a = new Wallet(new String("something"), 123, new ArrayList<>());
//        Wallet b = new Wallet(new String("something"), 123, new ArrayList<>());

//        assertSame(a.ownerName, b.ownerName);
        assertSame(a, b);
    }

    @Test
    void testAddCard() {
    }

    @Test
    void testRemoveCard() {
    }
}
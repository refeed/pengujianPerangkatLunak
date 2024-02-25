package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Wallet2Test {

    @Test
    void testSetOwner() {

    }

    @Test
    void testTambahKartu() {

    }

    @Test
    void ambilKartu() {

    }

    @Test
    void testTambahUangRupiah() {

    }

    @Test
    void testAmbilUangUangnyaCukup() {
        Wallet2 wallet2 = new Wallet2("owner");
        wallet2.tambahUangRupiah(1000);
        int uangTaken = wallet2.ambilUang(1000);

        assertEquals(1000, uangTaken);
    }

    @Test
    void testAmbilUangUangnyaNggaCukup() {
        Wallet2 wallet2 = new Wallet2("owner");
        int uangTaken = wallet2.ambilUang(1000);

        assertEquals(0, uangTaken);
    }

    @Test
    void tampilkanUang() {

    }
}
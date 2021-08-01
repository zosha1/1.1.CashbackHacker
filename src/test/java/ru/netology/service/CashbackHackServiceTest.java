package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain700() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        assertEquals(300, cashbackHackService.remain(700));
    }

    @Test
    public void testRemain1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        assertEquals(0, cashbackHackService.remain(1000));
    }

    @Test
    public void testRemain4300() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        assertEquals(700, cashbackHackService.remain(4300));
    }
}
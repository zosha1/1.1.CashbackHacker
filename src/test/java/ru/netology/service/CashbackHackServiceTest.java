package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain700() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        assertEquals(cashbackHackService.remain(700), 300);
    }

    @Test
    public void testRemain1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        assertEquals(cashbackHackService.remain(1000), 0);
    }

    @Test
    public void testRemain4300() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        assertEquals(cashbackHackService.remain(4300), 700);
    }
}
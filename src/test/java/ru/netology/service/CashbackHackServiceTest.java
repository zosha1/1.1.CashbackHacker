package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain750() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        Assertions.assertEquals(250, cashbackHackService.remain(750));
    }

    @Test
    public void testRemain0() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        Assertions.assertEquals(1000, cashbackHackService.remain(0));
    }

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
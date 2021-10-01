package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 3650;

        int actual = service.remain(amount);
        int expected = 350;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemainFrom1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

}
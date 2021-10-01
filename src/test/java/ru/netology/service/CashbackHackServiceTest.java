package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateRemain(){
        CashbackHackService service = new CashbackHackService();

        int amount = 3650;

        Assert.assertEquals(service.remain(amount),350);


    }
    @Test
    public void shouldCalculateRemainFrom1000(){
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        Assert.assertEquals(service.remain(amount),0);


    }

}
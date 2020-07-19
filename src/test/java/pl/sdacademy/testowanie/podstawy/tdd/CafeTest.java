package pl.sdacademy.testowanie.podstawy.tdd;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Test kawiarni podstawowy test z wykorzystaniem prostych asercji
 *
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @since : 07.03.2020
 **/
public class CafeTest {


    @Test
    public void shouldServeCoffee() {

        //given
        Cafe cafe = new Cafe();

        // when
        cafe.serveCoffee();

        // then
        assertTrue(cafe.canServeCoffee());
    }

    @Test
    public void shouldNotServeCoffee() {

        //given
        Cafe cafe = new Cafe();

        // when
        //cafe.serveCoffee();

        // then
        assertFalse(cafe.canServeCoffee());//
    }


}
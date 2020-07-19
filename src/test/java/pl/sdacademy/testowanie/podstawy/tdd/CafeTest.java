package pl.sdacademy.testowanie.podstawy.tdd;


import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Test kawiarni podstawowy test z wykorzystaniem prostych asercji
 *
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @since : 07.03.2020
 **/
public class CafeTest {

    private Cafe cafe;

    @Before
    public void before(){
        //given
        cafe = new Cafe();
    }


    @Test
    public void shouldServeCoffee() {

        // when
        cafe.serveCoffee();

        // then
        assertTrue(cafe.canServeCoffee());
        assertThat(cafe.canServeCoffee()).isTrue();
    }

    @Test
    public void shouldNotServeCoffee() {

        // when
        //cafe.serveCoffee();

        // then
        assertFalse(cafe.canServeCoffee());//
    }


}
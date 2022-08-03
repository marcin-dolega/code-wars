package pl.dolega;

import org.junit.Assert;
import org.junit.Test;
import pl.dolega.kata._6kyu.GoodVsEvil;

public class GoodVsEvilTest {

    @Test
    public void goodWinsTest() {
        // given
        String goods = "1 1 1 1 1 1";
        String evils = "1 1 1 1 1 1 0";
        // when
        String result = GoodVsEvil.battle(goods, evils);
        // then
        Assert.assertEquals("Battle Result: Good triumphs over Evil", result);
    }

    @Test
    public void evilWinsTest() {
        // given
        String goods = "1 1 1 1 1 1";
        String evils = "1 1 1 1 1 1 1";
        // when
        String result = GoodVsEvil.battle(goods, evils);
        // then
        Assert.assertEquals("Battle Result: Evil eradicates all trace of Good", result);
    }

    @Test
    public void drawTest() {
        // given
        String goods = "1 1 1 0 0 1";
        String evils = "1 1 0 0 1 0 1";
        // when
        String result = GoodVsEvil.battle(goods, evils);
        // then
        Assert.assertEquals("Battle Result: No victor on this battle field", result);
    }
}

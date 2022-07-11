package pl.dolega.kata;

public class GoodVsEvil {

    public static String battle(String goodAmounts, String evilAmounts) {

        int goodArmy = 0;
        int evilArmy = 0;

        String result;

        int[] goodUnits = new int[]{1, 2, 3, 3, 4, 10};
        int[] evilUnits = new int[]{1, 2, 2, 2, 3, 5, 10};

        String[] goods = goodAmounts.split(" ");
        String[] evils = evilAmounts.split(" ");

        for (int i = 0; i < goods.length; i++) {
            goodArmy += goodUnits[i] * Integer.parseInt(goods[i]);
        }

        for (int i = 0; i < evils.length; i++) {
            evilArmy += evilUnits[i] * Integer.parseInt(evils[i]);
        }

        if (goodArmy == evilArmy) {
            result = "No victor on this battle field";
        } else if (goodArmy > evilArmy) {
            result = "Good triumphs over Evil";
        } else {
            result = "Evil eradicates all trace of Good";
        }

        return "Battle Result: " + result;
    }
}

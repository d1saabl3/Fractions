package cz.educanet;

import java.util.ArrayList;

public class MathUtils {

    /**
     * Calculates the greatest common divisor.
     * https://www.bbc.co.uk/bitesize/guides/z9hb97h/revision/5
     * ie. for 8 and 12 => 4.
     * ie. for 10 and 5 => 5.
     * ect.
     * @param a first number
     * @param b second number
     * @return GCD
     */

    public static int findGreatestCommonDenominator(int a, int b) {
        ArrayList<Integer> list = new ArrayList<>();
        int gcd = 0;

        float toA = (float) a;
        float toB = (float) b;

        for (int i = 0; i <= a; i++) {
            if (toA / i == Math.floor(toA/i)) {
                list.add(i);
            }
        }

        for (int i = b; i <= b; i--) {
            if ((toB / i == Math.floor(toB/i)) && list.contains(i)) {
                gcd = i;
                return gcd;
            }
        }
        return 0;
    }

    /**
     * Calculates the lowest common multiple.
     * https://www.bbc.co.uk/bitesize/guides/z9hb97h/revision/5
     * ie. for 5 and 6 => 30.
     * multiples for 5: 5, 10, 15, 20, 25, *30*, 35...
     * multiples for 6: 6, 12, 18, 24, *30*...
     * @param a first number
     * @param b second number
     * @return GCD
     */

    public static int findLowestCommonMultiple(int a, int b) {
        ArrayList<Integer> list = new ArrayList<>();
        int prvniCislo = 0;
        int druhyCislo = 0;

        int nejnizsiSpolecnyNasobek = 0;

        for (int i = 1; i <= b; i++) {
            prvniCislo = a * i;
            list.add(prvniCislo);
        }

        for (int j = 1; j < a; j++) {
            druhyCislo = b * j;
            if (list.contains(druhyCislo)) {
                nejnizsiSpolecnyNasobek = druhyCislo;

                return nejnizsiSpolecnyNasobek;
            }
        }
        return 0;
    }

}

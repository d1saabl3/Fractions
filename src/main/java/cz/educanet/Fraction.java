package cz.educanet;

public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //region: basic operations (+, -, *, /)
    //Scitani
    public Fraction plus(Fraction other) {
        int anoMatikaJeFaktSuperPredmetMilujuToJJ = MathUtils.findLowestCommonMultiple(denominator, other.denominator);

        int a = anoMatikaJeFaktSuperPredmetMilujuToJJ / denominator;
        int b = anoMatikaJeFaktSuperPredmetMilujuToJJ / other.denominator;
        int c = numerator * a;
        int d = other.numerator * b;

        int vysledek = c + d;

        return new Fraction(vysledek, anoMatikaJeFaktSuperPredmetMilujuToJJ);
    }

    //Odecitani
    public Fraction minus(Fraction other) {
        int anoMatikaJeFaktSuperPredmetMilujuToJJ = MathUtils.findLowestCommonMultiple(denominator, other.denominator);

        int a = anoMatikaJeFaktSuperPredmetMilujuToJJ / denominator;
        int b = anoMatikaJeFaktSuperPredmetMilujuToJJ / other.denominator;
        int c = numerator * a;
        int d = other.numerator * b;

        int vysledek = c - d;

        return new Fraction(vysledek, anoMatikaJeFaktSuperPredmetMilujuToJJ);
    }

    //Nasobeni
    public Fraction times(Fraction other) {

        int nasobeniXD = numerator * other.numerator;
        int nasobenickoXD = denominator * other.denominator;

        return new Fraction(nasobeniXD, nasobenickoXD);
    }

    //Deleni
    public Fraction dividedBy(Fraction other) {

        int deleniXD = numerator * other.denominator;
        int delenickoXD = denominator * other.numerator;

        return new Fraction(deleniXD, delenickoXD);
    }
    //endregion

    //region: other operations
    //Prehozeni
    public Fraction getReciprocal() {
        return new Fraction (getDenominator(),getNumerator());
    }
    //Zjednoduseni
    public Fraction simplify() {
        int anoMatikaJeFaktSuperPredmetMilujuToJJ = MathUtils.findGreatestCommonDenominator(numerator, denominator);

        int ano = numerator / anoMatikaJeFaktSuperPredmetMilujuToJJ;
        int bne = denominator / anoMatikaJeFaktSuperPredmetMilujuToJJ;

        return new Fraction(ano,bne);
    }

    //Plovouci cislo
    public float toFloat() {
        int cislo = 0;
        float desetineCislo = cislo;

        if (denominator != 0) {
            desetineCislo = (float)numerator / (float)denominator;
        }
        else {
            System.out.println("Nejde dělit nulou (nečekaně)");
        }

        return desetineCislo;
    }
    //endregion

    //region: getters
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    //endregion
}

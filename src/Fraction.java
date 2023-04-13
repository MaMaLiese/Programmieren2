public class Fraction {
    private int numerator;
    private int denomenator;

    public int getDenomenator() {
        return denomenator;
    }

    public double toDecimal() {
        return (double) numerator / denomenator;
    }

    public void print() {
        System.out.println(numerator + "/" + denomenator);
    }

        public Fraction multiplicate(Fraction b2){
            return new Fraction(b2.getNumerator() )


        }
    public Fraction multiplicate(Fraction b2, Fraction b3) {
        Fraction tempResult = this.multiplicate(b2);
        Fraction result = tempResult.multiplicate(b3);

        return result;


    }


    }
}

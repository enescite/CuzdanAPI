package com.kartim;

public class Cuzdan {
    private double bakiye;

    public Cuzdan() {
        this.bakiye = 0.0;
    }

    public void cuzdanaParaYukle(double miktar) {
        this.bakiye += miktar;
    }

    public void cuzdandanParaHarca(double miktar) {
        if (miktar <= bakiye) {
            this.bakiye -= miktar;
        } else {
            throw new IllegalArgumentException("Yetersiz bakiye!");
        }
    }

    public double bakiyeSorgula() {
        return bakiye;
    }
}
package Pertemuan5;

public class IMT {
    private double beratBadan;
    private double tinggiBadan;

    public IMT(double beratBadan, double tinggiBadan) {
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

    public double hitungIMT() {
        return beratBadan / (tinggiBadan * tinggiBadan);
    }

    public String tentukanKriteria() {
        double imt = hitungIMT();
        if (imt <= 18.4) {
            return "Berat Badan Kurang";
        } else if (imt <= 24.9) {
            return "Berat Badan Ideal";
        } else if (imt <= 29.9) {
            return "Berat Badan Lebih";
        } else if (imt <= 39.9) {
            return "Gemuk";
        } else {
            return "Sangat Gemuk";
        }
    }
}

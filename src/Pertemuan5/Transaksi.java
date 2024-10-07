package Pertemuan5;

class Transaksi {
    private double totalPembelian;

    public Transaksi(double totalPembelian) {
        this.totalPembelian = totalPembelian;
    }

    public double hitungPotongan() {
        if (totalPembelian < 50000) {
            return totalPembelian * 0.05;
        } else {
            return totalPembelian * 0.20;
        }
    }

    public double hitungJumlahBayar() {
        return totalPembelian - hitungPotongan();
    }

    public double getTotalPembelian() {
        return totalPembelian;
    }
}
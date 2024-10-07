package Pertemuan5;

public class Mahasiswa {
    private String npm;
    private String nama;
    private double nilaiKehadiran;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;

    public Mahasiswa(String npm, String nama, double nilaiKehadiran, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.npm = npm;
        this.nama = nama;
        this.nilaiKehadiran = nilaiKehadiran;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public double hitungNilaiRataRata() {
        return (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }

    public String tentukanGrade() {
        double nilaiRataRata = hitungNilaiRataRata();
        if (nilaiRataRata >= 76) {
            return "A";
        } else if (nilaiRataRata >= 66) {
            return "B";
        } else if (nilaiRataRata >= 56) {
            return "C";
        } else if (nilaiRataRata >= 46) {
            return "D";
        } else {
            return "E";
        }
    }

    public String tentukanKeterangan() {
        String grade = tentukanGrade();
        switch (grade) {
            case "A":
                return "ISTIMEWA";
            case "B":
                return "BAIK";
            case "C":
                return "CUKUP";
            case "D":
                return "KURANG";
            case "E":
                return "KURANG SEKALI";
            default:
                return "error";
        }
    }

    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }
}
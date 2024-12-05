package Pertemuan9;

public class HitungHari {
     public static int hitung(int tahun, String bulan) {
        switch (bulan) {
            case "Januari":
            case "Maret":
            case "Mei":
            case "Juli":
            case "Agustus":
            case "Oktober":
            case "Desember":
                return 31;
            case "April":
            case "Juni":
            case "September":
            case "November":
                return 30;
            case "Februari":
                return (tahun % 4 == 0 && (tahun % 100 != 0 || tahun % 400 == 0)) ? 29 : 28;
            default:
                return 0;
        }
    }
    
}

package Pertemuan10;

public class Mahasiswa {
      private String NIM, Nama, Alamat, MKul;
    private String nilaiAkhir;

    public Mahasiswa(String NIM, String Nama, String Alamat, String MKul, String nilaiAkhir){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.MKul = MKul;
        this.nilaiAkhir = nilaiAkhir; 
    }

    public String getAlamat(){
        return Alamat;
    }

    public String getNIM(){
        return NIM;
    }

    public String getNama(){
        return Nama;
    }
    
    public String getMk(){
        return MKul;
    }
    
    public String getNilai(){
        return nilaiAkhir;
    }
    
}

package KeretaBarang;

import KeretaAPI.KeretaApi;

public class KeretaBarang extends KeretaApi {
    private String jenisMuatan;
    private double kapasitasMaksimum;
    private double beratMuatanSaatIni;
    private String kodeGudangAsal;
    private String kodeGudangTujuan;

    public KeretaBarang(String NO_KA, String Nama_KA, String Relasi, String Lokomotif, double KM_Tempuh, String[] Rangkaian,
                        String jenisMuatan, double kapasitasMaksimum, double beratMuatanSaatIni,
                        String kodeGudangAsal, String kodeGudangTujuan) {
        super(NO_KA, Nama_KA, Relasi, Lokomotif, KM_Tempuh, Rangkaian);
        this.jenisMuatan = jenisMuatan;
        this.kapasitasMaksimum = kapasitasMaksimum;
        this.beratMuatanSaatIni = beratMuatanSaatIni;
        this.kodeGudangAsal = kodeGudangAsal;
        this.kodeGudangTujuan = kodeGudangTujuan;
    }

    public String getJenisMuatan() {
        return jenisMuatan;
    }

    public double getKapasitasMaksimum() {
        return kapasitasMaksimum;
    }

    public double getBeratMuatanSaatIni() {
        return beratMuatanSaatIni;
    }

    public String getKodeGudangAsal() {
        return kodeGudangAsal;
    }

    public String getKodeGudangTujuan() {
        return kodeGudangTujuan;
    }

    public void tampilkanInformasiMuatan() {
        System.out.println("=== Informasi Muatan Kereta Barang ===");
        System.out.println("Jenis Muatan: " + jenisMuatan);
        System.out.println("Berat Saat Ini: " + beratMuatanSaatIni + " ton");
        System.out.println("Kapasitas Maksimum: " + kapasitasMaksimum + " ton");
    }

    public boolean isOverloaded() {
        return beratMuatanSaatIni > kapasitasMaksimum;
    }
}

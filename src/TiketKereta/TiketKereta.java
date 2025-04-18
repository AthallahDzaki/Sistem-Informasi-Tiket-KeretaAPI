package TiketKereta;

public class TiketKereta {
    private String nomorKereta;
    private String namaKereta;
    private String nomorTiket;
    private String namaPenumpang;
    private String nomorIdentitas;
    private String jenisKelamin;
    private int usia;
    private String nomorKursi;
    private String kelasKereta;
    private double hargaTiket;
    private String stasiunAsal;
    private String stasiunTujuan;
    private String jadwalKeberangkatan;
    private String jadwalKedatangan;
    private String statusTiket; // "Dipesan", "Dibayar", "Dibatalkan"

    // Constructor (optional)
    public TiketKereta() {
        this.statusTiket = "Dipesan"; // default status
    }

    // Getter & Setter
    public String getNomorKereta() {
        return nomorKereta;
    }

    public void setNomorKereta(String nomorKereta) {
        this.nomorKereta = nomorKereta;
    }

    public String getNamaKereta() {
        return namaKereta;
    }

    public void setNamaKereta(String namaKereta) {
        this.namaKereta = namaKereta;
    }

    public String getNomorTiket() {
        return nomorTiket;
    }

    public void setNomorTiket(String nomorTiket) {
        this.nomorTiket = nomorTiket;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public void setNamaPenumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }

    public String getNomorIdentitas() {
        return nomorIdentitas;
    }

    public void setNomorIdentitas(String nomorIdentitas) {
        this.nomorIdentitas = nomorIdentitas;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getNomorKursi() {
        return nomorKursi;
    }

    public void setNomorKursi(String nomorKursi) {
        this.nomorKursi = nomorKursi;
    }

    public String getKelasKereta() {
        return kelasKereta;
    }

    public void setKelasKereta(String kelasKereta) {
        this.kelasKereta = kelasKereta;
    }

    public double getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(double hargaTiket) {
        this.hargaTiket = hargaTiket;
    }

    public String getStasiunAsal() {
        return stasiunAsal;
    }

    public void setStasiunAsal(String stasiunAsal) {
        this.stasiunAsal = stasiunAsal;
    }

    public String getStasiunTujuan() {
        return stasiunTujuan;
    }

    public void setStasiunTujuan(String stasiunTujuan) {
        this.stasiunTujuan = stasiunTujuan;
    }

    public String getJadwalKeberangkatan() {
        return jadwalKeberangkatan;
    }

    public void setJadwalKeberangkatan(String jadwalKeberangkatan) {
        this.jadwalKeberangkatan = jadwalKeberangkatan;
    }

    public String getJadwalKedatangan() {
        return jadwalKedatangan;
    }

    public void setJadwalKedatangan(String jadwalKedatangan) {
        this.jadwalKedatangan = jadwalKedatangan;
    }

    public String getStatusTiket() {
        return statusTiket;
    }

    public void setStatusTiket(String statusTiket) {
        this.statusTiket = statusTiket;
    }

    // Method: Bayar Tiket
    public void bayarTiket() {
        if (statusTiket.equals("Dipesan")) {
            statusTiket = "Dibayar";
            System.out.println("Tiket berhasil dibayar.");
        } else {
            System.out.println("Tiket tidak dapat dibayar. Status saat ini: " + statusTiket);
        }
    }

    // Method: Batalkan Tiket
    public void batalkanTiket() {
        if (!statusTiket.equals("Dibatalkan")) {
            statusTiket = "Dibatalkan";
            System.out.println("Tiket berhasil dibatalkan.");
        } else {
            System.out.println("Tiket sudah dibatalkan sebelumnya.");
        }
    }

    // Method: Ubah Jadwal
    public void ubahJadwal(String keberangkatanBaru, String kedatanganBaru) {
        if (statusTiket.equals("Dipesan")) {
            this.jadwalKeberangkatan = keberangkatanBaru;
            this.jadwalKedatangan = kedatanganBaru;
            System.out.println("Jadwal tiket berhasil diubah.");
        } else {
            System.out.println("Jadwal tidak dapat diubah karena tiket sudah " + statusTiket);
        }
    }

    // Method: Cek Status Tiket
    public String cekStatus() {
        return statusTiket;
    }

    // Method: Tampilkan Detail Tiket
    public void tampilkanDetailTiket() {
        System.out.println("===== DETAIL TIKET =====");
        System.out.println("Nomor Tiket: " + nomorTiket);
        System.out.println("Nama Penumpang: " + namaPenumpang);
        System.out.println("Nomor Identitas: " + nomorIdentitas);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Usia: " + usia);
        System.out.println("Nomor Kursi: " + nomorKursi);
        System.out.println("Kelas Kereta: " + kelasKereta);
        System.out.println("Harga Tiket: Rp" + hargaTiket);
        System.out.println("Stasiun Asal: " + stasiunAsal);
        System.out.println("Stasiun Tujuan: " + stasiunTujuan);
        System.out.println("Jadwal Keberangkatan: " + jadwalKeberangkatan);
        System.out.println("Jadwal Kedatangan: " + jadwalKedatangan);
        System.out.println("Status Tiket: " + statusTiket);
    }

    // Method: Hitung Harga Total
    public double hitungHargaTotal(int jumlahTiket) {
        return hargaTiket * jumlahTiket;
    }

    // Method: Ganti Kursi
    public void gantiKursi(String nomorKursiBaru) {
        if (statusTiket.equals("Dipesan")) {
            this.nomorKursi = nomorKursiBaru;
            System.out.println("Nomor kursi berhasil diubah ke " + nomorKursiBaru);
        } else {
            System.out.println("Kursi tidak dapat diubah karena tiket sudah " + statusTiket);
        }
    }
}

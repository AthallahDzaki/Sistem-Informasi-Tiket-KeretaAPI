package TiketEksekutif;

import TiketKereta.TiketKereta;

public class TiketEksekutif extends TiketKereta {
    private double tarifTambahan;
    private boolean layananMakan;

    public TiketEksekutif() {
        super(); // Memanggil constructor dari TiketKereta
    }

    // Getter dan Setter
    public double getTarifTambahan() {
        return tarifTambahan;
    }

    public void setTarifTambahan(double tarifTambahan) {
        this.tarifTambahan = tarifTambahan;
    }

    public boolean isLayananMakan() {
        return layananMakan;
    }

    public void setLayananMakan(boolean layananMakan) {
        this.layananMakan = layananMakan;
    }

    // Overloading: Menambahkan metode hitungHargaTotal untuk tiket eksekutif
    @Override
    public double hitungHargaTotal(int jumlahTiket, double tarifTambahan) {
        double total = super.hitungHargaTotal(jumlahTiket);
        return total + tarifTambahan;
    }

    // Overriding: Menimpa metode cekStatus dari TiketKereta
    @Override
    public String cekStatus() {
        return "Tiket Eksekutif - Status: " + super.cekStatus();
    }

    // Overriding: Menimpa metode hitungHargaTotal untuk tiket eksekutif
    @Override
    public double hitungHargaTotal(int jumlahTiket) {
        double total = super.hitungHargaTotal(jumlahTiket);
        if (isLayananMakan()) {
            total += tarifTambahan;  // Menambahkan tarif tambahan jika ada layanan makan
        }
        return total;
    }
}

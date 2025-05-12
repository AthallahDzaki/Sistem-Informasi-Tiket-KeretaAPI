package KeretaAPI;

public class KeretaApi {
    private String NO_KA;
    private String Nama_KA;
    private String Relasi;
    private String Lokomotif;
    private double KM_Tempuh;
    private String[] Rangkaian;

    public KeretaApi(String NO_KA, String Nama_KA, String Relasi, String Lokomotif, double KM_Tempuh, String[] Rangkaian) {
        this.NO_KA = NO_KA;
        this.Nama_KA = Nama_KA;
        this.Relasi = Relasi;
        this.Lokomotif = Lokomotif;
        this.KM_Tempuh = KM_Tempuh;
        this.Rangkaian = Rangkaian;
    }

    public String getNO_KA() {
        return NO_KA;
    }

    public String getNama_KA() {
        return Nama_KA;
    }

    public String getRelasi() {
        return Relasi;
    }

    public String getLokomotif() {
        return Lokomotif;
    }

    public double getKM_Tempuh() {
        return KM_Tempuh;
    }

    public String[] getRangkaian() {
        return Rangkaian;
    }

    public void setLokomotif(String lokomotif) {
        this.Lokomotif = lokomotif;
    }

    // Overloading: Menambahkan gerbong, bisa ditambahkan parameter untuk lokasi gerbong baru
    public void tambahGerbong(String gerbongBaru) {
        String[] newRangkaian = new String[Rangkaian.length + 1];
        System.arraycopy(Rangkaian, 0, newRangkaian, 0, Rangkaian.length);
        newRangkaian[Rangkaian.length] = gerbongBaru;
        Rangkaian = newRangkaian;
        System.out.println("Gerbong " + gerbongBaru + " berhasil ditambahkan.");
    }

    // Overloading: Menambahkan gerbong pada posisi tertentu
    public void tambahGerbong(String gerbongBaru, int posisi) {
        if (posisi < 0 || posisi > Rangkaian.length) {
            System.out.println("Posisi gerbong tidak valid.");
            return;
        }
        String[] newRangkaian = new String[Rangkaian.length + 1];
        System.arraycopy(Rangkaian, 0, newRangkaian, 0, posisi);
        newRangkaian[posisi] = gerbongBaru;
        System.arraycopy(Rangkaian, posisi, newRangkaian, posisi + 1, Rangkaian.length - posisi);
        Rangkaian = newRangkaian;
        System.out.println("Gerbong " + gerbongBaru + " berhasil ditambahkan di posisi " + posisi);
    }

    // Overriding: Menimpa metode hitungTotalJarak untuk menghitung jarak total perjalanan
    public double hitungTotalJarak(int jumlahPerjalanan) {
        return KM_Tempuh * jumlahPerjalanan;
    }

    // Overloading: Menambahkan parameter untuk menghitung jarak dengan estimasi waktu
    public double hitungTotalJarak(int jumlahPerjalanan, double estimasiWaktuPerjalanan) {
        return (KM_Tempuh * jumlahPerjalanan) / estimasiWaktuPerjalanan;
    }

    // Menghapus Gerbong
    public void hapusGerbong(String gerbongHapus) {
        int index = -1;
        for (int i = 0; i < Rangkaian.length; i++) {
            if (Rangkaian[i].equals(gerbongHapus)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            String[] newRangkaian = new String[Rangkaian.length - 1];
            System.arraycopy(Rangkaian, 0, newRangkaian, 0, index);
            System.arraycopy(Rangkaian, index + 1, newRangkaian, index, Rangkaian.length - index - 1);
            Rangkaian = newRangkaian;
            System.out.println("Gerbong " + gerbongHapus + " berhasil dihapus.");
        } else {
            System.out.println("Gerbong " + gerbongHapus + " tidak ditemukan.");
        }
    }
}

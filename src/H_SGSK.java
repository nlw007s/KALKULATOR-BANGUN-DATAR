public class H_SGSK extends H_Segitiga {
    int kaki;
    int hasil;

    public int h_keliling() {
        hasil = (2 * kaki) + alas;
        return hasil;
    }

    public int h_luas() {
        hasil = (alas * tinggi) / 2;
        return hasil;
    }

    public int getKaki() {
        return kaki;
    }

    public void setKaki(int kaki) {
        this.kaki = kaki;
    }

    public int getHasil() {
        return hasil;
    }

    public void setHasil(int hasil) {
        this.hasil = hasil;
    }
}

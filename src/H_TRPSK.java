public class H_TRPSK extends H_Trapesium{
    int sm;

    public int h_keliling () {
        hasil = sm + t + sisi_atas + sisi_bawah;
        return hasil;
    }

    public int h_luas () {
        hasil = ((sisi_atas + sisi_bawah) * t) / 2;
        return hasil;
    }

    public int getSm() {
        return sm;
    }

    public void setSm(int sm) {
        this.sm = sm;
    }
}

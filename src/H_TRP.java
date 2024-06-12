public class H_TRP extends H_Trapesium {
    int sm_1;
    int sm_2;

    public int h_keliling () {
        hasil = sm_1 + sm_2 + sisi_atas + sisi_bawah;
        return hasil;
    }

    public int h_luas () {
        hasil = ((sisi_atas + sisi_bawah) * t) / 2;
        return hasil;
    }

    public int getSm_1() {
        return sm_1;
    }

    public void setSm_1(int sm_1) {
        this.sm_1 = sm_1;
    }

    public int getSm_2() {
        return sm_2;
    }

    public void setSm_2(int sm_2) {
        this.sm_2 = sm_2;
    }
}

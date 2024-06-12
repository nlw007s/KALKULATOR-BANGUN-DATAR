import java.util.InputMismatchException;

public class H_PersegiPanjang {
    int panjang;
    int lebar;
    int hasil;

    public int h_keliling() {
        hasil = 2 * (panjang + lebar);
        return hasil;
    }

    public int h_luas() {
        hasil = panjang * lebar;
        return hasil;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getHasil() {
        return hasil;
    }

    public void setHasil(int hasil) {
        this.hasil = hasil;
    }
}

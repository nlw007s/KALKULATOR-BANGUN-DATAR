import java.util.InputMismatchException;

public class H_SGSS extends H_Segitiga{
    int s;
    int hasil;

    public int h_keliling() {
        hasil = s * 3;
        return hasil;
    }

    public int h_luas() {
        hasil = (alas * tinggi) / 2;
        return hasil;
    }

    public int getHasil() {
        return hasil;
    }

    public void setHasil(int hasil) {
        this.hasil = hasil;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }
}

import java.util.InputMismatchException;

public class H_Persegi {
    int s;
    int hasil;

    public int h_keliling() {
        hasil = 4 * s;
        return hasil;
    }

    public int h_luas() {
        hasil = s * s;
        return hasil;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getHasil() {
        return hasil;
    }

    public void setHasil(int hasil) {
        this.hasil = hasil;
    }
}

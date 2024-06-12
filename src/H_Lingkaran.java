import java.math.*;
import java.util.InputMismatchException;

public class H_Lingkaran {
    private final double phi = 3.14;
    double r;
    double hasil;

    public double h_keliling() {
        hasil = phi * (2 * r);
        return hasil;
    }

    public double h_luas() {
        hasil = phi * Math.pow(r, 2);
        return hasil;
    }

    public double getPhi() {
        return phi;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getHasil() {
        return hasil;
    }

    public void setHasil(int hasil) {
        this.hasil = hasil;
    }
}

import java.util.InputMismatchException;

public class H_SGSKSK extends H_Segitiga{
    int sisiMiring;
    int hasil;

    public int h_keliling() {
        hasil = alas + tinggi + sisiMiring;
        return hasil;
    }

    public int h_luas() {
        hasil = (alas * tinggi) / 2;
        return hasil;
    }

    public int getSisiMiring() {
        return sisiMiring;
    }

    public void setSisiMiring(int sisiMiring) {
        this.sisiMiring = sisiMiring;
    }

    public int getHasil() {
        return hasil;
    }

    public void setHasil(int hasil) {
        this.hasil = hasil;
    }
}

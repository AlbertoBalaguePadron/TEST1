import java.util.Scanner;

public class calcular {
    Scanner leer = new Scanner(System.in);
    long A;
    long B;

    public calcular(long a, long b) {
        this.A = a;
        this.B = b;
    }

    public long suma() {
        return A + B;
    }

    public long resta() {
        return A - B;
    }

    public long multi() {
        return A * B;
    }

    public long Divi() {
        return A / B;
    }

    public long absolu() {
        return Math.abs(A);
    }

    public long elevado() {
        return (long) Math.pow(A, B);
    }

    public boolean positivo() {
        if (A < 0)
            return false;
        else
            return true;

    }

}

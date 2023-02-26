import com.devinhouse.ex1.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente ac = new ContaCorrente(100);

        ac.depositar(1000);
        ac.sacar(300);
        ac.sacar(1300);
    }

}
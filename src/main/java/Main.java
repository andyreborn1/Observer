import observer.AcoesLogger;
import observer.Grafico;
import observer.Wallet;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AcoesLogger logger = new AcoesLogger();
        Grafico grafico = new Grafico();
        Wallet wallet = new Wallet();
        String[] codes = {"ABCB4", "ALPA4","ALUP11","ABEV3"};
        Random random = new Random();

        wallet.attach(logger);
        wallet.attach(grafico);

        for (int i = 0; i < 50; i++) {
            wallet.addAcoes(codes[random.nextInt(4)], random.nextInt(40)-10);
            Thread.sleep(1500);
        }
    }
}

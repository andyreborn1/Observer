package observer;

import java.util.logging.Logger;

public class AcoesLogger implements Observer {

    private Logger logger = Logger.getLogger("loguinho");

    @Override
    public void update(String code, Integer qt) {
        logger.info("Quantidade da ação " + code + " alterada para " + qt);
    }
}

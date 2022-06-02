package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wallet implements Publisher {

    private Map<String, Integer> acoes = new HashMap<>();
    private List<Observer> obs = new ArrayList<>();

    public void addAcoes(String code, Integer qt) {
        if (acoes.containsKey(code)) {
            qt += acoes.get(code);
        }

        if (qt < 0) qt = 0;

        acoes.put(code, qt);
        notify(code, qt);
    }

    @Override
    public void notify(String code, Integer qt) {
        obs.forEach(observer -> observer.update(code, qt));
    }

    @Override
    public void attach(Observer observer) {
        obs.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        obs.remove(observer);
    }
}

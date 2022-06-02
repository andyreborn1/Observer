package observer;

public interface Publisher {
    void notify(String code, Integer qt);
    void attach(Observer observer);
    void detach(Observer observer);
}

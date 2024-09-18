package code.sammy;

public interface Subject {
    void subscriber(Subscriber sub);

    void unSubscribe(Subscriber sub);

    void notifySubscribers();

    void upload(String title);
}

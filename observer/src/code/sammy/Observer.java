package code.sammy;

public interface Observer {
    void update();

    void subscribeChannel(Channel ch);
}

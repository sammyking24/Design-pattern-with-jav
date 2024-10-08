package code.sammy;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

    private List<Subscriber> subs = new ArrayList<>();
     String title;

    @Override
    public void subscriber(Subscriber sub){
        subs.add(sub);
    }

    @Override
    public void unSubscribe(Subscriber sub){
        subs.remove(sub);
    }
    @Override
    public void notifySubscribers(){
        for (Subscriber sub : subs){
            sub.update();
        }
    }
    @Override
    public void upload(String title){
        this.title = title;
        notifySubscribers();
    }
}

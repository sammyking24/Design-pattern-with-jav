import code.sammy.Channel;
import code.sammy.Subscriber;

public class Youtube {
    public static void main(String[] args) {

        Channel sammyCode = new Channel();
        Subscriber s1 = new Subscriber("SwiftaSystem");
        Subscriber s2 = new Subscriber("NationBest");
        Subscriber s3 = new Subscriber("NifeEmpire");
        Subscriber s4 = new Subscriber("JomaTech");
        Subscriber s5 = new Subscriber("TechLead");
        Subscriber s6 = new Subscriber("JustJollof");
        Subscriber s7 = new Subscriber("OlaOfLagos");

        sammyCode.subscriber(s1);
        sammyCode.subscriber(s2);
        sammyCode.subscriber(s3);
        sammyCode.subscriber(s4);
        sammyCode.subscriber(s5);
        sammyCode.subscriber(s6);
        sammyCode.subscriber(s7);

        sammyCode.unSubscribe(s7);

        s1.subscribeChannel(sammyCode);
        s2.subscribeChannel(sammyCode);
        s3.subscribeChannel(sammyCode);
        s4.subscribeChannel(sammyCode);
        s5.subscribeChannel(sammyCode);
        s6.subscribeChannel(sammyCode);
        s7.subscribeChannel(sammyCode);


        sammyCode.upload("Design Patterns with JAVA");
    }
}
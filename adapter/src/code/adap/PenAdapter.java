package code.adap;

import code.adap.sammycode.PilotPen;

public class PenAdapter implements Pen{

    PilotPen pp = new PilotPen();
    @Override
    public void write(String str) {

        pp.sammy(str);
    }
}

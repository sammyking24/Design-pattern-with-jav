import code.adap.AssignmentWork;
import code.adap.Pen;
import code.adap.PenAdapter;

public class School {
    public static void main(String[] args) {

        Pen p = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(p);
        aw.writeAssignment("Im bit tired to write an Assignment");

    }
}
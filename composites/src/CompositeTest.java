import code.compositedesign.Composite;
import code.compositedesign.Leaf;




public class CompositeTest {
    public static void main(String[] args) {

        Leaf hd = new Leaf(70, "HDD");
        Leaf mouse = new Leaf(30, "Mouse");
        Leaf monitor = new Leaf(7000, "Monitor");
        Leaf ram = new Leaf(80, "Ram");
        Leaf cpu = new Leaf(5000, "CPU");


        Composite ph = new Composite("Peri");
        Composite cabinet = new Composite("Cabinet");
        Composite motherBoard = new Composite("MB");
        Composite computer = new Composite("computer");


        motherBoard.addComponent(cpu);
        motherBoard.addComponent(ram);

        ph.addComponent(mouse);
        ph.addComponent(hd);
        ph.addComponent(monitor);
        cabinet.addComponent(motherBoard);



        computer.addComponent(ph);
        computer.addComponent(cabinet);

        computer.ShowPrice();


    }
}
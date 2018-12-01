import BasicIO.*;
import Media.*;


public class Slot {

    private BasicForm display;
    int player;


    public Slot() {

        display = new BasicForm("Play", "Quit");
        int button = display.accept();










    }
    public static void main ( String[] args ) { Slot c = new Slot(); } ;
}
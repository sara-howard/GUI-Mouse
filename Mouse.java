
import ecs100.*;
import java.awt.Color;
import javax.swing.JColorChooser;

/**
 * Write a description of class Mouse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mouse {
    private Color currentColor = Color.black;   // default color
    private double brushSize = 5;  // default brush size
    private int clickcount = 0;
    private LineDrawer line;
    private DrawShape circle;
    
    /**
     * Constructor for objects of class Mouse
     */
    public Mouse() {
        // initialise instance variables
        UI.addButton("Colour",this::doChooseColor);
        UI.addSlider("Size", 1, 21, this::getSize);
        UI.addButton("Quit", UI::quit);
        UI.addButton("Line/Circle", this::chooseShape);
        line = new LineDrawer();
        circle = new DrawShape();
        UI.setMouseListener(line::doMouse);
    }

    public void doChooseColor() {
        this.currentColor = JColorChooser.showDialog(null, "Choose Color", this.currentColor);
        UI.setColor(this.currentColor);
    }
    
    public void getSize(double size) {
        this.brushSize = size;
        UI.setLineWidth(brushSize);
    }
    
    public void chooseShape() {
        clickcount+=1;
        if (clickcount%2 == 0) { // if click count even
            UI.setMouseListener(line::doMouse);
        }
        
        else { // if click count odd
            UI.setMouseListener(circle::doMouse);
        }
    }
    
    public static void main(String[] args) {
        Mouse mouse = new Mouse(); 
        
    }
}

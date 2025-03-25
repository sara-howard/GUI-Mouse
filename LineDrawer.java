import ecs100.*;
import java.awt.Color;
import javax.swing.JColorChooser;

/**
 * Let user draw lines on graphics pane with the mouse
 */
public class LineDrawer {
    private double startX, startY;  // fields to remember "pressed" position

    /**
     * Constructor for objects of class LineDrawer
     */
    public LineDrawer() {
        
    }
    
    public void doMouse(String action, double x, double y) {
        if (action.equals("pressed")) {
            this.startX = x;
            this.startY = y;
        }
        
        else if (action.equals("released")) {
            UI.drawLine(this.startX, this.startY, x, y);
        }
    }
    
    
}

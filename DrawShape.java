import ecs100.*;

/**
 * Let user draw shapes on graphics pane
 */
public class DrawShape {

    /**
     * Constructor for objects of class DrawShape
     */
    public DrawShape() {
        
    }
    
    public void doMouse(String action, double x, double y) {
        if (action.equals("clicked")) {
            UI.fillOval(x, y, 50, 50);
        }
    }
    
}

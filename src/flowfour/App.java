/**
 *
 *      @author Simon
 * 
 *      @program Starting point for flowfour operation. psvm();
 */

package flowfour;


public class App {
    
    public static void main(String[] args) {
       WordPairControlIF control = new Control();
       Graphics gui = new Graphics(control);
       gui.setVisible(true);
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flowfour;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Simon
 */
public class Formatter {

    private FileWriter fw;
    private Scanner scan;
    private String path;
    private String fileName;

    public Formatter() {
        setup();
    }

    
    private void setup(){
       String dir = System.getProperty("user.dir"); 
       fileName = "ordbog";
       path = dir+"/"+"ordbog"+"/"+fileName;
    }
    
    
    public void saveToFile() {
        try {

            fw = new FileWriter(new File("lol"));



        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    public void readFromFile() {
        try {
            scan = new Scanner(new File(path));
            
        
        
        } catch (FileNotFoundException ex) {
            
        }
        
        
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flowfour;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Simon
 */
public class Formatter
{

    private FileWriter fw;
    private Scanner scan;
    private String path;
    private String fileName;
    private ArrayList<String> wordPairs = new ArrayList<>();

    ;

    
    public Formatter()
    {
        setup();
    }

    private void setup()
    {
        String dir = System.getProperty("user.dir");
        fileName = "ordbog";
        path = dir + "/" + "ordbog" + "/" + fileName;
    }

    public boolean saveToFile()
    {
        try
        {

            fw = new FileWriter("lol");
            for (String str : wordPairs)
            {
                fw.write(str);
            }
            fw.close();
            System.out.println(fileName + " has been saved");


        } catch (Exception ex)
        {
            System.out.println("error" + ex);
            return false;
        }
        return true;
    }

    public boolean readFromFile()
    {
        try
        {
            scan = new Scanner(new File(path));
            while (scan.hasNext())
            {
                wordPairs.add(scan.next());
            }
            scan.close();
            System.out.println(fileName + " has been loaded ");




        } catch (FileNotFoundException ex)
        {
            System.out.println("error" + ex);
            return false;

        }

        return true;
    }
//    public boolean delete()
//    {
//        try
//        {
//            if (file.delete())
//            {
//                System.out.println(fileName + "is deleted");
//            } else
//            {
//                System.out.println("Unable to delete" + fileName);
//                return false;
//            }
//
//        } catch (Exception e)
//        {
//
//            e.printStackTrace();
//
//        }
//        return true;
//    }
    public void clear()
    {
        wordPairs.clear();
    }
}

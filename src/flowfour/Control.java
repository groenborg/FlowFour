/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flowfour;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javazoom.jl.decoder.JavaLayerException;

/**
 *
 * @author Simon
 */
public class Control implements WordPairControlIF {

    private ArrayList<String> wordPairs = new ArrayList();
    private Translator translator;
    
    @Override
    public void add(String question, String answer) {
        question = question.trim();
        answer = answer.trim();
        char divider = ',';
        int difficulty = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(question).append(divider);
        sb.append(answer).append(divider);
        sb.append(difficulty);
        wordPairs.add(sb.toString());
        
        translator = new Translator();
        
        try{
            translator.readOutLoud(answer);
        
        }catch(IOException | JavaLayerException e){
            
        }
        System.out.println(wordPairs.get(difficulty));
    }

    @Override
    public boolean delete(String question) {
        
        // følg op på det her
        
        for(int x = 0; x < wordPairs.size();++x){
            String wp = wordPairs.get(x);
            String[] a = wp.split(",");
            if(a[0].equalsIgnoreCase(question)){
                wordPairs.remove(x);
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return wordPairs.size();
    }

    @Override
    public String getRandomQuestion() {
        // følg op på den her
        Random r = new Random();
        return wordPairs.get(r.nextInt(size()));
    }

    @Override
    public boolean checkGuess(String question, String quess) {
        return true;
        
        
    }

    @Override
    public String lookup(String question) {
        return "";
    }

    @Override
    public boolean load() {
        return false;
    }

    @Override
    public boolean save() {
        return true;
    }

    @Override
    public void clear() {
        
    }
}

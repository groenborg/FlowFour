/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flowfour;


import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author Simon
 */
public class Control implements WordPairControlIF {

    private ArrayList<Word> wordPairs = new ArrayList();
    
    @Override
    public void add(String question, String answer) {
        question = question.trim();
        answer = answer.trim();
        wordPairs.add(new Word(question,answer));
    }

    @Override
    public boolean delete(String question) {
        for(int x = 0; x < wordPairs.size();++x){
            String tmp = wordPairs.get(x).getEnglish();
            if(tmp.equalsIgnoreCase(question)){
                wordPairs.remove(x);
                save();
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
        return wordPairs.get(r.nextInt()).getEnglish();
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

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flowfour;

import java.util.ArrayList;

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
        
        }catch(Exception e){
        }
        
        
        System.out.println(wordPairs.get(difficulty));
    }

    @Override
    public boolean delete(String question) {
        return false;
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public String getRandomQuestion() {
        return "";
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

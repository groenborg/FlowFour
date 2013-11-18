
package flowfour;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Simon
 */
public class Control implements WordPairControlIF {

    private ArrayList<Word> wordPairs = new ArrayList();
    private Formatter format;
    private Translator translate;
    
    
    @Override
    public void add(String question, String answer) {
        question = question.trim();
        answer = answer.trim();
        wordPairs.add(new Word(question,answer,0));
    }

    @Override
    public boolean delete(String question) {
        // foretag binær søgning med ascii
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
        Random r = new Random();
        return wordPairs.get(r.nextInt()).getEnglish();
    }

    @Override
    public boolean checkGuess(String question, String quess) {
        for(int x = 0; x < wordPairs.size();++x){
            Word w = wordPairs.get(x);
            if(w.getEnglish().equalsIgnoreCase(question)){
                if(w.getDanish().equalsIgnoreCase(quess)){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String lookup(String question) {
        for(int x = 0; x<wordPairs.size();++x){
            String q = wordPairs.get(x).getEnglish();
            if(q.equalsIgnoreCase(question)){
                return q; 
            }
        }
        return "";
    }

    @Override
    public boolean load(){
        Scanner s;
        try{
        s = new Scanner(new File("dictionary.txt"));
        while(s.hasNext()){
            String[] tokens = s.nextLine().split(",");
            int rate = Integer.parseInt(tokens[2]);
            wordPairs.add(new Word(tokens[0],tokens[1],rate));
        }
            return true;
        }catch(FileNotFoundException | NumberFormatException e){
            return false;
        }
    }

    @Override
    public boolean save() {
        
        this.format = new Formatter();
        
        this.format.saveToFile();
        
        return true;
    }

    @Override
    public void clear() {
        this.wordPairs.clear();
    }
}

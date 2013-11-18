package flowfour;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Simon
 */
public class Word {
    
    private String danish;
    private String english;
    private int rating;
    
    public Word(String danishWord, String englishWord){
        this.danish = danishWord;
        this.english = englishWord;
        genDifficulty();
    }
    
    public String getDanish(){
        return this.danish; 
    }
    
    public String getEnglish(){
        return this.english; 
    }
    
    public int getRating(){
        return this.rating;
    }
    
    public void setRating(int rate){
        this.rating = rate;
    }
    
    private void genDifficulty(){
        if(this.english.length() < 3 ){
            this.rating = 0; 
        }
        if(this.english.length() < 4){
            this.rating = 1;
        }
        if(this.english.length() < 5){
            this.rating = 2;
        }
        if(this.english.length() < 8){
            this.rating = 3;
        }
        if(this.english.length() > 8){
            this.rating = 6;
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flowfour;

import com.gtranslate.Audio;
import com.gtranslate.Language;
import java.io.IOException;
import java.io.InputStream;
import javazoom.jl.decoder.JavaLayerException;

/**
 *
 * @author Simon
 */
public class Translator {
    
    public Translator(){
        com.gtranslate.Translator translate = com.gtranslate.Translator.getInstance();
        String text = translate.translate("you just translated ", Language.DANISH, Language.ENGLISH);
        System.out.println(text);
        
        
    }
    
    
    public void readOutLoud(String answer) throws IOException, JavaLayerException{
        Audio audio = Audio.getInstance();
        InputStream sound;
        String message = "you just guessed: "+answer;
        sound = audio.getAudio(message, Language.RUSSIAN);
        audio.play(sound);
    
    }
    
}

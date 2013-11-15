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
        String text = translate.translate("bil", Language.DANISH, Language.CHINESE);
        System.out.println(text);
        
        try {
        Audio audio = Audio.getInstance();
        InputStream sound;
            
            
            sound = audio.getAudio(text, Language.CHINESE);
            //audio.play(sound);
        } catch (IOException ex) {
            
        }
    }
    
    
    public void readOutLoud(String answer) throws IOException, JavaLayerException{
        Audio audio = Audio.getInstance();
        InputStream sound;
        String message = "you just translated "+answer;
        sound = audio.getAudio(message, Language.ENGLISH);
        audio.play(sound);
    
    }
    
}

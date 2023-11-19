
import java.awt.Font;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Programming
 */
public class FormatFunction {
    
    Notepad notepad;
    Font arial, comic, tms;
    
    public FormatFunction(Notepad notepad){
        
        this.notepad = notepad;
    }
    
    public void setWordWrap(boolean wrap){
        if (wrap){
            notepad.wrap = false;
            notepad.wordWrap.setText("Word Wrap: off");
            notepad.textArea.setLineWrap(false);
            notepad.textArea.setWrapStyleWord(false);
        } else {
            notepad.wrap = true;
            notepad.wordWrap.setText("Word Wrap: on");
            notepad.textArea.setLineWrap(true);
            notepad.textArea.setWrapStyleWord(true);
        }
    }
    
    public void createFont(int size){
        arial = new Font("Arial", Font.PLAIN, size);
        comic = new Font("Comic Sans MS", Font.PLAIN, size);
        tms = new Font("Times New Roman", Font.PLAIN, size);
        
        setFont(notepad.selectedFont);
    }
    
    public void setFont(String command){
        
        notepad.selectedFont = command;
        switch (command){
            case "Arial" -> notepad.textArea.setFont(arial);
            case "Comic Sans MS" -> notepad.textArea.setFont(comic);
            case "Times New Roman" -> notepad.textArea.setFont(tms);
        }
    }
}

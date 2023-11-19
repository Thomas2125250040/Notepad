
import java.awt.Color;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Programming
 */
public class ColorFunction {
    
    Notepad notepad;
    
    public ColorFunction(Notepad notepad){
        
        this.notepad = notepad;
    }
    
    public void setColor(String color){
        
        switch(color){
            case "White": notepad.frame.setBackground(Color.WHITE);
                notepad.textArea.setBackground(Color.WHITE);
                notepad.textArea.setForeground(Color.BLACK);
                break;
            case "Black": notepad.frame.setBackground(Color.BLACK);
                notepad.textArea.setBackground(Color.BLACK);
                notepad.textArea.setForeground(Color.WHITE);
                break;
            case "Cream": notepad.frame.setBackground(new Color(255,255,219));
                notepad.textArea.setBackground(new Color(255,255,219));
                notepad.textArea.setForeground(Color.BLACK);
                break;
        }
    }
}


import java.awt.FileDialog;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Programming
 */
public class FileFunction {
    Notepad notepad;
    
    public FileFunction(Notepad notepad){
        
        this.notepad = notepad;
    }
    
    public void newFile(){
        notepad.textArea.setText("");
        notepad.frame.setTitle("New");
    }
    
    public void open(){
        FileDialog fd = new FileDialog(notepad.frame, "Open", FileDialog.LOAD);
        fd.setVisible(true);
    }
}

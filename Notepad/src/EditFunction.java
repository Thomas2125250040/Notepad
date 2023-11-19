/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Programming
 */
public class EditFunction {
    
    Notepad notepad;
    
    public EditFunction(Notepad notepad){
        
        this.notepad = notepad;
    }
    
    public void undo(){
        notepad.um.undo();
    }
    
    public void redo(){
        notepad.um.redo();
    }
}


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Programming
 */
public class KeyHandler implements KeyListener{
    
    Notepad notepad;
    public KeyHandler(Notepad notepad){
        this.notepad = notepad;
    }
    

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    if (e.isControlDown() && (e.getKeyCode()==KeyEvent.VK_S)){
            notepad.fileFunction.save();
        }
        if (e.isControlDown() && (e.getKeyCode()==KeyEvent.VK_S) && e.isShiftDown()){
            notepad.fileFunction.saveAs();
        }
        if (e.isAltDown() && (e.getKeyCode()==KeyEvent.VK_F)){
            notepad.menuFile.doClick();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

}

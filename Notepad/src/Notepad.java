
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Programming
 */
public class Notepad {
    JFrame frame;
    JTextArea textArea;
    JScrollPane scrollPane;
    
    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        notepad.createWindow();
        notepad.createTextArea();
    }
    
    public void createWindow(){
        frame = new JFrame("Notepad");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setVisible(true);
    }
    
    public void createTextArea(){
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        frame.add(scrollPane);
    }
}

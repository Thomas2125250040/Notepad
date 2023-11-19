
import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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
    String fileName;
    String fileAddress;
    
    public FileFunction(Notepad notepad){
        
        this.notepad = notepad;
    }
    
    public void newFile(){
        
        notepad.textArea.setText("");
        notepad.frame.setTitle("New");
        fileName = null;
        fileAddress = null;
    }
    
    public void open(){
        
        FileDialog fd = new FileDialog(notepad.frame, "Open", FileDialog.LOAD);
        fd.setVisible(true);
        if (fd.getFile() != null){
            
            fileName = fd.getFile();
            fileAddress = fd.getDirectory();
            try {
                
                BufferedReader br = new BufferedReader(new FileReader(fileAddress + fileName));
                String line = null;
                notepad.textArea.setText("");
                while((line = br.readLine()) != null){
                    
                    notepad.textArea.append(line + "\n");
                }
                br.close();
            } catch (Exception e){
                
                System.out.println("FILE CANNNOT BE OPENED!");
            }
        }
    }
    
    public void saveAs(){
        
        FileDialog fd = new FileDialog(notepad.frame, "Save", FileDialog.SAVE);
        fd.setVisible(true);
        
        if (fd.getFile() != null){
            fileName = fd.getFile();
            fileAddress = fd.getDirectory();
            
            try{
                FileWriter fw = new FileWriter(fileAddress + fileName);
                fw.write(notepad.textArea.getText());
                fw.close();
            } catch (IOException e){
                System.out.println("An error occured! : " + e.getMessage());
            }
        }
    }
    
    public void save(){
        
        if (fileName != null){
            try{
                FileWriter fw = new FileWriter(fileAddress + fileName);
                fw.write(notepad.textArea.getText());
                fw.close();
            } catch (IOException e){
                System.out.println("An error occured! : " + e.getMessage());
            }
        } else {
            saveAs();
        }
    }
    
    public void exit(){
        System.exit(0);
    }
}

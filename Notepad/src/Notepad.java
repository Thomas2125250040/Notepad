
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Programming
 */
public class Notepad implements ActionListener{
    
    JFrame frame;
    JTextArea textArea;
    JScrollPane scrollPane;
    JMenuBar menuBar;
    JMenu menuFile, menuEdit, menuFormat, menuColor;
    JMenuItem iNew ,iOpen, iSave, iSaveAs, iExit;
    FileFunction fileFunction = new FileFunction(this);
    
    public static void main(String[] args) {
        
        new Notepad();
    }
    
    public Notepad(){
        
        createWindow();
        createTextArea();
        createMenu();
        createMenuFile();
        frame.setVisible(true);
    }
    
    public void createWindow(){
        
        frame = new JFrame("Notepad");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
    
    public void createTextArea(){
        
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        frame.add(scrollPane);
    }
    
    public void createMenu(){
        
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        
        menuFile = new JMenu("File");
        menuBar.add(menuFile);
        
        menuEdit = new JMenu("Edit");
        menuBar.add(menuEdit);
        
        menuFormat = new JMenu("Format");
        menuBar.add(menuFormat);
        
        menuColor = new JMenu("Color");
        menuBar.add(menuColor);
    }
    
    public void createMenuFile(){
   
        iNew = new JMenuItem("New");
        iNew.addActionListener(this);
        iNew.setActionCommand("New");
        menuFile.add(iNew);
        
        iOpen = new JMenuItem("Open");
        iOpen.addActionListener(this);
        iOpen.setActionCommand("Open");
        menuFile.add(iOpen);
        
        iSave = new JMenuItem("Save");
        menuFile.add(iSave);
        
        iSaveAs = new JMenuItem("Save As");
        menuFile.add(iSaveAs);
        
        iExit = new JMenuItem("Exit");
        menuFile.add(iExit);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
        String command = e.getActionCommand();
        
        switch(command){
            case "New" -> fileFunction.newFile();
            case "Open" -> fileFunction.open();
        }
    }
}

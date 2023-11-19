
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
    // Window
    JFrame frame;
    // JTextArea
    JTextArea textArea;
    // JScrollPane
    JScrollPane scrollPane;
    // JMenuBar
    JMenuBar menuBar;
    // JMenu
    JMenu menuFile, menuEdit, menuFormat, menuColor;
    // Menu File
    JMenuItem iNew ,iOpen, iSave, iSaveAs, iExit;
    // Menu Format
    JMenuItem wordWrap;
    JMenu menuFont, menuFontSize;
    
    // Menu item Font type
    JMenuItem iArial, iComicSans, iTMS;
    
    // Menu item Font Size
    JMenuItem iFont8,iFont12,iFont16,iFont20,iFont24,iFont28;
    
    // Menu Color
    JMenuItem iWhite, iBlack, iCream;
    
    // Wrap set to off
    boolean wrap = false;
    
    FileFunction fileFunction = new FileFunction(this);
    
    FormatFunction formatFunction = new FormatFunction(this);
    
    ColorFunction colorFunction = new ColorFunction(this);
    
    int fontSize = 16;
    String selectedFont = "Arial";
    String defaultColor = "White";
    
    public static void main(String[] args) {
        
        new Notepad();
    }
    
    public Notepad(){
        
        createWindow();
        createTextArea();
        createMenu();
        createMenuFile();
        createMenuFormat();
        createMenuColor();
        
        formatFunction.createFont(fontSize);
        colorFunction.setColor(defaultColor);
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
        iSave.addActionListener(this);
        iSave.setActionCommand("Save");
        menuFile.add(iSave);
        
        iSaveAs = new JMenuItem("SaveAs");
        iSaveAs.addActionListener(this);
        iSaveAs.setActionCommand("SaveAs");
        menuFile.add(iSaveAs);
        
        iExit = new JMenuItem("Exit");
        iExit.addActionListener(this);
        iExit.setActionCommand("Exit");
        menuFile.add(iExit);
    }
    
    public void createMenuFormat(){
        wordWrap = new JMenuItem("Word Wrap: off");
        wordWrap.addActionListener(this);
        wordWrap.setActionCommand("Word Wrap");
        menuFormat.add(wordWrap);
        
        menuFont = new JMenu("Font");
        
        iArial = new JMenuItem("Arial");
        iArial.addActionListener(this);
        iArial.setActionCommand("Arial");
        menuFont.add(iArial);
        iComicSans = new JMenuItem("Comic Sans MS");
        iComicSans.addActionListener(this);
        iComicSans.setActionCommand("Comic Sans MS");
        menuFont.add(iComicSans);
        iTMS = new JMenuItem("Times New Roman");
        iTMS.addActionListener(this);
        iTMS.setActionCommand("Times New Roman");
        menuFont.add(iTMS);
        
        menuFormat.add(menuFont);
        
        menuFontSize = new JMenu("Font Size");
        iFont8 = new JMenuItem("8");
        iFont8.addActionListener(this);
        iFont8.setActionCommand("font8");
        menuFontSize.add(iFont8);
        iFont12 = new JMenuItem("12");
        iFont12.addActionListener(this);
        iFont12.setActionCommand("font12");
        menuFontSize.add(iFont12);
        iFont16 = new JMenuItem("16");
        iFont16.addActionListener(this);
        iFont16.setActionCommand("font16");
        menuFontSize.add(iFont16);
        iFont20 = new JMenuItem("20");
        iFont20.addActionListener(this);
        iFont20.setActionCommand("font20");
        menuFontSize.add(iFont20);
        iFont24 = new JMenuItem("24");
        iFont24.addActionListener(this);
        iFont24.setActionCommand("font24");
        menuFontSize.add(iFont24);
        iFont28 = new JMenuItem("28");
        iFont28.addActionListener(this);
        iFont28.setActionCommand("font28");
        menuFontSize.add(iFont28);
        
        menuFormat.add(menuFontSize);
    }
    
    public void createMenuColor(){
        iWhite = new JMenuItem("White");
        iWhite.addActionListener(this);
        iWhite.setActionCommand("White");
        menuColor.add(iWhite);
        
        iBlack = new JMenuItem("Black");
        iBlack.addActionListener(this);
        iBlack.setActionCommand("Black");
        menuColor.add(iBlack);
        
        iCream = new JMenuItem("Cream");
        iCream.addActionListener(this);
        iCream.setActionCommand("Cream");
        menuColor.add(iCream);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
        String command = e.getActionCommand();
        
        switch(command){
            case "New" -> fileFunction.newFile();
            case "Open" -> fileFunction.open();
            case "Save" -> fileFunction.save();
            case "SaveAs" -> fileFunction.saveAs();
            case "Exit" -> fileFunction.exit();
            case "Word Wrap" -> formatFunction.setWordWrap(wrap);
            case "Arial" -> formatFunction.setFont(command);
            case "Comic Sans MS" -> formatFunction.setFont(command);
            case "Times New Roman" -> formatFunction.setFont(command);
            case "font8" -> formatFunction.createFont(fontSize = 8);
            case "font12" -> formatFunction.createFont(fontSize = 12);
            case "font16" -> formatFunction.createFont(fontSize = 16);
            case "font20" -> formatFunction.createFont(fontSize = 20);
            case "font24" -> formatFunction.createFont(fontSize = 24);
            case "font28" -> formatFunction.createFont(fontSize = 28);
            case "White" -> colorFunction.setColor(command);
            case "Black" -> colorFunction.setColor(command);
            case "Cream" -> colorFunction.setColor(command);
        }
    }
}

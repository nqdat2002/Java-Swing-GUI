import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileSystemView;
import javax.swing.plaf.DimensionUIResource;

import org.w3c.dom.Text;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class Bai2_Main extends JFrame implements ActionListener{

    private static JTextArea area;
    private static JFrame frame;
    private static int returnValue = 0;
    static ArrayList<Student> list;
    JPanel jPanelActionAdd = new JPanel();
    JPanel jPanelActionDelete;
    JPanel container = new JPanel();

    JTextField jTextFieldId ;
        JTextField jTextFieldName ;
        JTextField jTextFieldAge ;

    JTextField jTextFieldIdDelete = new JTextField();



    public Bai2_Main() {
        frame = new JFrame("Text Edit");
        list = new ArrayList<>();
        jTextFieldId = new JTextField();
         jTextFieldName = new JTextField();
         jTextFieldAge = new JTextField();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            java.util.logging.Logger.getLogger(Text.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
        // Build the menu
        JMenuBar menuMain = new JMenuBar();

        JMenu menuFile = new JMenu("File");
        JMenuItem menuItemNew = new JMenuItem("New");
        JMenuItem menuItemOpen = new JMenuItem("Open");
        JMenuItem menuItemSave = new JMenuItem("Save");
        JMenuItem menuItemQuit = new JMenuItem("Quit");

        // Menu action
        JMenu menuAction = new JMenu("Edit");
        JMenuItem menuItemAdd = new JMenuItem("Add");
        JMenuItem menuItemUpdate = new JMenuItem("Update");
        JMenuItem menuItemDelete = new JMenuItem("Delete");

        menuItemAdd.addActionListener(this);
        menuItemUpdate.addActionListener(this);
        menuItemDelete.addActionListener(this);

        menuAction.add(menuItemAdd);
        menuAction.add(menuItemUpdate);
        menuAction.add(menuItemDelete);
        menuMain.add(menuAction);


        jPanelActionAdd.setLayout(new FlowLayout());
        JLabel jLabelId = new JLabel("Id");
        JLabel jLabelName = new JLabel("Name");
        JLabel jLabelAge = new JLabel("Age");

        

        JButton jButtonAdd = new JButton("Add Student");

        jTextFieldId.setPreferredSize(new DimensionUIResource(100, 20));
        jTextFieldName.setPreferredSize(new DimensionUIResource(100, 20));
        jTextFieldAge.setPreferredSize(new DimensionUIResource(100, 20));
        
        jTextFieldId.addActionListener(this);
        jTextFieldName.addActionListener(this);
        jTextFieldAge.addActionListener(this);
        jButtonAdd.addActionListener(this);

        jPanelActionAdd.add(jLabelId);
        jPanelActionAdd.add(jTextFieldId);
        jPanelActionAdd.add(jLabelName);
        jPanelActionAdd.add(jTextFieldName);
        jPanelActionAdd.add(jLabelAge);
        jPanelActionAdd.add(jTextFieldAge);
        jPanelActionAdd.add(jButtonAdd);

        jPanelActionAdd.setPreferredSize(new DimensionUIResource(640, 480));
        jPanelActionAdd.setSize(getPreferredSize());


        jPanelActionDelete = new JPanel();
        jPanelActionDelete.setLayout(new FlowLayout());
        JButton jButtonDelete = new JButton("Remove Student");
        JLabel jLabelIdDelete = new JLabel("Id");
        jTextFieldIdDelete.setPreferredSize(new DimensionUIResource(100, 20));


        jButtonDelete.addActionListener(this);
        // delete
        jPanelActionDelete.add(jLabelIdDelete);
        jPanelActionDelete.add(jTextFieldIdDelete);
        jPanelActionDelete.add(jButtonDelete);
        




        // action listerner
        menuItemNew.addActionListener(this);
        menuItemOpen.addActionListener(this);
        menuItemSave.addActionListener(this);
        menuItemQuit.addActionListener(this);

        menuMain.add(menuFile);
        menuFile.add(menuItemNew);
        menuFile.add(menuItemOpen);
        menuFile.add(menuItemSave);
        menuFile.add(menuItemQuit);

        frame.setJMenuBar(menuMain);

        // buil text area
        area = new JTextArea();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        area.setPreferredSize(new DimensionUIResource(480, 480));

        area.setSize(getPreferredSize());
        container.add(area);
        
        frame.add(container);
        // frame.add(jPanelActionAdd);
        frame.setSize(640, 480);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        String ingest = "";
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle("Choose destination.");
        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        String ae = e.getActionCommand();
        System.out.println(ae);
        switch (ae) {
            case "Open": {
                returnValue = jfc.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File f = new File(jfc.getSelectedFile().getAbsolutePath());
                    try {
                        FileReader read = new FileReader(f);
                        Scanner scan = new Scanner(read);
                        while (scan.hasNextLine()) {
                            String line = scan.nextLine();
                            ingest +=line+"\n";
                            String[] a = line.split(",");
                            list.add(new Student(Integer.parseInt( a[0]), a[1], Integer.parseInt( a[2])));
                        }
                        area.setText(ingest);
                        scan.close();
                    } catch (FileNotFoundException ex) {
                        ex.getStackTrace();
                    }
                }
                System.out.println(list);
                break;
            }
            case "Save": {
                returnValue = jfc.showSaveDialog(null);
                try {
                    File f = new File(jfc.getSelectedFile().getAbsolutePath());
                    FileWriter out = new FileWriter(f);
                    out.write(area.getText());
                    out.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("File not found");
                } catch (IOException ex) {
                    System.out.println("Error");
                }
                break;
            }
            case "New": {
                area.setText("");
                break;
            }
            case "Quit": {
                System.exit(0);
                break;
            }
            case "Add":{
                // reset default
                jTextFieldId.setText(""); 
                jTextFieldName.setText(""); 
                jTextFieldAge.setText(""); 
                
                    container.removeAll();
                    container.revalidate();
                    container.repaint();
                container.add(jPanelActionAdd);
                if(area.getText() != null){
                    System.out.println(area.getText());
                    String[] text = area.getText().split("\n");
                    for(String b:text){
                        String[] a =b.split(",");

                        list.add(new Student(Integer.parseInt( a[0]), a[1], Integer.parseInt( a[2])));
                    }
                }
                
                System.out.println( list.size());
                break;
            }
            case "Add Student":{
                    

                    container.removeAll();
                    container.revalidate();
                    container.repaint();
                    container.add(area);
                    String textValue="";
                    Student s = new Student(Integer.parseInt(jTextFieldId.getText()), jTextFieldName.getText(), Integer.parseInt(jTextFieldAge.getText()));
                    list.add(s);
                    for(int i=0;i<list.size();i++){
                        textValue += Integer.toString(list.get(i).getId())+"," + list.get(i).getName()+"," +  Integer.toString(list.get(i).getAge())+"\n";
                    }
                    System.out.println(list.size());
                    area.setText(textValue);
                    System.out.println(textValue);
                    break;
            }
            case "Delete":{

                // reset default
                jTextFieldIdDelete.setText("");

                container.removeAll();
                    container.revalidate();
                    container.repaint();
                    container.add(jPanelActionDelete);
                    if(area.getText() != null){
                        System.out.println(area.getText());
                        String[] text = area.getText().split("\n");
                        for(String b:text){
                            String[] a =b.split(",");
    
                            list.add(new Student(Integer.parseInt( a[0]), a[1], Integer.parseInt( a[2])));
                        }
                    }
                    
                    System.out.println( list.size());
                break;

            }

            case "Remove Student":{


                container.removeAll();
                    container.revalidate();
                    container.repaint();
                    container.add(area);
                    String textValue="";
                    ArrayList<Student> l = RemoveById(Integer.parseInt(jTextFieldIdDelete.getText()));
                    for(int i=0;i<l.size();i++){
                        textValue += Integer.toString(l.get(i).getId())+"," + l.get(i).getName()+"," +  Integer.toString(l.get(i).getAge())+"\n";
                    }
                    System.out.println(l.size());
                    area.setText(textValue);
                    System.out.println(textValue);

                break;
            }

            default:
                System.exit(0);
                break;
        }

    }
    public ArrayList<Student> RemoveById(int id){
        ArrayList<Student> l = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId() != id){
                l.add(list.get(i));
            }
        }

        return l;
    }
}

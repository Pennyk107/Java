package Lab8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Notes extends JFrame {
    private JPanel MainPanel;
    private JTextArea NotesInput;
    private JButton SaveButton;
    private JLabel NoteLabel;
    private JLabel NotesInputLabel;
    public String IfNoteIsEdit;
    public String str;
    public String TextFromNote;
    private JLabel MatchFiles;
    private JButton OpenButton;
    private JButton EditButton;
    private JRadioButton Font1;
    private JRadioButton Font2;
    private JButton DeleteNotes;
    private JList list1;


    public Notes (String title){
        super(title);
        str = "1";
        TextFromNote = null;
        IfNoteIsEdit = null;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(MainPanel);
        this.pack();
        this.setBounds(0,0,500, 500);



        SaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    FileNumberRead();
                    SaveNoteToFile(NotesInput.getText());
                    NotesInput.setText("");

                    FileNumberWrite();

                    MatchFiles.setText("Количество сохранённых заметок: " + (str));


                    IfNoteIsEdit = null;



            }
        });


        OpenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser file = new JFileChooser();

                file.setCurrentDirectory(new File("/Users/dengt/Desktop/Учёба/1 семестр (2 курс)/Java/Лабы/Решения/15/Labs"));
                file.setMultiSelectionEnabled(true);
                file.setFileSelectionMode(JFileChooser.FILES_ONLY);
                file.setFileHidingEnabled(false);
                String toNote = " ";
                if (file.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    File f = file.getSelectedFile();

                    try(FileReader reader = new FileReader(f.getPath()))
                    {
                        BufferedReader reader2 = new BufferedReader(reader);
                        String line = reader2.readLine();
                        while(line != null){
                            toNote  = toNote + line + "\n";
                            line = reader2.readLine();
                        }
                        line = reader2.readLine();
                    }
                    catch(IOException ex){
                        System.out.println(ex.getMessage());
                    }
                }
                NotesInput.setText(toNote);
            }
        });


        EditButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser file = new JFileChooser();

                file.setCurrentDirectory(new File("/Users/dengt/Desktop/Учёба/1 семестр (2 курс)/Java/Лабы/Решения/15/Labs"));
                file.setMultiSelectionEnabled(true);
                file.setFileSelectionMode(JFileChooser.FILES_ONLY);
                file.setFileHidingEnabled(false);
                String toNote = " ";
                if (file.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    File f = file.getSelectedFile();

                    try(FileReader reader = new FileReader(f.getPath()))
                    {
                        BufferedReader reader2 = new BufferedReader(reader);
                        String line = reader2.readLine();
                        while(line != null){
                            toNote  = toNote + line + "\n";
                            line = reader2.readLine();
                        }
                        line = reader2.readLine();
                    }
                    catch(IOException ex){
                        System.out.println(ex.getMessage());
                    }
                    IfNoteIsEdit = f.getPath();
                }

                NotesInput.setText(toNote);
                try(FileWriter writer = new FileWriter("MatchFilesFile.txt", false)) {
                    int k = Integer.parseInt(str);
                    writer.write(Integer.toString(k));
                    writer.flush();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });


        Font1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = new Font("Times New Roman", Font.BOLD, 18);
                NotesInput.setFont(font);
            }
        });
        Font2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = new Font("Serif", Font.ITALIC, 18);
                NotesInput.setFont(font);
            }
        });
        DeleteNotes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while (Integer.parseInt(str) > 0) {
                    File file = new File("Note" + str + ".txt");
                    if (file.delete())
                    str = String.valueOf(Integer.parseInt(str)-1);
                    MatchFiles.setText("Все файлы удалены");
                    NotesInput.setText("");
                    try(FileWriter writer = new FileWriter("MatchFilesFile.txt", false)) {


                        writer.write("1");
                        writer.flush();
                    } catch (IOException ec) {
                        throw new RuntimeException(ec);
                    }
                }
            }
        });
    }

    public void FileNumberRead() {
        int StringCounter = 0;
        try {
            File FileIN = new File("MatchFilesFile.txt");
            FileReader FileInRead = new FileReader(FileIN);
            BufferedReader ReaderFileIn = new BufferedReader(FileInRead);
            str = ReaderFileIn.readLine();
            } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }


    public void SaveNoteToFile(String TextFromNote1){
        String NameSaveFile;
        if(IfNoteIsEdit == null){
            NameSaveFile = "Note" + str + ".txt";
        }
        else{
            NameSaveFile = IfNoteIsEdit;
        }

        File f = new File(NameSaveFile);
        try(FileWriter writer = new FileWriter(NameSaveFile, false)) {
            writer.write(TextFromNote1);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    public void FileNumberWrite(){
        try(FileWriter writer = new FileWriter("MatchFilesFile.txt", false)) {
            int k = Integer.parseInt(str);
                k++;
            writer.write(Integer.toString(k));
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

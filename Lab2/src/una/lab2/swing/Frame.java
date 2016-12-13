/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.lab2.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author Estudiante
 */
public class Frame extends JFrame {
    JTextField username = new JTextField(15);
    JPasswordField Phone = new JPasswordField(15);
    JTextArea comments = new JTextArea(4, 15);
    JButton ok = new JButton("OK");
    JButton cancel = new JButton("Cancel");

    public Frame() {
        super("Account Information");
        setSize(300, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        

        JPanel panel = new JPanel();
        
        JLabel usernameLabel = new JLabel("Username: ");
        JLabel PhoneLabel = new JLabel("Phone: ");
        JLabel commentsLabel = new JLabel("Comments: ");
        JLabel GenderLabel = new JLabel("Gender:");
        
        //set the name to components
        usernameLabel.setName("lblUsername");
        PhoneLabel.setName("lblPhone");
        commentsLabel.setName("lblComments");
        username.setName("username");
        Phone.setName("Phone");
        comments.setName("comments");
        ok.setName("ok");
        cancel.setName("cancel");
        GenderLabel.setName("Gender");
        comments.setLineWrap(true);
        comments.setWrapStyleWord(true);
        
        panel.setName("Form");
        panel.add(usernameLabel);
        panel.add(username);
        panel.add(PhoneLabel);
        panel.add(Phone);
        panel.add(GenderLabel);
        panel.add(commentsLabel);
        panel.add(comments);
        panel.add(ok);
        panel.add(cancel);
        add(panel);
        setVisible(true);
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    public static void main(String[] arguments) {
        Frame.setLookAndFeel();
        Frame auth = new Frame();
    }
}
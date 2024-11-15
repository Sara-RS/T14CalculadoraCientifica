package Ventanas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame{
    public VentanaPrincipal() throws HeadlessException {
        setSize(380,600);
        setTitle("CALCULADORA CIENTIFICA");
        setLocation(200,100);
        
        setLayout(new BorderLayout());
        var panel = new JPanel();
        var panel1 = new JPanel();
        var textField= new JTextField("", 60);
        panel.setLayout(new GridLayout(8,5));
        //botones
        panel.add(new JButton("DRG"));
        panel.add(new JButton("LOG"));
        panel.add(new JButton("LN "));
        panel.add(new JButton("OFF"));
        panel.add(new JButton("ON/C"));
        panel.add(new JButton("HYP"));
        panel.add(new JButton("SIN"));
        panel.add(new JButton("COS"));
        panel.add(new JButton("TAN"));
        panel.add(new JButton("yX "));
        panel.add(new JButton("PI "));
        panel.add(new JButton("1/X"));
        panel.add(new JButton("x2 "));
        panel.add(new JButton("x^ "));
        panel.add(new JButton("Vx "));
        panel.add(new JButton("E+ "));
        panel.add(new JButton("EE "));
        panel.add(new JButton(" ( "));
        panel.add(new JButton(" ) "));
        panel.add(new JButton(" / "));
        panel.add(new JButton("STO"));
        panel.add(new JButton(" 7 "));
        panel.add(new JButton(" 8 "));
        panel.add(new JButton(" 9 "));            
        panel.add(new JButton(" * "));
        panel.add(new JButton("RCL"));
        panel.add(new JButton(" 4 "));
        panel.add(new JButton(" 5 "));
        panel.add(new JButton(" 6 "));
        panel.add(new JButton(" - "));
        panel.add(new JButton("a b/c"));
        panel.add(new JButton(" 1 "));
        panel.add(new JButton(" 2 "));
        panel.add(new JButton(" 3 "));
        panel.add(new JButton(" + "));
        panel.add(new JButton("<-"));
        panel.add(new JButton(" 0 "));
        panel.add(new JButton(" . "));
        panel.add(new JButton("+/-"));
        panel.add(new JButton(" ="));
        
        add(panel,BorderLayout.CENTER);
        panel1.add(textField);
        add(panel1,BorderLayout.NORTH);
    }
}

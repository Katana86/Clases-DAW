/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.awt.HeadlessException;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author Alumno avanzado
 */
public class Calculadora extends JFrame implements ActionListener{

    JLabel lbl,lbl_resultado;
    JTextArea num1;
    JTextArea num2;
    JButton sum,res,div,mult;

    public Calculadora() throws HeadlessException {
        lbl = new JLabel("Calculadora");
        num1 = new JTextArea();
        num2 = new JTextArea();
        lbl_resultado = new JLabel("Resultado: 0");
        
        sum = new JButton("Suma");
        sum.addActionListener(new suma());
        res = new JButton("Resta");
        res.addActionListener(new resta());
        div = new JButton("Division");
        div.addActionListener(new division());
        mult = new JButton("Multiplicacion");
        mult.addActionListener(new multiplicacion());
        
        setLayout(null);
        lbl.setBounds(10,10,100,20);
        num1.setBounds(130,10,100,20);
        num2.setBounds(260,10,150,20);
        lbl_resultado.setBounds(260,50,150,20);
        sum.setBounds(430,10,150,20);
        res.setBounds(600,10,150,20);
        div.setBounds(430,40,150,20);
        mult.setBounds(600,40,150,20);
        add(lbl);
        add(num1);
        add(num2);
        add(lbl_resultado);
        add(sum);
        add(res);
        add(div);
        add(mult);
    }
    
    class suma implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == sum) {
                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());
                int suma = a+b;
                lbl_resultado.setText("Resultado: "+String.valueOf(suma));
            }
        }
        
    }
    
    class resta implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == res) {
                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());
                int resta = a-b;
                lbl_resultado.setText("Resultado: "+String.valueOf(resta));
            }
        }
        
    }
    
    class division implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == div) {
                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());
                int division = a/b;
                lbl_resultado.setText("Resultado: "+String.valueOf(division));
            }
        }
        
    }
    
    class multiplicacion implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == mult) {
                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());
                int multiplicacion = a*b;
                lbl_resultado.setText("Resultado: "+String.valueOf(multiplicacion));
            }
        }
        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

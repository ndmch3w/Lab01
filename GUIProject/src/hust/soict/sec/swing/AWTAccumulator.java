package hust.soict.sec.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTAccumulator extends Frame {
    private JTextField tfInput;
    private JTextField tfOutput;
    private int sum = 0;

    private class TFInputListener implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            int numberIn = Integer.parseInt(tfInput.getText());
            sum += numberIn;
            tfInput.setText("");
            tfOutput.setText(String.valueOf(sum));
        }
    }
    public AWTAccumulator(){
        setLayout(new GridLayout(2, 2));

        add(new Label("Enter an integer:"));
        tfInput = new JTextField(10);
        add(tfInput);
        tfInput.addActionListener(new TFInputListener());

        add(new Label("The accumulator sum is:"));
        tfOutput = new JTextField(10);
        tfOutput.setEditable(false);
        add(tfOutput);

        setTitle("AWT Accumulator");
        setVisible(true);
        setSize(350,200);
    }
    public static void main(String[] args){
        AWTAccumulator awtAccumulator = new AWTAccumulator();
    }
}

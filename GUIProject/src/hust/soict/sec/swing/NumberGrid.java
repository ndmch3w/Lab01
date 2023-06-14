package hust.soict.sec.swing;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonListener;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberGrid extends JFrame {
    private JButton[] btnNumbers = new JButton[10];
    private JButton btnDelete, btnReset;
    private JTextField tfDisplay;

    public static void main(String[] args){
        new NumberGrid();
    }
    private void addButtons(JPanel panelButtons){
        ButtonListener buttonListener = new ButtonListener();
        for (int i=0; i<=9; i++){
            btnNumbers[i] = new JButton("" + i);
            panelButtons.add(btnNumbers[i]);
            btnNumbers[i].addActionListener(buttonListener);
        }

        btnDelete = new JButton("DEL");
        panelButtons.add(btnDelete);
        btnDelete.addActionListener(buttonListener);

        btnReset = new JButton("C");
        panelButtons.add(btnReset);
        btnReset.addActionListener(buttonListener);
    }
    public NumberGrid(){
        tfDisplay = new JTextField(10);
        tfDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        JPanel panelButtons = new JPanel(new GridLayout(4, 3));
        addButtons(panelButtons);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(tfDisplay, BorderLayout.NORTH);
        cp.add(panelButtons, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(200, 200);
        setTitle("Number grid");
    }
    private class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String button = e.getActionCommand();
            if(button.charAt(0) >= '0' && button.charAt(0) <= '9'){
                tfDisplay.setText(tfDisplay.getText() + button);
            }else if (button.equals("DEL")){
                String displayResult = tfDisplay.getText();
                if (displayResult.length() > 0)
                    tfDisplay.setText(displayResult.substring(0, displayResult.length() - 1));
            }else{
                tfDisplay.setText("");
            }}
    }
}

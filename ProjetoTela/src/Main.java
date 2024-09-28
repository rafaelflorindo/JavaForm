import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class Main extends JFrame {

    private JTextField textField1;
    private JTextField textField2;
    private JButton CALCULARButton;
    private JPanel MainPanel;
    private JLabel tAnoNascimento;

    public Main(){
        setContentPane(MainPanel);
        setTitle("Formulário de Autenticação");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        CALCULARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int anoNascimento = parseInt(textField1.getText());
                int anoAtual = parseInt(textField2.getText());
                int idade = anoAtual - anoNascimento;
                JOptionPane.showMessageDialog(Main.this,"Idade: " + idade);
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Double.parseDouble;

public class Main extends JFrame {
    private JTextField Txt_ValorMoeda;
    private JButton CONVERSAOButton;
    private JTextField Txt_ValorConvertido;
    private JTextField Txt_QuantidadeMoeda;
    private JPanel MainPanel;

    public Main(){
        setContentPane(MainPanel);
        setTitle("Formulário de conversão");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        CONVERSAOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valorMoeda = parseDouble(Txt_ValorMoeda.getText());
                double quantidadeMoeda = parseDouble(Txt_QuantidadeMoeda.getText());

                double valorConversao = valorMoeda * quantidadeMoeda;

                Txt_ValorConvertido.setText(String.valueOf(valorConversao));
                //parseString(valorConversao);
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}

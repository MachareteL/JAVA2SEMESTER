import com.sun.prism.Image;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame implements ActionListener {

    public Screen() {
        setVisible(true);
        setSize(800, 500);
        setTitle("Void's Adventure");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setBackground(new Color(52, 16, 220));
        setLayout(null);



        ImageIcon img = new ImageIcon("S:\\PM\\ter\\ets\\Inter_Setor\\COMPARTILHADO\\APRENDIZES\\SMART_AUTOMATION_05\\LUCAS_DA_SILVA_MACHARETE\\JAVA\\GUI\\src\\logo.png");
        setIconImage(img.getImage());


        JButton botao = new JButton();
        botao.setText("START");
        botao.setBounds(275, 280, 250, 70);
        botao.setFont(new Font("Arial", Font.BOLD, 20));
        botao.setForeground(new Color(151, 241, 215));
        botao.setBackground(new Color(9, 9, 9));

        add(botao);

        JButton sair = new JButton("sair");
        System.out.println(this.getX());
        sair.setBounds(350, 350, 100, 25);
        sair.setFont(new Font("Arial", Font.ITALIC, 10));
        sair.setForeground(new Color(7, 124, 92));
        sair.setBackground(new Color(9, 9, 9));


        add(sair);

        sair.addActionListener(this);
        botao.addActionListener(this::start);

        JLabel labela = new JLabel("Olá, longuinquo visitante!");
        labela.setBounds(150,50,300,100);
        labela.setFont(new Font("Arial", Font.BOLD,40));
        add(labela);






    }

    private void start(ActionEvent actionEvent) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
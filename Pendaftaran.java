import java.awt.event.*;
import javax.swing.*;

public class Pendaftaran extends JFrame implements ActionListener {

    JLabel lblEmail, lblNama, lblUmur, lblAlasan;
    JTextField txtEmail, txtNama, txtUmur;
    JTextArea txtAlasan;
    JButton btnDaftar;

    public Pendaftaran() {

        setTitle("Pendaftaran Kursus");
        setSize(400, 390);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblEmail = new JLabel("Email");
        lblEmail.setBounds(30, 30, 120, 25);
        add(lblEmail);

        // Label
        lblNama = new JLabel("Nama Peserta");
        lblNama.setBounds(30, 80, 120, 25);
        add(lblNama);

        lblUmur = new JLabel("Umur");
        lblUmur.setBounds(30, 130, 120, 25);
        add(lblUmur);

        lblAlasan = new JLabel("Alasan Mengikuti Kursus");
        lblAlasan.setBounds(30, 180, 180, 25);
        add(lblAlasan);

        // TextField
        txtEmail = new JTextField();
        txtEmail.setBounds(180, 30, 150, 25);
        add(txtEmail);

        txtNama = new JTextField();
        txtNama.setBounds(180, 80, 150, 25);
        add(txtNama);

        txtUmur = new JTextField();
        txtUmur.setBounds(180, 130, 150, 25);
        add(txtUmur);

        // TextArea
        txtAlasan = new JTextArea();
        JScrollPane scroll = new JScrollPane(txtAlasan);
        scroll.setBounds(30, 210, 300, 80);
        add(scroll);

        btnDaftar = new JButton("Daftar");
        btnDaftar.setBounds(130, 300, 100, 30);
        btnDaftar.addActionListener(this);
        add(btnDaftar);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String email = txtEmail.getText();
        String nama = txtNama.getText();
        String umur = txtUmur.getText();
        String alasan = txtAlasan.getText();

        JOptionPane.showMessageDialog(this,
                "Email : " + email +
                "\nNama Peserta : " + nama +
                "\nUmur : " + umur +
                "\nAlasan : " + alasan);
    }

    public static void main(String[] args) {
        new Pendaftaran();
    }
}
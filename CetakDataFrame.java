import java.awt.*;
import java.awt.event.*;

public class CetakDataFrame extends Frame implements ActionListener {

    // Input
    Label lblUser, lblPass, lblCom;
    TextField txtUser, txtPass;
    TextArea txtCom;

    // Output
    Label lblHasilUser, lblHasilPass, lblHasilCom;
    TextField hasilUser, hasilPass;
    TextArea hasilCom;

    // Button
    Button btnDisplay, btnDelete;

    public CetakDataFrame() {

        // Judul Frame
        setTitle("Program Cetak Data");

        // Ukuran Frame
        setSize(600, 450);

        // Layout manual
        setLayout(null);

        // Warna background
        setBackground(Color.lightGray);

        // ===== INPUT =====
        lblUser = new Label("Username");
        lblUser.setBounds(50, 50, 100, 25);
        add(lblUser);

        txtUser = new TextField();
        txtUser.setBounds(200, 50, 250, 25);
        add(txtUser);

        lblPass = new Label("Password");
        lblPass.setBounds(50, 90, 100, 25);
        add(lblPass);

        txtPass = new TextField();
        txtPass.setEchoChar('*');
        txtPass.setBounds(200, 90, 250, 25);
        add(txtPass);

        lblCom = new Label("Comments");
        lblCom.setBounds(50, 130, 100, 25);
        add(lblCom);

        txtCom = new TextArea();
        txtCom.setBounds(200, 130, 250, 70);
        add(txtCom);

        // ===== BUTTON =====
        btnDisplay = new Button("Display");
        btnDisplay.setBounds(200, 220, 80, 30);
        add(btnDisplay);

        btnDelete = new Button("Delete");
        btnDelete.setBounds(300, 220, 80, 30);
        add(btnDelete);

        // ===== OUTPUT =====
        lblHasilUser = new Label("Username");
        lblHasilUser.setBounds(50, 280, 100, 25);
        add(lblHasilUser);

        hasilUser = new TextField();
        hasilUser.setBounds(200, 280, 250, 25);
        hasilUser.setEditable(false);
        add(hasilUser);

        lblHasilPass = new Label("Password");
        lblHasilPass.setBounds(50, 320, 100, 25);
        add(lblHasilPass);

        hasilPass = new TextField();
        hasilPass.setBounds(200, 320, 250, 25);
        hasilPass.setEditable(false);
        add(hasilPass);

        lblHasilCom = new Label("Comments");
        lblHasilCom.setBounds(50, 360, 100, 25);
        add(lblHasilCom);

        hasilCom = new TextArea();
        hasilCom.setBounds(200, 360, 250, 50);
        hasilCom.setEditable(false);
        add(hasilCom);

        // Event Button
        btnDisplay.addActionListener(this);
        btnDelete.addActionListener(this);

        // Event Close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setVisible(true);
    }

    // Event tombol
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnDisplay) {

            hasilUser.setText(txtUser.getText());
            hasilPass.setText(txtPass.getText());
            hasilCom.setText(txtCom.getText());

        } else if (e.getSource() == btnDelete) {

            txtUser.setText("");
            txtPass.setText("");
            txtCom.setText("");

            hasilUser.setText("");
            hasilPass.setText("");
            hasilCom.setText("");
        }
    }

    // Main Method
    public static void main(String[] args) {
        new CetakDataFrame();
    }
}
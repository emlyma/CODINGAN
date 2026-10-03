import javax.swing.*;

public class cobagui {
    public static void main(String[] args) {

        // Membuat window/frame
        JFrame frame = new JFrame("Form Login");

        // Membuat label
        JLabel Userlabel = new JLabel("Username");
        JLabel Passlabel = new JLabel("Password");

        // Membuat kolom input
        JTextField username = new JTextField();
        JPasswordField password = new JPasswordField();

        // Membuat tombol
        JButton login = new JButton("Login");

        // Mengatur posisi komponen
        Userlabel.setBounds(50, 30, 100, 30);
        username.setBounds(150, 30, 150, 30);

        Passlabel.setBounds(50, 80, 100, 30);
        password.setBounds(150, 80, 150, 30);

        login.setBounds(120, 140, 100, 30);

        // Menambahkan komponen ke frame
        frame.add(Userlabel);
        frame.add(username);

        frame.add(Passlabel);
        frame.add(password);

        frame.add(login);

        // Mengatur ukuran window
        frame.setSize(400, 250);

        // Layout manual
        frame.setLayout(null);

        // Menampilkan frame
        frame.setVisible(true);
    }
}
import javax.swing.*;

public class gui {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Form Login");


        JLabel userLabel = new JLabel("Username");
        JLabel passLabel = new JLabel("Password");

        JTextField username = new JTextField();
        JPasswordField password = new JPasswordField();

        JButton login = new JButton("Login");

        userLabel.setBounds(50, 30, 100, 30);
        username.setBounds(150, 30, 150, 30);

        passLabel.setBounds(50, 80, 100, 30);
        password.setBounds(150, 80, 150, 30);

        login.setBounds(120, 140, 100, 30);

        frame.add(userLabel);
        frame.add(username);

        frame.add(passLabel);
        frame.add(password);

        frame.add(login);

        frame.setSize(400, 250);

        frame.setLocation(550, 275);

        frame.setLayout(null);

        frame.setVisible(true);
    }
}
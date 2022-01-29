import javax.swing.*;


public class MyFrame extends JFrame {
    JButton myButton = new JButton("My Button one");
    JButton myButton2 = new JButton("My Button two");

    MyFrame() {
        myButton.setBounds(100, 100, 150, 100);
        myButton.addActionListener(
                (e) -> System.out.println("This is the first button"));

        myButton2.setBounds(100, 200, 150, 100);
        myButton2.addActionListener(
                (e) -> System.out.println("This is the second button"));

        this.add(myButton);
        this.add(myButton2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);
        this.setVisible(true);
    }
}

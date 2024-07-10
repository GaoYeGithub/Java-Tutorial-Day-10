# Solution (No peeking!)


<details> <summary> 👀 Answer  </summary>

```java

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        JTextField num1 = new JTextField(5);
        JTextField num2 = new JTextField(5);
        JButton addButton = new JButton("Add");
        final JLabel resultLabel = new JLabel("Result: ");

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int number1 = Integer.parseInt(num1.getText());
                int number2 = Integer.parseInt(num2.getText());
                int result = number1 + number2;
                resultLabel.setText("Result: " + result);
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Number 1:"));
        frame.add(num1);
        frame.add(new JLabel("Number 2:"));
        frame.add(num2);
        frame.add(addButton);
        frame.add(resultLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 120);
        frame.setVisible(true);
    }
}
```






</details>
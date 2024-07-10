# Layout Managers

## What is Layout
If you had try to add the buttons, labels, and textfield together you realize you can only show one at a times that because they overlay each other hiding the bottom ones. 

Here are some common layout

### Flow Layout

```java
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setLayout(new FlowLayout()); // Automatically Prevent overlay pretty useful
        
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

```

```java
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");
        JButton button = new JButton("Click Me!");
        JLabel label = new JLabel("Hello, World!");
        JTextField textField = new JTextField("Enter text here", 20);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        frame.add(label);
        frame.add(textField);
        frame.add(button);

        frame.setVisible(true);
    }
}
```

### Border Layout

You want to keep something one direction you can called using the compass direction

``` java
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setLayout(new BorderLayout());

        frame.add(new JButton("North"), BorderLayout.NORTH); // You just say what you wanna add and direction
        frame.add(new JButton("South"), BorderLayout.SOUTH);
        frame.add(new JButton("East"), BorderLayout.EAST);
        frame.add(new JButton("West"), BorderLayout.WEST);
        frame.add(new JButton("Center"), BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

### Grid Layout
Lastly there is the Grid Layout
A bit more niche but like it's name create a grid

``` java
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example");
        frame.setLayout(new GridLayout(3, 2)); // it's (Row, Column)

        for (int i = 1; i <= 6; i++) { //for each section of the grid creates a button here it 3x2 so 6 buttons
            frame.add(new JButton("Button " + i));
        }

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

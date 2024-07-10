# Working with Components

Common Components include button, label, and TextField. There are way more but you can read it here:
https://web.mit.edu/6.005/www/sp14/psets/ps4/java-6-tutorial/components.html

👉 Type this line of code in `Main.java` and click `run`. 

### Buttons 

```java
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Example");
      //button
        JButton button = new JButton("Click Me!");
        
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.setVisible(true);
    }
}

```

### Label

```java
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Label Example");
        JLabel label = new JLabel("Hello, World!");

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.setVisible(true);
    }
}

```

# TextField
```java
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TextField Example");
        JTextField textField = new JTextField("Enter text here", 20);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(textField);
        frame.setVisible(true);
    }
}

```

And this is how you add most components.
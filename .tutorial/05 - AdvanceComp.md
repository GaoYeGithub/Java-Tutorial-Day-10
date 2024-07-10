# Advanced Components 

Advanced components are like interactive display all for more formatted information like:

### JComboBox

It allow you to choose different options. You might see on places with preselected options

```java
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ComboBox Example");
        String[] options = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<String>(options);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(comboBox);
        frame.setVisible(true);
    }
}
```

### JCheckBox
Typically for boolean choices of True or False, the most common is Accept Terms and Conditions

```java
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CheckBox Example");
        JCheckBox checkBox = new JCheckBox("Accept Terms and Conditions");

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(checkBox);
        frame.setVisible(true);
    }
}
```

### JRadioButton
Lasty is the Radio Button is another interactive display all for more predefined choices

```java
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RadioButton Example");
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.setVisible(true);
    }
}
```
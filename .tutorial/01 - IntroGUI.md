# Java Graphical User Interfaces (GUIs)

Graphical User Interfaces (GUIs) make applications look prettier and interactive. 

Today we will be using Java Swing Oracle's Java Foundation Classes – an API for providing a graphical user interface for Java programs

## Basics of Swing

To start with Java Swing we need JFrame a window where the other components are put 

👉 Copy this code into your coding editor in `Main.java` and see what happens when you hit `run`:


```java
//Import JFrame from Swing
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
      //Label the JFrame as GUI and frame where things are place inside
        JFrame frame = new JFrame("GUI");
      //set the size of the window if things are place other of here it won't be shown
        frame.setSize(400, 300);
      //Create allow you to close the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //Display the frame and set it true
        frame.setVisible(true);
    }
}

```

You can also overlay it like this:

```java
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame1 = new JFrame("Popup");
        JFrame frame2 = new JFrame("Main Window");

        frame1.setSize(400, 300);
        frame2.setSize(1000, 1000);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
        frame2.setVisible(true);

    }
}
```

Let Practice adding stuff to it like buttons

```java
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Buttons");
        JButton button = new JButton("Button!");

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.setVisible(true);
    }
}

```
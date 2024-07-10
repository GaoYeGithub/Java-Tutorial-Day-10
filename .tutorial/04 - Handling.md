# Event Handling

Now let add some interactivity here are common event listener

### Action Listener
Check for action useing add action listener

```java
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionListener Example");
        JButton button = new JButton("Click Me!");
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
            }
        });
        
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.setVisible(true);
    }
}

```

### Mouse Listner

Check different state like hover, click and exit of the mouse

```java
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MouseListener Example");
        JButton button = new JButton("Hover or Click Me!");
        
        button.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked!");
            }
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse Entered!");
            }
            public void mouseExited(MouseEvent e) {}
        });
        
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.setVisible(true);
    }
}

```



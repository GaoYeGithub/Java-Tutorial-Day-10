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

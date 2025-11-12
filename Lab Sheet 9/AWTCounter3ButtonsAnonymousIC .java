import java.awt.*;
import java.awt.event.*;

class AWTCounter extends Frame {
    private Label label;
    private Button countUpButton, countDownButton, resetButton;
    private int count;

    public AWTCounter() {
        setTitle("AWT Counter");
        setLayout(new FlowLayout());

        label = new Label("Counter");
        add(label);

        countUpButton = new Button("Count Up");
        add(countUpButton);

        countDownButton = new Button("Count Down");
        add(countDownButton);

        resetButton = new Button("Reset");
        add(resetButton);

        countUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText("Counter: " + count);
            }
        });

        countDownButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count--;
                label.setText("Counter: " + count);
            }
        });

        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count = 0;
                label.setText("Counter: " + count);
            }
        });

        setSize(300, 200);
        setVisible(true);
    }
}

public class AWTCounter3ButtonsAnonymousIC  extends AWTCounter {
    public AWTCounter3ButtonsAnonymousIC() {
        super();
    }

    public static void main(String[] args) {
        new AWTCounter3ButtonsAnonymousIC ();
    }
}

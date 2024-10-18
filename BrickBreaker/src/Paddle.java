import javafx.scene.input.KeyCode;
import java.awt.event.KeyEvent;

public class Paddle {
    private int x, y, width, height;

    public Paddle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void move(KeyEvent e){
        if (e.getKeyCode() == KeyCode.LEFT){
            x = x - 5;
        }
    }
}

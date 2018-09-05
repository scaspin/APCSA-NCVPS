/**
 * Shai Caspin
 * Due 04/19/2017
 * APCS Principles Create Project
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Snake extends JFrame {

    //Properties of boardgame with 
    private final int BOARD_WIDTH = 600; // 20 (tile size) * 30 (number of collums)
    private final int BOARD_HEIGHT = 600;
    private final int TILE_SIZE = 20;
    private final int ALL_TILES = 900; // Total numer of tiles
    private final int DELAY = 100;

    //Snake coordinates
    private int[] xCoor = new int[ALL_TILES];
    private int[] yCoor = new int[ALL_TILES];
    

    // Apple coordinates
    private int apple_x, apple_y;

    // User input through keyboard
    static int  pressedKey = KeyEvent.VK_DOWN;
    int oldPressedKey;
    private int snakeSize = 4;
    private boolean inGame = true;
    
    /**
     * main method to start new game
     * 
     */
    public static void main (String[] args) {
        Snake s = new Snake();
        
    } 
    
    /**
     * Snake method for start
     */
    public Snake(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(BOARD_WIDTH, BOARD_HEIGHT);
        setResizable(false);
        setLocation(BOARD_WIDTH/2, BOARD_HEIGHT/2);
    
        Board b = new Board();
        addKeyListener(b);
        add(b);
        setVisible(true);
    
        Timer t = new Timer(DELAY, b);
        t.start();
    }
    
   public class Board extends JPanel implements KeyListener, ActionListener {
        public void keyReleased(KeyEvent e){}
        public void keyTyped(KeyEvent e){}
        
        Board(){
            setBackground(Color.white);
            //setBorder(BorderFactory.createMatteBorder(570, 590, 570, 590, Color.black));
            
            int temp;
            // Set snake starting coordinates. 
            for(int i = 0; i < snakeSize; i++){
              yCoor[i] = 300 - (i * 30);
              xCoor[i] = 300;
            }
    
            rndApple();
        }
    
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
    
            if (inGame) {
        
                //apple
                g.setColor(Color.red);
                g.fillRect(apple_x, apple_y, TILE_SIZE, TILE_SIZE);
        
                // snake
                for (int i = 0; i < snakeSize; i++) {
        
                    if (i == 0) { 
                      g.setColor(Color.magenta);
                    } else {
                      g.setColor(Color.green);}
        
                    g.fillRect(xCoor[i], yCoor[i], TILE_SIZE, TILE_SIZE);
                }
                
                //update s
                g.setFont(new Font("Sans serif", Font.BOLD, 20));
                g.drawString(getScore(), 500, 50);
        
            } 
            else {
              gameOver(g);
            }
        }
    
        public void actionPerformed(ActionEvent e) {
            checkTile();
            move();
            repaint();
        }
    
        /* Saves pressedKeyCode to pressedKey. */
        public void keyPressed(KeyEvent e) {
            oldPressedKey = pressedKey;
            pressedKey = e.getKeyCode();
        }
        private void move(){
    
            /* Move coordinates up one in the matrix.*/
            for (int i = snakeSize; i > 0; i--) {
              xCoor[i] = xCoor[(i - 1)];
              yCoor[i] = yCoor[(i - 1)];
            }
    
            /* Depending on what key was pressed, change coordinates
             * accordingly. */
            switch (pressedKey) {
                case KeyEvent.VK_DOWN:
                  yCoor[0] += TILE_SIZE;
                  break;
                case KeyEvent.VK_UP:
                  yCoor[0] -= TILE_SIZE;
                  break;
                case KeyEvent.VK_LEFT:
                  xCoor[0] -= TILE_SIZE;
                  break;
                case KeyEvent.VK_RIGHT:
                  xCoor[0] += TILE_SIZE;
                  break;
            }
        }
    

        private void checkTile(){
            outWall();
            collide();
            eatApple();
        }
        
        private void outWall()
        {
            if ( xCoor[0] > BOARD_WIDTH || xCoor[0] < 0 || yCoor[0] > BOARD_HEIGHT || yCoor[0] < 0 ) {
                 inGame = false;
               }
        }
        private void collide()
        {
            for(int i = 1; i < xCoor.length; i++){
              if (xCoor[0] == xCoor[i] && yCoor[0] == yCoor[i]){
                  inGame = false;
              }
            }
        }
        private void eatApple()
        {
            if ((xCoor[0] == apple_x) && (yCoor[0] == apple_y)) {
              snakeSize++;
              rndApple();
            }
        }
    
        /** Generates random coordinates for apple. */
        private void rndApple() {
            int rndm = (int) (Math.random() * 29);
            apple_x = ((rndm * (TILE_SIZE)));
    
            rndm= (int) (Math.random() * 29);
            apple_y = ((rndm * (TILE_SIZE)));
        }
    
        /**  gameOver-message */
        private void gameOver(Graphics g) {
            g.setColor(Color.black);
            g.setFont(new Font("Sans serif", Font.BOLD, 20));
            g.drawString(("Game Over! You ate " + (getScore()) + " apples!"),
                 BOARD_WIDTH / 4, BOARD_HEIGHT / 2);
            g.drawString("Press space to restart",
                 BOARD_WIDTH / 4 + 20, BOARD_HEIGHT / 2 + 30);
    
            /* Restart game if space is pressed. */
            if (pressedKey == KeyEvent.VK_SPACE){
             
              pressedKey = KeyEvent.VK_DOWN;
              setVisible(false); 
              dispose(); 
              Snake s = new Snake();
            }
        }

        private String getScore(){
            return "" + (snakeSize - 4);
        }
      } 
 
}
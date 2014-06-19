package pong;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/*
 * @author Michael Lay
 */
public class Game extends javax.swing.JFrame {

    Ball ball;
    Graphics g;
    boolean gameOver;
    public Game() {       
        ball = new Ball();
        ball.x = 300;
        ball.y = 200;
        gameOver = true;
        gameLoop();
        
        initComponents();
       
    }
    
   private void gameLoop(){
       while(!gameOver){
           table.setBall(ball);
           table.paint(g);
       }
       //display game over message box
   }
   
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scoreBoard = new javax.swing.JScrollPane();
        table = new PingPongTable(ball);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false
        );

        scoreBoard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        scoreBoard.setWheelScrollingEnabled(false);

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setPreferredSize(new java.awt.Dimension(600, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(scoreBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scoreBoard))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane scoreBoard;
    private java.awt.Canvas table;
    // End of variables declaration//GEN-END:variables
}

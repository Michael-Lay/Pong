package pong;

import java.awt.*;


public class PingPongTable extends Canvas {
    
    Ball ball;
    public PingPongTable(Ball sphere) {        
        ball = sphere;
        Dimension dim = new Dimension(600,400);
        this.setPreferredSize(dim);
    }
    

    public void setBall(Ball sphere){
        ball = sphere;
    }
    
//    @Override
//    public void paint(Graphics g){
//        g.drawLine(300,0, 300, 400);
//        g.setColor(Color.red);
//        g.fillOval(ball.x-10, ball.y-10, 20, 20);//subtracting half width half height from x,y to get centered ball
//    }
}

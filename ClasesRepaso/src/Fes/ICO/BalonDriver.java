package Fes.ICO;

import java.awt.*;

public class BalonDriver {
    public static void main(String[] args) {
        Balon ball = new Balon("Futball", "mediano", Color.LIGHT_GRAY);
        ball.botando();
        System.out.println(ball);
        ball.rodando();
        System.out.println(ball);
        ball.quieto();
        System.out.println(ball);
    }

    }


package com.luizgamer.netbeansteste.meuJogo.modelo;

import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Timer;

public class Fase extends JPanel implements ActionListener
{
    private Image background;
    private Player player;
    private Timer timer;

    public Fase() 
    {
        setFocusable(true);
        setDoubleBuffered(true);
        timer = new Timer(5, this);//TRATA A VELOCIDADE DO JOGO
        //timer.start();
        
        ImageIcon referencia = new ImageIcon
        ("D:\\Arquivo\\Luiz\\projetos\\Java\\NetBeansTeste\\res\\background\\background.jpg");
        
        background = referencia.getImage();
        player = new Player();
        player.load();
        
        setVisible(true);
    }
    public void paint(Graphics g) 
    {
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(background, 0, 0, null);
        g2D.drawImage
        (player.getImagem(), player.getX(), player.getY(), this);
        
        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        player.update();
        repaint();
    }
    
    public class TecladoAdapter extends KeyAdapter
    {
        @Override
        public void keyPressed(KeyEvent e) 
        {
            player.keyPressed(e);
        }
        @Override
        public void keyReleased(KeyEvent e) 
        {
            player.keyRelesed(e);
        }
    }
}

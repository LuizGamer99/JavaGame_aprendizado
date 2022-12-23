

package com.luizgamer.netbeansteste.meuJogo.modelo;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Player
{
    private int x,y;
    private int dX,dY;
    private Image imagem;
    private int altura,largura;
    
    public Player() 
    {
        this.x = 100;
        this.y = 100;
        
    }
    
    public void load() 
    {
        ImageIcon referencia = new ImageIcon
        ("D:\\Arquivo\\Luiz\\projetos\\Java\\NetBeansTeste\\res\\sprite\\player.png");
        
         imagem = referencia.getImage();
         altura = 20;
         largura = 20;
    }
    
    public void update() 
    {
        x += dX;
        y += dY;
    }
    
    public void keyPressed(KeyEvent tecla) 
    {
        int codigo = tecla.getKeyCode();
        
        if(codigo == KeyEvent.VK_W)
        {
            dY = 3;
        }
        if(codigo == KeyEvent.VK_S)
        {
            dY = -3;
        }
        if(codigo == KeyEvent.VK_D)
        {
            dX = 3;
        }
        if(codigo == KeyEvent.VK_A)
        {
            dX = -3;
        }
    }
    public void keyRelesed(KeyEvent tecla) 
    {
        int codigo = tecla.getKeyCode();
        
        if(codigo == KeyEvent.VK_UP)
        {
            dY = 0;
            System.out.println("W click");
        }
        if(codigo == KeyEvent.VK_DOWN)
        {
            dY = 0;
            System.out.println("S click");
        }
        if(codigo == KeyEvent.VK_RIGHT)
        {
            dX = 0;
            System.out.println("D click");
        }
        if(codigo == KeyEvent.VK_LEFT)
        {
            dX = 0;
            System.out.println("A click");
        }
    }
    
    public int getX() 
    {
        return x;
    }
    public int getY() 
    {
        return y;
    }
    public Image getImagem() 
    {
        return imagem;
    }
}

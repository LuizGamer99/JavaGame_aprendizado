package com.luizgamer.netbeansteste.meuJogo;

import com.luizgamer.netbeansteste.meuJogo.modelo.Entrada;
import javax.swing.JFrame;
import com.luizgamer.netbeansteste.meuJogo.modelo.Fase;
import java.awt.event.KeyEvent;

public class Janela extends JFrame
{
    Entrada entrada = new Entrada();
    
    public Janela () 
    {
        add(new Fase());
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
        this.addKeyListener(entrada);
        entrada.createKeys("cima",KeyEvent.VK_UP);
        entrada.createKeys("baixo",KeyEvent.VK_DOWN);
        entrada.createKeys("esquerda",KeyEvent.VK_LEFT);
        entrada.createKeys("direita",KeyEvent.VK_RIGHT);
    }
    public void update() 
    {
        if(entrada.isKeyPressed("cima"))
        {
            System.out.println("pra cima aeee");
        }
    }

    public static void main(String[] args) 
    {
        System.out.println("halo");
        new Janela();
    }
    
}

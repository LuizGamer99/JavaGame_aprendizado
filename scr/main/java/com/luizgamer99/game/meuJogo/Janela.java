package com.luizgamer.netbeansteste.meuJogo;

import javax.swing.JFrame;
import com.luizgamer.netbeansteste.meuJogo.modelo.Fase;

public class Janela extends JFrame
{
    
    public Janela () 
    {
        add(new Fase());
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        System.out.println("halo");
        new Janela();
    }
    
}

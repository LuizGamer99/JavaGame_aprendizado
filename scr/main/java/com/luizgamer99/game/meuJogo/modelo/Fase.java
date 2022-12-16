package com.luizgamer.netbeansteste.meuJogo.modelo;

import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fase extends JPanel
{
    private Image background;

    public Fase() 
    {
        ImageIcon referencia = new ImageIcon
        ("D:\\Arquivo\\Luiz\\projetos\\Java\\brincando\\resourcers\\background\\background.jpg");
        
        background = referencia.getImage();
        setVisible(true);
    }
    public void paint(Graphics g) 
    {
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(background, 0, 0, null);
        g.dispose();
    }
}

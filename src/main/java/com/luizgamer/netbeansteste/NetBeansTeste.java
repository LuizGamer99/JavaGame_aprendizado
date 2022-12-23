package com.luizgamer.netbeansteste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.python.core.PyFile;
import org.python.core.PyFileReader;
import org.python.util.PythonInterpreter;

public class NetBeansTeste 
{
    //inicializa o progama
    public static void main(String[] args) throws FileNotFoundException 
    {
        
        PyFileReader leitura = new PyFileReader(null);

        System.out.println("inicio");
        PythonInterpreter py = new PythonInterpreter();
        py.exec("print('ai')");

      //new Janela();
        py.close();
        System.out.println("fim");
    }
}

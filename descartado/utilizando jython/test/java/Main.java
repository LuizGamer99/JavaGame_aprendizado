import java.io.InputStream;

import org.python.util.PythonInterpreter;

import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) throws Exception 
    {
        InputStream arquivo = new FileInputStream
		("src\\test\\java\\Entrada.py");// arquivo python principal
        PythonInterpreter python = new PythonInterpreter();//necessário para que o jython funcione
        python.execfile(arquivo);
        python.get("out");//recebe a variável

    }
}

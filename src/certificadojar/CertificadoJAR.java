/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certificadojar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class CertificadoJAR {

    static final private Logger LOGGER = Logger.getLogger("certificadojar.CertificadoJAR");

    static public void main(String[] args) {
        try {
            CertificadoJAR prueba = new CertificadoJAR();

            String mensaje = prueba.leerCert();

            JOptionPane.showMessageDialog(null, mensaje);

        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }

    }

    public String leerCert() throws IOException {
        InputStream is = getClass().getResourceAsStream("/dataCert.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String mensaje = "";
        String cadena;

        while ((cadena = br.readLine()) != null) {
            mensaje = mensaje + cadena + "\n";
        }

        return mensaje;
    }

}

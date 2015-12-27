/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.semher.visualpoint.verificadores;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Aleksandro
 */
public class VerificadorExe {
    public volatile static Process p;
    
    public static int ComandoExe(String ip){
        int caso = 0, echo = 0;
        String s = "";
        boolean validador = false;
        try {
            p = Runtime.getRuntime().exec("ping " + ip +" -n 10");
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));
            while ((s = inputStream.readLine()) != null) {
                char stremvetor[] = s.toCharArray();
                if (stremvetor.length == 48|| stremvetor.length == 49 || stremvetor.length == 50 || stremvetor.length == 51) {
                    echo++;
                } else {
                    validador = true;
                }

            }
            p.destroyForcibly();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao chamar o Runtime, não foi possível chamar o prompt " + e, "Erro ! ", JOptionPane.ERROR_MESSAGE);
            caso = 4;
        }
        if (echo >= 4) {
            caso = 1;
        } else if (echo >=1 && echo < 3) {
            caso = 2;
        } else if (echo < 1 && validador) {
            caso = 3;
        }
        return caso;
    }
    
}

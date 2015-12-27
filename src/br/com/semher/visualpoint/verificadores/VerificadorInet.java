/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.semher.visualpoint.verificadores;
import java.net.InetAddress;

/**
 *
 * @author Aleksandro Guimarães de Matos
 */

//metodo que verificar se o servidor está ativo pelo isReachable da Classe InetAddress
public class VerificadorInet {
    public static int  verificador (String servidor) {
        int caso = 0, echo = 0;
        boolean validador = false;
        
        
        for (int i = 0; i < 4; i++) {
            try {
                if (InetAddress.getByName(servidor).isReachable(null, 64, 2000)) {
                    echo++;
                } else {
                    validador = true;
                }
            } catch (Exception e) {
                caso = 4;
                break;
            }
        }
        if (echo >= 3) {
            caso = 1;
        } else if (echo >=1 && echo < 3) {
            caso = 2;
        } else if (echo < 1 && validador) {
            caso = 3;
        }
        return caso;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.semher.visualpoint.verificadores;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Aleksandro
 */
public class Parametros {

    // metodo que pega a dimensão da tela e devolve para ser utilizada no aplicativo

    public static Dimension modoTelaCheia() {
        return (new Dimension((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(),
                (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
    }
    // variável TEMPO armazena o tempo da em que a tarefa de monitormanto será iniciada
    //atualiza a cada  2segundos
    public static final long TEMPO = (1000 * 5 ); // atualiza o site a cada  5 segundo

}

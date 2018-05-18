
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controle.ControleTutor;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.TelaTutor;

/**
 *
 * @author gleyser
 */
public class Main {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException { 
        ControleTutor controleTutor =  new ControleTutor();        
        new TelaTutor(controleTutor).setVisible(true);
                
    }
    
}

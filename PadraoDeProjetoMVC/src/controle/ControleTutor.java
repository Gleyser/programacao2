/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Main;
import model.Tutor;

/**
 *
 * @author gleyser
 */
public class ControleTutor implements Serializable {
    private static final long serialVersionUID = 2806421523585360625L;
    private ArrayList<Tutor> tutores;

    public ControleTutor() {
        this.tutores = new ArrayList<Tutor>();
        try {            
            setTutores();
        } catch (IOException ex) {
            Logger.getLogger(ControleTutor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControleTutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    public void cadastrarTutor(String nome, String matricula, String email, String disciplina){
        Tutor tutor = new Tutor(nome, matricula, email, disciplina);
        this.tutores.add(tutor);        
        ObjectOutputStream objectOut;
        
        try {
            objectOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("tutoresSalvos1")));
            objectOut.writeObject(this.tutores);
            objectOut.close();
            
        } catch (IOException ex) {
            Logger.getLogger(ControleTutor.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    
    public ArrayList<String> recuperaTutores(){
        ArrayList<String> retorno =  new ArrayList<String>();
        for (Tutor i: this.tutores){
            retorno.add(i.getNome());
            retorno.add(i.getMatricula());
            retorno.add(i.getEmail());
            retorno.add(i.getDisciplina());
        }
        return retorno;
                
    }

    public void setTutores() throws IOException, ClassNotFoundException {
        ObjectInputStream objectIn;
        try {
           objectIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("tutoresSalvos1")));
           ArrayList<Tutor> so = (ArrayList<Tutor>)objectIn.readObject();           
           this.tutores = so;
           objectIn.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControleTutor.class.getName()).log(Level.SEVERE, null, ex);
        }     
 
    }

    public ArrayList<Tutor> getTutores() {
        System.out.println(tutores);
        return tutores;
    }   
    
}

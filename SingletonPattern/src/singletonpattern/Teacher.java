/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpattern;

/**
 *
 * @author sksha
 */
public class Teacher {
 

    public void readEssay () {
          TextFile textfile= TextFile.getInstance();
            textfile.readEssay();
    }
}

    

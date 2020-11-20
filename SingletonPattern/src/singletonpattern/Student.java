/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpattern;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author sksha
 */
public class Student {

    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
     */
    public void readEssay() {
        //TextFile textfile= new TextFile();
        //TextFile textfile= TextFile.getInstance();
        //textfile.TextFile.getInstance()
        TextFile.getInstance().getInstance();

    }

    public void writeEssay(String text) {
        //TextFile textfile= TextFile.getInstance();
        //textfile.writeEssay(text);
        TextFile.getInstance().writeEssay(text);
    }

}

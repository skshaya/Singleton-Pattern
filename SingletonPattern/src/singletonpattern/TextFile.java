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

public class TextFile {

    //create an object of SingleObject
   private static TextFile instance = new TextFile();

   //make the constructor private so that this class cannot be
   //instantiated
   private TextFile(){}

   //Get the only object available
   public static TextFile getInstance(){
      return instance;
   }


    public void readEssay () {
    try {
            FileReader reader = new FileReader("MyFile.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeEssay (String text) {
         try {
            FileWriter writer = new FileWriter("MyFile.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write(text);
            bufferedWriter.newLine();
            bufferedWriter.write("See You Again!");

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

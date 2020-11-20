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
public class SingletonPattern {

    public static void main(String[] args) {
        // TODO code application logic here

        Student stu1 = new Student();
            stu1.writeEssay("My Pet is a Rat");


           Teacher tea1 = new Teacher();
           System.out.println("Teacher is reading");
           tea1.readEssay();


           Coordinator co1 = new Coordinator();
           System.out.println("Coordinator is reading");
           co1.readEssay();
    }

}


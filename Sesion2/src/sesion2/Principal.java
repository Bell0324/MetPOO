/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person Leonardo = new Person("Leonardo", "Moncada", 1.79f, 23);
        Person Abigail = new Person("Abigail", "Acuña", 1.63f, 20);
        Person Erick = new Person("Erick", "Martinez", 1.63f, 39);
        Person Justin = new Person("Justin", "Detrinidad", 1.80f, 19);
        Person Sergio = new Person("Sergio", "Rivas", 1.72f, 19);
       
        
        ArrayList<Person> people = new ArrayList<>();
        people.add(Leonardo);
        people.add(Abigail);
        people.add(Erick);
        people.add(Justin);
        people.add(Sergio);

        
        people.forEach(person -> {
            System.out.println(person);
        });

    }
    
}


package sesion2;

/**
 *
 * @author Bellacuña
 */
public class Person {
    private String name;
    private String lastName; 
    private float height;
    private int age; 
    
    /** metodo constructor 
     * (metodo) constructor vascio
     * 
     */
    public Person (){
        
    }

    /**
     *
     * @param name
     * @param lastName
     * @param height
     * @param age
     */
    
    public Person(String name, String lastName, float height, int age){
            this.name = name;
            this.lastName = lastName;
            this.height = height;
            this.age = age;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nNombre: " + name + "\nApellido: " + lastName + "\nAltura: " + height + "\nEdad: " + age + '\n'; 
       
    }
    
    
}

package Modelo;

import jakarta.persistence.*;
@Entity
@Table(name = "persona") //Establecemos que esta clase es una tabla y que se llama persona
public class Persona {

    // Establecemos los atributos que va a manejar nuestra app

        //Referencia al id de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String apellido;
    public Persona(){}

    public Persona(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

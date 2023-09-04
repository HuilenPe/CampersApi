package model;

import lombok.Data;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Data
public class Camper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private String username;
    private String password;

    // La relación con Signups
    @OneToMany(mappedBy = "camper")
    private List<Signup> signups;

    public Camper(String name, Integer age, String username, String password) {
        this.name = name;
        this.age = age;
        this.username = username;
        this.password = password;
    }
}

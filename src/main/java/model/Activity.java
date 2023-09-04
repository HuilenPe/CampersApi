package model;

import lombok.Data;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Data
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer difficulty;

    // Relación con Signups
    @OneToMany(mappedBy = "activity")
    private List<Signup> signups;

}

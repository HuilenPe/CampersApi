package model;

import lombok.Data;

import jakarta.persistence.*;

@Entity
@Data
public class Signup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // La relación con Camper
    @ManyToOne
    @JoinColumn(name = "camper_id")
    private Camper camper;

    // La relación con Activity
    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;
}
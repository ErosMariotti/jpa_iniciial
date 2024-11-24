package Entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    // La columna que contiene la clave foránea de domicilio
    // Se crea el FK en la tabla cliente
    @JoinColumn(name = "fk_cliente")
    private Domicilio domicilio;
}

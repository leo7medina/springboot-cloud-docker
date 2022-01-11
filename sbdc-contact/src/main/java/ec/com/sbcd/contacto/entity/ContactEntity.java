package ec.com.sbcd.contacto.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@Entity(name = "CONTACTO")
public class ContactEntity implements Serializable {


    @Id
    private Integer id;

    @Column(name = "NOMBRE")
    private String name;

    @Column(name = "CORREO")
    private String mail;
}

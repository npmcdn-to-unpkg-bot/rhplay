package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Escolaridade extends Model {

    @Id
    private Long id;
}

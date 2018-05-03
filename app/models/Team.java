package models;

import io.ebean.Finder;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Team extends BaseModel {
    public static Finder<Integer, Team> find = new Finder<>(Team.class);
    public List<Student> players;
    public String name;


    public Team(String name) {
        this.name = name;
    }
}

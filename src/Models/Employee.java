package Models;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Burak Köken on 28.5.2017.
 */
@Entity
public class Employee {

    private int id;
    private String name;
    private int salary;

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

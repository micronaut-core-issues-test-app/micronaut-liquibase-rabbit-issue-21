package micronaut.liquibase.rabbit;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class Book {

    @Id
    private Long id;

    private String name;

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

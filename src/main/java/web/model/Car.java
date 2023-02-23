package web.model;

import org.springframework.stereotype.Component;


public class Car {
    private Long id;
    private String name;
    private int prodYear;

    public Car(Long id, String name, int prodYear) {
        this.id = id;
        this.name = name;
        this.prodYear = prodYear;
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

    public int getProdYear() {
        return prodYear;
    }

    public void setProdYear(int prodYear) {
        this.prodYear = prodYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prodYear=" + prodYear +
                '}';
    }
}

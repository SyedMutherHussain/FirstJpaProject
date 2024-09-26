package io.Hussain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //kabhi bhi persistence ka use karo agar kabhi hibernate sae acha wala version aagaya to easy to switch
@Table(name = "POKEMON_NAME")
public class Pokemon {

    @Id//because of primary key we use this notation
    @Column(name = "POKEMON_NAME")
    private String name;//@column nahi lagaenge toh bhi Hibernate is so smart it asume itself

    
    private String type;
    
//    public Pokemon(Color color) {
//		super();
//		this.color = color;
//	}


    
    private int power;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
    
    @Enumerated(EnumType.STRING)
    private Color color;

    public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Column(nullable = false)
    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    @Override
    public String toString() {
    	return this.getName() + " " + this.getPower() + " " + this.getType();
    }
}

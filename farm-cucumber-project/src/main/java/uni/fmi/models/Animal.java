package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Animal {

    public Animal() {
    }

    private String type;

    private int age;

    private Set<Animal> child;

    private Set<Animal> parent;

    private Farm farm;

    public String getType() {
        return type;
    }

    
    public void setType(String type) {
    	this.type = type;
    }

    public Set<Animal> getParent() {
        return parent;
    }

    public void setParent(Set<Animal> parent) {
    	this.parent = parent;
    }

    public Set<Animal> getChild() {
        return child;
    }

    public void setChild(Set<Animal> child) {
    	this.child = child;
    }

    public Farm getFarm() {
        return farm;
    }

    public void setFarm(Farm farm) {
    	this.farm = farm;
    }

    public int getAge() {
    	return age;
    }

    public void setAge(int age) {
    	this.age = age;
    }


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Animal other = (Animal) obj;
		if (age != other.age) {
			return false;
		}
		if (type == null) {
			if (other.type != null) {
				return false;
			}
		} else if (!type.equals(other.type)) {
			return false;
		}
		return true;
	}

}
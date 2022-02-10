package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Farm {

    /**
     * Default constructor
     */
    public Farm() {
    }

    private String name;

    private Owner owner;

    private Set<Animal> animal;

    private Set<Association> association;

    public String getName() {
        return name;
    }

    public void setName(String name) {
    	this.name = name;
    }

    public Set<Animal> getAnimal() {
        return animal;
    }

    public void setAnimal(Set<Animal> animal) {
    	this.animal=animal;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
    	this.owner=owner;
    }

    public Set<Association> getAssociation() {
        return association;
    }

    public void setAssociation(Set<Association> association) {
    	this.association=association;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Farm other = (Farm) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

}
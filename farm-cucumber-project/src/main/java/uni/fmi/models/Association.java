package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Association {

    /**
     * Default constructor
     */
    public Association() {
    }

    private String name;

    private Set<Farm> farm;

    private Set<Owner> owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
    	this.name = name;
    }

    public Set<Owner> getOwner() {
        return owner;
    }

    public void setOwner(Set<Owner> owners) {
    	this.owner=owners;
    }

    public Set<Farm> getFarms() {
        return farm;
    }

    public void setFarms(Set<Farm> farms) {
    	this.farm = farms;
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
		Association other = (Association) obj;
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
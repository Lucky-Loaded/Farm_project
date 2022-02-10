package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Owner {

    /**
     * Default constructor
     */
    public Owner() {
    }

    private String name;

    private String address;

    private String phone;

    private String email;

    private Set<Farm> farm;

    private Set<Association> association;

    public String getName() {
        return name;
    }

    public void setName(String name) {
    	this.name=name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
    	this.address=address;
    }

    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
    	this.phone=phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
    	this.email=email;
    }

    public Set<Farm> getFarms() {
        return farm;
    }

    public void setFarms(Set<Farm> farms) {
    	this.farm=farms;
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
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
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
		Owner other = (Owner) obj;
		if (address == null) {
			if (other.address != null) {
				return false;
			}
		} else if (!address.equals(other.address)) {
			return false;
		}
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (phone == null) {
			if (other.phone != null) {
				return false;
			}
		} else if (!phone.equals(other.phone)) {
			return false;
		}
		return true;
	}
    

}
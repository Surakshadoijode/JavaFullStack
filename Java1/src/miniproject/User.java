package miniproject;

public class User {
	    String name;
	    String email;

	    public User(String name, String email) {
	        this.name = name;
	        this.email = email;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (!(obj instanceof User)) return false;
	        User other = (User) obj;
	        return this.email.equalsIgnoreCase(other.email);
	    }

	    @Override
	    public int hashCode() {
	        return email.toLowerCase().hashCode();
	    }
	}


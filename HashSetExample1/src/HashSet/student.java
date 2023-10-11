package HashSet;

import java.util.Objects;

class student {
    private int id;
    private String name;

    public student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        student student = (student) obj;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + "]";
	}

  
	
}


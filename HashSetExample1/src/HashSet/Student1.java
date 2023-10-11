package HashSet;

class Student1 {
    private int id;
    private String name;

    public Student1(int id, String name) {
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
        Student1 student = (Student1) obj;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}



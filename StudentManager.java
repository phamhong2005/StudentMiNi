package Student;

public class StudentManager {
    private int size;
    private Student[] lisStudent;

    public StudentManager() {
        this.size = 0;
        this.lisStudent = new Student[100];
    }

    public void add(Student student) {
        lisStudent[size] = student;
        size++;
    }

    public Student[] getLisStudent() {
        return this.lisStudent;
    }

    public int getSize() {
        return size;
    }

    public Student getStudentById(int id) {
        for (int i = 0; i < size; i++) {
            if (id == lisStudent[i].getId()) {
                return lisStudent[i];
            }
        }
        return null;
    }

    public int getById(int id) {
        for (int i = 0; i < getSize(); i++) {
            if (id == lisStudent[i].getId()) {
                return id;
            }
        }
        return -1;
    }

    public void delete(int id) {
        int index = getById(id);
        for (int i = index; i < getSize(); i++) {
            lisStudent[i] = lisStudent[i + 1];
            size--;
        }
    }

}

package Student;

public class Main4 {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        double[] points1 = {5, 6, 8, 3};
        Student studentOne = new Student("Jr", points1, "Nam");//1
        studentManager.add(studentOne);
        double[] points2 = {5, 3, 2, 3};
        Student studentTwo = new Student("Jkay", points2, "Nam");//2
        studentManager.add(studentTwo);
        double[] points3 = {2, 1, 8, 1};
        Student studentThree = new Student("Coutinho", points3, "Nam");//3
        studentManager.add(studentThree);

        System.out.println(studentManager.getStudentById(1));
        System.out.println(studentManager.getStudentById(2));
        System.out.println(studentManager.getStudentById(3));

        studentManager.delete(1);
        for (int i = 0; i < studentManager.getSize(); i++) {
            System.out.println(studentManager.getLisStudent()[i]);
        }

    }
}

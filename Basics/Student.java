class Student {
    int id;
    String name;
    String gender;

    boolean updateProfile(String newName) {
        name = newName;
        return true;
    }
}

class StudentTest {

    public static void main(String[] args) {
        Student s = new Student();

        s.id = 1000;
        s.name = "Calvin";
        s.gender = "male";

        s.updateProfile("Calvin");
    }

}

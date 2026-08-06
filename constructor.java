class Student {
    String name;
    int age;
    String branch;

    // Constructor
    Student(String name, int age, String branch) {
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    // Display method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student("Rishi", 19, "CSE");
        Student s2 = new Student("Anu", 20, "ECE");

        s1.display();
        s2.display();
    }
}
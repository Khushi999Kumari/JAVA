class Hello {
    int age = 15;

    void data() {
        System.out.println(this);

    }
}

class Student {
    int age;

    Student(int age) {
        this.age = age;
    }

    void print() {
        System.out.println(age);
    }
}

class constructor_call {
    public static void main(String[] args) {
        Student obj = new Student(15);
        obj.print();
    }
}

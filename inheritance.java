// multi level
class Employee {
    public void checkin() {
        System.out.println("checked in");
    }
}

class Manager extends Employee {
    public void managing() {
        System.out.println("job to manage");
    }
}

class Task extends Manager {
    public void tasking() {
        System.out.println("task");
    }
}

// heirarchial
class Developer extends Employee {
    public void develop() {
        System.out.println("developer");
    }
}

// multiple
interface A {
    public static void m1() {
        System.out.println("method 1");
    }
}

interface B {
    public static void m2() {
        System.out.println("method 2");
    }
}

class C implements A, B {
    public C() {
        A.m1();
        B.m2();
    }
}

class inheritance {
    public static void main(String[] args) {
        Task t = new Task();
        t.checkin();
        t.managing();
        Developer d = new Developer();
        d.checkin();
        C c = new C();
    }
}

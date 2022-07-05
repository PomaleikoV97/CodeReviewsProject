package by.itstep.pomaleiko.javalessons.lesson22.model.entity;

public class Worker extends Human {
    private double salary;
    //

    public Worker () {

    }

    public Worker(String name, int age, double salary, boolean alive) {
        setName(name);
        setAge(age);
        setAlive(alive);
//        this.name = name;
//        this.age = age;
        this.salary = salary;
//        this.alive = alive;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getInfo() {
        return "Worker - " + getName() + ": age = " + getAge()
                + ", salary = " + salary
                + ", is alive = " + (isAlive() ? "yes" : "no");
    }
}

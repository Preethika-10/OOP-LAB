class Animal {
    String name;
    int age;
    String diet;

Animal(String name, int age, String diet) {
        this.name = name;
        this.age = age;
        this.diet = diet;
    }

    void eat() {
       System.out.println(name + " is eating");
    }

    void sleep() {
       System.out.println(name + " is sleeping");
    }

    void display() {
       System.out.println("Name: " + name + " Age: " + age + " Diet: " + diet);
    }
}

class Mammal extends Animal {
    String furColor;

Mammal(String name, int age, String diet, String furColor) {
      super(name, age, diet);
      this.furColor = furColor;
    }

    void run() {
      System.out.println(name + " is running");
    }
}

class Bird extends Animal {
    double wingspan;

Bird(String name, int age, String diet, double wingspan) {
    super(name, age, diet);
    this.wingspan = wingspan;
    }

    void fly() {
       System.out.println(name + " is flying");
    }
}

class Reptile extends Animal {
     boolean venomous;

Reptile(String name, int age, String diet, boolean venomous) {
       super(name, age, diet);
       this.venomous = venomous;
    }

    void crawl() {
System.out.println(name + " is crawling");
    }
}

public class zooAnimal {
    public static void main(String[] args) {

        Mammal m = new Mammal("Lion", 5, "Carnivore", "Golden");
        Bird b = new Bird("Eagle", 3, "Carnivore", 2.5);
        Reptile r = new Reptile("Snake", 2, "Carnivore", true);

        m.display();
        m.run();

        b.display();
        b.fly();

        r.display();
        r.crawl();
    }
}


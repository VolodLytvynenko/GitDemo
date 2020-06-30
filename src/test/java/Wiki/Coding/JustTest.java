package Wiki.Coding;

public class JustTest {

    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        man.wife = woman;
        woman.husband = man;
    }

    }


              class Man {
                public int age;
                public int height;
                public Woman wife;
            }

     class Woman {
                public int age;
                public int height;
                public Man husband;
            }



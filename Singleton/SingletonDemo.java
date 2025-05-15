class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton instance created");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage(String caller) {
        System.out.println("Called from: " + caller);
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.showMessage("Main Method");
        accessFromAnotherMethod();
    }

    public static void accessFromAnotherMethod() {
        Singleton s2 = Singleton.getInstance();
        s2.showMessage("Another Method");
    }
}

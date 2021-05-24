package wzorce01;
import java.io.Serializable;

final class ClassSingleton implements Serializable {

    private static ClassSingleton INSTANCE;

    private ClassSingleton() {
    }

    public static ClassSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ClassSingleton();
        }
        return INSTANCE;
    }

    // Replace read object with Singleton instance
    protected Object readResolve() {
        return getInstance();
    }
}
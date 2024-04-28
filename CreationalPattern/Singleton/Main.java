package CreationalPattern.Singleton;
public class Main {
    public static void main(String[] args) {
        // Get the singleton instance
        Singleton singletonInstance = Singleton.getInstance();

        // Call singleton method
        singletonInstance.showMessage();
    }
}
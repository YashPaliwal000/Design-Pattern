package CreationalPattern.Singleton;

/*The Singleton pattern ensures that a class has only one instance and provides a global point of access to that instance.
 It's often used for logging, caching, thread pools, database connections, and more. */
 
 public class Singleton{

    // Private static variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Singleton() {}

    // Public static method to get the single instance of the class
    public static Singleton getInstance(){
        // Lazy initialization: create the instance when needed
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    
    // Add other methods and properties as needed
    public void showMessage() {
        System.out.println("Hello, I am a Singleton!");
    }

 }
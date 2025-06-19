class Logger{
    //making an instance of the class to access the class through an single instance
    private static Logger instance=new Logger();
    //i had create an private constructor.so that the other classes can't create the instance of this class
    private Logger(){
        System.out.println("Logger class is intialized");
    }
    //making an method to getting an declared instance to other class
    public static Logger getInstance(){
        return instance;
    }
    //for testing 
    public void log(String message){
        System.out.println(" [LOG] "+message);
    }
}
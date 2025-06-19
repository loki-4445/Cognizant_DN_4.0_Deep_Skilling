class Main{
    public static void main(String[] args){

        //creating the two objects
        
        Logger logger1=Logger.getInstance();
        Logger logger2=Logger.getInstance();
        logger1.log("Application Started");
        logger1.log("User logged in.");

        //checking wheater the objects are from same instances or not 

        if(logger1==logger2){
            System.out.println("Both the Instances are Same");
        }
        else {
            System.out.println("Both the Instances are not same (Not Singleton)");
        }
    }
}
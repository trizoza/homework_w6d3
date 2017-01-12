public class President {
   
   //create an object of SingleObject
   private static President president = new President();
   
   //make the constructor private so that this class cannot be used to create an instance
   private President(){

   }
   
   //Get the only object available - the accessor function
   public static President getPresident(){
      return president;
   }

   public void showPresidentsName(){
      System.out.println("Barack Obama");
   }

}
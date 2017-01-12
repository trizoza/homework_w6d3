public class Press {
   public static void main(String[] args) {

      //Get the only object available
      President president = President.getPresident();

      //this is now not possible:
      // President president = new President();

      //show the message
      president.showPresidentsName();
   }
}
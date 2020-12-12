
public class Project {
   public String name;
   public String description;

   public Project(String name, String description){
       this.name = name;
       this.description = description;
   }
   // Getters
   public String getName(){
       return this.name;
   }
   public String getDescription(){
       return this.description;
   }
   // Setters
   public void setName(String name){
       this.name = name;
   }
   public void setDescription(String description){
       this.description = description;
   }
   public void elevatorPitch(){
       System.out.printf("The name of my projet is " + name, "and the description is" + description);
   }
   public String ElevatorPitch() {
    return String.format("%s (%02f) %s", name, description);
}
}

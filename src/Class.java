public class Class {
    private String name;
    private int hours;
    private int maxCapacity;
   private int enrolledStudents;

   public Class(String name, int hours, int maxCapacity) {
       this.name = name;
       this.hours= hours;
       this.maxCapacity = maxCapacity;
       enrolledStudents = 0;
   }





   public void enroll() {
       if(maxCapacityReached()) {
           System.out.println("Schon voll");
       } else {
           System.out.println("Angemeldet");
           enrolledStudents++;
       }
   }

   public boolean maxCapacityReached() {
       return enrolledStudents >= maxCapacity;
   }

   public void setName(String name) {
       //checks
       this.name = name;
   }


       public String toString(){
           return "Class{" +
                   "name";

       }

    public String getName() {
        return name;
    }
}


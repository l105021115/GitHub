public class Staff {
      private String name,jobs,id;
      private float heigh,weigh;
      private char gender;
      
      public  Staff(String name1,String id1){
    	  name = name1;
    	  id = id1;
      }
            
      public String getName(){
   	   return name;     
      }
      
      public String getid(){
      	   return id;     
      }
    
      
      public void setGender(char gender1){
    	  gender = gender1;
      }
      public char getGender(){
    	   return gender;     
      }
}


public class SeabedAnimals {
      private String name,ecologicalGroup;
      private float height,weight;
      
      public SeabedAnimals(String name1,String ecologicalGroup1){
    	  name = name1;
    	  ecologicalGroup = ecologicalGroup1;
      }
      
      public String getName(){
    	  return name;
      }
      
      public String getEcologicalGroup(){
    	  return ecologicalGroup;
      }
      
     
      public void setHeight(float height1){
    	  height = height1;
      }
      public float getHeight(){
    	  return height;
      }
      
      public void setWeight(float weight1){
    	  weight = weight1;
      }
      public float getWeight(){
    	  return weight;
      }
}

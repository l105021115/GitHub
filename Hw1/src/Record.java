
public class Record {

	public static void main(String[] args) {
		System.out.println("================================");
		
		SeabedAnimals sa1 = new SeabedAnimals("藍鯨","海洋游泳生物");
        System.out.println("名稱:"+sa1.getName());
        System.out.println("生態類群:"+sa1.getEcologicalGroup());
        sa1.setHeight(33);
        System.out.println("身長:"+sa1.getHeight()+"公尺");
        sa1.setWeight(1500);
        System.out.println("體重:"+sa1.getWeight()+"公斤");
        
        System.out.println("================================");
        
        SeabedAnimals sa2 = new SeabedAnimals("虎鯨","海洋游泳生物");
        System.out.println("名稱:"+sa2.getName());
        System.out.println("生態類群:"+sa2.getEcologicalGroup());
        sa2.setHeight(10);
        System.out.println("身長:"+sa2.getHeight()+"公尺");
        sa2.setWeight(7000);
        System.out.println("體重:"+sa2.getWeight()+"公斤");
        
        System.out.println("================================");
        
        SeabedAnimals sa3 = new SeabedAnimals("海豹","海洋游泳生物");
        System.out.println("名稱:"+sa3.getName());
        System.out.println("生態類群:"+sa3.getEcologicalGroup());
        sa3.setHeight(2);
        System.out.println("身長:"+sa3.getHeight()+"公尺");
        sa3.setWeight(150);
        System.out.println("體重:"+sa3.getWeight()+"公斤");
        
        System.out.println("================================");
       
	}

}
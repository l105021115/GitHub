/*
* Topic: hw1主程式
* Date: 2017/03/03
* Author: 105021115 陳邦天
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("--------------------------------");
		
		Staff s1 = new Staff("陳先生","105021115");
		System.out.println("名字:"+s1.getName());
		System.out.println("職編:"+s1.getid());
		s1.setGender('M');
        System.out.println("性別:"+s1.getGender());
        
        System.out.println("--------------------------------");
        
        Staff s2 = new Staff("曾小姐","105021330");
        System.out.println("名字:"+s2.getName());
		System.out.println("職編:"+s2.getid());
		s2.setGender('F');
        System.out.println("性別:"+s2.getGender());
        
        System.out.println("--------------------------------");
        
        Staff s3 = new Staff("翁先生","105021689");
        System.out.println("名字:"+s3.getName());
		System.out.println("職編:"+s3.getid());
		s3.setGender('M');
        System.out.println("性別:"+s3.getGender());
        
        System.out.println("--------------------------------");
        
        Staff s4 = new Staff("江小姐","105021467");
        System.out.println("名字:"+s4.getName());
		System.out.println("職編:"+s4.getid());
		s4.setGender('F');
        System.out.println("性別:"+s4.getGender());
        
        System.out.println("--------------------------------");
        
        Staff s5 = new Staff("張先生","105021358");
        System.out.println("名字:"+s5.getName());
		System.out.println("職編:"+s5.getid());
		s5.setGender('M');
        System.out.println("性別:"+s5.getGender());
        
        System.out.println("--------------------------------");
	}

}

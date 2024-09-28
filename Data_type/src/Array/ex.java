package Array;

public class ex {
	public static void main(String[] args) {
		int i=10;
		System.out.println("i ="+i);
		
		 int [] allid=new int [10];

		 allid[0] =10;
		 allid[1] =20;
		 allid[2] =30;
		 allid[3] =40;
		 allid[4] =50;
		 allid[5] =60;
		 allid[6] =70;
		 allid[7] =80;
		 allid[8] =90;
		 allid[9] =100;
		 
		 //System.out.println(allid);          //direct print kela tr address show lrto index cha
			
	for(i=0;i<10;i++)
	{
		System.out.println("allid: " +i);
	}
	
	//ata fkt selective no pahije asel tr
	
	System.out.println("allid  : "+allid[5]);
	
	
	//ata arrey chi limit ahe [10]pn mi jr 11 no pathvla tr.......to exception deil ArrayIndexOutOfBoundsException
	
	System.out.println("allid  : "+allid[10]);
	
	}
	
	

}

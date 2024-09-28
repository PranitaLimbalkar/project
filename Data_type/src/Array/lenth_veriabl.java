package Array;

public class lenth_veriabl {
	public static void main(String[] args) {
		String [][] data=new  String[7][2];  //jr space adhvli tr exception yet hot....pm .lenth ne space create hote eg.[8][2]tr tya jagi null yet 
		
		data[0][0]="name";
		data[0][1]="city";
	
		data[1][0]="reva";
		data[1][1]="mumbai";
	
		data[2][0]="vira";
		data[2][1]="murud";
	
		data[3][0]="mai";
		data[3][1]="indapur";
	
		data[4][0]="amar";
		data[4][1]="airoli";
		
		
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(data[i][j]);

		}

}
	}
}

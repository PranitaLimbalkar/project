package Array;
//multidimentional array
public class ex2 {
	public static void main(String[] args) {
		
		String [][] data=new String[5][2] ;
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
		
		
		System.out.println(data[4][0]);    //print singal
		
		for (int i=0;i<5;i++)
		{
		
			//System.out.println(data[i][0]);    fkt i print kela
			
			for (int j=0;j<2;j++)
			{
				System.out.println(data[i][j]);
			}
		}
	
	
	
	}

}

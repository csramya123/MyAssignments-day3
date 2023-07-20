package week1.day3;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] splitted = test.split(" ");
		
		for(int i=0;i<splitted.length;i++) {
			System.out.println(splitted[i]);
			}
		
		System.out.println("\nOdd position from splitted array:");
		for(int j=0;j<splitted.length;j++)
		{
			if (j%2!=0)
			{
				System.out.println(splitted[j]);
			}
		}
		
		System.out.println("\nPrint even postion words in reverse:");
		for(int k=0;k<splitted.length;k++)
		{
			if (k%2==0)
			{
				char[] chars = splitted[k].toCharArray();
				for (int l=chars.length-1; l>=0; l--)
				{
                    System.out.print(chars[l]); 
                }
            }
			else 
            {
                System.out.print(splitted[k]+ " "); 
            }
	
			}
		
	}

}

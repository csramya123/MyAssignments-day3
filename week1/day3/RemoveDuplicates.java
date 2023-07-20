package week1.day3;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] chart = text.split(" ");
		for(int i=0;i<chart.length;i++)
		{
			System.out.println(chart[i]);
		}
			for(int j=0;j<chart.length;j++)
			{
			for (int k = j + 1; k < chart.length; k++) 
			{
                if (chart[j].equals(chart[k]))
                {
                    chart[k]="";
                 }
             }
			 }
			System.out.println("Removing Duplicate words:");
		for(int l=0;l<chart.length;l++)
		{
			System.out.print(chart[l]+ " ");
		}
	}
}
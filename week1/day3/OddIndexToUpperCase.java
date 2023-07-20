package week1.day3;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="changeme";//c0,h1,a2,n3,g4,e5,m6,e7
		char[] ch = new char[test.length()];
		char[] charArray = test.toCharArray();
		for(int i=0;i<test.length();i++) 
		{
	            ch[i] = test.charAt(i);
	            System.out.println(ch[i]);
		}
		
	    System.out.println("Odd index characters: ");
		for (int j = 0; j < test.length(); j++) {
            if (j % 2 != 0) {
                System.out.print(test.charAt(j));
            }
		}
		
		for (int k = 0; k < test.length(); k++) {
            if (k % 2 != 0) {
            	charArray[k] = Character.toUpperCase(charArray[k]);
            }
        }
		System.out.println("\nCaps in odd index");
		String result = new String(charArray);
        System.out.println(result);
	}

}


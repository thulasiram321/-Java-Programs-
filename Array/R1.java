public class R1  {

	public static void main(String[] args) {
	String[][] str = {{"luke", "shaw"},{"waynee", "rooney"},{"rooney", "ronaldo"},{"shaw", "rooney"}};
  System.out.println("Enter the name :");
		Scanner sc = new Scanner(System.in);
		String s =sc.next();
		String targetName = s;
		int grandchildrenCount = 0;

		for (int i = 0; i < str.length; i++) {		   
		    if (str[i][1].equals(targetName)) { 
		        String childName = str[i][0];
		        
		     
		        for (int j = 0; j < str.length; j++) {
		            if (str[j][1].equals(childName)) {
		                grandchildrenCount++;
		            }
		        }
		    }
		}

		System.out.println("Number of grandchildren for " + targetName + ": " + grandchildrenCount);
  }
	 }
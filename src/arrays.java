import java.util.ArrayList;

public class arrays {

	public static void main(String[] args) {
//		int[] arr1 = new int[5];
//		arr1[0]= 2;
//		arr1[3]=4;
//		
//		for(int i=0;i<arr1.length;i++) {
//			System.out.println(arr1[i]);
//		}
//		
//		int []arr2 = {1,2,3,4,5};
//		for(int j =0;j<arr2.length;j++)
//		{
//			if(arr2[j]%2==0) {
//				System.out.println(arr2[j]);
//			}
//			
//		}
		ArrayList<String> a = new ArrayList();
		a.add("Bhargav");
		a.add("Sreenivas");
		a.add("Nayaka");
		
		for(int i=0;i<a.size();i++)
			if(a.get(i).equals("Bhargav")) {
		System.out.println(a.get(i));}
		
		
	}

}

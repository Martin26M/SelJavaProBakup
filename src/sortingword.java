
public class sortingword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "martin";
	char[] arr=	s.toCharArray();
		char temp = ' ';
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (Character.compare(arr[i], arr[j]) < 0) {

					temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
				}

			}

		}
		
		for (char res : arr) {
			
			System.out.print(res);
		}
	}

}

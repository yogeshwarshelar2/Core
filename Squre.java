package prepCall;

public class Squre {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 3, 4, 5, 6, 6, 4 };
		// int arr2[0]=5;

		int l = arr.length;

		for (int i = 0; i < l; i++)
		{

			for (int j = 0; j <= i; j++) 
			{
				if (( arr[i] == arr[j]) && (i!=j))
				{

					System.out.print(arr[i]);
				    break;
				}
			}

		}

	}
}

class array1
{
	public static void main(String[] args)
	{

	int arr1[] = {8, 12, 43, 23, 64, 17};
	int arr2[]={7,22,8,64,28,27};

	

	for(int i=0; i<arr1.length; i++)
	{
		for(int j=0; j<arr2.length; j++)
		{
			if(arr1[i] == arr2[j])
			{
				System.out.println(arr1[i]+" ");
			}
		}
	}
	}
}



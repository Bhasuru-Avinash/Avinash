
class BinarySearch
{
	public void binarySearch(int[] array,int key)
	{
		int low=0;
		int high=array.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key<array[mid])
			{
				high=mid-1;
			}
			else if(key>array[mid])
			{
				low=mid+1;
			}
			else if(key==array[mid])
			{
				System.out.println("Search element "+key+" is found at position : "+mid);
				break;
			}
		}
		if(low>high)
		{
			System.out.println("Search element "+key+" is not found");
		}
			
			
		}
	}

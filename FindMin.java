public class FindMin 
{
    public static void main(String[] args) 
    {
        int[] array ={1,2,5,0,9};
        int index = findMin(array);
        System.out.println("Min : " + array[index] + " at posotion " + index);
    }

    public static int findMin(int []arr)
    {
        int min = arr[0];
        int index = 0;
        int i;
        for (i = 1; i< arr.length; i++)
        {
            if(min > arr[i])
            {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}

import java.util.Scanner;

public class FindMin
{
    public static void main(String[] args)
    {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập từng phần tử vào mảng , tối đa 10 phần tử:");
        for (int x = 0; x < array.length; x++)
        {
            System.out.println("phần tử thứ " + (x + 1) + ":");
            array[x] = scanner.nextInt();
        }
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

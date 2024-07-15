//Dizideki Tekrar Eden Sayıları Bulan Program

public class Main
{
    
    static boolean isFind(int[] arr, int value)
    {
        for(int i : arr)
        {
            if (i == value)
            {
                return true;
            }
        }
        return false;
    }
    
    
    static boolean isEven(int[] arr, int value)
    {
        for(int j : arr)
        {
            if(j % 2 == 0 && value % 2 == 0)
            {
                return true;
            }
        }
        return false;
    }
    
    
    
    public static void main(String[] args)
    {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        
        for(int i = 0 ; i <list.length ; i++)
        {
            for(int j = 0 ; j < list.length; j++)
            {
                if ((i != j) && (list[i] == list[j]))
                {
                    if(isEven(duplicate, list[i]))
                    {
                        if(!isFind(duplicate, list[i]))
                        {
                            duplicate[startIndex++] = list[i];
                        }
                    }
                    break;
                }
            }
        }
        
        
        for(int value : duplicate)
        {
            if(value != 0)
            {
                System.out.print(" " + value + " ");
            }
                
        }
    }
}

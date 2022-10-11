import java.util.Arrays;

public class ArrayManipulation
{
    public static void main(String[] args) {
        System.out.println("Introduction toarrays");
        int[] newArray={1,8,12,3,2,4,5,6,7};
        int[] secondArray={1,8,12,3,2,4,5,6,7};
        int[] thirdArray= new int[5];
        Arrays.sort(newArray);
        Arrays.sort(secondArray);
        for(int i=0;i<newArray.length;i++)
        {
            System.out.println(newArray[i]);
        }

        System.out.println(newArray.length);
        System.out.println(Arrays.equals(newArray,secondArray));

           Arrays.fill(thirdArray,5);
           for (int j=0;j<thirdArray.length;j++)
           {
               System.out.println(thirdArray[j]);
           }
        System.out.println(Arrays.toString(thirdArray));

    }

}

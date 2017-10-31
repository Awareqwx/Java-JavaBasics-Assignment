
public class BasicJava
{

    public static void arrPrint(int[] arr)
    {
        System.out.print("[");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
            if(i + 1 < arr.length)
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public static void main(String[] args)
    {
        print1to255();
        System.out.println();
        printodd1to255();
        System.out.println();
        sum0to255();
        System.out.println();
        iterArray(new int[] {1, 3, 5, 7, 9, 2, 4, 6, 8, 0});
        System.out.println();
        findMax(new int[] {3, 1, 7, 6, 23, 7, 9});
        System.out.println();
        getAverage(new int[] {5, 2, 7, 8, -32, 20, 1});
        System.out.println();
        arrPrint(arrOdd());
        System.out.println();
        System.out.println(greaterThanY(new int[] {3, 12, 5, 10, 25, -3, 7}, 10));
        System.out.println();
        arrPrint(squareArr(new int[] {1, 2, 3, 4, 5, 6}));
        System.out.println();
        arrPrint(removeNegatives(new int[] {10, 5, -4, 3, -12, 76, -1032}));
        System.out.println();
        arrPrint(maxMinAvg(new int[] {3, 1, 27, -103, 56, 90, 67}));
        System.out.println();
        arrPrint(shiftUp(new int[] {1, 1, 2, 3, 5, 8, 12, 20}));
    }

    public static void print1to255()
    {
        for(int i = 1; i <= 255; i++)
        {
            System.out.println(i);
        }
    }
    
    public static void printodd1to255()
    {
        for(int i = 1; i <= 255; i+=2)
        {
            System.out.println(i);
        }
    }
    
    public static void sum0to255()
    {
        int sum = 0;
        for(int i = 0; i <= 255; i++)
        {
            sum += i;
            System.out.println("New number: " + i + ", Sum: " + sum);
        }
    }
    
    public static void iterArray(int[] arr)
    {
        for(int i : arr)
        {
            System.out.println(i);
        }
    }
    
    public static void findMax(int[] arr)
    {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    
    public static void getAverage(int[] arr)
    {
        int sum = 0;
        for(int i : arr)
        {
            sum += i;
        }
        System.out.println((sum / 1.0) / arr.length);
    }
    
    public static int[] arrOdd()
    {
        int[] odd = new int[128];
        for(int i = 0; i < 128; i++)
        {
            odd[i] = 1 + (2 * i);
        }
        return odd;
    }
    
    public static int greaterThanY(int[] x, int y)
    {
        int g = 0;
        for(int i : x)
        {
            if(i > y)
            {
                g++;
            }
        }
        return g;
    }
    
    public static int[] squareArr(int[] arr)
    {
        int[] sqr = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            sqr[i] = arr[i] * arr[i];
        }
        return sqr;
    }
    
    public static int[] removeNegatives(int[] arr)
    {
        int[] noNeg = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            noNeg[i] = arr[i] < 0 ? 0 : arr[i];
        }
        return noNeg;
    }
    
    public static int[] maxMinAvg(int[] arr)
    {
        int[] vals = new int[3];
        vals[0] = vals[1] = arr[0];
        vals[2] = 0;
        for(int i : arr)
        {
            if(i > vals[0])
            {
                vals[0] = i;
            }
            else if(i < vals[1])
            {
                vals[1] = i;
            }
            vals[2] += i;
        }
        vals[2] = vals[2] / arr.length;
        return vals;
    }

    public static int[] shiftUp(int[] arr)
    {
        int[] shifted = new int[arr.length];
        for(int i = 1; i < arr.length; i++)
        {
            shifted[i - 1] = arr[i];
        }
        shifted[shifted.length - 1] = arr[0];
        return shifted;
    }
}

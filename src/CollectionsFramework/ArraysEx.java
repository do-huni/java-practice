import java.util.*;

class ArraysEx{
    public static void main(String[] args){
        //copyOf(arr, length), copyOfRange(arr, start, end)
        int[] arr = {0,1,2,3,4,5};
        System.out.println(Arrays.toString(Arrays.copyOf(arr,4))); //[0,1,2,3]
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,2,5))); //[2,3,4]
        
        //fill(arr, value), setAll(arr, lambdaExpression)
        arr = new int[10];
        Arrays.fill(arr,5);        
        System.out.println(Arrays.toString(arr));
        Arrays.setAll(arr, (i) -> (int) (Math.random() * 5) + 1);
        System.out.println(Arrays.toString(arr));
        
        //sort(arr), binarySearch()
        arr = new int[]{3,2,0,1,4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int idx = Arrays.binarySearch(arr, 2);
        System.out.printf("idx: %d\n", idx);
        
        //equals(arr1, arr2), deepEquals(nD_arr1, nD_arr2) toString() 
        String[][] str2D1 = {{"abc","cdf"},{"qwe","ert"}};
        String[][] str2D2 = {{"abc","cdf"},{"qwe","ert"}};        
        System.out.println(Arrays.deepEquals(str2D1, str2D2));
        
        //asList(objarr)
        List list = Arrays.asList(new Integer[]{1,2,3,4,5});
        try{
            list.add(1);
        } catch(UnsupportedOperationException e){
            System.out.println("크기를 늘릴수가 없다.");
        }
        ArrayList revisedList = new ArrayList(Arrays.asList(new Integer[] {1,2,3,4,5,6}));
        revisedList.add(10);
        ListIterator liit = revisedList.listIterator();
        while(liit.hasNext()){
            System.out.print(liit.next().toString()+ ' ');
        }
    }
}
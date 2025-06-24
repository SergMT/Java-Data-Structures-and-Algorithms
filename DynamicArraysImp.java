public class DynamicArraysImp {
    public static void main(String[] args) {
                /*
         *  Advantages:
         *  1. Random access of elements O(1)
         *  2. Good locality of reference and data cache utilization
         *  3. Easy to insert/delete at the end
         * 
         *  Disadvantages:
         *  1. Wastes more memory
         *  2. Shifting elements is time consuming O(n)
         *  3. Expanding/Shrinking the array is time consuming O(n)
         * 
         */

        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        System.out.println(dynamicArray);
        System.out.println("is empty: " + dynamicArray.isEmpty());
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);

    }
}

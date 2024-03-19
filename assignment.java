public class assignment {

    public static void main(String[] args) {
        String[] firstArray = {"Anne", "John", "Alex", "Jessica"};
        System.out.println("First call to the method with first array:");
        inverseAndReverseStrings(firstArray);
        String[] secArray = {"Fred", "Bob", "Joe", "Michael", "Chris", "David"};
        System.out.println("\nSecond call to the method with second array:");
        inverseAndReverseStrings(secArray);
    }
    private static void inverseAndReverseStrings(String[] array) {
        String[] reversedArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            String reversed = new StringBuilder(array[i]).reverse().toString();
            reversed = reversed.substring(0, 1).toUpperCase() + reversed.substring(1).toLowerCase();
            reversedArray[array.length - 1 - i] = reversed;
        }
        System.out.println("Original array:");
        for (String str : array) {
            System.out.println("\"" + str + "\",");
        }
        System.out.println("End of the array\n");
        System.out.println("Resultant array:");
        for (String str : reversedArray) {
            System.out.println("\"" + str + "\",");
        }
        System.out.println("End of the array\n");
    }
}
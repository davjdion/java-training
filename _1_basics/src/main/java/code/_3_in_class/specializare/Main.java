package code._3_in_class.specializare;

public class Main {
    public static void main(String[] agrs) {
        AlgortimSortare alg = new AlgortimSortare();
        int[] arr = new int[]{3,5,1,7,2,6,4};

        alg.sort(arr);

        for(int i=0;i<arr.length;i++) {
            System.out.println(arr);
        }
    }
}

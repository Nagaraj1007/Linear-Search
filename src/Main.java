
public class Main {

    public static int linearSearch(int array[], int number){
        int occurence = 0 ;
        for (int elements : array){
            occurence += (elements == number) ? 1 : 0;
        }
        return occurence;
    }

    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{1,2,2}, 3));
    }
}
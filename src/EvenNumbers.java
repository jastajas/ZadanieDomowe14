public class EvenNumbers {
    public static void main (String[] args){

        int sum = 0;
        for(int n = 0 ; n < 101 ; n++ ){
            if(n%2 != 0){
                continue;}
            System.out.print(n + ", ");
            sum += n;
        }
        System.out.println("");
        System.out.println(sum);
    }
}

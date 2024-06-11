public class Pattern4 {
    public static void main(String[] args) {
        int N=5;
        for (int row=1; row<=N; row=row+1){
            for (int col=1; col<=row; col=col+1){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

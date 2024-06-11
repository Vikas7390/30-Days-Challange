public class Pattern5 {
    public static void main(String[] args) {
        int N=5;
        for(int row=1; row<=N; row=row+1){
            for (int col=1; col<=(N+1-row); col=col+1){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Pattern3 {
    public static void main(String[] args) {
        int N=4;
        int M=5;
        for (int row =1; row<=N; row=row+1){
            for(int col=1; col<=M; col=col+1){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

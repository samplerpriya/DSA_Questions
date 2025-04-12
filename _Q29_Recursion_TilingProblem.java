public class _Q29_Recursion_TilingProblem
{
    public static int tilingProblem(int n) {
        // i can write it as
        // if(n == 0 || n == 1){
        // return 1;
        // }

        if(n == 0 ){
            return 1;
        } else if (n == 1) {
            return 1;
        }

        // vertical choice
        int nm1 = tilingProblem(n - 1);

        // horizontal choice
        int nm2 = tilingProblem(n - 2);
        int totalWay = (nm1 + nm2);

        return totalWay;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
}

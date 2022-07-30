package DynamicProgramming;

public class PaintHouse {
    public static void main(String[] args) {
       int costs[][] = {{17,2,17},{16,16,5},{14,3,19}};
        System.out.println(minCost(costs));

    }

    private static int minCost(int[][] costs) {
        if(costs.length == 0 || costs[0].length == 0) return 0;
        int row = costs.length;
        int col = costs[0].length;
      //  System.out.println(row);
      //  System.out.println(col);
        for(int i = 1 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(j == 0){
                    costs[i][j] = costs[i][j] + Math.min(costs[i-1][j+1] , costs[i-1][j+2]);
                }else if( j == col-1){
                    costs[i][j] = costs[i][j] + Math.min(costs[i-1][j-1] , costs[i-1][j-2]);
                }else{
                    costs[i][j] = costs[i][j] + Math.min(costs[i-1][j-1] , costs[i-1][j+1]);
                }
            }
        }

        int value = Integer.MAX_VALUE;
        for(int i = 0 ; i < col; i++ ){
            value = Math.min(value, costs[row - 1][i]);
        }
        return value;
    }
}

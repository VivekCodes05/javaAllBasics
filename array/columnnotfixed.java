public class columnnotfixed {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4},
            {7,8},
            {4,6,8,1,5},
            {2,4,7}
        };
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++)/*for row=0 :-arr[row].length will be 4
                                    for row=1 :-arr[row].length will be 2
                                    for row=2 :-arr[row].length will be 5
                                    for row=3 :-arr[row].length will be 3  */
            {System.out.print(arr[row][col]+" ");}
System.out.println();
        }
    }
}

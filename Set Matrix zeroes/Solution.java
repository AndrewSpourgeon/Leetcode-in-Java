class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> setI= new HashSet<>();
        HashSet<Integer> setJ= new HashSet<>();
        for(int i=0;i<matrix.length;i++){
             for(int j=0;j<matrix[0].length;j++){
                 if(matrix[i][j]==0){
                    setI.add(i);
                    setJ.add(j);
                 }
             }
        }
        for(int i=0;i<matrix.length;i++){
            if(setI.contains(i)){
                for(int j=0; j<matrix[0].length;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int j=0;j<matrix[0].length;j++){
            if(setJ.contains(j)){
                for(int i=0; i<matrix.length;i++){
                    matrix[i][j]=0;
                }
            }
        }
      
    }
}
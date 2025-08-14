class Solution {
    static class Row implements Comparable<Row>{
        int soldiers;
        int idx;

        public Row(int soldiers,int idx){
            this.soldiers = soldiers;
            this.idx = idx;
        }
        public int compareTo(Row other){
            if(this.soldiers != other.soldiers){
                return this.soldiers - other.soldiers;
            }else{
                return this.idx - other.idx;
            }
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue <Row> pq = new PriorityQueue<>();
        int n = mat.length;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int val : mat[i]){
                if (val == 1) count++;
            }
            pq.add(new Row(count,i));
        }

        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i] = pq.poll().idx;
        }
        return result;
    }
}
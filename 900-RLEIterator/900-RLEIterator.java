class RLEIterator {
    int index;
    int [] A;
    public RLEIterator(int[] A) {
        this.A = A;
        index = 0;
    }
    
    public int next(int n) {
        while(index < A.length && n > A[index]){
            n = n - A[index];
            index += 2;
        }
["RLEIterator","next","next","next","next"]

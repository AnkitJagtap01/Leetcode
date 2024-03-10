class Solution {
    private long gcd(long n1, long n2) {
        if(n1 == 0) return n2;
        if(n2 == 0) return n1;
        return gcd(n2, n1%n2);
    }
    private long lcm(long n1, long n2) {
        return (n1*n2)/gcd(n1, n2);
    }
    public int minimizeSet(int d1, int d2, int c1, int c2) {
            long s = 1, e = (long)Math.pow(10, 10), m1 = 0, m2 = 0, m3 = 0;
            while(s < e) {
                
                long mid = (s+e)/2;
                m1 = mid - mid/d1;
                m2 = mid - mid/d2;
                m3 = mid - mid/lcm(d1, d2);
                if(m1 >= c1 && m2 >= c2 && m3 >= c1+c2) {
                    e = mid;
                } else {
                    s= mid+1;
                }
            }
            return (int)s;
    }
}
2

class Solution {
    public boolean isHappy(int n) {
        return isHappyInternal(n, new HashSet<Integer>());
    }
    
    private boolean isHappyInternal(int n, Set<Integer> history) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        if (sum == 1) return true;
        if (history.contains(sum)) {
            return false;
        }
        history.add(sum);
        return isHappyInternal(sum, history);
    }
}
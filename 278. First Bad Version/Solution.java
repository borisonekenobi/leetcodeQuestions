/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if (isBadVersion(n)) {
            if (!isBadVersion(n - 1)) return n;
            else return firstBadVersion(n / 2);
        } else {
            if (isBadVersion(n + 1)) return n + 1;
            else return firstBadVersion(n + n / 2);
        }
    }
}
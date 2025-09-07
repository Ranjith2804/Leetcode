class Solution {
    public int accountBalanceAfterPurchase(int p2) {
        int res = (int) Math.round(p2 / 10.0f) * 10;
        return 100-res;
    }
}

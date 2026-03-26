class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            // If the last bit is 0, it's even. If it's 1, it's odd.
            if ((num & 1) == 0) {
                num >>= 1; // Shift right by 1 (same as dividing by 2)
            } else {
                num ^= 1;  // XOR with 1 (same as subtracting 1 for odd numbers)
            }
            steps++;
        }
        return steps;
    }
}
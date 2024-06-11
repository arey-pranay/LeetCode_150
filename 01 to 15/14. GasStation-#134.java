class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sGas = 0, sCost = 0, res = 0, total = 0; // Initialize variables
        // sGas: total gas available
        // sCost: total cost needed
        // res: the starting index of the circuit
        // total: the current net gas in the tank
        
        // Calculate the total gas and total cost
        for (int i = 0; i < gas.length; i++) {
            sGas += gas[i]; // Sum up total gas
            sCost += cost[i]; // Sum up total cost
        }
        
        // If total gas is less than total cost, it's impossible to complete the circuit
        if (sGas < sCost) return -1;
        
        // Try to find the starting point
        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i]; // Update the net gas in the tank
            
            // If net gas is negative, it means we can't reach the next station from the current start
            if (total < 0) {
                total = 0; // Reset net gas
                res = i + 1; // Set the next station as the new starting point
            }
        }
        
        // Return the starting index from where we can complete the circuit
        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int result = solution.canCompleteCircuit(gas, cost);
        System.out.println(result); // Expected output is 3
    }
}

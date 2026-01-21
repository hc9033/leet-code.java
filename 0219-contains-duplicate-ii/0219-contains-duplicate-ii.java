class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Pehla loop: Har number ko uthao
        for (int i = 0; i < nums.length; i++) {
            // Doosra loop: Sirf agle 'k' elements tak hi check karo (taaki fast ho)
            // Ya phir pure array mein check karo aur gap ki condition lagao
            for (int j = i + 1; j < nums.length; j++) {
                // Pehli condition: Numbers barabar honi chahiye
                if (nums[i] == nums[j]) {
                    // Doosri condition: Gap k se chota ya barabar hona chahiye
                    if (Math.abs(i - j) <= k) {
                        return true;
                    }
                }
                
                // Chota sa optimization: Agar j aur i ka gap k se bada ho gaya, 
                // toh aage check karne ka fayda nahi
                if (j - i > k) break;
            }
        }
        return false; // Kahin bhi aisi jodi nahi mili
    }
}
class IntToRoman {
    public String Solution(int num) {
        int[] values =    {1000, 900, 500, 400, 100, 90,  50, 40,  10, 9,   5, 4,  1};
        String[] symbols ={"M",  "CM","D", "CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length && num > 0; i++) {
            while (num >= values[i]) {
                sb.append(symbols[i]);
                num -= values[i];
            }
        }

        return sb.toString();
    }
}

// 1994 
// 1994 > 1000   -> M  1994-1000 = 994
// 994 > 900 ->MCM 994-900 = 94
// 94 > 90 - > MCMXC 94-90  = 4
// 4 > 1 -> MCMXCIV
class Solution2 {
    void show() {
        int A[]={1,2,3,4};
        String rst = "";
        // Choose different indices i, j, k, l as a permutation of 0, 1, 2, 3
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                for (int k = 0; k < 4; ++k) {
                    // avoid duplicate among i, j and k.
                    if (i == j || i == k || j == k) {
                        continue;
                    }
                    String hour = "" + A[i] + A[j];
                    // the last indices l = 6 - i - j - k
                    String minute = "" + A[k] + A[6 - i - j - k];
                    String time = hour + ":" + minute;
                    // hour < 24; minute < 60; update result.
                    if (hour.compareTo("24") < 0 && minute.compareTo("60") < 0 && rst.compareTo(time) < 0) {
                        rst = time;
                    }
                }
            }
        }
        // return rst;
        System.out.println(rst);
    }

    public static void main(String args[])
    {
        Solution2 s= new Solution2();
        s.show();
    }
}
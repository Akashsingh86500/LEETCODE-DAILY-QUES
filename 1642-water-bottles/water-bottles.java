class Solution {
    public int numWaterBottles(int numb, int nume) {
        int c = numb;
        int r = 0;
        while (numb >= nume) {
            r += numb % nume;
            numb = numb / nume;
            c += numb;
            if (r >= nume) {
                c += r / nume;
                r = r % nume;
            }
            numb += r;
            r = 0;
        }
        return c;
    }
}
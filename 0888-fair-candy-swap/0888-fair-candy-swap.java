class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        
        int alicetotal = 0;
        int bobtotal = 0;

        for(int x: aliceSizes){
            alicetotal += x;
        }
        for(int x: bobSizes){
            bobtotal += x;
        }

        int difference = (bobtotal - alicetotal) / 2;

        for(int a:aliceSizes){
            for(int b: bobSizes){
                if((b - a) == difference){
                    return new int[] {a,b};
                }
            }
 
        }
        return new int[] {-1,-1};
    }
    
}
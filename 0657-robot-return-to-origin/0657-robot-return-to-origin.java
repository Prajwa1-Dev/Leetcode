class Solution {
    public boolean judgeCircle(String moves) {
     int v = 0;
     int h = 0;

     for(int i=0;i<moves.length();i++){
        char ch = moves.charAt(i);

        if(ch == 'U'){
            v++;
        }else if(ch == 'D'){
            v--;
        }else if(ch == 'R'){
            h++;
        }else if (ch == 'L'){
            h--;
        }
     }

     if(h == 0 && v == 0){
        return true;
     }
     return false;
    }
}
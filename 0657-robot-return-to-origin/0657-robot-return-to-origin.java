class Solution {
    public boolean judgeCircle(String moves) {
     char[] ch = moves.toCharArray();
     int v = 0;
     int h = 0;

     for(int i=0;i<moves.length();i++){

        if(ch[i] == 'U'){
            v++;
        }else if(ch[i] == 'D'){
            v--;
        }else if(ch[i] == 'R'){
            h++;
        }else if (ch[i] == 'L'){
            h--;
        }
     }

    
     return h == 0 && v == 0;
    }
}
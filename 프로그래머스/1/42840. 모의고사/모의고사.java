import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        int fscore = 0;
        int sscore = 0;
        int tscore = 0;
        
        int f = 0;
        int s = 0;
        int t = 0;
        for(int i = 0; i < answers.length; i++){
            if (answers[i] == first[f]) fscore++;
            if (answers[i] == second[s]) sscore++;
            if (answers[i] == third[t]) tscore++;

            f = (f + 1) % first.length;    
            s = (s + 1) % second.length;
            t = (t + 1) % third.length;
        }
        int max = Math.max(fscore, Math.max(sscore, tscore));

        int count = 0;
        if (fscore == max) count++;
        if (sscore == max) count++;
        if (tscore == max) count++;

      
        int[] result = new int[count];
        int idx = 0;

        if (fscore == max) result[idx++] = 1;
        if (sscore == max) result[idx++] = 2;
        if (tscore == max) result[idx++] = 3;
        return result;
    }

}
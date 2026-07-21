class Solution {
    public boolean searchMatrix(int[][] m, int t) {

        int top =0, bottom = m.length -1, cols = m[0].length-1;
        int validRow = -1;

        while(top <= bottom)
        {
            int mid = (top+bottom)/2;

            if(t >= m[mid][0] && t<=m[mid][cols])
            {
                validRow = mid;
                break;
            }

            else if(t > m[mid][cols])
            {
                top = mid +1;
            }

            else
                bottom = mid -1;
        }

        if(validRow == -1)
            return false;

        int l=0, r = cols;

        while(l<=r)
        {
            int mid = (l+r)/2;

            if(m[validRow][mid] == t)
            {
                return true;
            }
            else if(t>m[validRow][mid])
                l=mid+1;
            else
                r=mid -1;
        }
        
        return false;
    }
}

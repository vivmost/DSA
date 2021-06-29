class Solution {
    public int minDistance(String word1, String word2) {
        int dist[][] = new int[word1.length() + 1][word2.length() + 1];
        
        for(int i = 0; i < word1.length(); i++) 
            dist[i + 1][0] = i + 1;
        
        for(int i = 0; i < word2.length(); i++)
            dist[0][i + 1] = i + 1;
        
        for(int i = 0; i < word1.length(); i++) {
            for(int j = 0; j < word2.length(); j++) {
                if( word1.charAt(i) == word2.charAt(j) )
                    dist[i + 1][j + 1] = dist[i][j];
                else
                    dist[i + 1][j + 1] = Math.min(Math.min(dist[i][j + 1], dist[i + 1][j]) + 1, dist[i][j] + 1);
            }
        }
        
        return dist[word1.length()][word2.length()];
    }
}
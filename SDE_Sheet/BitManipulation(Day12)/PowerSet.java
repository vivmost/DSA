class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
            int n = s.length(); 
		    List<String> ans = new ArrayList<>(); 
		    for(int num = 0; num < (1 << n); num++) {
		        String sub = ""; 
		        for(int i = 0; i<n; i++) {
		            if((num & (1<<i)) != 0) {
		                sub += s.charAt(i);
		            }
		        }
		        
		        if(sub.length() > 0)
		            ans.add(sub);
		    }
		    
		    Collections.sort(ans); 
		    return ans; 
    }
}
class GFG {
public static HashMap printNSE(int arr[], int n) {
    Stack<Integer> s = new Stack<Integer>();
    HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();     

    s.push(arr[0]);
    for (int i = 1; i < n; i++) {
        if (s.empty()) {
            s.push(arr[i]);
            continue;
        }
     
        while (s.empty() == false && s.peek() > arr[i]) {
            mp.put(s.peek(), arr[i]);
            s.pop();
        }
        s.push(arr[i]);
    }
         
    while (s.empty() == false) {
        mp.put(s.peek(), -1);
        s.pop();
    }
     
    return mp;
}
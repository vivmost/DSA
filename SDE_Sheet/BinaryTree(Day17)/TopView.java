class Pair {
    int depth;
    int value;
    public Pair(int value, int depth) {
        this.depth = depth;
        this.value = value;
    }
}

class Solution{
    public void top(Node node, int x, int y, Map<Integer, Pair> map) {
        if (node == null) {
            return;
        }
        
        if (!map.containsKey(x) || map.get(x).depth > y) {
            map.put(x, new Pair(node.data, y));
        }
        
        top(node.left, x - 1, y + 1, map);
        top(node.right, x + 1, y + 1, map);
    }
    
    public ArrayList <Integer> topView(Node root){
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Pair> map = new TreeMap<>();
        top(root, 0, 0, map);
        for (Pair it: map.values()) {
            result.add(it.value);
        }
        return result;
    }
}
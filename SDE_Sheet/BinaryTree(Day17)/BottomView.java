class Pair {
    int depth;
    int value;
    public Pair(int value, int depth) {
        this.depth = depth;
        this.value = value;
    }
}

class Tree{
    public void bottom (Node node, int x, int y, Map<Integer, Pair> map) {
        if (node == null) {
            return;
        }
        
        if (!map.containsKey(x) || map.get(x).depth >= y) {
            map.put(x, new Pair(node.data, y));
        }
        
        bottom(node.left, x - 1, y + 1, map);
        bottom(node.right, x + 1, y + 1, map);
    }
    
    public ArrayList <Integer> bottomView(Node root){
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Pair> map = new TreeMap<>();
        bottom(root, 0, 0, map);
        for (Pair it: map.values()) {
            result.add(it.value);
        }
        return result;
    }
}
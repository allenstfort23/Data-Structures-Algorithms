class Node {
    int element;
    Node next;
    public Node(int element){
        this.element = element;
        this.next = null;
    }
    static class OtherNode {
        public OtherNode next;
        String name;
        public OtherNode(String name){
            this.name = name;
            this.next = null;
        }
    }

}
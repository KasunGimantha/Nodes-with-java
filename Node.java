class Node{
    int data;
    Node next;
public Node (int data){
    this.data=data;
    this.next = null;
}   
public Node(int data,Node next){
    this.data = data;
    this.next = next;
}
public static void main(String args[]){
    Node head = new Node(10);
    Node newNode = new Node(20,head);
}

}


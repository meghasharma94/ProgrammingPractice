package algodaily.map;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class Node {
    int key;
    int value;
    Node previous;
    Node next;

    public Node(int key, int value)
    {
        this.key = key;
        this.value = value;
    }

    public Node(){}
}
public class LRUCache {

    Node head=new Node(0,0);
    Node tail=new Node(0,0);


    Map<Integer, Node> map = new HashMap<>();
    private Hashtable<Integer,Node> cache=new Hashtable<Integer,Node>();
    private int count=0;
    private int capacity;


    public LRUCache(int _capacity){

        this.capacity=_capacity;
        head.next=tail;
        tail.previous=head;
    }


    private void moveToHead(Node node){

        this.removeNode(node);
        this.addNodeToHead(node);
     }

    private void removeNode(Node node){

        Node pre=node.previous;
        Node post=node.next;


        pre.next=post;
        post.previous=pre;

    }

    private void addNodeToHead(Node node){

        node.previous=head;
        node.next=head.next;

        head.next.previous=node;
        head.next=node;

     }

     private Node popTail(){

        Node node=tail.previous;
        this.removeNode(node);
        return node;


     }

     public int get(int key){

            Node node=cache.get(key);
            if(node==null){

                  return -1;
            }
        this.moveToHead(node);
            return node.value;
      }

      public void put(int key , int val){
        Node node=cache.get(key);
        if(node==null){
            node =new Node();
            node.key=key;
            node.value=val;

            this.cache.put(key,node);
            this.addNodeToHead(node);

            ++count;

            if(count>capacity){

                Node tail=this.popTail();
                this.cache.remove(tail.key);
                count--;

            }  }else{

            node.value=val;
            this.moveToHead(node);

        }
 }


    public static void main(String[] args){

        LRUCache lru=new LRUCache(3);
        lru.put(1,30);
        lru.put(2,20);

        System.out.println("Value for the key: 1 is " +
                lru.get(1));

        lru.put(3,40);
        lru.put(4,60);

        System.out.println("Value for the key: 2 is " +
                lru.get(2));
        lru.put(1,30);

        System.out.println(lru);



    }

}

import java.util.*;


public class bubble
{
private int id;
private int listSize;
private Node pre;     // sentinel before first item
private Node post;    // sentinel after last item


//bubble constructor
public bubble() {
        pre  = new Node();
        post = new Node();
        pre.next = post;
        post.prev = pre;
    }

//has next and previous 
private class Node {
        private int item;
        private Node next;
        private Node prev;
    }
  

// add nodes to the end of the list 
public void addNode(int item)
{    
        Node last = post.prev;
        Node temp = new Node();
        temp.item = item;
        temp.next = post;
        temp.prev = last;
        post.prev = temp;
        last.next = temp;
        listSize++;
}


//prints the list
public void printList()
{

  Node temp=pre;
  while(temp.next!=null)                                                                                                                                                                                          
  { 
                                                                                                                                                                                                                                           if(temp.next.item!=0)
    System.out.println(temp.next.item);  
    temp=temp.next;
    
  }
} 


//sorts the list from low to high 
public void bubbleSort(){
   Node temp=pre;
   Node hold=temp;

  boolean change=true;//holds the value to whether or not there was a change to the list 
  int i;
  
  while(change)
  {change=false; //intilzes the change to false
    temp=pre;
   for(i=0; i<listSize-1; i++)
   {
    while(temp.next!=null)
      
    {if(temp.item > temp.next.item)      
      {
       hold.item=temp.item;
       temp.item=temp.next.item;
       temp.next.item=hold.item;
       change=true;}//changes change to true if a change has taken place 
   temp=temp.next;
    }
   }
 }
}

}


    
    
 


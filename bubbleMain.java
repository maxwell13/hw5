public class  bubbleMain{
  
    public static void main(String[] args) {
  bubble list= new bubble();
  //adding items to list 
 list.addNode(4);
 list.addNode(2);
 list.addNode(5);
 list.addNode(3);
 list.addNode(1);
 
 list.printList();//prints list 
 System.out.println("///////");
 list.bubbleSort();//sorts list
 list.printList(); // prints out sorted list 
    
    }
 
    
    
    
   
}
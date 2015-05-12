public class MinHeap {

    //CHARACTERISTICS
         //Each child is greater than its parent
         //Each level is as full as possible from left to right
         //Given node n, its children are 2n and 2n+1
             //Vice versa, given node n, its parent is n/2
         //Can be contained in an array (with empty slots for each node not there)

    //RUNTIMES
         //findMin --> O(1)
         //removeMin, pushDown, insert --> O(log n)
         //heapSort --> O(n * log n)
    
    /*
      public int removeMin(Node t) { }

      1. Remove min
      2. Replace with lowest value to the right
      3. Push down
          - Swap root with smaller child and continue done until
	  the end of the tree is reached
    */

    /*
      public void insert(Node t) { }
      
      1. Add new lowest left node
      2. Sift up
    */

}

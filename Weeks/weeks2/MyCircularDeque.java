class MyCircularDeque {
    int[] arr;
    int capacity;
    int lastIndex;
    public MyCircularDeque(int k) {
        arr = new int[k];
        capacity = k;
        lastIndex = -1;
    }
    
    public boolean insertFront(int value) {
        if(!isFull()){
            for(int i = lastIndex+1 ; i >= 1; i--) {
             arr[i] = arr[i-1];
                
             }
            arr[0] = value;
            lastIndex++;
            return true;
        }
        return false;
      
        
    }
    
    public boolean insertLast(int value) {
        if(!isFull()){
            arr[lastIndex+1] = value;
            lastIndex++;
            return true;
        }
        return false;
        
        
        
    }
    
    public boolean deleteFront() {
        if(!isEmpty()){
            for(int i = 1; i <= lastIndex; i++){
                arr[i-1] = arr[i];
            }
            lastIndex--;
            return true;
        }
        return false;
    }
    
    public boolean deleteLast() {
        if(!isEmpty()){
            lastIndex--;
            return true;
        }
        return false;
    }
    
    public int getFront() {
          if(!isEmpty()){
             return arr[0];
        }
        return -1;
   
    }
    
    public int getRear() {
        if(!isEmpty()){
             return arr[lastIndex];
        }
        return -1;
       
    }
    
    public boolean isEmpty() {
        return lastIndex <0;
        
    }
    
    public boolean isFull() {
        return capacity == lastIndex+1;
        
    }
}
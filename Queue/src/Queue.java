public class Queue {
    
    
    private int[] numbers;
    
    public void enQueue(int number){
        if(numbers==null){
            numbers = new int[1];
            numbers [0] = number;
        }else{
            int[] temp = new int[numbers.length+1];
            for (int i = 0; i < numbers.length; i++) {
                temp[i] = numbers[i];
            }
            temp[temp.length-1]=number;
            numbers = temp;
        }
    }
    public void dQueue(){

    }
    public boolean empty(){
        return false;
    }
    public int peek(){
        return 0;
    }
    public void clear(){

    }
    public void print(){

    }
    public boolean contains(int number){
        return false;
    }
    public int size(){
        return 0;
    }


}

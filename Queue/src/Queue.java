public class Queue {
    
    
    private int[] numbers;

    int swep;
    
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
        if(numbers == null){
            System.out.println("null error");
            return;
        }else if(numbers.length==1){
            numbers =null;
            return;
        }else {
            int[] revers = new int[numbers.length-1];
            int v = numbers.length-1;
            for (int i = revers.length-1; i>=0;i--) {
               swep = numbers[i+1];
               revers[i] = swep;

            }
            numbers = revers;

        }


    }
    public boolean empty(){
        return numbers==null;
    }
    public int peek(){
        return 0;
    }
    public void clear(){
          numbers = null;
    }
    public void print(){
        if (empty()){
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = numbers.length-1; i >=0 ; i--) {
            System.out.print(numbers[i] + ",");
        }
        System.out.println("\b\b]");
    }

    public boolean contains(int number){
        return false;
    }
    public int size(){
        return 0;
    }


}

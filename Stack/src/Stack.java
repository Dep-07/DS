public class Stack {

    int num[] = new int[100];


    public void push(int number){
        for (int i = 0; i < num.length; i++) {
            num[i] = number;
        }

    }
    public void pop(){
        for (int i = 0; i < num.length; i++) {
        }

    }
    public boolean empty(){

    }
    public int peek(){
        //Dont know
    }
    public void clear(){
        num = null;
    }
    public void print(){
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

    }
    public  boolean contains(int number){
        for (int i = 0; i < num.length; i++) {
            if (number != num[i]) {
                 return false;
            }else{
                return  true;
            }
        }

    }

}

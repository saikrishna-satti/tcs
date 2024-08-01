public class StackUsingArray {
    int maxSize;
    int top;
    char[] stackArray;

    public StackUsingArray(int size){
        maxSize=size;
        stackArray=new char[maxSize];
        top=-1;
    }

    public void push(char value){

       if(top<maxSize-1){
           stackArray[++top]=value;
       }
       else{

        System.out.println("array is full");
       }
    }

    public int pop(){
        if(top==-1){
            System.out.println("array is empty");
            return -1;
        }
        else{
            return stackArray[top--];
        }

    }
    public static void main (String[] args){
          String str="madam";
          int count=0;
          int l=str.length();
         StackUsingArray stack1=new StackUsingArray(5);

             for(int i=0;i<l;i++){
                stack1.push(str.charAt(i));
             }

             for(int i=0;i<str.length();i++){
                if(str.charAt(i)==stack1.pop()){
                    count++;
                }
             }
            if(count==l){System.out.println("palindrome");} 
            else{
            System.out.println("not palindrome");}
    }
}

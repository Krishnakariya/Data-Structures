
public class Stack {
    int[] a;
    int top;
    int p;
    Stack(int n){
        a=new int[n];
        top=-1;
        p=-1;
    }
    void push(int x){
        if(top<=a.length){
            if(top==-1){
            	p=0;
            }
            top+=1;
            a[top]=x;
        }
    }
    int pop(){
        if(p<=top && p>=0){
            p+=1;
            return a[p-1];
        }
        return -1;
    }
    int peek(){
        if(p<=top && p>=0){
            return a[p];
        }
        else{
            return -1;
        }
    }
    boolean isempty(){
        if(top>=0){
            return false;
        }
        else{
            return true;
        }
    }
}

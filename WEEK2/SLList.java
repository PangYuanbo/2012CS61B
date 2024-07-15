public class SLList(){
    public static class IntList(){
        int first;
        IntList rest;
        public IntList(int f, IntList r){
            first=f;
            rest=r;
        }
    }
    private IntList first;
    private int size=0;

    public SLList(int f){
        first=new IntList(f,null);
        size++;
    }
     public addFirst(int f){
        first=new IntList(f,first);
        size++;
     }
     public getSize(){
        return size;
     }
     public addRest(int f){
        size++;
        IntList p=first;
        while(p.rest!=null){
            p=p.next;
        }
        first=new IntList(f,null);
        p.next=first;

     }
}
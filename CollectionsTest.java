 class OurGenericList<T>{
    private T[] items;
    private int size; 
    @SuppressWarnings("unchecked")
      public OurGenericList(){
             size=0;
          items=(T[])new Object [100];
      }
      public void add(T item){
         items[size++]=item;
      }
      public T GetItemAtIndex(int index){
        return items[index];
      }
 }






public class CollectionsTest {
    public static void main(String[] args) {
        OurGenericList<Integer> list=new OurGenericList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        for(int i=0;i<3;i++){
          list.GetItemAtIndex(i);
        }
    }
}

package test;

public class GenericsImplement<T> {
	
        T obj;
        public GenericsImplement(T obj)
        {  this.obj = obj;  }  // constructor
        public T getObject()  { return this.obj; }
        static <T> void genericDisplay (T element)
        {
           System.out.println(element.getClass().getName() + " = " + element);
        }
     

    public static void main (String[] args)
    {
        GenericsImplement <Integer> iObj = new GenericsImplement<Integer>(15);
        System.out.println(iObj.getObject());
        GenericsImplement <String> sObj =
                          new GenericsImplement<String>("DataFlair");
        System.out.println(sObj.getObject());
        
    }
}
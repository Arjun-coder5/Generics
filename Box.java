public class Box<T>{
   T container;
  //  Object class is top most parent class for all java class
   public Box( T container){
      this.container = container;
   } 
   public void perFormSomeTask(){
      if(container instanceof String){
         System.out.println("Length of "+ container +"is"+ ((String)this.container).length());
      }else if(container instanceof Integer){
         System.out.println("This is an integer value"+ container);
      }
   }
   public T getValue(){
      return this.container;
   }
}
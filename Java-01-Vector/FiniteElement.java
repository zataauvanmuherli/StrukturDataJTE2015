
public class FiniteElement
{
   private Gaya [] Gaya ;
   
   public FiniteElement(){
  } 
  
  public FiniteElement (Gaya[] Gaya){
   this.Gaya=Gaya; 
}
    
   
   public Gaya[] daftarGaya (){
   return Gaya; 
}
}   
   
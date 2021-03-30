public class Quadrat extends Figur{
  //Attribute
  private double a; //Seitenl�nge
  
  //Konstruktor
  public Quadrat(double aA){
    a = Math.abs(aA);       //Math.abs = Betrag 
  }
  
  //Methoden (muss getUmfang() und getFl�che() beinhalten)
  //@Override Methode k�nnte ganz interessant sein
  public double getUmfang(){
    return 4*a;
  }
  
  public double getFlaeche(){
    return a*a;
    }
  
  public String toString(){
    return "Quadrat mit Seitenel�nge " + a;
    }
  
  
}

public class Quadrat extends Figur{
  //Attribute
  private double a; //Seitenlänge
  
  //Konstruktor
  public Quadrat(double aA){
    a = Math.abs(aA);       //Math.abs = Betrag 
  }
  
  //Methoden (muss getUmfang() und getFläche() beinhalten)
  //@Override Methode könnte ganz interessant sein
  public double getUmfang(){
    return 4*a;
  }
  
  public double getFlaeche(){
    return a*a;
    }
  
  public String toString(){
    return "Quadrat mit Seitenelänge " + a;
    }
  
  
}

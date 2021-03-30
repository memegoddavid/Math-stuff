public class Kreis extends Figur{
  private double r;
  
  public Kreis(double radius){
    r = Math.abs(radius);
    }
  
  public double getUmfang(){
    return 2*Math.PI*r;
    }
  
  public double getFlaeche(){
    return Math.PI*Math.pow(r, 2);
    } 
  
  public String toString(){
    return "Kreis mit dem Radius; "+r;
    }    
  
  
  
}

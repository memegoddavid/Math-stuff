public class Rechteck extends Figur{
  private double a;
  private double b;
  
  public Rechteck(double sL, double mL){
    a = Math.abs(sL);
    b = Math.abs(mL);
    }
  
  public double getUmfang(){
    return 2*a+2*b; 
    }
  
  public double getFlaeche(){
    return a*b;
    
    }
  
  public String toString(){
    return "Rechteck mit den Seitenlängen: " +a+", "+b;
    }
  }

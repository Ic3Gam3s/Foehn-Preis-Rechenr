/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 28.11.2023
 * @author 
 */

public class Foehn {
  
  // Anfang Attribute
  private String bauart;
  private String farbe;
  private int spannung;
  private boolean ionizator;
  private int leistung;
  // Ende Attribute
  
  public Foehn(String bauart, String farbe, int spannung, boolean ionizator, int leistung) {
    this.bauart = bauart;
    this.farbe = farbe;
    this.spannung = spannung;
    this.ionizator = ionizator;
    this.leistung = leistung;
  }

  // Anfang Methoden
  public String getBauart() {
    return bauart;
  }

  public String getFarbe() {
    return farbe;
  }

  public int getSpannung() {
    return spannung;
  }

  public boolean getIonizator() {
    return ionizator;
  }

  public int getLeistung() {
    return leistung;
  }

  public void setLeistung(int leistungNeu) {
    leistung = leistungNeu;
  }

  public void setIonizator(boolean ionizatorNeu) {
    ionizator = ionizatorNeu;
  }

  public void setFarbe(String farbeNeu) {
    farbe = farbeNeu;
  }

  public void setBauart(String bauartNeu) {
    bauart = bauartNeu;
  }

  public double calcPrice() {
    double preis = 0;
    
    // Grundpreis
    switch (this.bauart) {
      case  "Handföhn": 
        preis += 15;
        break;
      case  "Wandföhn": 
        preis += 150;
        break;
      case  "Trockenhaube": 
        preis += 100;
        break;
      default: 
        
    } // end of switch
    
    // Farbe
    if (this.farbe != "Schwarz" && this.farbe != "Weiß") {
      preis += 2;
    } // end of if
    
    // Spannung
    if (this.spannung == 2) {
      preis += 1.50;
    } // end of if
    
    // Ionisator
    if (this.ionizator) {
      preis += 5;
    } // end of if
    
    //Leistung
    preis += (0.01 *(this.leistung / 2));
    
    return preis;
  }
  
  public double calcSalesPrice(double aufschlag) {
    return calcPrice() + (calcPrice() * (aufschlag / 100));
  }


  // Ende Methoden
} // end of Foehn

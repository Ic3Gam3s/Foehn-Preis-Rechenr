import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import java.util.Hashtable;
import java.awt.font.TextAttribute;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 14.11.2023
 * @author 
 */

public class main extends JFrame {
  // Anfang Attribute
  private JComboBox<String> jComboBox1 = new JComboBox<>();
  private DefaultComboBoxModel<String> jComboBox1Model = new DefaultComboBoxModel<>();
  private JLabel lBauart1 = new JLabel();
  private JComboBox<String> jComboBox2 = new JComboBox<>();
  private DefaultComboBoxModel<String> jComboBox2Model = new DefaultComboBoxModel<>();
  private JLabel lSpannung1 = new JLabel();
  private JSpinner jSpinner1 = new JSpinner();
  private SpinnerNumberModel jSpinner1Model = new SpinnerNumberModel(500, 500, 3000, 1);
  private JSlider jSlider1 = new JSlider();
  private JLabel lLeistung1 = new JLabel();
  private JComboBox<String> jComboBox3 = new JComboBox<>();
  private DefaultComboBoxModel<String> jComboBox3Model = new DefaultComboBoxModel<>();
  private JLabel lFarbe1 = new JLabel();
  private JCheckBox jCheckBox1 = new JCheckBox();
  private JPanel jPanel1 = new JPanel(null, true);
  private JLabel lEinkaufspreis1 = new JLabel();
  private JTextField jTextField_Einkauf = new JTextField();
  private JTextField jTextField_Einkauf1 = new JTextField();
  private JLabel lVorgeschVerkaufspreis1 = new JLabel();
  private JSeparator jSeparator1 = new JSeparator();
  private JSeparator jSeparator2 = new JSeparator();
  
  // Anfang Globale Variablen
  int selectedLeistung = 500;
  private JLabel lAufschlag1 = new JLabel();
    private JLabel l1 = new JLabel();
    private JNumberField jNumberField1 = new JNumberField();
  // Ende Attribute
  
  // Ende Globale Varianblen
  
  public main() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 714; 
    int frameHeight = 293;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("main");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jComboBox1.setModel(jComboBox1Model);
    jComboBox1.setBounds(32, 64, 136, 24);
    jComboBox1Model.addElement("- Bitte Wählen -");
    jComboBox1Model.addElement("Handföhn");
    jComboBox1Model.addElement("Wandföhn");
    jComboBox1Model.addElement("Trockenhaube");
    jComboBox1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jComboBox1_ActionPerformed(evt);
      }
    });
    cp.add(jComboBox1);
    lBauart1.setBounds(32, 40, 80, 24);
    lBauart1.setText("Bauart");
    cp.add(lBauart1);
    jComboBox2.setBounds(204, 64, 120, 24);
    jComboBox2.setModel(jComboBox2Model);
    jComboBox2.setEnabled(false);
    jComboBox2.setEditable(false);
    jComboBox2Model.addElement("- Bitte Wählen -");
    jComboBox2Model.addElement("230 V (EU)");
    jComboBox2Model.addElement("110 V (NA)");
    jComboBox2.addItemListener(new ItemListener() { 
      public void itemStateChanged(ItemEvent evt) { 
        jComboBox2_ItemStateChanged(evt);
      }
    });
    cp.add(jComboBox2);
    lSpannung1.setBounds(208, 40, 80, 24);
    lSpannung1.setText("Spannung");
    cp.add(lSpannung1);
    jSpinner1.setValue(500);
    jSpinner1.setModel(jSpinner1Model);
    jSpinner1.setBounds(600, 16, 80, 24);
    jSpinner1.setEnabled(false);
    jSpinner1.addChangeListener(new ChangeListener() { 
      public void stateChanged(ChangeEvent evt) { 
        jSpinner1_StateChanged(evt);
      }
    });
    cp.add(jSpinner1);
    lLeistung1.setBounds(360, 16, 80, 24);
    lLeistung1.setText("Leistung");
    cp.add(lLeistung1);
    jComboBox3.setModel(jComboBox3Model);
    jComboBox3.setBounds(32, 160, 136, 24);
    jComboBox3Model.addElement("- Bitte Wählen -");
    jComboBox3Model.addElement("Schwarz");
    jComboBox3Model.addElement("Weiß");
    jComboBox3Model.addElement("Blau");
    jComboBox3Model.addElement("Rot");
    jComboBox3Model.addElement("Grau");
    jComboBox3Model.addElement("Grün");
    jComboBox3.setEnabled(false);
    jComboBox3.addItemListener(new ItemListener() { 
      public void itemStateChanged(ItemEvent evt) { 
        jComboBox3_ItemStateChanged(evt);
      }
    });
    cp.add(jComboBox3);
    lFarbe1.setBounds(32, 136, 80, 24);
    lFarbe1.setText("Farbe");
    cp.add(lFarbe1);
    jCheckBox1.setBounds(200, 160, 80, 24);
    jCheckBox1.setText("Ionizator");
    jCheckBox1.setOpaque(false);
    jCheckBox1.setEnabled(false);
    jCheckBox1.addItemListener(new ItemListener() { 
      public void itemStateChanged(ItemEvent evt) { 
        jCheckBox1_ItemStateChanged(evt);
      }
    });
    cp.add(jCheckBox1);
    jPanel1.setBounds(344, 152, 352, 96);
    jPanel1.setOpaque(false);
    cp.add(jPanel1);
    lEinkaufspreis1.setBounds(8, 8, 85, 24);
    lEinkaufspreis1.setText("Einkaufspreis:");
    jPanel1.add(lEinkaufspreis1);
    jTextField_Einkauf.setBounds(200, 8, 136, 24);
    jTextField_Einkauf.setEditable(false);
    jPanel1.add(jTextField_Einkauf);
    jTextField_Einkauf1.setBounds(200, 56, 136, 24);
    jTextField_Einkauf1.setEditable(false);
    jPanel1.add(jTextField_Einkauf1);
    lVorgeschVerkaufspreis1.setBounds(8, 48, 146, 24);
    lVorgeschVerkaufspreis1.setText("Vorgesch. Verkaufspreis");
    jPanel1.add(lVorgeschVerkaufspreis1);
    
    Hashtable<TextAttribute, Object> jLabel1_map = new Hashtable<TextAttribute, Object>();
    jLabel1_map.put(TextAttribute.FAMILY, "Dialog");
    jLabel1_map.put(TextAttribute.SIZE, new Integer(12));
    jLabel1_map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    jSlider1.setBounds(360, 48, 320, 80);
    jSlider1.setMinorTickSpacing(50);
    jSlider1.setMajorTickSpacing(50);
    jSlider1.setPaintTicks(true);
    jSlider1.setPaintLabels(false);
    jSlider1.setEnabled(false);
    jSlider1.setMaximum(3000);
    jSlider1.setMinimum(500);
    jSlider1.setOpaque(true);
    jSlider1.setPaintTrack(false);
    jSlider1.addChangeListener(new ChangeListener() { 
      public void stateChanged(ChangeEvent evt) { 
        jSlider1_StateChanged(evt);
      }
    });
    cp.add(jSlider1);

    jSeparator1.setBounds(336, 0, 8, 256);
    jSeparator1.setOrientation(SwingConstants.VERTICAL);
    jSeparator2.setBounds(344, 136, 352, 8);
    cp.add(jSeparator2);
    
    lAufschlag1.setBounds(352, 224, 64, 24);
    lAufschlag1.setText("Aufschlag");
    cp.add(lAufschlag1);
    l1.setBounds(160, 72, 16, 24);
    l1.setText("%");
    jPanel1.add(l1);
    jNumberField1.setBounds(80, 72, 80, 24);
    jNumberField1.setFont(new Font("Dialog", Font.BOLD, 12));
    jNumberField1.setSelectionEnd(100);
    jNumberField1.setToolTipText("Verkaufsaufschlag (Wert bis 100% möglich)");
    jNumberField1.setText("20");
    jNumberField1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jNumberField1_ActionPerformed(evt);
      }
    });
    jPanel1.add(jNumberField1);
    // Ende Komponenten
    setVisible(true);
  } // end of public main
  
  
  // Anfang Methoden
  public static void main(String[] args) {
    new main();
  } // end of main
  
  public void updatePreis() {
    if (jComboBox1.getSelectedIndex() != 0 && jComboBox2.getSelectedIndex() != 0 && jComboBox3.getSelectedIndex() != 0 && selectedLeistung <= 3000 && selectedLeistung >= 500 && jNumberField1.getDouble() != 0) {

      Foehn foehn = new Foehn(jComboBox1.getSelectedItem().toString(),
            jComboBox3.getSelectedItem().toString(), 
            jComboBox2.getSelectedIndex(), 
            jCheckBox1.isSelected(), 
            selectedLeistung);
      
      //double preis = foehn.calcPrice();
      
      //double aufschlag = jNumberField1.getDouble();
      
      // Ausgabe
      jTextField_Einkauf.setText((roundDouble(foehn.calcPrice(), 2) / 100) + "€");
      jTextField_Einkauf1.setText((roundDouble(foehn.calcSalesPrice(jNumberField1.getDouble()), 2)/ 100) + "€");
      
    } else {
      jTextField_Einkauf.setText("");
      jTextField_Einkauf1.setText("");
    } // end of if-else
  }
  
  public double roundDouble(double num, int anzNachkomma) {
    double d = Math.pow(10, anzNachkomma);
    return Math.round(num * d);
  }
  
  public void jComboBox1_ActionPerformed(ActionEvent evt) {
    //System.out.println(evt.getModifiers());
    if (evt.getActionCommand() == "comboBoxChanged") {
      if (jComboBox1.getSelectedIndex() != 0) {
        changeSelectionState(true);
      } else {
        changeSelectionState(false);
      } // end of if-else
    } // end of if
    updatePreis();
    // end of if
  }
  
  public void changeSelectionState(boolean bool) {
    jComboBox2.setEnabled(bool);
    jComboBox3.setEnabled(bool);
    jSpinner1.setEnabled(bool);
    jSlider1.setEnabled(bool);
    jCheckBox1.setEnabled(bool);
  }
  
  public void updateLeistung(String source) {
    if (source == "spinner") {
      selectedLeistung = (int)jSpinner1.getValue();
      jSlider1.setValue(selectedLeistung);
    } else if (source == "slider") {
        selectedLeistung = jSlider1.getValue();
        jSpinner1.setValue(selectedLeistung);
      }
    
    updatePreis();
  }
  public void jSpinner1_StateChanged(ChangeEvent evt) {
    updateLeistung("spinner");
    updatePreis();
  } // end of jSpinner1_StateChanged

  public void jSlider1_StateChanged(ChangeEvent evt) {
    updateLeistung("slider");
    updatePreis();
  } // end of jSlider1_StateChanged

  public void jComboBox2_ItemStateChanged(ItemEvent evt) {
    updatePreis();
  } // end of jComboBox2_ItemStateChanged

  public void jComboBox3_ItemStateChanged(ItemEvent evt) {
    updatePreis();
  } // end of jComboBox3_ItemStateChanged

  public void jCheckBox1_ItemStateChanged(ItemEvent evt) {
    updatePreis();
  } // end of jCheckBox1_ItemStateChanged
  public void jNumberField1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    updatePreis();
  } // end of jNumberField1_ActionPerformed

  // Ende Methoden
} // end of class main

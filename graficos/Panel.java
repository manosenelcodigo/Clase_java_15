
package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Panel extends JPanel implements ActionListener
{
    private JTextField nombre;
    private JLabel label1;
    
    private JTextField correo;
    private JLabel label2;
    
    private JTextField telefono;
    private JLabel label3;
    
    private JTextArea descripcion;
    private JLabel label4;
    
    private JComboBox pais;
    private JLabel label5;
    
    
    private JButton boton;
    
    public Panel()
    {
        setLayout(null);
        this.label1=new JLabel("Nombre:");
        this.label1.setBounds(10,10,100,20);
        this.nombre=new JTextField();
        this.nombre.setBounds(70,10,150,20);
        
        this.label2=new JLabel("E-Mail:");
        this.label2.setBounds(10,50,100,20);
        this.correo=new JTextField();
        this.correo.setBounds(70,50,150,20);
        
        this.label3=new JLabel("Teléfono:");
        this.label3.setBounds(10,100,100,20);
        this.telefono=new JTextField();
        this.telefono.setBounds(70,100,150,20);
        
        this.label4=new JLabel("Descripción:");
        this.label4.setBounds(10,150,120,20);
        this.descripcion=new JTextArea();
        this.descripcion.setBounds(90,150,150,100);
        
       this.label5=new JLabel("País:");
       this.label5.setBounds(10,270,100,20);
       this.pais=new JComboBox();
       this.pais.addItem("Chile");
       this.pais.addItem("Noruega");
       this.pais.addItem("China");
       this.pais.addItem("Nigeria");
       this.pais.addItem("Australia");
       this.pais.addItem("Marte");
       this.pais.setBounds(70,270,150,20);
       
       this.boton=new JButton("Enviar");
       this.boton.setBounds(10,320,100,20);
       this.boton.setToolTipText("Texto al posicionarse");
       this.boton.addActionListener(this);
       
        add(this.label1);
        add(this.nombre);
        add(this.label2);
        add(this.correo);
        add(this.label3);
        add(this.telefono);
        add(this.label4);
        add(this.descripcion);
        add(this.label5);
        add(this.pais);
        add(this.boton);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Object botonPulsado=e.getSource();
        if(botonPulsado==this.boton)
        {
            //JOptionPane.showMessageDialog(null, "hola");
            if(this.nombre.getText().length()==0 || this.correo.getText().length()==0 || this.telefono.getText().length()==0 || this.descripcion.getText().length()==0 )
            {
                JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
            }else
            {
                String resultado=" "
                                + "Nombre : "+this.nombre.getText()+" \n"
                                + "E-Mail : "+this.correo.getText()+" \n"
                                + "Teléfono :  "+this.telefono.getText()+" \n"
                                + "Descripción: "+this.descripcion.getText()+"  \n"
                                + "País :  "+this.pais.getSelectedItem()+" ";
                JOptionPane.showMessageDialog(null, resultado);
            }
        }
    }
}

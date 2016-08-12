
package graficos;

import javax.swing.JFrame;



public class Marco extends JFrame 
{
    
    
    public Marco()
    {
        setBounds(200,50,1024,768);
        setVisible(true);
        setTitle("#manosenelcódigo");
        
        setResizable(true);
        add(new Panel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

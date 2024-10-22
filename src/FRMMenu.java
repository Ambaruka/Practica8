import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FRMMenu extends JFrame{
    private JLabel JLTitulo;
    private JPanel JPMenu;
    private JLabel JLLIsta;
    private JButton JBAlumnos;
    private JButton JBLibros;
    private JButton JBPrestamos;
    private JLabel JLAccion;
    private JRadioButton JBRegistro;
    private JRadioButton JBVisualizar;
    private JRadioButton JBEditar;

    Alumnos[] alumnos=new Alumnos[10];
     int contadorAlumnos=0;


    public FRMMenu() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(JPMenu);
        setSize(500,500);

        JBAlumnos.addActionListener(e -> {
                if (JBRegistro.isSelected()){
                    this.setVisible(false);
                    FRMAlumnos frmAlumnos=new FRMAlumnos(alumnos,this);
                    frmAlumnos.setVisible(true);

                }
        });
    }
}

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

    public Alumnos[] alumnos=new Alumnos[10];
    public Libro[] libros=new Libro[15];

    FRMAlumnos frmAlumnos=new FRMAlumnos(alumnos,this);
    FRMViAlumnos frmViAlumnos=new FRMViAlumnos(alumnos,this);
    FRMLibros frmLibros=new FRMLibros(libros,this);

    public FRMMenu() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(JPMenu);
        setSize(500,500);

        libros[0]=new Libro("Realismo mágico","Cien años de soledad",1967,false);
        libros[1]=new Libro("Distopía","1984",1949,true);
        libros[2]=new Libro("Novela romantica","Orgullo y prejuicio",1813,true);
        libros[3]=new Libro("Drama","Matar un ruiseñor",1960,false);
        libros[4]=new Libro("Fantasía épica","El señor de los anillos",1954,true);

        JBAlumnos.addActionListener(e -> {
                if (JBRegistro.isSelected()){
                    seVa();
                    frmAlumnos.setVisible(true);

                }else if(JBVisualizar.isSelected()){
                   seVa();
                    frmViAlumnos.setVisible(true);
                }
        });
        JBLibros.addActionListener(e ->{
                if (JBRegistro.isSelected()) {
                    seVa();
                    frmLibros.setVisible(true);
        }
        });
    }
    private void seVa(){
        this.setVisible(false);
    }
}

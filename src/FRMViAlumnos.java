import javax.swing.*;

public class FRMViAlumnos extends JFrame{
    private JPanel JPVIAlumnos;
    private JLabel JLtitulo;
    private JButton JBAnterior;
    private JButton JBSiguiente;
    private JButton button3;
    private JLabel JLNombre;
    private JLabel JLMatricula;
    private JLabel JLDias;
    private JLabel JLEstado;
    private JLabel SuNombre;
    private JLabel SuMatricula;
    private JLabel SusDias;
    private JLabel SuEstado;

    int posicion=0;

    public FRMViAlumnos(Alumnos[] alumnos,FRMMenu frmMenu) {

        JLDias.setText("<html>Periodo de<br> prestamo /<html>");
        SuNombre.setText(alumnos[posicion].getNombre());
        SuMatricula.setText(String.valueOf(alumnos[posicion].getMatricula()));
        SusDias.setText(String.valueOf(alumnos[posicion].getDias()) + "días");
        SuEstado.setText(estado(alumnos[posicion]));

    }

    private String estado(Alumnos alumnos){
        if (alumnos.isEntregado()==true){
            return "Entregados";
        }else {return "En prestamo";}
    }
}

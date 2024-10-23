import javax.swing.*;

public class FRMViLibros extends JFrame{
    private JPanel JPViLibros;
    private JLabel JLTitulo;
    private JLabel JLNombre;
    private JLabel JLGenero;
    private JLabel JLPublicacion;
    private JLabel JLDisponibilidad;
    private JLabel SuNombre;
    private JLabel SuGenero;
    private JLabel SuPublicacion;
    private JLabel SuDisponibilidad;
    private JButton JBAnterior;
    private JButton JBSiguiente;
    private JButton JBAtras;

    int contador=0;

    public FRMViLibros(Libro[] libros) {
        JLPublicacion.setText("<html>Año de<br>publicación</html>");
        if (libros[contador!=null]){

        }
    }
    private void imprecion(Libro libro){
        SuNombre.setText(libro.getNombre());
        SuGenero.setText(libro.getGenero());
        SuPublicacion.setText(String.valueOf(libro.getAñoPublicacion()));
        if (libro.isDisponible()==true){SuDisponibilidad.setText("Disponible");}
        
    }
}

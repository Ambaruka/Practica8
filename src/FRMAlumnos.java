import javax.swing.*;
import java.awt.event.*;

public class FRMAlumnos extends JFrame{
    private JPanel JPAlumnos;
    private JLabel JLTitulo;
    private JTextField JTNombre;
    private JTextField JTMatricula;
    private JList<Integer> JLIDias;
    private JLabel JLNombre;
    private JRadioButton JRBEntregados;
    private JRadioButton JRBPrestamo;
    private JLabel JLMatricula;
    private JLabel JLDias;
    private JLabel JLEntregados;
    private JLabel JLMensaje;
    private JButton JBRegistrar;
    private JButton JBLimpiar;
    private JButton JBAtras;

    ButtonGroup libros=new ButtonGroup();
    int contador=0;

    public FRMAlumnos(Alumnos[] alumnos,FRMMenu frmMenu) {


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(JPAlumnos);
        setSize(500,700);

        libros.add(JRBEntregados);
        libros.add(JRBPrestamo);

        JTNombre.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                limpiar();
                validaLetras(e);
                enter(e,JTNombre,JTMatricula);
            }
        });

        JTMatricula.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                limpiar();
                validaNumeros(e);
            }
        });

        JLIDias.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                limpiar();
            }
        });

        JRBEntregados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });

        JRBPrestamo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });

        JBRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
                if (posible()==true){
                    alumnos[contador]=new Alumnos(JTNombre.getText(),Integer.getInteger(JTMatricula.getText()),JLIDias.getSelectedValue(),libros());
                    contador++;
                    JLMensaje.setText("Registro hecho con exito");
                }else {JLMensaje.setText("Complete los datos");}
            }
        });

        JBLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
                JTNombre.setText("");
                JTMatricula.setText("");
                JLIDias.clearSelection();
                libros.clearSelection();
            }
        });

        JBAtras.addActionListener(e -> {
            this.setVisible(false);
            frmMenu.setVisible(true);
        });
    }
    private boolean posible(){
        boolean posible=true;
        if (JTNombre.getText().trim().isEmpty() || JTMatricula.getText().trim().isEmpty()|| JLIDias.getSelectedValue()==null|| libros.getSelection() == null ){
            posible=false;
        }
        return posible;
    }

    private boolean libros(){
        if (JRBEntregados.isSelected()){
            return true;
        }else {return false;}
    }

    private void validaLetras(KeyEvent e){
        if (!(Character.isAlphabetic(e.getKeyChar()))){
            e.consume();
        }
    }
    private void validaNumeros(KeyEvent e){
        if (!(Character.isDigit(e.getKeyChar()))){
            e.consume();
        }
    }

    private void enter(KeyEvent e,JTextField javier,JComponent oskar){
        char letra = e.getKeyChar();
        if (letra == KeyEvent.VK_ENTER) {
            oskar.requestFocus();//pasar el focus al siguiente input
        }
    }

    private void limpiar(){JLMensaje.setText("");}
}

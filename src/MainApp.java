import javax.swing.*;
import java.awt.*;

public class MainApp extends JFrame {

    private JPanel contentPanel;
    private ContentManager contentManager;

    public MainApp() {
        setTitle("Sistema de acreditación ANUIES");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Contenido principal del area
        contentPanel = new JPanel();
        add(contentPanel, BorderLayout.CENTER);

        contentManager = new ContentManager(contentPanel);

        //agregar la barra de menu
        AppMenu appMenu = new AppMenu(this);
        setJMenuBar(appMenu.getMenuBar());

        //contenido inicial
        contentPanel.add(new JLabel("Bienvenido al sistema de acreditación  ANUIES"));


        //Creamos barra para el menu
//        JMenuBar menuBar = new JMenuBar();
//        JMenu menu = new JMenu("menú");


        setVisible(true);
    }

    public void actualizarContenido(String text) {
        contentManager.actualizarContenido(text);
    }

    public void mostrarOpcionesdeAcreditacion() {
        contentManager.mostrarOpcionesdeAcreditacion();
    }

}

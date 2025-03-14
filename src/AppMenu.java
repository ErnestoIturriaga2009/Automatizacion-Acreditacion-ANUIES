import javax.swing.*;

public class AppMenu {
    private JMenuBar menuBar;

    public AppMenu(MainApp mainApp) {
        menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");

        //barra de opciones para el menu
        JMenuItem inicioItem = new JMenuItem("Inicio");
        JMenuItem sobreItem = new JMenuItem("Sobre ANUIES");
        JMenuItem acreditacionItem = new JMenuItem("Acreditaciones");

        //agregar items a la app
        menu.add(inicioItem);
        menu.add(sobreItem);
        menu.add(acreditacionItem);
        menuBar.add(menu);

        inicioItem.addActionListener(e -> mainApp.actualizarContenido("Pagina de Inicio"));
        sobreItem.addActionListener(e -> mainApp.actualizarContenido("Sobre Anuies"));
        acreditacionItem.addActionListener(e -> mainApp.mostrarOpcionesdeAcreditacion());
    }

    public JMenuBar getMenuBar() {
        return menuBar;
    }
}

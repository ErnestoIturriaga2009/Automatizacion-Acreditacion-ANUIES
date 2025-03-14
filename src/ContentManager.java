import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContentManager {

    private JPanel contentPanel;
    private JLabel labelFechaGuardado;

    public ContentManager(JPanel contentPanel) {
        this.contentPanel = contentPanel;
    }

    public void actualizarContenido(String text) {
        contentPanel.removeAll();
        contentPanel.add(new JLabel(text));
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    //Funcion para mostrar las opciones de acreditacion
    //aqui quisiera que fuera donde mostremos las acreditaciones
    // o papeleria(esto lo puedo cambiar si se necesita) necesitada para la escuela

    public void mostrarOpcionesdeAcreditacion() {
        contentPanel.removeAll();
        contentPanel.setLayout(new GridLayout(5, 1, 10, 10));

        JButton option1 = new JButton("''Papelerie Inicial'' ");
        JButton option2 = new JButton("Option 2");
        JButton option3 = new JButton("Option 3");

        //creamos input de fecha de renovacion
        JPanel panelRenovacion = new JPanel();
        panelRenovacion.setLayout(new FlowLayout());

        JLabel labelRenovacion = new JLabel("Fecha de renovación: ");
        JTextField campoDeRenovacion = new JTextField(10);
        JButton saveButton = new JButton("Guardar");

        //Label para mostrar la fecha de guardado
        labelFechaGuardado = new JLabel("No se guardó ninguna fecha.");

        //agregar funcion al boton de guardado
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fechaIngresada = campoDeRenovacion.getText().trim();
                if (!fechaIngresada.isEmpty()) {
                    labelFechaGuardado.setText("Fecha de renovación: " + fechaIngresada);
                } else {
                    labelFechaGuardado.setText("No se ingresó ninguna fecha de renovación.");
                }
            }
        });

        //panel para viñetas o checkboxes
        JPanel checkboxPanel = new JPanel();
        checkboxPanel.setLayout(new GridLayout(3, 1));
        checkboxPanel.add(option1);
        checkboxPanel.add(option2);
        checkboxPanel.add(option3);

        //panel de completado
        JLabel labeldeCompletado = new JLabel("Estado de completado: No completado");
        JButton botonVerificarCompletado = new JButton("Verificacion completa: Completo");

        //boton para verificar si todas las acreditaciones estan completadas
        botonVerificarCompletado.addActionListener(e -> {
            if (option1.isSelected() && option2.isSelected() && option3.isSelected()) {
                labeldeCompletado.setText("Todas las acreditaciones están COMPLETADAS");
            } else {
                labeldeCompletado.setText("Estado de completado: NO COMPLETADO");
            }
        });

        //agregar componentes al panel
        panelRenovacion.add(labelRenovacion);
        panelRenovacion.add(campoDeRenovacion);
        panelRenovacion.add(saveButton);


        contentPanel.add(option1);
        contentPanel.add(option2);
        contentPanel.add(option3);
        contentPanel.add(panelRenovacion);
        contentPanel.add(labelFechaGuardado);
        contentPanel.add(botonVerificarCompletado);
        contentPanel.add(labeldeCompletado);

        contentPanel.revalidate();
        contentPanel.repaint();
    }
}








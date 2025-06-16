import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class CalculatorGUI extends JFrame {
    private JTextField displayField;
    private JPanel buttonPanel;

    public CalculatorGUI() {
        // setUp Frame
        setTitle("Kalkulator Simple");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // inisialisasi file tampilan
        displayField = new JTextField();
        displayField.setEditable(false);
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setFont(new Font("Arial", Font.PLAIN, 24));
        add(displayField, BorderLayout.NORTH);

        // inisialisasi button panel
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3,6,5,5));

        // menambahkan angka & button
        String[] buttonLabels = {
            "1", "2", "3", "4", "5", "6",
            "7", "8", "9", "0", "+", "-",
            "*", "/", "=", "%", "Mod", "Exit"
        };

        ButtonHandler handler = new ButtonHandler();

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 18)); // Set font for buttons
            button.addActionListener(handler); // Register the action listener
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER); // Add button panel to the center

        pack(); // Pack the components to their preferred size
        setLocationRelativeTo(null); // Center the window on the screen
        setVisible(true); // Make the frame visible
    }

    // Inner class to handle button actions
    private class ButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand(); // Get the text of the button clicked

            if (command.equals("Exit")) {
                System.exit(0); // Exit the application
            } else {
                // For now, just append the button text to the display field
                // In a real calculator, you'd add logic for calculations
                displayField.setText(displayField.getText() + command);
            }
        }
    }
    public static void main(String[] args) {
        // Run the GUI creation on the Event Dispatch Thread (EDT)
        // This is crucial for Swing applications
        SwingUtilities.invokeLater(() -> {
            new CalculatorGUI();
        });
    }
}
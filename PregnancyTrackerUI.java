import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PregnancyTrackerUI extends JFrame {

    private JTextField dueDateField;
    private JTextField weightField;

    public PregnancyTrackerUI() {
        super("Pregnancy Tracker");

        // Create UI components
        JLabel dueDateLabel = new JLabel("Due Date:");
        dueDateField = new JTextField(10);
        JLabel weightLabel = new JLabel("Weight (lbs):");
        weightField = new JTextField(10);
        JLabel Symptons = new JLabel ("Symptons;");
        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(new SaveButtonListener());

        // Set layout and add components to frame
        setLayout(new GridLayout(3, 2));
        add(dueDateLabel);
        add(dueDateField);
        add(weightLabel);
        add(weightField);
        add(new JLabel()); // Empty label to fill in grid
        add(saveButton);

        // Set frame properties
        setSize(400, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class SaveButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String dueDate = dueDateField.getText();
            int weight = Integer.parseInt(weightField.getText());
            // Save data to data structure or database
            System.out.println("Due date: " + dueDate);
            System.out.println("Weight: " + weight);
            
        }
    }

    public static void main(String[] args) {
        PregnancyTrackerUI tracker = new PregnancyTrackerUI();
    }
}
    


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StudentMarks {
    StudentMarks() {
        JFrame frame = new JFrame("Student Marks");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // frame.add(new StudentMarksPanel());
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        frame.add(panel);

        // create UI Widgets;

        JLabel lblName = new JLabel("Student Name");
        JTextField txtName = new JTextField(20);
        JLabel lblMarks = new JLabel("Student Marks");
        JTextField txtMarks = new JTextField(20);
        JLabel lblResult = new JLabel("Result");
        JButton btnCal = new JButton("Calculate");

        // panel.add(new StudentMarksPanel());
        panel.add(lblName);
        panel.add(txtName);
        panel.add(lblMarks);
        panel.add(txtMarks);
        panel.add(lblResult);
        panel.add(btnCal);

        Student s1 = new Student("Dananjaya", "40");
        txtName.setText(s1.getName());
        txtMarks.setText(s1.getMarks());

        btnCal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // System.out.println("Button clicked");

                String name = txtName.getText();
                String marks = txtMarks.getText();
                int marks1 = Integer.parseInt(marks);
                String result = marks1 >= 50 ? "Pass" : "Fail";
                lblResult.setText(name + " " + result);
            }

        });

    }

    public static void main(String[] args) {
        new StudentMarks();

    }

}
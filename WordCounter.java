package Word_Counter;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WordCounter{
    public static void main(String[] args) {
        //Create frame
        JFrame frame=new JFrame("Word Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,700);

        frame.setLocationRelativeTo(null);//Center the frame

        //create components
        JTextArea textArea=new JTextArea(10,30);
        JButton countButton=new JButton("Count Words");
        JLabel resultLabel=new JLabel("Word Count: 0");

        //Set up layout
        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(textArea),BorderLayout.CENTER);
        frame.add(countButton, BorderLayout.SOUTH);  // Button at the bottom
        frame.add(resultLabel, BorderLayout.NORTH);  // Result label at the top

        // ActionListener for the count button
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = textArea.getText().trim();  // Get text from the text area
                int wordCount = countWords(inputText);  // Call method to count words
                resultLabel.setText("Word Count: " + wordCount);  // Display word count
            }
        });

        // Display the frame
        frame.setVisible(true);
    }

    // Method to count words
    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.split("\\s+");  // Split by whitespace (spaces, tabs, etc.)
        return words.length;
    }
}


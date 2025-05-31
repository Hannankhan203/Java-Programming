// import javax.swing.*;
// import java.awt.*;
// import java.awt.datatransfer.StringSelection;
// import java.awt.dnd.DnDConstants;
// import java.awt.dnd.DropTarget;
// import java.awt.dnd.DropTargetDropEvent;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class DragDropCalculator extends JFrame {

//     private JTextField display;
//     private JPanel buttonPanel;

//     public DragDropCalculator() {
//         setTitle("Drag and Drop Calculator");
//         setSize(400, 500);
//         setDefaultCloseOperation(EXIT_ON_CLOSE);
//         setLayout(new BorderLayout());

//         // Display Panel
//         display = new JTextField();
//         display.setFont(new Font("Arial", Font.BOLD, 24));
//         display.setHorizontalAlignment(JTextField.RIGHT);
//         display.setEditable(false);
//         display.setTransferHandler(new TransferHandler("text")); // Allow drag and drop
//         add(display, BorderLayout.NORTH);

//         // Button Panel
//         buttonPanel = new JPanel();
//         buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

//         String[] buttons = {
//                 "7", "8", "9", "/",
//                 "4", "5", "6", "*",
//                 "1", "2", "3", "-",
//                 "0", ".", "=", "+"
//         };

//         for (String text : buttons) {
//             JButton button = new JButton(text);
//             button.setFont(new Font("Arial", Font.BOLD, 18));
//             button.setTransferHandler(new TransferHandler("text")); // Allow drag and drop
//             button.addActionListener(new ButtonClickListener());
//             buttonPanel.add(button);
//         }

//         add(buttonPanel, BorderLayout.CENTER);

//         // Enable dropping text into the display field
//         display.setDropTarget(new DropTarget() {
//             public synchronized void drop(DropTargetDropEvent evt) {
//                 try {
//                     evt.acceptDrop(DnDConstants.ACTION_COPY);
//                     String droppedText = evt.getTransferable()
//                             .getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor)
//                             .toString();
//                     display.setText(display.getText() + droppedText);
//                 } catch (Exception ex) {
//                     ex.printStackTrace();
//                 }
//             }
//         });

//         setVisible(true);
//     }

//     private class ButtonClickListener implements ActionListener {
//         public void actionPerformed(ActionEvent e) {
//             String command = ((JButton) e.getSource()).getText();

//             if (command.equals("=")) {
//                 try {
//                     String result = evaluateExpression(display.getText());
//                     display.setText(result);
//                 } catch (Exception ex) {
//                     display.setText("Error");
//                 }
//             } else {
//                 display.setText(display.getText() + command);
//             }
//         }
//     }

//     private String evaluateExpression(String expression) {
//         try {
//             // Simple backend to evaluate the expression
//             ScriptEngineManager manager = new ScriptEngineManager();
//             ScriptEngine engine = manager.getEngineByName("JavaScript");
//             return engine.eval(expression).toString();
//         } catch (Exception e) {
//             return "Error";
//         }
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(DragDropCalculator::new);
//     }
// }







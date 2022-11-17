import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CurrencyConverter extends Frame implements ItemListener, ActionListener {
    // iniatialized all the GUI components
    JComboBox<String> convertFrom, convertTo;
    JTextField txtFrom, txtTo;
    JButton compute, clear, exit;
    JLabel from, to;
    JLabel lblFrom, lblTo;
    JPanel mainPanel = new JPanel();

    double input = 0;
    double result = 0;

    public CurrencyConverter() {
        // add all the GUI components
        super("Realtime Currency Converter");
        setSize(420, 300);
        setLayout(null);
        setBackground(Color.darkGray);

        lblFrom = new JLabel("From:");
        lblFrom.setBounds(30, 45, 250, 30);
        lblFrom.setForeground(Color.WHITE);
        add(lblFrom);

        convertFrom = new JComboBox<String>();
        convertFrom.setBounds(30, 70, 150, 30);
        convertFrom.addItem("US Dollar");
        convertFrom.addItem("Euro");
        convertFrom.addItem("Sterling Pound");
        convertFrom.addItem("KE Shilling");
        convertFrom.addItem("TZ Shilling");
        convertFrom.addItem("SA Rand");
        add(convertFrom);

        lblTo = new JLabel("To:");
        lblTo.setBounds(230, 45, 250, 30);
        lblTo.setForeground(Color.WHITE);
        add(lblTo);

        convertTo = new JComboBox<String>();
        convertTo.setBounds(230, 70, 150, 30);
        convertTo.addItem("US Dollar");
        convertTo.addItem("Euro");
        convertTo.addItem("Sterling Pound");
        convertTo.addItem("KE Shilling");
        convertTo.addItem("TZ Shilling");
        convertTo.addItem("SA Rand");
        add(convertTo);

        from = new JLabel("Enter Amount to Convert:");
        from.setBounds(50, 110, 300, 30);
        from.setForeground(Color.WHITE);
        add(from);

        txtFrom = new JTextField(15);
        txtFrom.setBounds(50, 140, 300, 30);
        add(txtFrom);

        compute = new JButton("Compute");
        compute.setBounds(50, 250, 90, 30);
        add(compute);

        to = new JLabel("Total Amount Converted:");
        to.setBounds(50, 170, 300, 30);
        to.setForeground(Color.WHITE);
        add(to);

        txtTo = new JTextField(15);
        txtTo.setBounds(50, 200, 300, 30);
        txtTo.setEditable(false);
        txtTo.setForeground(Color.RED);
        add(txtTo);

        clear = new JButton("Clear");
        clear.setBounds(150, 250, 90, 30);
        add(clear);

        exit = new JButton("Exit");
        exit.setBounds(250, 250, 90, 30);
        add(exit);

        // register all the GUI components who will listen or invoke the methods
        convertFrom.addItemListener(this);
        convertTo.addItemListener(this);
        compute.addActionListener(this);
        txtFrom.addActionListener(this);
        exit.addActionListener(this);

        // this will close the applet window if the user clicked the close or exit
        // button
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                exit();
            }
        });

        // when clear button is pressed
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clear();
            }
        });

    }

    // clear method
    public void clear() {
        txtFrom.setText("");
        txtTo.setText("");
    }

    // the exit method
    public void exit() {
        setVisible(false);
        dispose();
        System.exit(0);
    }

    // show or make the applet window frame visible
    public static void main(String args[]) {
        CurrencyConverter w = new CurrencyConverter();
        w.setVisible(true);
    }

    public void convertDollar() {
        if (convertTo.getSelectedItem() == "Euro") {
            result = (input * 0.96);
            txtTo.setText("" + result);
        } else if (convertTo.getSelectedItem() == "Sterling Pound") {
            result = (input * 0.84);
            txtTo.setText("" + result);
        } else if (convertTo.getSelectedItem() == "KE Shilling") {
            result = (input * 122.15);
            txtTo.setText("" + result);
        } else if (convertTo.getSelectedItem() == "TZ Shilling") {
            result = (input * 2333.41);
            txtTo.setText("" + result);
        } else if (convertTo.getSelectedItem() == "SA Rand") {
            result = (input * 17.21);
            txtTo.setText("" + result);
        } else {
            txtTo.setText("" + input);
        }
    }

    public void convertEuro() {
        if (convertTo.getSelectedItem() == "US Dollar") {
            result = (input * 1.04);
            txtTo.setText("" + result);
        } else if (convertTo.getSelectedItem() == "Sterling Pound") {
            result = (input * 0.87);
            txtTo.setText("" + result);
        } else if (convertTo.getSelectedItem() == "KE Shilling") {
            result = (input * 126.87);
            txtTo.setText("" + result);
        } else if (convertTo.getSelectedItem() == "TZ Shilling") {
            result = (input * 2425.17);
            txtTo.setText("" + result);
        } else if (convertTo.getSelectedItem() == "SA Rand") {
            result = (input * 17.90);
            txtTo.setText("" + result);
        } else {
            txtTo.setText("" + input);
        }
    }

    public void convertPound() {
        if (convertTo.getSelectedItem() == "Dollar") {
            result = (input * 1.19);
            txtTo.setText("" + result);
        } else if (convertTo.getSelectedItem() == "Euro") {
            result = (input * 1.14);
            txtTo.setText("" + result);
        } else if (convertTo.getSelectedItem() == "KE Shilling") {
            result = (input * 145.00);
            txtTo.setText("" + result);
        } else if (convertTo.getSelectedItem() == "TZ Shilling") {
            result = (input * 2772.34);
            txtTo.setText("" + result);
        } else if (convertTo.getSelectedItem() == "SA Rand") {
            result = (input * 20.50);
            txtTo.setText("" + result);
        } else {
            txtTo.setText("" + input);
        }
    }

    public void convertKe() {
        if (convertTo.getSelectedItem() == "Euro") {
            result = (input * 0.0082);
            txtTo.setText("" + result);
        } else if (convertTo.getSelectedItem() == "Sterling Pound") {
            result = (input * 0.0069);
            txtTo.setText("" + result);
        } else if (convertTo.getSelectedItem() == "US Dollar") {
            result = (input * 0.0072);
            txtTo.setText("" + result);
        } else if (convertTo.getSelectedItem() == "TZ Shilling") {
            result = (input * 19.11);
            txtTo.setText("" + result);
        } else if (convertTo.getSelectedItem() == "SA Rand") {
            result = (input * 0.14);
            txtTo.setText("" + result);
        } else {
            txtTo.setText("" + input);
        }
    }

    public void convertTz() {
        if (convertTo.getSelectedItem() == "Euro") {
            result = (input * 0.00041);
            txtTo.setText("" + result);
        } else if (convertTo.getSelectedItem() == "Sterling Pound") {
            result = (input * 0.00036);
            txtTo.setText("" + result);
        } else if (convertTo.getSelectedItem() == "KE Shilling") {
            result = (input * 0.052);
            txtTo.setText("" + result);
        } else if (convertTo.getSelectedItem() == "US Dollar") {
            result = (input * 0.00043);
            txtTo.setText("" + result);
        } else if (convertTo.getSelectedItem() == "SA Rand") {
            result = (input * 0.0074);
            txtTo.setText("" + result);
        } else {
            txtTo.setText("" + input);
        }
    }

    public void convertRand() {
        if (convertTo.getSelectedItem() == "Euro") {
            result = (input * 0.056);
            txtTo.setText("" + result);
        } else if (convertTo.getSelectedItem() == "Sterling Pound") {
            result = (input * 0.049);
            txtTo.setText("" + result);
        } else if (convertTo.getSelectedItem() == "KE Shilling") {
            result = (input * 7.12);
            txtTo.setText("" + result);
        } else if (convertTo.getSelectedItem() == "TZ Shilling") {
            result = (input * 135.58);
            txtTo.setText("" + result);
        } else if (convertTo.getSelectedItem() == "US Dollar") {
            result = (input * 0.058);
            txtTo.setText("" + result);
        } else {
            txtTo.setText("" + input);
        }
    }

    public void actionPerformed(ActionEvent e) {

        input = Double.parseDouble(txtFrom.getText());

        if (e.getSource() == compute) {
            if (convertFrom.getSelectedItem() == "US Dollar") {
                convertDollar();
            } else if (convertFrom.getSelectedItem() == "Euro") {
                convertEuro();
            } else if (convertFrom.getSelectedItem() == "Sterling Pound") {
                convertPound();
            } else if (convertFrom.getSelectedItem() == "KE Shilling") {
                convertKe();
            } else if (convertFrom.getSelectedItem() == "TZ Shilling") {
                convertTz();
            } else {
                convertRand();
            }

        }
        // this will asked the user to exit or not
        else {
            // this will display a confirm dialog box
            int choice = JOptionPane.showConfirmDialog(null, "Do you really want to quit?", "Exit",
                    JOptionPane.YES_NO_OPTION);
            if (choice == 0) {
                dispose();
                System.exit(0);
            }
        }
    }

    public void itemStateChanged(ItemEvent e) {

    }
}

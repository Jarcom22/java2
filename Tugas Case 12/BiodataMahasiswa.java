import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BiodataMahasiswa extends JFrame {

    private JTextField txtNim;
    private JTextField txtNama;
    private JTextField txtProdi;
    private JTextArea txtOutput;
    private JButton btnTampilkan;
    private JButton btnReset;

    public BiodataMahasiswa() {
        setTitle("Aplikasi Biodata Mahasiswa");
        setSize(650, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // ===== Panel Input =====
        JPanel panelInput = new JPanel();
        panelInput.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Input Data",
                TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION,
                new Font("SansSerif", Font.BOLD, 12)));
        panelInput.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        Font labelFont = new Font("SansSerif", Font.BOLD, 12);

        // NIM
        gbc.gridx = 0; gbc.gridy = 0; gbc.weightx = 0.3;
        JLabel lblNim = new JLabel("NIM");
        lblNim.setFont(labelFont);
        panelInput.add(lblNim, gbc);

        gbc.gridx = 1; gbc.weightx = 0.7;
        txtNim = new JTextField();
        panelInput.add(txtNim, gbc);

        // Nama
        gbc.gridx = 0; gbc.gridy = 1; gbc.weightx = 0.3;
        JLabel lblNama = new JLabel("Nama");
        lblNama.setFont(labelFont);
        panelInput.add(lblNama, gbc);

        gbc.gridx = 1; gbc.weightx = 0.7;
        txtNama = new JTextField();
        panelInput.add(txtNama, gbc);

        // Program Studi
        gbc.gridx = 0; gbc.gridy = 2; gbc.weightx = 0.3;
        JLabel lblProdi = new JLabel("Program Studi");
        lblProdi.setFont(labelFont);
        panelInput.add(lblProdi, gbc);

        gbc.gridx = 1; gbc.weightx = 0.7;
        txtProdi = new JTextField();
        panelInput.add(txtProdi, gbc);

        // ===== Panel Tombol =====
        JPanel panelTombol = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        btnTampilkan = new JButton("Tampilkan");
        btnReset = new JButton("Reset");
        panelTombol.add(btnTampilkan);
        panelTombol.add(btnReset);

        // Gabung input + tombol jadi satu panel atas
        JPanel panelAtas = new JPanel(new BorderLayout());
        panelAtas.add(panelInput, BorderLayout.CENTER);
        panelAtas.add(panelTombol, BorderLayout.SOUTH);

        // ===== Panel Output =====
        JPanel panelOutput = new JPanel(new BorderLayout());
        panelOutput.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Output",
                TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION,
                new Font("SansSerif", Font.BOLD, 12)));

        txtOutput = new JTextArea();
        txtOutput.setEditable(false);
        txtOutput.setFont(new Font("Monospaced", Font.PLAIN, 13));
        txtOutput.setForeground(new Color(80, 60, 20));
        JScrollPane scrollOutput = new JScrollPane(txtOutput);
        panelOutput.add(scrollOutput, BorderLayout.CENTER);

        // ===== Tambah ke Frame =====
        add(panelAtas, BorderLayout.NORTH);
        add(panelOutput, BorderLayout.CENTER);

        // ===== Aksi Tombol =====
        btnTampilkan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tampilkanData();
            }
        });

        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetForm();
            }
        });
    }

    private void tampilkanData() {
        String nim = txtNim.getText().trim();
        String nama = txtNama.getText().trim();
        String prodi = txtProdi.getText().trim();

        if (nim.isEmpty() || nama.isEmpty() || prodi.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Mohon isi semua data terlebih dahulu.",
                    "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("========== BIODATA MAHASISWA ==========\n\n");
        sb.append(String.format("%-15s: %s\n", "NIM", nim));
        sb.append(String.format("%-15s: %s\n", "Nama", nama));
        sb.append(String.format("%-15s: %s\n", "Program Studi", prodi));

        txtOutput.setText(sb.toString());
    }

    private void resetForm() {
        txtNim.setText("");
        txtNama.setText("");
        txtProdi.setText("");
        txtOutput.setText("");
        txtNim.requestFocus();
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            BiodataMahasiswa frame = new BiodataMahasiswa();
            frame.setVisible(true);
        });
    }
}

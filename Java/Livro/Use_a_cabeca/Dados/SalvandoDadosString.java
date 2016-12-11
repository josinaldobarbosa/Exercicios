package dados;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SalvandoDadosString extends JFrame {
	private static final long serialVersionUID = 1L;

	private static JTextArea txtrTexto;
	private static String texto; // Onde será salvo o texto

	// Abrir caixa de pastas
	private void janelaSalvar(){
		JFileChooser arquivoSalvo = new JFileChooser();
		arquivoSalvo.showSaveDialog(contentPane);
		salvaTexto(arquivoSalvo.getSelectedFile());
	}

	// Salvar em formato txt
	private void salvaTexto(File arquivo){
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo + ".txt"));
			writer.write("O Texto digitado foi: \"" + texto + "\"");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Não foi possivel salvar o texto");
		}
	}

	// Janela abrir
	private void janelaAbrir(){
		JFileChooser arquivoAbrir = new JFileChooser();
		arquivoAbrir.showOpenDialog(contentPane);
		abriTexto(arquivoAbrir.getSelectedFile());
	}

	// Abri e exibe texto
	private void abriTexto(File arquivo){
		try {
			FileReader lerArquivo = new FileReader(arquivo);
			BufferedReader ler = new BufferedReader(lerArquivo);
			String linha = null;
			while((linha = ler.readLine()) != null){
				txtrTexto.setText(txtrTexto.getText() + linha);
			}
			ler.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Não foi possivel ler o arquivo");
		}
	}

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalvandoDadosString frame = new SalvandoDadosString();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SalvandoDadosString() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Abri janela de pastas
				janelaSalvar();
			}
		});

		JLabel lblDigiteUmTexto = new JLabel("Digite um texto abaixo:");
		lblDigiteUmTexto.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblDigiteUmTexto, BorderLayout.NORTH);
		contentPane.add(btnSalvar, BorderLayout.SOUTH);

		txtrTexto = new JTextArea();
		txtrTexto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				// Atualiza toda vez que digitar
				texto = txtrTexto.getText();
			}
		});
		txtrTexto.setLineWrap(true);
		contentPane.add(txtrTexto, BorderLayout.CENTER);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Limpa o texto
				txtrTexto.setText("");
			}
		});
		contentPane.add(btnLimpar, BorderLayout.EAST);

		JButton btnAbir = new JButton("Abir");
		btnAbir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Abri janela de pastas
				janelaAbrir();
			}
		});
		contentPane.add(btnAbir, BorderLayout.WEST);
	}

}

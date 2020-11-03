
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class JogoDaVelha extends JFrame {

	private JPanel contentPane;
	private char[][] hashtag = new char[3][3];
	private static final long serialVersionUID = 1L;
	private JButton A1, A2, A3, A4, A5, A6, A7, A8, A9;
	private JLabel T3, T2, T1, T4, T5, T6, T7, T8, T9;
	private int jogada = 1, fim, soma = 0;
	private char k;
	private String resultado = "", mostrar;

	public static void main(String[] args) {
		try {
			JogoDaVelha frame = new JogoDaVelha();
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} catch (Exception e) {
		}
	}

	public JogoDaVelha() {
		
		/* layout */
		
		setTitle("Jogo da senhora idosa");
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 491);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		A1 = new JButton("");
		A1.setFont(new Font("Tahoma", Font.BOLD, 99));
		A1.setBackground(Color.WHITE);
		A1.setBounds(0, 0, 150, 150);
		contentPane.add(A1);
		A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (round() == 'X') {
					k = 'X';
				} else
					k = 'O';
				hashtag[0][0] = k;
				mostrar();
				String x = String.valueOf(hashtag[0][0]);
				T1.setText(x);
				A1.setVisible(false);
				verificar();
				soma+=1;
			}
		});

		A2 = new JButton("");
		A2.setFont(new Font("Tahoma", Font.BOLD, 99));
		A2.setBackground(Color.WHITE);
		A2.setBounds(151, 0, 150, 150);
		contentPane.add(A2);
		A2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (round() == 'X') {
					k = 'X';
				} else
					k = 'O';
				hashtag[0][1] = k;
				mostrar();
				String x = String.valueOf(hashtag[0][1]);
				T2.setText(x);
				A2.setVisible(false);
				verificar();
				soma+=1;
			}
		});

		A3 = new JButton("");
		A3.setFont(new Font("Tahoma", Font.BOLD, 99));
		A3.setBackground(Color.WHITE);
		A3.setBounds(302, 0, 150, 150);
		contentPane.add(A3);
		A3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (round() == 'X') {
					k = 'X';
				} else
					k = 'O';
				hashtag[0][2] = k;
				mostrar();
				String x = String.valueOf(hashtag[0][2]);
				T3.setText(x);
				A3.setVisible(false);
				verificar();
				soma+=1;
			}
		});

		A4 = new JButton("");
		A4.setFont(new Font("Tahoma", Font.BOLD, 99));
		A4.setBackground(Color.WHITE);
		A4.setBounds(0, 151, 150, 150);
		contentPane.add(A4);
		A4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (round() == 'X') {
					k = 'X';
				} else
					k = 'O';
				hashtag[1][0] = k;
				mostrar();
				String x = String.valueOf(hashtag[1][0]);
				T4.setText(x);
				A4.setVisible(false);
				verificar();
				soma+=1;
			}
		});

		A5 = new JButton("");
		A5.setFont(new Font("Tahoma", Font.BOLD, 99));
		A5.setBackground(Color.WHITE);
		A5.setBounds(151, 151, 150, 150);
		contentPane.add(A5);
		A5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (round() == 'X') {
					k = 'X';
				} else
					k = 'O';
				hashtag[1][1] = k;
				mostrar();
				String x = String.valueOf(hashtag[1][1]);
				T5.setText(x);
				A5.setVisible(false);
				verificar();
				soma+=1;
			}
		});

		A6 = new JButton("");
		A6.setFont(new Font("Tahoma", Font.BOLD, 99));
		A6.setBackground(Color.WHITE);
		A6.setBounds(302, 151, 150, 150);
		contentPane.add(A6);
		A6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (round() == 'X') {
					k = 'X';
				} else
					k = 'O';
				hashtag[1][2] = k;
				mostrar();
				String x = String.valueOf(hashtag[1][2]);
				T6.setText(x);
				A6.setVisible(false);
				verificar();
				soma+=1;
			}
		});

		A7 = new JButton("");
		A7.setFont(new Font("Tahoma", Font.BOLD, 99));
		A7.setBackground(Color.WHITE);
		A7.setBounds(0, 302, 150, 150);
		contentPane.add(A7);
		A7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (round() == 'X') {
					k = 'X';
				} else
					k = 'O';
				hashtag[2][0] = k;
				mostrar();
				String x = String.valueOf(hashtag[2][0]);
				T7.setText(x);
				A7.setVisible(false);
				verificar();
				soma+=1;
			}
		});

		A8 = new JButton("");
		A8.setFont(new Font("Tahoma", Font.BOLD, 99));
		A8.setBackground(Color.WHITE);
		A8.setBounds(151, 302, 150, 150);
		contentPane.add(A8);
		A8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (round() == 'X') {
					k = 'X';
				} else
					k = 'O';
				hashtag[2][1] = k;
				mostrar();
				String x = String.valueOf(hashtag[2][1]);
				T8.setText(x);
				A8.setVisible(false);
				verificar();
				soma+=1;
			}
		});

		A9 = new JButton("");
		A9.setFont(new Font("Tahoma", Font.BOLD, 99));
		A9.setBackground(Color.WHITE);
		A9.setBounds(302, 302, 150, 150);
		contentPane.add(A9);
		A9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (round() == 'X') {
					k = 'X';
				} else
					k = 'O';
				mostrar();
				hashtag[2][2] = k;
				String x = String.valueOf(hashtag[2][2]);
				T9.setText(x);
				A9.setVisible(false);
				verificar();
				soma+=1;
			}
		});

		T3 = new JLabel("");
		T3.setForeground(Color.BLACK);
		T3.setVerticalAlignment(SwingConstants.TOP);
		T3.setHorizontalAlignment(SwingConstants.CENTER);
		T3.setBackground(Color.WHITE);
		T3.setFont(new Font("Tahoma", Font.BOLD, 99));
		T3.setBounds(302, 0, 150, 150);
		contentPane.add(T3);

		T2 = new JLabel("");
		T2.setForeground(Color.BLACK);
		T2.setVerticalAlignment(SwingConstants.TOP);
		T2.setHorizontalAlignment(SwingConstants.CENTER);
		T2.setFont(new Font("Tahoma", Font.BOLD, 99));
		T2.setBackground(Color.WHITE);
		T2.setBounds(151, 0, 150, 150);
		contentPane.add(T2);

		T1 = new JLabel("");
		T1.setForeground(Color.BLACK);
		T1.setVerticalAlignment(SwingConstants.TOP);
		T1.setHorizontalAlignment(SwingConstants.CENTER);
		T1.setFont(new Font("Tahoma", Font.BOLD, 99));
		T1.setBackground(Color.WHITE);
		T1.setBounds(0, 0, 150, 150);
		contentPane.add(T1);

		T4 = new JLabel("");
		T4.setForeground(Color.BLACK);
		T4.setVerticalAlignment(SwingConstants.TOP);
		T4.setHorizontalAlignment(SwingConstants.CENTER);
		T4.setFont(new Font("Tahoma", Font.BOLD, 99));
		T4.setBackground(Color.WHITE);
		T4.setBounds(0, 151, 150, 150);
		contentPane.add(T4);

		T5 = new JLabel("");
		T5.setForeground(Color.BLACK);
		T5.setVerticalAlignment(SwingConstants.TOP);
		T5.setHorizontalAlignment(SwingConstants.CENTER);
		T5.setFont(new Font("Tahoma", Font.BOLD, 99));
		T5.setBackground(Color.WHITE);
		T5.setBounds(151, 151, 150, 150);
		contentPane.add(T5);

		T6 = new JLabel("");
		T6.setForeground(Color.BLACK);
		T6.setVerticalAlignment(SwingConstants.TOP);
		T6.setHorizontalAlignment(SwingConstants.CENTER);
		T6.setFont(new Font("Tahoma", Font.BOLD, 99));
		T6.setBackground(Color.WHITE);
		T6.setBounds(302, 151, 150, 150);
		contentPane.add(T6);

		T7 = new JLabel("");
		T7.setForeground(Color.BLACK);
		T7.setVerticalAlignment(SwingConstants.TOP);
		T7.setHorizontalAlignment(SwingConstants.CENTER);
		T7.setFont(new Font("Tahoma", Font.BOLD, 99));
		T7.setBackground(Color.WHITE);
		T7.setBounds(0, 302, 150, 150);
		contentPane.add(T7);

		T8 = new JLabel("");
		T8.setForeground(Color.BLACK);
		T8.setVerticalAlignment(SwingConstants.TOP);
		T8.setHorizontalAlignment(SwingConstants.CENTER);
		T8.setFont(new Font("Tahoma", Font.BOLD, 99));
		T8.setBackground(Color.WHITE);
		T8.setBounds(151, 302, 150, 150);
		contentPane.add(T8);

		T9 = new JLabel("");
		T9.setForeground(Color.BLACK);
		T9.setVerticalAlignment(SwingConstants.TOP);
		T9.setHorizontalAlignment(SwingConstants.CENTER);
		T9.setFont(new Font("Tahoma", Font.BOLD, 99));
		T9.setBackground(Color.WHITE);
		T9.setBounds(302, 302, 150, 150);
		contentPane.add(T9);

	}

	public char round() {
		
		if (jogada == 1) {
			jogada = 2;
			return 'X';
		} else {
			jogada = 1;
			return 'O';
		}
	}
	
	public void mostrar() {
		for(int w = 0; w < hashtag.length; w++) {
			for(int d = 0; d < hashtag[w].length; d++) {
				String v = String.valueOf(hashtag[w][d]);
				if(!"O".equals(v) && !"X".equals(v)) {
					hashtag[w][d] = '-';
				}
//               System.out.print(hashtag[w][d] +" | ");
			} 
//			System.out.println("\n");
		}
//		System.out.println("\n\r");
	}
	
	public void verificar() {
		
		/*verifica se tem algum vencedor ou se empatou */
		
		String x = String.valueOf(hashtag[2][2]) + String.valueOf(hashtag[1][1]) + String.valueOf(hashtag[0][0]);
		String y = String.valueOf(hashtag[2][0]) + String.valueOf(hashtag[1][1]) + String.valueOf(hashtag[0][2]);
		String z = String.valueOf(hashtag[2][0]) + String.valueOf(hashtag[2][1]) + String.valueOf(hashtag[2][2]);
		String b = String.valueOf(hashtag[1][0]) + String.valueOf(hashtag[1][1]) + String.valueOf(hashtag[1][2]);
		String h = String.valueOf(hashtag[0][0]) + String.valueOf(hashtag[0][1]) + String.valueOf(hashtag[0][2]);
		String p = String.valueOf(hashtag[0][0]) + String.valueOf(hashtag[1][0]) + String.valueOf(hashtag[2][0]);
		String g = String.valueOf(hashtag[0][1]) + String.valueOf(hashtag[1][1]) + String.valueOf(hashtag[2][1]);
		String f = String.valueOf(hashtag[0][2]) + String.valueOf(hashtag[1][2]) + String.valueOf(hashtag[2][2]);
		if(x.equals("XXX") || x.equals("OOO")) {
			T9.setForeground(Color.RED);
			T5.setForeground(Color.RED);
			T1.setForeground(Color.RED);
			fim = 1;
		} else if(y.equals("XXX") || y.equals("OOO")) {
			T7.setForeground(Color.RED);
			T5.setForeground(Color.RED);
			T3.setForeground(Color.RED);
			fim = 1;
		} else if(z.equals("XXX") || z.equals("OOO")) {
			T9.setForeground(Color.RED);
			T8.setForeground(Color.RED);
			T7.setForeground(Color.RED);
			fim = 1;
		} else if(b.equals("XXX") || b.equals("OOO")) {
			T6.setForeground(Color.RED);
			T5.setForeground(Color.RED);
			T4.setForeground(Color.RED);
			fim = 1;
		} else if(h.equals("XXX") || h.equals("OOO")) {
			T3.setForeground(Color.RED);
			T2.setForeground(Color.RED);
			T1.setForeground(Color.RED);
			fim = 1;
		} else if(p.equals("XXX") || p.equals("OOO")) {
			T1.setForeground(Color.RED);
			T4.setForeground(Color.RED);
			T7.setForeground(Color.RED);
			fim = 1;
		} else if(g.equals("XXX") || g.equals("OOO")) {
			T2.setForeground(Color.RED);
			T5.setForeground(Color.RED);
			T8.setForeground(Color.RED);
			fim = 1;
		} else if(f.equals("XXX") || f.equals("OOO")) {
			T3.setForeground(Color.RED);
			T6.setForeground(Color.RED);
			T9.setForeground(Color.RED);
			fim = 1;
		}else if(soma == 8) {
			JOptionPane.showMessageDialog(null, "Empate!");
		}
		
		if(fim == 1) {
			/*mostra o vencedor ou mensagem de empate */
			
			A9.setVisible(false);
			A8.setVisible(false);
			A7.setVisible(false);
			A6.setVisible(false);
			A5.setVisible(false);
			A4.setVisible(false);
			A3.setVisible(false);
			A2.setVisible(false);
			A1.setVisible(false);
			
			for(int w = 0; w < hashtag.length; w++) {
				for(int d = 0; d < hashtag[w].length; d++) {
					String v = String.valueOf(hashtag[w][d]);
					if(!"O".equals(v) && !"X".equals(v)) {
						hashtag[w][d] = '-';
					}
                    resultado += hashtag[w][d] + " | ";
				} 
                   resultado +="\n";
			}
			JOptionPane.showMessageDialog(null,k+" Ganhou!\n "+resultado);
		}
	}
}

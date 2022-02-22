/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
import javax.swing.JOptionPane;
public class JavaLibs5026211078{
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,
            "Halo!\nSelamat Datang di Wecidi\nSilakan Pesanannya",
            "WCD",
            1);
        String input1 = JOptionPane.showInputDialog(null, "Atas nama siapa?","Type here");
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Angka favorit dari 1-5","integer"));
        String[] acceptableValues = {"Nasi", "Kentang"};
        String input2 = (String)JOptionPane.showInputDialog(null,"Lebih suka yang mana?","Karbohidrat",2,null,
            acceptableValues,
            acceptableValues[0]);
        double doub1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Pilih skala dari 1-2","misal 1.5")); 
	int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Umurnya berapa?","integer"));
        String input3 = JOptionPane.showInputDialog(null,"Ingin makan "+input2+" dengan apa?","Type here");
	double doub2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Berat badannya berapa?(kg)"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Angka favoritnya berapa?","integer"));
	String input4 = JOptionPane.showInputDialog(null, "Minuman favoritnya apa?","Type here");
	double doub3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Tinggi badannya berapa?(cm)"));
        int totalInt = num1+num2+num3;
        double totalDoub = doub1+doub2+doub3;
        JOptionPane.showMessageDialog(null,
            "Baik, saya ulangi pesanannya ya kak. \nPesanan atas nama "+input1+" untuk\n "
                    +num1+" porsi "+input2+" seharga "+doub1+" ribu rupiah\n"
                    +num2+" porsi "+input3+" seharga "+doub2+" ribu rupiah\n"
                    +num3+" buah "+input4+" dengan harga "+doub3+" ribu rupiah.\nJadi, total pesanannya sebanyak "
                    +totalInt+" produk dengan total harga sebesar "+totalDoub+" ribu rupiah ya kak.\nTerima kasih sudah memesan di Wecidi.");
    }    
    
}


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class TugasBesar extends JFrame implements ActionListener {
    public JButton buttonlog,button1, button2, button3, buttonback1, buttonback2,buttonback3, buttonnext1,buttonnext2,buttonsubmit,buttonnextbayar, buttonbackform,buttonsubmitpay,buttonnextfin,buttonhome,buttonsubmit2,buttonsubmit3,buttonbackform2,buttonextbayar2,buttonnextfin2,buttonconfirm1,buttonconfirm2,buttomsubmitpay2, buttonsubmitjenis,buttonnext3,buttonbackform3,buttonextbayar3,buttonexit;
    public JFrame framelogin, frame, keretaframe, pesawatframe, busframe,pembayaranframe,payframe,tyframe,pembayaranframe2,payframe2,pembayaranframe3;
    public JComboBox<String> cbKode,cbtujuan,cbkelas,cbJenis,cbmaskapai;
    public JTextField untf,tfNama,tfjam,tfasal,tfdewasa,tfanak,tfperkiraan,tfemail,tfhp,tfhd,tfha,tftotal,tfpajak,tfdiskon,tfgrand,tfuang,tfkembalian,tfkursi,tfharagakursi,tfbagasi;
    public JPasswordField passtf;
    public JLabel typic,gambar1,un,pass,login1,labelnama,labelkode,labelasal,labeltujuan, labelkelas,labeljam,divider, divider1, labeldewasa, labelanak, labelperkiraan,divider2,labelemail, labelhp,labelharga,labelhargaa, labelhargad,labelpembayaran,labelpajak,labeldiskon,labelgrand,labeluang,labelstatus,labelkembalian,ty1,ty2,labelkursi,labelhargakursi,labeljenis, labelmaskapai,labelbagasi;
    public JTextArea konfirmasi;
    public Container containerlogin, container, keretacontainer, pesawatcontainer, buscontainer, pembayarancontainer, paycontainer,tycontainer;
    public String newLine = "\n";
    public String a,b,c,d,e,f,g,h,i,j;
    public int dewasa, anak, hdewasa, hanak,total,pajak,diskon,grand,uang,kembalian,hkursi,kursi;
    public String [] maskapaii = {"","Garuda Indonesia","Air Asia"};
    public String [] maskapaid = {"","Citylink","Sriwijaya Air"};

    public static void main (String [] args) {
        TugasBesar App = new TugasBesar();
        App.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private String formatRp(int value) {
        DecimalFormat format = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols symbol = format.getDecimalFormatSymbols();
        symbol.setCurrencySymbol("Rp.  ");
        symbol.setGroupingSeparator('.');
        return format.format(value);
    }

    public TugasBesar() {
        login();
    }

    public void login() {
        framelogin = new JFrame();
        framelogin.setTitle("Login");
        containerlogin= new Container();
        buttonlog = new JButton("Submit");
        login1 = new JLabel("Login");
        un = new JLabel("Username");
        pass = new JLabel("Password");
        untf = new JTextField();
        passtf = new JPasswordField();
        framelogin.setSize(350,300);
        Font flog = new Font("Times New Roman",Font.BOLD,30);
        login1.setFont(flog);
        containerlogin.setSize(350,300);
        login1.setBounds(130,20,500,50);
        un.setBounds(30,110,80,20);
        untf.setBounds(140,110,130,20);
        pass.setBounds(30,150,80,20);
        passtf.setBounds(140,150,130,20);
        buttonlog.setBounds(130,200,100,30);
        framelogin.setLocation(100,100);
        framelogin.getContentPane();
        framelogin.setLayout(new FlowLayout());
        framelogin.setVisible(true);
        framelogin.setLayout(null);
        framelogin.add(containerlogin);
        framelogin.add(login1);
        framelogin.add(un);
        framelogin.add(pass);
        framelogin.add(untf);
        framelogin.add(passtf);
        framelogin.add(buttonlog);
        buttonlog.addActionListener(this);
        containerlogin.show();
    }

    public void homepage() {
        frame = new JFrame();
        container = new Container();
        frame.setSize(600,600);
        container.setSize(500,500);
        frame.setTitle("Home");
        frame.setLocation(100,100);
        JLabel header = new JLabel("Hai " + untf.getText() + " !");
        JLabel header1 = new JLabel("Silakan pilih kateogori yang diinginkan !");
        Font fheader = new Font("Times New Roman",Font.BOLD,30);
        Font fheader1 = new Font("Times New Roman",Font.ITALIC,25);
        header1.setForeground(Color.BLUE);
        header.setFont(fheader);
        header1.setFont(fheader1);
        frame.getContentPane();
        header.setBounds(160,30,600,50);
        header1.setBounds(80,110,700,50);
        Icon icon1 = new ImageIcon("train.png");
        Icon icon2 = new ImageIcon("plane.png");
        Icon icon3 = new ImageIcon("bus.png");
        button1 = new JButton( "    Kereta api        " , icon1     );
        button2 = new JButton("     Pesawat           ",  icon2     );
         button3 = new JButton("     Bus               ",  icon3     );
        button1.setBounds(200,230,200,50);
        button2.setBounds(200,330,200,50);
        button3.setBounds(200,430,200,50);
        button1.setForeground(Color.RED);
        button2.setForeground(Color.RED );
        button3.setForeground(Color.RED);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(container);
        container.add(header);
        container.add(header1);
        container.add(button1);
        container.add(button2);
        container.add(button3);
        container.show();
    }

    public void actionPerformed (ActionEvent e) {
        if (e.getSource() == button1 ) {
            frame.setVisible(false);
            kereta();
        }

        else if (e.getSource() == button2) {
            frame.setVisible(false);
            pesawat();
        }

        else if (e.getSource() == button3) {
            frame.setVisible(false);
            bus();
        }

        else if (e.getSource() == buttonback1) {
            keretaframe.setVisible(false);
            homepage();
        }

        else if (e.getSource() == buttonback2) {
            pesawatframe.setVisible(false);
            homepage();
        }

        else if (e.getSource() == buttonback3) {
            busframe.setVisible(false);
            homepage();
        }

        else if (e.getSource() == buttonnext1) {
                keretaframe.setVisible(false);
                konfirmasi();
            }

        else if (e.getSource() == buttonsubmit) {
            if (tfNama.getText().trim().isEmpty() || tfdewasa.getText().trim().isEmpty() || tfanak.getText().trim().isEmpty() || tfemail.getText().trim().isEmpty() || tfhp.getText().trim().isEmpty() || cbKode.getSelectedItem().equals(null) || cbtujuan.getSelectedItem().equals(null) ||cbkelas.getSelectedItem().equals(null)) {
                JOptionPane.showMessageDialog(null, "Mohon lengkapi form anda sebelum melanjutkan !", "Warning" ,0);
                buttonnext1.setEnabled(false);
            }

            else {
                submit();
                buttonnext1.setEnabled(true);
            }
        }

        else if (e.getSource() == buttonsubmit3) {
            if (tfNama.getText().trim().isEmpty() || cbJenis.getSelectedItem() == null || cbmaskapai.getSelectedItem()== null || cbkelas.getSelectedItem()==null || cbtujuan.getSelectedItem() == null || tfdewasa.getText().trim().isEmpty() || tfanak.getText().trim().isEmpty() || tfbagasi.getText().trim().isEmpty() || tfemail.getText().trim().isEmpty() || tfhp.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Mohon lengkapi form anda sebelum melanjutkan !", "Warning" ,0);
                buttonnext3.setEnabled(false);
            }

            else {
                submit2();
                buttonnext3.setEnabled(true);
            }
        }

        else if (e.getSource() == buttonhome) {
            tyframe.setVisible(false);
            homepage();
        }

        else if (e.getSource() == buttonbackform) {
            pembayaranframe.setVisible(false);
            keretaframe.setVisible(true);
        }

        else if (e.getSource() == buttonnextbayar) {
            pembayaranframe.setVisible(false);
            pay();
        }

        else if (e.getSource() == buttonlog) {
            if (untf.getText().isEmpty() && passtf.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Mohon isi dahulu username dan passwordnya !","Warning",2 );
            }
            else if (untf.getText().equals("samueloliver760") && passtf.getText().equals("mulutmerah")) {
                framelogin.setVisible(false);
                homepage();
            }

            else {
                JOptionPane.showMessageDialog(null,"Username atau password salah input !","Warning",2 );
            }
        }

        else if (e.getSource() == buttonsubmitpay) {
            if (tfuang.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Mohon isi jumlah nominal terlebih dahulu !", "Warning" ,0);
                buttonnextfin.setEnabled(false);
            }
            else {
                uang = Integer.parseInt(tfuang.getText());
                if (uang < grand) {
                    labelstatus.setText("Uang anda tidak cukup, mohon diulangi lagi");
                    labelstatus.setForeground(Color.RED);
                    tfuang.setText(null);
                    tfuang.requestFocus();
                    buttonnextfin.setEnabled(false);
                }
                else if (uang == grand) {
                    labelstatus.setText("Uang anda pas");
                    tfkembalian.setText(String.valueOf(0));
                    buttonnextfin.setEnabled(true);
                }
                else if (uang > grand) {
                    labelstatus.setText("Uang anda mencukupi");
                    labelstatus.setForeground(Color.GREEN);
                    kembalian = uang - grand;
                    tfkembalian.setText(String.valueOf(kembalian));
                    g = this.formatRp(kembalian);
                    tfkembalian.setText(g);
                    buttonnextfin.setEnabled(true);
                }
            }

        }

        else if (e.getSource() == buttonnextfin) {
            payframe.setVisible(false);
            thankyou();
        }

        else if (e.getSource() == buttonsubmit2) {
            if (tfNama.getText().trim().isEmpty() && tfkursi.getText().trim().isEmpty() || tfemail.getText().trim().isEmpty() ||  tfhp.getText().trim().isEmpty() || cbKode.getSelectedItem() == null || cbkelas.getSelectedItem() == null || cbtujuan.getSelectedItem()== null) {
                JOptionPane.showMessageDialog(null, "Mohon lengkapi form anda sebelum melanjutkan !", "Warning" ,0);
                buttonnext2.setEnabled(false);
            }

            else {
                submitbus();
                buttonnext2.setEnabled(true);
            }
        }

        else if(e.getSource() == buttonnext2) {
            busframe.setVisible(false);
            konfirmasi2();
        }

        else if(e.getSource() == buttonnext3) {
            pesawatframe.setVisible(false);
            confirm3();
        }

        else if (e.getSource() == buttonbackform2) {
            pembayaranframe2.setVisible(false);
            busframe.setVisible(true);
        }

        else if (e.getSource() == buttonbackform3) {
            pembayaranframe3.setVisible(false);
            pesawatframe.setVisible(true);
        }

        else if (e.getSource() == buttonextbayar2) {
            pembayaranframe2.setVisible(false);
            pay2();
            buttonnextfin2.setEnabled(false);
        }

        else if (e.getSource() == buttonextbayar3) {
            pembayaranframe3.setVisible(false);
            pay3();
        }

        else if (e.getSource() == buttonnextfin2) {
            payframe2.setVisible(false);
            thankyou();
        }

        else if (e.getSource() == buttonconfirm1) {
            payframe.setVisible(false);
            pembayaranframe.setVisible(true);
        }

        else if (e.getSource() == buttonconfirm2) {
            payframe.setVisible(false);
            pembayaranframe3.setVisible(true);
        }

        else if (e.getSource() == buttonsubmitjenis) {
            if (cbJenis.getSelectedItem() == "Domestik") {
                domestik();
            }

            else if (cbJenis.getSelectedItem() == "Internasional") {
                internasional();
            }
        }

        else if (e.getSource() == buttomsubmitpay2) {
            if (tfuang.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Mohon isi jumlah nominal terlebih dahulu !", "Warning" ,0);
                buttonnextfin2.setEnabled(false);
            }
            else {
                uang = Integer.parseInt(tfuang.getText());
                if (uang < grand) {
                    labelstatus.setText("Uang anda tidak cukup, mohon diulangi lagi");
                    labelstatus.setForeground(Color.RED);
                    tfuang.setText(null);
                    tfuang.requestFocus();
                    buttonnextfin2.setEnabled(false);
                }
                else if (uang == grand) {
                    labelstatus.setText("Uang anda pas");
                    tfkembalian.setText(String.valueOf(0));
                    buttonnextfin2.setEnabled(true);

                }
                else if (uang > grand) {
                    labelstatus.setText("Uang anda mencukupi");
                    labelstatus.setForeground(Color.GREEN);
                    kembalian = uang - grand;
                    tfkembalian.setText(String.valueOf(kembalian));
                    g = this.formatRp(kembalian);
                    tfkembalian.setText(g);
                    buttonnextfin2.setEnabled(true);
                }
            }
        }

        else if (e.getSource() == buttonexit) {
            System.exit(0);
        }

    }
    public void kereta() {
        keretaframe = new JFrame();
        keretacontainer = new Container();
        keretaframe.setTitle("Pembelian tiket kereta");
        keretaframe.setSize(600,600);
        keretacontainer.setSize(600,600);
        keretaframe.setLocation(100,100);
        keretaframe.getContentPane();
        keretaframe.setLayout(new FlowLayout());
        keretaframe.setVisible(true);
        keretaframe.setLayout(null);
        keretaframe.add(keretacontainer);
        keretacontainer.show();
        formkereta();
    }

    public void formkereta() {
        JLabel judulkereta = new JLabel("Tiket kereta");
        JLabel headerkereta = new JLabel("Silakan isi form pendaftaran");
        Font judul1 = new Font("Times New Roman",Font.BOLD,35);
        Font header1 = new Font("Times New Roman",Font.ITALIC,25);
        headerkereta.setForeground(Color.BLUE);
        judulkereta.setBounds(200,5,400,50);
        headerkereta.setBounds(155,50,400,50);
        labelnama = new JLabel("Nama Pembeli");
        labelkode = new JLabel("Kode Kereta");
        labelasal = new JLabel("Kota Asal");
        labeltujuan = new JLabel("Kota Tujuan");
        labelkelas = new JLabel("Kelas");
        labeljam = new JLabel("Jam");
        labeldewasa =  new JLabel("Dewasa");
        labelanak = new JLabel("Anak");
        labelperkiraan = new JLabel("Perkiraan sampai");
        labelemail = new JLabel("Email");
        labelhp = new JLabel("No HP");
        labelharga = new JLabel("Sub Harga");
        labelhargad = new JLabel("Harga dewasa");
        labelhargaa = new JLabel("Harga anak");
        tftotal = new JTextField();
        tftotal.setEditable(false);
        keretacontainer.add(labelnama);
        tftotal.setForeground(Color.RED);
        labelnama.setBounds(30,112,400,50);
        labelkode.setBounds(320,112,400,50);
        labelasal.setBounds(30,155,400,50);
        labeltujuan.setBounds(320,155,400,50);
        labelkelas.setBounds(30,198,400,50);
        labeljam.setBounds(320,198,400,50);
        labeldewasa.setBounds(30,240,400,50);
        labelanak.setBounds(180,240,400,50);
        labelperkiraan.setBounds(320,240,400,50);
        labelharga.setBounds(30,410,400,50);
        tftotal.setBounds(320,425,100,20);
        labelhargad.setBounds(320,290,400,50);
        labelhargaa.setBounds(320,340,400,50);
        judulkereta.setFont(judul1);
        headerkereta.setFont(header1);
        String [] kode = {"","KRT01", "KRT02"};
        String [] tujuan = {"","Cirebon","Jakarta", "Surabaya", "Yogya"};
        String [] kelas = {"","Regular", "Eksekutif"};
        cbKode = new JComboBox<>(kode);
        cbKode.setSelectedIndex(0);
        tfasal = new JTextField("Bandung");
        tfasal.setEditable(false);
        cbtujuan = new JComboBox<>(tujuan);
        cbtujuan.setSelectedIndex(0);
        cbkelas = new JComboBox<>(kelas);
        cbkelas.setSelectedIndex(0);
        keretacontainer.add(judulkereta);
        keretacontainer.add(labelkode);
        keretacontainer.add(labelasal);
        keretacontainer.add(labeltujuan);
        keretacontainer.add(labelkelas);
        keretacontainer.add(labeljam);
        keretacontainer.add(labeldewasa);
        keretacontainer.add(labelanak);
        keretacontainer.add(labelperkiraan);
        keretacontainer.add(labelharga);
        keretacontainer.add(labelhargad);
        keretacontainer.add(labelhargaa);
        keretacontainer.add(headerkereta);
        tfperkiraan = new JTextField();
        tfNama = new JTextField();
        tfjam = new JTextField();
        tfdewasa = new JTextField();
        tfanak = new JTextField();
        tfemail = new JTextField();
        tfhp = new JTextField();
        tfhd = new JTextField();
        tfha = new JTextField();
        tfhd.setEditable(false);
        tfha.setEditable(false);
        Font nama = new Font("Arial",Font.PLAIN,15);
        tfNama.setFont(nama);
        tfNama.setBounds(130,128,125,20);
        cbKode.setBounds(435,128,125,20);
        tfasal.setBounds(130,170,125,20);
        cbtujuan.setBounds(435,170,125,20);
        cbkelas.setBounds(130,212,125,20);
        tfjam.setBounds(435,212,100,20);
        tfdewasa.setBounds(110,260,40,20);
        tfanak.setBounds(230,260,40,20);
        tfperkiraan.setBounds(435,260,100,20);
        labelemail.setBounds(30,295,400,50);
        labelhp.setBounds(30,345,400,50);
        tfemail.setBounds(130,310,125,20);
        tfhp.setBounds(130,360,125,20);
        tfhd.setBounds(435,310,100,20);
        tfha.setBounds(435,360,100,20);
        keretacontainer.add(tfNama);
        keretacontainer.add(tfhd);
        keretacontainer.add(tfha);
        keretacontainer.add(cbKode);
        keretacontainer.add(tfasal);
        keretacontainer.add(cbtujuan);
        keretacontainer.add(cbkelas);
        keretacontainer.add(tfjam);
        keretacontainer.add(tfdewasa);
        keretacontainer.add(tfanak);
        keretacontainer.add(tfperkiraan);
        keretacontainer.add(tftotal);
        tfjam.setEditable(false);
        tfperkiraan.setEditable(false);
        divider = new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        divider.setBounds(0,400,2000,20);
        keretacontainer.add(divider);
        divider2 = new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        divider2.setBounds(0,450,2000,20);
        keretacontainer.add(labelemail);
        keretacontainer.add(divider2);
        keretacontainer.add(labelhp);
        keretacontainer.add(tfemail);
        keretacontainer.add(tfhp);
        buttonback1 = new JButton("Back");
        buttonback1.addActionListener(this);
        buttonback1.setBounds(120,490,100,50);
        keretacontainer.add(buttonback1);
        buttonnext1 = new JButton("Next");
        buttonnext1.addActionListener(this);
        buttonnext1.setBounds(380,490,100,50);
        keretacontainer.add(buttonnext1);
        buttonsubmit = new JButton("Submit");
        buttonsubmit.setBounds(250,490,100,50);
        keretacontainer.add(buttonsubmit);
        buttonsubmit.addActionListener(this);
        buttonnext1.setEnabled(false);
        tfNama.requestFocus();
    }
    //Submit form pendaftaran kereta
    public void submit() {
        if (cbKode.getSelectedItem() == "KRT01" && cbtujuan.getSelectedItem() == "Jakarta" && cbkelas.getSelectedItem() == "Regular") {
            tfjam.setText("15.00");
            tfperkiraan.setText("17.40");
            tfhd.setText("50000");
            tfha.setText("25000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "KRT02" && cbtujuan.getSelectedItem() == "Jakarta" && cbkelas.getSelectedItem() == "Regular") {
            tfjam.setText("15.15");
            tfperkiraan.setText("17.55");
            tfhd.setText("50000");
            tfha.setText("25000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "KRT01" && cbtujuan.getSelectedItem() == "Jakarta" && cbkelas.getSelectedItem() == "Eksekutif") {
            tfjam.setText("16.00");
            tfperkiraan.setText("18.40");
            tfhd.setText("60000");
            tfha.setText("30000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "KRT02" && cbtujuan.getSelectedItem() == "Jakarta" && cbkelas.getSelectedItem() == "Eksekutif") {
            tfjam.setText("16.15");
            tfperkiraan.setText("18.55");
            tfhd.setText("60000");
            tfha.setText("30000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "KRT01" && cbtujuan.getSelectedItem() == "Cirebon" && cbkelas.getSelectedItem() == "Regular") {
            tfjam.setText("06.00");
            tfperkiraan.setText("10.00");
            tfhd.setText("25000");
            tfha.setText("15000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "KRT02" && cbtujuan.getSelectedItem() == "Cirebon" && cbkelas.getSelectedItem() == "Regular") {
            tfjam.setText("06.15");
            tfperkiraan.setText("10.15");
            tfhd.setText("25000");
            tfha.setText("15000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "KRT01" && cbtujuan.getSelectedItem() == "Cirebon" && cbkelas.getSelectedItem() == "Eksekutif") {
            tfjam.setText("07.00");
            tfperkiraan.setText("11.00");
            tfhd.setText("35000");
            tfha.setText("25000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "KRT02" && cbtujuan.getSelectedItem() == "Cirebon" && cbkelas.getSelectedItem() == "Eksekutif") {
            tfjam.setText("07.15");
            tfperkiraan.setText("11.15");
            tfhd.setText("35000");
            tfha.setText("25000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "KRT01" &&  cbtujuan.getSelectedItem() == "Yogya" && cbkelas.getSelectedItem() == "Regular") {
            tfjam.setText("19.00");
            tfperkiraan.setText("02.30");
            tfhd.setText("70000");
            tfha.setText("35000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "KRT02" &&  cbtujuan.getSelectedItem() == "Yogya" && cbkelas.getSelectedItem() == "Regular") {
            tfjam.setText("19.15");
            tfperkiraan.setText("02.45");
            tfhd.setText("70000");
            tfha.setText("35000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "KRT01" &&  cbtujuan.getSelectedItem() == "Yogya" && cbkelas.getSelectedItem() == "Eksekutif") {
            tfjam.setText("20.00");
            tfperkiraan.setText("03.30");
            tfhd.setText("85000");
            tfha.setText("45000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "KRT02" &&  cbtujuan.getSelectedItem() == "Yogya" && cbkelas.getSelectedItem() == "Eksekutif") {
            tfjam.setText("21.15");
            tfperkiraan.setText("03.45");
            tfhd.setText("85000");
            tfha.setText("45000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "KRT01" && cbtujuan.getSelectedItem() == "Surabaya" && cbkelas.getSelectedItem() == "Regular") {
            tfjam.setText("09.00");
            tfperkiraan.setText("17.50");
            tfhd.setText("55000");
            tfha.setText("25000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "KRT02"  && cbtujuan.getSelectedItem() == "Surabaya" && cbkelas.getSelectedItem() == "Regular") {
            tfjam.setText("09.15");
            tfperkiraan.setText("18.05");
            tfhd.setText("55000");
            tfha.setText("25000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "KRT01"  && cbtujuan.getSelectedItem() == "Surabaya" && cbkelas.getSelectedItem() == "Eksekutif") {
            tfjam.setText("10.00");
            tfperkiraan.setText("18.50");
            tfhd.setText("65000");
            tfha.setText("35000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));

            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "KRT02" && cbtujuan.getSelectedItem() == "Surabaya" && cbkelas.getSelectedItem() == "Eksekutif") {
            tfjam.setText("10.15");
            tfperkiraan.setText("19.05");
            tfhd.setText("65000");
            tfha.setText("35000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
        }
    }

    //Konfirmasi form kereta
    public void konfirmasi() {
        pembayaranframe = new JFrame();
        pembayaranframe.setTitle("Konfirmasi");
        pembayarancontainer= new Container();
        pembayaranframe.setSize(600,600);
        pembayarancontainer.setSize(600,600);
        pembayaranframe.getContentPane();
        pembayaranframe.setLocation(100,100);
        JLabel headerbayar = new JLabel("Konfirmasi pembelian");
        JLabel headerbayar1 = new JLabel("Pastikan data yang ditampilkan sudah tepat");
        Font fbheader = new Font("Times New Roman",Font.BOLD,35);
        Font fbheader1 = new Font("Times New Roman",Font.ITALIC,20);
        konfirmasi = new JTextArea(
                "Nama pembeli : " + tfNama.getText() + newLine + "Email : "  + tfemail.getText() + newLine + "No HP : " + tfhp.getText() + newLine + "Kode Kereta : " + cbKode.getSelectedItem() + newLine + "Kota asal : " + tfasal.getText() + newLine + "Kota Tujuan : " + cbtujuan.getSelectedItem() + newLine + "Kelas : " + cbkelas.getSelectedItem() + newLine + "Jam pemberangkatan : " + tfjam.getText() + newLine + "Perkiraan sampai : " +  tfperkiraan.getText() + newLine + "Orang dewasa : " + tfdewasa.getText() + newLine + "Anak - anak : " + tfanak.getText() + newLine + "Subtotal  : " + tftotal.getText()

        );
        konfirmasi.setEditable(false);
        headerbayar1.setForeground(Color.BLUE);
        headerbayar.setFont(fbheader);
        headerbayar1.setFont(fbheader1);
        pembayaranframe.getContentPane();
        headerbayar.setBounds(140,30,600,50);
        headerbayar1.setBounds(120,90,700,50);
        konfirmasi.setBounds(50,160,500,270);
        pembayaranframe.setLayout(new FlowLayout());
        pembayaranframe.setVisible(true);
        pembayaranframe.setLayout(null);
        pembayaranframe.add(pembayarancontainer);
        pembayaranframe.add(konfirmasi);
        pembayarancontainer.add(headerbayar);
        pembayarancontainer.add(headerbayar1);
        pembayarancontainer.show();
        Font konfont = new Font("Arial",Font.PLAIN,18);
        konfirmasi.setFont(konfont);
        buttonbackform = new JButton("Back");
        buttonnextbayar = new JButton("Next");
        buttonbackform.setBounds(150,460,100,50);
        buttonnextbayar.setBounds(300,460,100,50);
        buttonbackform.addActionListener(this);
        buttonnextbayar.addActionListener(this);
        pembayarancontainer.add(buttonbackform);
        pembayarancontainer.add(buttonnextbayar);
    }

    public void konfirmasi2() {
        pembayaranframe2 = new JFrame();
        pembayaranframe2.setTitle("Konfirmasi");
        pembayarancontainer= new Container();
        pembayaranframe2.setSize(600,600);
        pembayarancontainer.setSize(600,600);
        pembayaranframe2.getContentPane();
        pembayaranframe2.setLocation(100,100);
        JLabel headerbayar = new JLabel("Konfirmasi pembelian");
        JLabel headerbayar1 = new JLabel("Pastikan data yang ditampilkan sudah tepat");
        Font fbheader = new Font("Times New Roman",Font.BOLD,35);
        Font fbheader1 = new Font("Times New Roman",Font.ITALIC,20);
        konfirmasi = new JTextArea(
                "Nama pembeli : " + tfNama.getText() + newLine + "Email : "  + tfemail.getText() + newLine + "No HP : " + tfhp.getText() + newLine + "Kode Bus : " + cbKode.getSelectedItem() + newLine + "Kota Awal : " + tfasal.getText() + newLine + "Kota Tujuan : " + cbtujuan.getSelectedItem() + newLine + "Kelas : " + cbkelas.getSelectedItem() + newLine + "Jam pemberangkatan : " + tfjam.getText() + newLine + "Perkiraan sampai : " +  tfperkiraan.getText() + newLine + "Jumlah kursi : " + tfkursi.getText() + newLine +  "Subtotal  : " + tftotal.getText()

        );
        konfirmasi.setEditable(false);
        headerbayar1.setForeground(Color.BLUE);
        headerbayar.setFont(fbheader);
        headerbayar1.setFont(fbheader1);
        pembayaranframe2.getContentPane();
        headerbayar.setBounds(140,30,600,50);
        headerbayar1.setBounds(120,90,700,50);
        konfirmasi.setBounds(50,160,500,270);
        pembayaranframe2.setLayout(new FlowLayout());
        pembayaranframe2.setVisible(true);
        pembayaranframe2.setLayout(null);
        pembayaranframe2.add(pembayarancontainer);
        pembayaranframe2.add(konfirmasi);
        pembayarancontainer.add(headerbayar);
        pembayarancontainer.add(headerbayar1);
        pembayarancontainer.show();
        Font konfont = new Font("Arial",Font.PLAIN,18);
        konfirmasi.setFont(konfont);
        buttonbackform2 = new JButton("Back");
        buttonextbayar2 = new JButton("Next");
        buttonbackform2.setBounds(150,460,100,50);
        buttonextbayar2.setBounds(300,460,100,50);
        buttonbackform2.addActionListener(this);
        buttonextbayar2.addActionListener(this);
        pembayarancontainer.add(buttonbackform2);
        pembayarancontainer.add(buttonextbayar2);
    }

    public void confirm3() {
        pembayaranframe3 = new JFrame();
        pembayaranframe3.setTitle("Konfirmasi");
        pembayarancontainer= new Container();
        pembayaranframe3.setSize(600,650);
        pembayarancontainer.setSize(600,630);
        pembayaranframe3.getContentPane();
        pembayaranframe3.setLocation(100,100);
        JLabel headerbayar = new JLabel("Konfirmasi pembelian");
        JLabel headerbayar1 = new JLabel("Pastikan data yang ditampilkan sudah tepat");
        Font fbheader = new Font("Times New Roman",Font.BOLD,35);
        Font fbheader1 = new Font("Times New Roman",Font.ITALIC,20);
        konfirmasi = new JTextArea(
                "Nama pembeli : " + tfNama.getText() + newLine + "Email : "  + tfemail.getText() + newLine + "No HP : " + tfhp.getText() + newLine + "Jenis Penerbangan : " + cbJenis.getSelectedItem() + newLine + "Maskapai : " + cbmaskapai.getSelectedItem() + newLine + "Kota Asal : " + tfasal.getText() + newLine + "Kota Tujuan : " + cbtujuan.getSelectedItem() + newLine + "Kelas : " + cbkelas.getSelectedItem() + newLine + "Jam keberangkatan : " +  tfjam.getText() + newLine + "Perkiraan sampai : " + tfperkiraan.getText() + newLine +  "Dewasa  : " + tfdewasa.getText() + newLine + "Anak :" + tfanak.getText() + newLine + "Berat bagasi : " + tfbagasi.getText() + " kg" + newLine + "Sub Harga : " + tftotal.getText()

        );
        konfirmasi.setEditable(false);
        headerbayar1.setForeground(Color.BLUE);
        headerbayar.setFont(fbheader);
        headerbayar1.setFont(fbheader1);
        pembayaranframe3.getContentPane();
        headerbayar.setBounds(140,30,600,50);
        headerbayar1.setBounds(120,90,700,50);
        konfirmasi.setBounds(50,160,470,330);
        pembayaranframe3.setLayout(new FlowLayout());
        pembayaranframe3.setVisible(true);
        pembayaranframe3.setLayout(null);
        pembayaranframe3.add(pembayarancontainer);
        pembayaranframe3.add(konfirmasi);
        pembayarancontainer.add(headerbayar);
        pembayarancontainer.add(headerbayar1);
        pembayarancontainer.show();
        Font konfont = new Font("Arial",Font.PLAIN,18);
        konfirmasi.setFont(konfont);
        buttonbackform3 = new JButton("Back");
        buttonextbayar3 = new JButton("Next");
        buttonbackform3.setBounds(150,530,100,50);
        buttonextbayar3.setBounds(300,530,100,50);
        buttonbackform3.addActionListener(this);
        buttonextbayar3.addActionListener(this);
        pembayarancontainer.add(buttonbackform3);
        pembayarancontainer.add(buttonextbayar3);
    }

    public  void pay() {
        payframe = new JFrame();
        payframe.setTitle("Pembayaran tiket");
        paycontainer= new Container();
        payframe.setSize(600,600);
        paycontainer.setSize(600,600);
        payframe.setLocation(100,100);
        labelpembayaran = new JLabel("Pembayaran");
        labelpembayaran.setBounds(200,30,600,50);
        Font bfont = new Font("Times New Roman",Font.BOLD,35);
        labelpembayaran.setFont(bfont);
        labelharga = new JLabel("Sub Harga");
        labelpajak = new JLabel("Pajak");
        labelharga.setBounds(30,120,400,50);
        labelpajak.setBounds(30,160,400,50);
        tftotal = new JTextField();
        tfdiskon = new JTextField();
        tftotal.setEditable(false);
        tfpajak = new JTextField();
        tfpajak.setEditable(false);
        tftotal.setText(String.valueOf(total));
        labeldiskon = new JLabel("Diskon");
        pajak = (total*5) / 100;;
        labelgrand = new JLabel("Grand Total");
        tfgrand = new JTextField();
        tfgrand.setEditable(false);
        tftotal.setBounds(160,135,100,20);
        tfpajak.setBounds(160,175,100,20);
        labeldiskon.setBounds(30,200,400,50);
        labelgrand.setBounds(30,240,400,50);
        tfdiskon.setBounds(160,215,100,20);
        tfgrand.setBounds(160,255,100,20);
        tfdiskon.setEditable(false);
        payframe.getContentPane();
        payframe.setLayout(new FlowLayout());
        payframe.setVisible(true);
        payframe.setLayout(null);
        payframe.add(paycontainer);
        paycontainer.add(labelharga);
        paycontainer.add(tftotal);
        paycontainer.add(labelpajak);
        paycontainer.add(tfpajak);
        paycontainer.add(labelpembayaran);
        paycontainer.add(labeldiskon);
        paycontainer.add(tfdiskon);
        paycontainer.add(labelgrand);
        paycontainer.add(tfgrand);
        tfgrand.setForeground(Color.RED);
        paycontainer.show();
        c = this.formatRp(total);
        d = this.formatRp(pajak);
        tfpajak.setText(d);
        tftotal.setText(c);
        diskon();
        divider1 = new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        divider1.setBounds(0,300,2000,20);
        paycontainer.add(divider1);
        inputuang();
    }

    public  void pay2() {
        payframe2 = new JFrame();
        payframe2.setTitle("Pembayaran tiket");
        paycontainer= new Container();
        payframe2.setSize(600,600);
        paycontainer.setSize(600,600);
        payframe2.setLocation(100,100);
        labelpembayaran = new JLabel("Pembayaran");
        labelpembayaran.setBounds(200,30,600,50);
        Font bfont = new Font("Times New Roman",Font.BOLD,35);
        labelpembayaran.setFont(bfont);
        labelharga = new JLabel("Sub Harga");
        labelpajak = new JLabel("Pajak");
        labelharga.setBounds(30,120,400,50);
        labelpajak.setBounds(30,160,400,50);
        tftotal = new JTextField();
        tfdiskon = new JTextField();
        tftotal.setEditable(false);
        tfpajak = new JTextField();
        tfpajak.setEditable(false);
        tftotal.setText(String.valueOf(total));
        pajak = (total*5) / 100;
        labeldiskon = new JLabel("Diskon");
        labelgrand = new JLabel("Grand Total");
        tfgrand = new JTextField();
        tfgrand.setEditable(false);
        tftotal.setBounds(160,135,100,20);
        tfpajak.setBounds(160,175,100,20);
        labeldiskon.setBounds(30,200,400,50);
        labelgrand.setBounds(30,240,400,50);
        tfdiskon.setBounds(160,215,100,20);
        tfgrand.setBounds(160,255,100,20);
        tfdiskon.setEditable(false);
        payframe2.getContentPane();
        payframe2.setLayout(new FlowLayout());
        payframe2.setVisible(true);
        payframe2.setLayout(null);
        payframe2.add(paycontainer);
        paycontainer.add(labelharga);
        paycontainer.add(tftotal);
        paycontainer.add(labelpajak);
        paycontainer.add(tfpajak);
        paycontainer.add(labelpembayaran);
        paycontainer.add(labeldiskon);
        paycontainer.add(tfdiskon);
        paycontainer.add(labelgrand);
        paycontainer.add(tfgrand);
        tfgrand.setForeground(Color.RED);
        paycontainer.show();
        c = this.formatRp(total);
        d = this.formatRp(pajak);
        tfpajak.setText(d);
        tftotal.setText(c);
        diskon();
        divider1 = new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        divider1.setBounds(0,300,2000,20);
        paycontainer.add(divider1);
        inputuang2();
    }

    public  void pay3() {
        payframe = new JFrame();
        payframe.setTitle("Pembayaran tiket");
        paycontainer= new Container();
        payframe.setSize(600,600);
        paycontainer.setSize(600,600);
        payframe.setLocation(100,100);
        labelpembayaran = new JLabel("Pembayaran");
        labelpembayaran.setBounds(200,30,600,50);
        Font bfont = new Font("Times New Roman",Font.BOLD,35);
        labelpembayaran.setFont(bfont);
        labelharga = new JLabel("Sub Harga");
        labelpajak = new JLabel("Pajak");
        labelharga.setBounds(30,120,400,50);
        labelpajak.setBounds(30,160,400,50);
        tftotal = new JTextField();
        tfdiskon = new JTextField();
        tftotal.setEditable(false);
        tfpajak = new JTextField();
        tfpajak.setEditable(false);
        tftotal.setText(String.valueOf(total));
        pajak = (total*10) / 100;
        labeldiskon = new JLabel("Diskon");
        labelgrand = new JLabel("Grand Total");
        tfgrand = new JTextField();
        tfgrand.setEditable(false);
        tftotal.setBounds(160,135,100,20);
        tfpajak.setBounds(160,175,100,20);
        labeldiskon.setBounds(30,200,400,50);
        labelgrand.setBounds(30,240,400,50);
        tfdiskon.setBounds(160,215,100,20);
        tfgrand.setBounds(160,255,100,20);
        tfdiskon.setEditable(false);
        payframe.getContentPane();
        payframe.setLayout(new FlowLayout());
        payframe.setVisible(true);
        payframe.setLayout(null);
        payframe.add(paycontainer);
        paycontainer.add(labelharga);
        paycontainer.add(tftotal);
        paycontainer.add(labelpajak);
        paycontainer.add(tfpajak);
        paycontainer.add(labelpembayaran);
        paycontainer.add(labeldiskon);
        paycontainer.add(tfdiskon);
        paycontainer.add(labelgrand);
        paycontainer.add(tfgrand);
        tfgrand.setForeground(Color.RED);
        paycontainer.show();
        c = this.formatRp(total);
        d = this.formatRp(pajak);
        tfpajak.setText(d);
        tftotal.setText(c);
        diskon();
        divider1 = new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        divider1.setBounds(0,300,2000,20);
        paycontainer.add(divider1);
        inputuang3();
    }

    //Diskon
    public void diskon() {
        if(total <= 500000) {
            diskon = (15 * total) / 100;
            tfdiskon.setText(String.valueOf(diskon));
            grand = total + pajak - diskon;
            tfgrand.setText(String.valueOf(grand));
            e = this.formatRp(diskon);
            f = this.formatRp(grand);
            tfdiskon.setText(e);
            tfgrand.setText(f);
        }

        else if(total <= 1000000) {
            diskon = (20 * total) / 100;
            tfdiskon.setText(String.valueOf(diskon));
            grand = total + pajak - diskon;
            tfgrand.setText(String.valueOf(grand));
            e = this.formatRp(diskon);
            f = this.formatRp(grand);
            tfdiskon.setText(e);
            tfgrand.setText(f);
        }

        else if (total <= 5000000) {
            diskon = (25 * total) / 100;
            tfdiskon.setText(String.valueOf(diskon));
            grand = total + pajak - diskon;
            tfgrand.setText(String.valueOf(grand));
            e = this.formatRp(diskon);
            f = this.formatRp(grand);
            tfdiskon.setText(e);
            tfgrand.setText(f);
        }

        else if (total > 5000000) {
            diskon = (30*total) / 100;
            tfdiskon.setText(String.valueOf(diskon));
            grand = total + pajak - diskon;
            tfgrand.setText(String.valueOf(grand));
            e = this.formatRp(diskon);
            f = this.formatRp(grand);
            tfdiskon.setText(e);
            tfgrand.setText(f);
        }
    }

    public  void  inputuang() {
        labeluang = new JLabel("Masukan uang");
        tfuang = new JTextField();
        labelstatus = new JLabel();
        buttonconfirm1 = new JButton("Back");
        buttonsubmitpay = new JButton("Submit");
        buttonnextfin = new JButton("Next");
        labelkembalian = new JLabel("Kembalian");
        tfkembalian = new JTextField();
        tfkembalian.setEditable(false);
        labeluang.setBounds(30,320,400,50);
        tfuang.setBounds(160,335,100,20);
        labelstatus.setBounds(270,335,250,20);
        buttonconfirm1.setBounds(100,440,100,50);
        buttonsubmitpay.setBounds(250,440,100,50);
        buttonnextfin.setBounds(400,440,100,50);
        labelkembalian.setBounds(30,360,100,50);
        tfkembalian.setBounds(160,375,100,20);
        paycontainer.add(labeluang);
        paycontainer.add(tfuang);
        paycontainer.add(labelstatus);
        paycontainer.add(buttonconfirm1);
        paycontainer.add(buttonsubmitpay);
        paycontainer.add(buttonnextfin);
        paycontainer.add(labelkembalian);
        paycontainer.add(tfkembalian);
        buttonsubmitpay.addActionListener(this);
        buttonnextfin.addActionListener(this);
        buttonconfirm1.addActionListener(this);
        paycontainer.add(labeluang);
        paycontainer.add(tfuang);
        buttonnextfin.setEnabled(false);
    }

    public  void  inputuang2() {
        labeluang = new JLabel("Masukan uang");
        tfuang = new JTextField();
        labelstatus = new JLabel();
        buttomsubmitpay2 = new JButton("Submit");
        buttonnextfin2 = new JButton("Next");
        labelkembalian = new JLabel("Kembalian");
        tfkembalian = new JTextField();
        tfkembalian.setEditable(false);
        labeluang.setBounds(30,320,400,50);
        tfuang.setBounds(160,335,100,20);
        labelstatus.setBounds(270,335,150,20);
        buttomsubmitpay2.setBounds(150,440,100,50);
        buttonnextfin2.setBounds(300,440,100,50);
        labelkembalian.setBounds(30,360,100,50);
        tfkembalian.setBounds(160,375,100,20);
        paycontainer.add(labeluang);
        paycontainer.add(tfuang);
        paycontainer.add(labelstatus);
        paycontainer.add(buttomsubmitpay2);
        paycontainer.add(buttonnextfin2);
        paycontainer.add(labelkembalian);
        paycontainer.add(tfkembalian);
        buttomsubmitpay2.addActionListener(this);
        buttonnextfin2.addActionListener(this);
        paycontainer.add(labeluang);
        paycontainer.add(tfuang);
        buttonnextfin2.setEnabled(false);
    }

    public  void  inputuang3() {
        labeluang = new JLabel("Masukan uang");
        tfuang = new JTextField();
        labelstatus = new JLabel();
        buttonconfirm2 = new JButton("Back");
        buttonsubmitpay = new JButton("Submit");
        buttonnextfin = new JButton("Next");
        labelkembalian = new JLabel("Kembalian");
        tfkembalian = new JTextField();
        tfkembalian.setEditable(false);
        labeluang.setBounds(30,320,400,50);
        tfuang.setBounds(160,335,100,20);
        labelstatus.setBounds(270,335,250,20);
        buttonconfirm2.setBounds(100,440,100,50);
        buttonsubmitpay.setBounds(250,440,100,50);
        buttonnextfin.setBounds(400,440,100,50);
        labelkembalian.setBounds(30,360,100,50);
        tfkembalian.setBounds(160,375,100,20);
        paycontainer.add(labeluang);
        paycontainer.add(tfuang);
        paycontainer.add(labelstatus);
        paycontainer.add(buttonconfirm2);
        paycontainer.add(buttonsubmitpay);
        paycontainer.add(buttonnextfin);
        paycontainer.add(labelkembalian);
        paycontainer.add(tfkembalian);
        buttonsubmitpay.addActionListener(this);
        buttonnextfin.addActionListener(this);
        buttonconfirm2.addActionListener(this);
        paycontainer.add(labeluang);
        paycontainer.add(tfuang);
        buttonnextfin.setEnabled(false);
    }

    public void pesawat() {
        pesawatframe = new JFrame();
        pesawatframe.setTitle("Pembelian tiket pesawat");
        pesawatcontainer= new Container();
        pesawatframe.setSize(750,650);
        pesawatcontainer.setSize(750,650);
        pesawatframe.setLocation(100,100);
        pesawatframe.getContentPane();
        pesawatframe.setLayout(new FlowLayout());
        pesawatframe.setVisible(true);
        pesawatframe.setLayout(null);
        pesawatframe.add(pesawatcontainer);
        pesawatcontainer.show();
        formpesawat();
    }

    public void bus() {
        busframe = new JFrame();
        buscontainer= new Container();
        busframe.setTitle("Pembelian tiket bus");
        busframe.setLayout(new FlowLayout());
        busframe.setVisible(true);
        busframe.setSize(600,600);
        buscontainer.setSize(600,600);
        busframe.getContentPane();
        busframe.setLocation(100,100);
        busframe.setLayout(new FlowLayout());
        busframe.setVisible(true);
        busframe.setLayout(null);
        busframe.add(buscontainer);
        buscontainer.show();
        formbus();
    }

    public void formbus() {
        JLabel judulbus = new JLabel("Tiket bus");
        JLabel headerbus = new JLabel("Silakan isi form pendaftaran");
        Font judul1 = new Font("Times New Roman",Font.BOLD,35);
        Font header1 = new Font("Times New Roman",Font.ITALIC,25);
        headerbus.setForeground(Color.BLUE);
        judulbus.setBounds(200,5,400,50);
        headerbus.setBounds(155,50,400,50);
        labelnama = new JLabel("Nama Pembeli");
        labelkode = new JLabel("Kode Bus");
        labelasal = new JLabel("Kota Asal");
        labeltujuan = new JLabel("Kota Tujuan");
        labelkelas = new JLabel("Kelas");
        labeljam = new JLabel("Jam");
        labelkursi =  new JLabel("Jumlah kursi");
        labelperkiraan = new JLabel("Perkiraan sampai");
        labelhargakursi = new JLabel("Harga Kursi");
        labelemail = new JLabel("Email");
        labelhp = new JLabel("No HP");
        labelharga = new JLabel("Sub Harga");
        tftotal = new JTextField();
        tftotal.setEditable(false);
        buscontainer.add(labelnama);
        tftotal.setForeground(Color.RED);
        labelnama.setBounds(30,112,400,50);
        labelkode.setBounds(320,112,400,50);
        labelasal.setBounds(30,155,400,50);
        labeltujuan.setBounds(320,155,400,50);
        labelkelas.setBounds(30,198,400,50);
        labeljam.setBounds(320,198,400,50);
        labelkursi.setBounds(30,240,400,50);
        labelperkiraan.setBounds(320,240,400,50);
        labelhargakursi.setBounds(320,290,400,50);;
        labelharga.setBounds(30,410,400,50);
        tftotal.setBounds(320,425,100,20);
        judulbus.setFont(judul1);
        headerbus.setFont(header1);
        String [] kode = {"","BUS01", "BUS02"};
        String [] tujuan = {"","Jakarta","Surabaya", "Yogya", "Bali"};
        String [] kelas = {"","Regular", "Premium"};
        cbKode = new JComboBox<>(kode);
        cbKode.setSelectedIndex(0);
        tfasal = new JTextField("Bandung");
        tfasal.setEditable(false);
        cbtujuan = new JComboBox<>(tujuan);
        cbtujuan.setSelectedIndex(0);
        cbkelas = new JComboBox<>(kelas);
        cbkelas.setSelectedIndex(0);
        buscontainer.add(judulbus);
        buscontainer.add(labelkode);
        buscontainer.add(labelasal);
        buscontainer.add(labeltujuan);
        buscontainer.add(labelkelas);
        buscontainer.add(labeljam);
        buscontainer.add(labelkursi);
        buscontainer.add(labelperkiraan);
        buscontainer.add(labelharga);
        buscontainer.add(labelhargakursi);
        buscontainer.add(headerbus);
        tfperkiraan = new JTextField();
        tfNama = new JTextField();
        tfjam = new JTextField();
        tfkursi = new JTextField();
        tfemail = new JTextField();
        tfhp = new JTextField();
        tfharagakursi = new JTextField();
        tfharagakursi.setEditable(false);
        Font nama = new Font("Arial",Font.PLAIN,15);
        tfNama.setFont(nama);
        tfNama.setBounds(130,128,125,20);
        cbKode.setBounds(435,128,125,20);
        tfasal.setBounds(130,170,125,20);
        cbtujuan.setBounds(435,170,125,20);
        cbkelas.setBounds(130,212,125,20);
        tfjam.setBounds(435,212,100,20);
        tfkursi.setBounds(130,260,40,20);
        tfperkiraan.setBounds(435,260,100,20);
        labelemail.setBounds(30,295,400,50);
        labelhp.setBounds(30,345,400,50);
        tfemail.setBounds(130,310,125,20);
        tfhp.setBounds(130,360,125,20);
        tfharagakursi.setBounds(435,310,100,20);
        buscontainer.add(tfNama);
        buscontainer.add(tfharagakursi);
        buscontainer.add(cbKode);
        buscontainer.add(tfasal);
        buscontainer.add(cbtujuan);
        buscontainer.add(cbkelas);
        buscontainer.add(tfjam);
        buscontainer.add(tfkursi);
        buscontainer.add(tfperkiraan);
        buscontainer.add(tftotal);
        tfjam.setEditable(false);
        tfperkiraan.setEditable(false);
        divider = new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        divider.setBounds(0,400,2000,20);
        buscontainer.add(divider);
        divider2 = new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        divider2.setBounds(0,450,2000,20);
        buscontainer.add(labelemail);
        buscontainer.add(divider2);
        buscontainer.add(labelhp);
        buscontainer.add(tfemail);
        buscontainer.add(tfhp);
        buttonback3 = new JButton("Back");
        buttonback3.addActionListener(this);
        buttonback3.setBounds(120,490,100,50);
        buscontainer.add(buttonback3);
        buttonnext2 = new JButton("Next");
        buttonnext2.addActionListener(this);
        buttonnext2.setBounds(380,490,100,50);
        buttonnext2.setEnabled(false);
        buscontainer.add(buttonnext2);
        buttonsubmit2 = new JButton("Submit");
        buttonsubmit2.setBounds(250,490,100,50);
        buscontainer.add(buttonsubmit2);
        buttonsubmit2.addActionListener(this);
        busframe.add(buscontainer);
        buscontainer.show();
        submitbus();
    }

    public void submitbus() {
        if (cbKode.getSelectedItem() == "BUS01" && cbtujuan.getSelectedItem() == "Jakarta" && cbkelas.getSelectedItem() == "Regular") {
            tfjam.setText("08.00");
            tfperkiraan.setText("10.30");
            tfharagakursi.setText("20000");
            hkursi = Integer.parseInt(tfharagakursi.getText());
            kursi = Integer.parseInt(tfkursi.getText());
            total = hkursi * kursi;
            tftotal.setText(String.valueOf(total));
            h = this.formatRp(hkursi);
            c = this.formatRp(total);
            tfharagakursi.setText(h);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "BUS02" && cbtujuan.getSelectedItem() == "Jakarta" && cbkelas.getSelectedItem() == "Regular") {
            tfjam.setText("08.30");
            tfperkiraan.setText("11.00");
            tfharagakursi.setText("20000");
            hkursi = Integer.parseInt(tfharagakursi.getText());
            kursi = Integer.parseInt(tfkursi.getText());
            total = hkursi * kursi;
            tftotal.setText(String.valueOf(total));
            h = this.formatRp(hkursi);
            c = this.formatRp(total);
            tfharagakursi.setText(h);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "BUS01" && cbtujuan.getSelectedItem() == "Jakarta" && cbkelas.getSelectedItem() == "Premium") {
            tfjam.setText("11.00");
            tfperkiraan.setText("13.30");
            tfharagakursi.setText("25000");
            hkursi = Integer.parseInt(tfharagakursi.getText());
            kursi = Integer.parseInt(tfkursi.getText());
            total = hkursi * kursi;
            tftotal.setText(String.valueOf(total));
            h = this.formatRp(hkursi);
            c = this.formatRp(total);
            tfharagakursi.setText(h);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "BUS02" && cbtujuan.getSelectedItem() == "Jakarta" && cbkelas.getSelectedItem() == "Premium") {
            tfjam.setText("11.30");
            tfperkiraan.setText("14.00");
            tfharagakursi.setText("25000");
            hkursi = Integer.parseInt(tfharagakursi.getText());
            kursi = Integer.parseInt(tfkursi.getText());
            total = hkursi * kursi;
            tftotal.setText(String.valueOf(total));
            h = this.formatRp(hkursi);
            c = this.formatRp(total);
            tfharagakursi.setText(h);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "BUS01" && cbtujuan.getSelectedItem() == "Bali" && cbkelas.getSelectedItem() == "Regular") {
            tfjam.setText("02.00");
            tfperkiraan.setText("20.00");
            tfharagakursi.setText("80000");
            hkursi = Integer.parseInt(tfharagakursi.getText());
            kursi = Integer.parseInt(tfkursi.getText());
            total = hkursi * kursi;
            tftotal.setText(String.valueOf(total));
            h = this.formatRp(hkursi);
            c = this.formatRp(total);
            tfharagakursi.setText(h);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "BUS02" && cbtujuan.getSelectedItem() == "Bali" && cbkelas.getSelectedItem() == "Regular") {
            tfjam.setText("02.30");
            tfperkiraan.setText("20.30");
            tfharagakursi.setText("80000");
            hkursi = Integer.parseInt(tfharagakursi.getText());
            kursi = Integer.parseInt(tfkursi.getText());
            total = hkursi * kursi;
            tftotal.setText(String.valueOf(total));
            h = this.formatRp(hkursi);
            c = this.formatRp(total);
            tfharagakursi.setText(h);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "BUS01" && cbtujuan.getSelectedItem() == "Bali" && cbkelas.getSelectedItem() == "Premium") {
            tfjam.setText("03.00");
            tfperkiraan.setText("21.00");
            tfharagakursi.setText("90000");
            hkursi = Integer.parseInt(tfharagakursi.getText());
            kursi = Integer.parseInt(tfkursi.getText());
            total = hkursi * kursi;
            tftotal.setText(String.valueOf(total));
            h = this.formatRp(hkursi);
            c = this.formatRp(total);
            tfharagakursi.setText(h);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "BUS02" && cbtujuan.getSelectedItem() == "Bali" && cbkelas.getSelectedItem() == "Premium") {
            tfjam.setText("03.30");
            tfperkiraan.setText("21.30");
            tfharagakursi.setText("90000");
            hkursi = Integer.parseInt(tfharagakursi.getText());
            kursi = Integer.parseInt(tfkursi.getText());
            total = hkursi * kursi;
            tftotal.setText(String.valueOf(total));
            h = this.formatRp(hkursi);
            c = this.formatRp(total);
            tfharagakursi.setText(h);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "BUS01" &&  cbtujuan.getSelectedItem() == "Yogya" && cbkelas.getSelectedItem() == "Regular") {
            tfjam.setText("06.00");
            tfperkiraan.setText("16.00");
            tfharagakursi.setText("50000");
            hkursi = Integer.parseInt(tfharagakursi.getText());
            kursi = Integer.parseInt(tfkursi.getText());
            total = hkursi * kursi;
            tftotal.setText(String.valueOf(total));
            h = this.formatRp(hkursi);
            c = this.formatRp(total);
            tfharagakursi.setText(h);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "BUS02" &&  cbtujuan.getSelectedItem() == "Yogya" && cbkelas.getSelectedItem() == "Regular") {
            tfjam.setText("07.00");
            tfperkiraan.setText("17.00");
            tfharagakursi.setText("50000");
            hkursi = Integer.parseInt(tfharagakursi.getText());
            kursi = Integer.parseInt(tfkursi.getText());
            total = hkursi * kursi;
            tftotal.setText(String.valueOf(total));
            h = this.formatRp(hkursi);
            c = this.formatRp(total);
            tfharagakursi.setText(h);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "BUS01" &&  cbtujuan.getSelectedItem() == "Yogya" && cbkelas.getSelectedItem() == "Premium") {
            tfjam.setText("08.00");
            tfperkiraan.setText("18.00");
            tfharagakursi.setText("60000");
            hkursi = Integer.parseInt(tfharagakursi.getText());
            kursi = Integer.parseInt(tfkursi.getText());
            total = hkursi * kursi;
            tftotal.setText(String.valueOf(total));
            h = this.formatRp(hkursi);
            c = this.formatRp(total);
            tfharagakursi.setText(h);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "BUS02" &&  cbtujuan.getSelectedItem() == "Yogya" && cbkelas.getSelectedItem() == "Premium") {
            tfjam.setText("09.00");
            tfperkiraan.setText("19.00");
            tfharagakursi.setText("60000");
            hkursi = Integer.parseInt(tfharagakursi.getText());
            kursi = Integer.parseInt(tfkursi.getText());
            total = hkursi * kursi;
            tftotal.setText(String.valueOf(total));
            h = this.formatRp(hkursi);
            c = this.formatRp(total);
            tfharagakursi.setText(h);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "BUS01" && cbtujuan.getSelectedItem() == "Surabaya" && cbkelas.getSelectedItem() == "Regular") {
            tfjam.setText("12.00");
            tfperkiraan.setText("00.00");
            tfharagakursi.setText("45000");
            hkursi = Integer.parseInt(tfharagakursi.getText());
            kursi = Integer.parseInt(tfkursi.getText());
            total = hkursi * kursi;
            tftotal.setText(String.valueOf(total));
            h = this.formatRp(hkursi);
            c = this.formatRp(total);
            tfharagakursi.setText(h);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "BUS02"  && cbtujuan.getSelectedItem() == "Surabaya" && cbkelas.getSelectedItem() == "Regular") {
            tfjam.setText("13.00");
            tfperkiraan.setText("01.00");
            tfharagakursi.setText("45000");
            hkursi = Integer.parseInt(tfharagakursi.getText());
            kursi = Integer.parseInt(tfkursi.getText());
            total = hkursi * kursi;
            tftotal.setText(String.valueOf(total));
            h = this.formatRp(hkursi);
            c = this.formatRp(total);
            tfharagakursi.setText(h);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "BUS01"  && cbtujuan.getSelectedItem() == "Surabaya" && cbkelas.getSelectedItem() == "Premium") {
            tfjam.setText("14.00");
            tfperkiraan.setText("02.00");
            tfharagakursi.setText("50000");
            hkursi = Integer.parseInt(tfharagakursi.getText());
            kursi = Integer.parseInt(tfkursi.getText());
            total = hkursi * kursi;
            tftotal.setText(String.valueOf(total));
            h = this.formatRp(hkursi);
            c = this.formatRp(total);
            tfharagakursi.setText(h);
            tftotal.setText(c);
        }

        else if (cbKode.getSelectedItem() == "BUS02" && cbtujuan.getSelectedItem() == "Surabaya" && cbkelas.getSelectedItem() == "Premium") {
            tfjam.setText("15.00");
            tfperkiraan.setText("03.00");
            tfharagakursi.setText("50000");
            hkursi = Integer.parseInt(tfharagakursi.getText());
            kursi = Integer.parseInt(tfkursi.getText());
            total = hkursi * kursi;
            tftotal.setText(String.valueOf(total));
            h = this.formatRp(hkursi);
            c = this.formatRp(total);
            tfharagakursi.setText(h);
            tftotal.setText(c);
        }
    }

    public void thankyou() {;
        tyframe = new JFrame();
        tyframe.setTitle("End of the form");
        tycontainer= new Container();
        buttonhome = new JButton("Home");
        buttonexit = new JButton("Exit");
        Icon icon4 = new ImageIcon("thankyou.jpg");
        typic = new JLabel(icon4);
        ty2 = new JLabel("Have a nice trip ahead !");
        tyframe.setSize(600,600);
        Font fty2 = new Font("Times New Roman",Font.BOLD,25);
        ty2.setFont(fty2);
        tycontainer.setSize(600,600);
        typic.setBounds(40,35,500,300);
        ty2.setBounds(155,350,500,50);
        buttonexit.setBounds(75,420,200,50);
        buttonhome.setBounds(300,420,200,50);
        tyframe.setLocation(100,100);
        tyframe.getContentPane();
        tyframe.setLayout(new FlowLayout());
        tyframe.setVisible(true);
        tyframe.setLayout(null);
        tyframe.add(typic);
        tyframe.add(tycontainer);
        tyframe.add(ty2);
        tyframe.add(buttonhome);
        tyframe.add(buttonexit);
        buttonhome.addActionListener(this);
        buttonexit.addActionListener(this);
        tycontainer.show();
    }

    public void formpesawat() {
        JLabel judulpesawat = new JLabel("Tiket Pesawat");
        JLabel headerpesawat = new JLabel("Silakan isi form pendaftaran");
        Font judul1 = new Font("Times New Roman",Font.BOLD,35);
        Font header1 = new Font("Times New Roman",Font.ITALIC,25);
        headerpesawat.setForeground(Color.BLUE);
        judulpesawat.setBounds(240,5,400,50);
        headerpesawat.setBounds(200,50,400,50);
        labelnama = new JLabel("Nama Pembeli");
        labeljenis = new JLabel("Jenis Penerbangan");
        pesawatcontainer.add(labelnama);
        labelnama.setBounds(30,112,400,50);
        labeljenis.setBounds(320,112,400,50);
        judulpesawat.setFont(judul1);
        headerpesawat.setFont(header1);
        String [] jenis = {"","Domestik","Internasional"};
        cbJenis = new JComboBox<>(jenis);
        cbJenis.setSelectedIndex(0);
        buttonsubmitjenis = new JButton("Submit");
        pesawatcontainer.add(judulpesawat);
        pesawatcontainer.add(labeljenis);
        pesawatcontainer.add(headerpesawat);
        tfperkiraan = new JTextField();
        tfNama = new JTextField();
        tfjam = new JTextField();
        tfdewasa = new JTextField();
        tfanak = new JTextField();
        tfemail = new JTextField();
        tfhp = new JTextField();
        tfhd = new JTextField();
        tfha = new JTextField();
        tfhd.setEditable(false);
        tfha.setEditable(false);
        Font nama = new Font("Arial",Font.PLAIN,15);
        tfNama.setFont(nama);
        tfNama.setBounds(130,128,125,20);
        cbJenis.setBounds(450,128,125,20);
        buttonsubmitjenis.setBounds(600,128,80,20);
        pesawatcontainer.add(tfNama);
        pesawatcontainer.add(cbJenis);
        pesawatcontainer.add(buttonsubmitjenis);
        buttonsubmitjenis.addActionListener(this);
        buttonback2 = new JButton("Back");
        buttonback2.addActionListener(this);
        buttonback2.setBounds(150,540,100,50);
        pesawatcontainer.add(buttonback2);
        buttonnext3 = new JButton("Next");
        buttonnext3.addActionListener(this);
        buttonnext3.setBounds(450,540,100,50);
        pesawatcontainer.add(buttonnext3);
        buttonsubmit3 = new JButton("Submit");
        buttonsubmit3.setBounds(300,540,100,50);
        pesawatcontainer.add(buttonsubmit3);
        buttonsubmit3.addActionListener(this);
        buttonnext3.setEnabled(false);
    }

    public void domestik() {
        labelmaskapai = new JLabel("Maskapai");
        labelkelas = new JLabel("Kelas");
        labelmaskapai.setBounds(30,170,80,20);
        cbmaskapai = new JComboBox<>(maskapaid);
        String [] kelas = {"","Ekonomi", "First Class"};
        String [] tujuan = {"","Jakarta", "Bali","Medan","Makasar"};
        cbkelas = new JComboBox<>(kelas);
        cbtujuan = new JComboBox<>(tujuan);
        cbmaskapai.setBounds(130,170,125,20);
        labelkelas.setBounds(320,170,80,20);
        cbkelas.setBounds(450,170,125,20);
        cbtujuan.setBounds(450,220,125,20);
        pesawatcontainer.add(labelmaskapai);
        pesawatcontainer.add(cbmaskapai);
        pesawatcontainer.add(labelkelas);
        pesawatcontainer.add(cbkelas);
        labelasal = new JLabel("Kota asal");
        tfasal = new JTextField("Bandung");
        labeltujuan = new JLabel("Tujuan");
        labeljam = new JLabel("Jam");
        tfjam = new JTextField();
        labelperkiraan = new JLabel("Perkiraan sampai");
        tfperkiraan = new JTextField();
        labelasal.setBounds(30,220,80,20);
        labeljam.setBounds(30,270,80,20);
        tfjam.setBounds(130,270,125,20);
        tfasal.setBounds(130,220,125,20);
        labeltujuan.setBounds(320,220,80,20);
        labelperkiraan.setBounds(320,270,100,20);
        tfperkiraan.setBounds(450,270,125,20);
        tfdewasa.setBounds(110,320,40,20);
        tfanak.setBounds(230,320,40,20);
        labelbagasi = new JLabel("Bagasi");
        tfbagasi = new JTextField();
        labelbagasi.setBounds(320,320,100,20);
        tfbagasi.setBounds(450,320,40,20);
        labeldewasa = new JLabel("Dewasa");
        labelanak = new JLabel("Anak");
        labelemail = new JLabel("Email");
        tfemail = new JTextField();
        labelhargad = new JLabel("Harga dewasa");
        tfhd = new JTextField();
        labelhp = new JLabel("Handphone");
        tfhp = new JTextField();
        labelhargaa = new JLabel("Harga anak");
        tfha = new JTextField();
        labeldewasa.setBounds(30,302,400,50);
        labelanak.setBounds(190,302,400,50);
        labelemail.setBounds(30,370,80,20);
        tfemail.setBounds(130,370,125,20);
        labelhargad.setBounds(320,370,80,20);
        labelhargaa.setBounds(320,420,80,20);
        tfhd.setBounds(450,370,125,20);
        tfha.setBounds(450,420,125,20);
        labelhp.setBounds(30,420,80,20);
        tfhp.setBounds(130,420,125,20);
        tfasal.setEditable(false);
        pesawatcontainer.add(labelasal);
        pesawatcontainer.add(tfasal);
        pesawatcontainer.add(labeltujuan);
        pesawatcontainer.add(cbtujuan);
        pesawatcontainer.add(labeljam);
        pesawatcontainer.add(tfjam);
        pesawatcontainer.add(labelperkiraan);
        pesawatcontainer.add(tfperkiraan);
        pesawatcontainer.add(labeldewasa);
        pesawatcontainer.add(labelanak);
        pesawatcontainer.add(tfdewasa);
        pesawatcontainer.add(tfanak);
        pesawatcontainer.add(labelbagasi);
        pesawatcontainer.add(tfbagasi);
        pesawatcontainer.add(labelemail);
        pesawatcontainer.add(tfemail);
        pesawatcontainer.add(tfhd);
        pesawatcontainer.add(labelhargad);
        pesawatcontainer.add(tfhp);
        pesawatcontainer.add(labelhp);
        pesawatcontainer.add(tfha);
        pesawatcontainer.add(labelhargaa);
        tfjam.setEditable(false);
        tfperkiraan.setEditable(false);
        tfhd.setEditable(false);
        tfha.setEditable(false);
        divider = new JLabel("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        divider.setBounds(0,458,3000,20);
        pesawatcontainer.add(divider);
        labelharga = new JLabel("Sub total");
        tftotal = new JTextField();
        labelharga.setBounds(30,468,400,50);
        pesawatcontainer.add(labelharga);
        tftotal.setBounds(240,485,150,20);
        pesawatcontainer.add(tftotal);
        divider2 = new JLabel("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        divider2.setBounds(0,510,3000,20);
        pesawatcontainer.add(divider2);
        tftotal.setEditable(false);
    }

    public void internasional() {
        labelmaskapai = new JLabel("Maskapai");
        labelkelas = new JLabel("Kelas");
        labelmaskapai.setBounds(30,170,80,20);
        cbmaskapai = new JComboBox<>(maskapaii);
        String [] kelas = {"","Ekonomi", "First Class"};
        String [] tujuan = {"","Singapore", "Seoul","Tokyo","Bangkok"};
        cbkelas = new JComboBox<>(kelas);
        cbtujuan = new JComboBox<>(tujuan);
        cbmaskapai.setBounds(130,170,125,20);
        labelkelas.setBounds(320,170,80,20);
        cbkelas.setBounds(450,170,125,20);
        cbtujuan.setBounds(450,220,125,20);
        pesawatcontainer.add(labelmaskapai);
        pesawatcontainer.add(cbmaskapai);
        pesawatcontainer.add(labelkelas);
        pesawatcontainer.add(cbkelas);
        labelasal = new JLabel("Kota asal");
        tfasal = new JTextField("Bandung");
        labeltujuan = new JLabel("Tujuan");
        labeljam = new JLabel("Jam");
        tfjam = new JTextField();
        labelperkiraan = new JLabel("Perkiraan sampai");
        tfperkiraan = new JTextField();
        labelasal.setBounds(30,220,80,20);
        labeljam.setBounds(30,270,80,20);
        tfjam.setBounds(130,270,125,20);
        tfasal.setBounds(130,220,125,20);
        labeltujuan.setBounds(320,220,80,20);
        labelperkiraan.setBounds(320,270,100,20);
        tfperkiraan.setBounds(450,270,125,20);
        tfdewasa.setBounds(110,320,40,20);
        tfanak.setBounds(230,320,40,20);
        labelbagasi = new JLabel("Bagasi");
        tfbagasi = new JTextField();
        labelbagasi.setBounds(320,320,100,20);
        tfbagasi.setBounds(450,320,40,20);
        labeldewasa = new JLabel("Dewasa");
        labelanak = new JLabel("Anak");
        labelemail = new JLabel("Email");
        tfemail = new JTextField();
        labelhargad = new JLabel("Harga dewasa");
        tfhd = new JTextField();
        labelhp = new JLabel("Handphone");
        tfhp = new JTextField();
        labelhargaa = new JLabel("Harga anak");
        tfha = new JTextField();
        labeldewasa.setBounds(30,302,400,50);
        labelanak.setBounds(190,302,400,50);
        labelemail.setBounds(30,370,80,20);
        tfemail.setBounds(130,370,125,20);
        labelhargad.setBounds(320,370,80,20);
        labelhargaa.setBounds(320,420,80,20);
        tfhd.setBounds(450,370,125,20);
        tfha.setBounds(450,420,125,20);
        labelhp.setBounds(30,420,80,20);
        tfhp.setBounds(130,420,125,20);
        tfasal.setEditable(false);
        pesawatcontainer.add(labelasal);
        pesawatcontainer.add(tfasal);
        pesawatcontainer.add(labeltujuan);
        pesawatcontainer.add(cbtujuan);
        pesawatcontainer.add(labeljam);
        pesawatcontainer.add(tfjam);
        pesawatcontainer.add(labelperkiraan);
        pesawatcontainer.add(tfperkiraan);
        pesawatcontainer.add(labeldewasa);
        pesawatcontainer.add(labelanak);
        pesawatcontainer.add(tfdewasa);
        pesawatcontainer.add(tfanak);
        pesawatcontainer.add(labelbagasi);
        pesawatcontainer.add(tfbagasi);
        pesawatcontainer.add(labelemail);
        pesawatcontainer.add(tfemail);
        pesawatcontainer.add(tfhd);
        pesawatcontainer.add(labelhargad);
        pesawatcontainer.add(tfhp);
        pesawatcontainer.add(labelhp);
        pesawatcontainer.add(tfha);
        pesawatcontainer.add(labelhargaa);
        tfjam.setEditable(false);
        tfperkiraan.setEditable(false);
        tfhd.setEditable(false);
        tfha.setEditable(false);
        divider = new JLabel("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        divider.setBounds(0,458,3000,20);
        pesawatcontainer.add(divider);
        labelharga = new JLabel("Sub total");
        tftotal = new JTextField();
        labelharga.setBounds(30,468,400,50);
        pesawatcontainer.add(labelharga);
        tftotal.setBounds(240,485,150,20);
        pesawatcontainer.add(tftotal);
        divider2 = new JLabel("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        divider2.setBounds(0,510,3000,20);
        pesawatcontainer.add(divider2);
        tftotal.setEditable(false);
    }

    public void submit2() {
        if (cbJenis.getSelectedItem() == "Domestik" && cbmaskapai.getSelectedItem() == "Citylink" && cbkelas.getSelectedItem() == "Ekonomi" && cbtujuan.getSelectedItem() == "Jakarta" ) {
            tfjam.setText("10.00");
            tfperkiraan.setText("11.30");
            tfhd.setText("400000");
            tfha.setText("200000");
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Domestik" && cbmaskapai.getSelectedItem() == "Citylink" && cbkelas.getSelectedItem() == "First Class" && cbtujuan.getSelectedItem() == "Jakarta" ) {
            tfjam.setText("12.00");
            tfperkiraan.setText("13.30");
            tfhd.setText("500000");
            tfha.setText("250000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Domestik" && cbmaskapai.getSelectedItem() == "Sriwijaya Air" && cbkelas.getSelectedItem() == "Ekonomi" && cbtujuan.getSelectedItem() == "Jakarta" ) {
            tfjam.setText("15.00");
            tfperkiraan.setText("16.30");
            tfhd.setText("300000");
            tfha.setText("150000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Domestik" && cbmaskapai.getSelectedItem() == "Sriwijaya Air" && cbkelas.getSelectedItem() == "First Class" && cbtujuan.getSelectedItem() == "Jakarta" ) {
            tfjam.setText("17.00");
            tfperkiraan.setText("18.30");
            tfhd.setText("350000");
            tfha.setText("200000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Domestik" && cbmaskapai.getSelectedItem() == "Citylink" && cbkelas.getSelectedItem() == "Ekonomi" && cbtujuan.getSelectedItem() == "Bali" ) {
            tfjam.setText("15.30");
            tfperkiraan.setText("18.30");
            tfhd.setText("700000");
            tfha.setText("350000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Domestik" && cbmaskapai.getSelectedItem() == "Citylink" && cbkelas.getSelectedItem() == "First Class" && cbtujuan.getSelectedItem() == "Bali" ) {
            tfjam.setText("09.00");
            tfperkiraan.setText("12.00");
            tfhd.setText("800000");
            tfha.setText("400000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Domestik" && cbmaskapai.getSelectedItem() == "Sriwijaya Air" && cbkelas.getSelectedItem() == "Ekonomi" && cbtujuan.getSelectedItem() == "Bali" ) {
            tfjam.setText("12.00");
            tfperkiraan.setText("15.00");
            tfhd.setText("800000");
            tfha.setText("400000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Domestik" && cbmaskapai.getSelectedItem() == "Sriwijaya Air" && cbkelas.getSelectedItem() == "First Class" && cbtujuan.getSelectedItem() == "Bali" ) {
            tfjam.setText("19.00");
            tfperkiraan.setText("22.00");
            tfhd.setText("900000");
            tfha.setText("450000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Domestik" && cbmaskapai.getSelectedItem() == "Citylink" && cbkelas.getSelectedItem() == "Ekonomi" && cbtujuan.getSelectedItem() == "Medan" ) {
            tfjam.setText("05.00");
            tfperkiraan.setText("10.00");
            tfhd.setText("650000");
            tfha.setText("350000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Domestik" && cbmaskapai.getSelectedItem() == "Citylink" && cbkelas.getSelectedItem() == "First Class" && cbtujuan.getSelectedItem() == "Medan" ) {
            tfjam.setText("07.30");
            tfperkiraan.setText("12.30");
            tfhd.setText("75000");
            tfha.setText("400000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Domestik" && cbmaskapai.getSelectedItem() == "Sriwijaya Air" && cbkelas.getSelectedItem() == "Ekonomi" && cbtujuan.getSelectedItem() == "Medan" ) {
            tfjam.setText("23.00");
            tfperkiraan.setText("04.00");
            tfhd.setText("500000");
            tfha.setText("300000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Domestik" && cbmaskapai.getSelectedItem() == "Sriwijaya Air" && cbkelas.getSelectedItem() == "First Class" && cbtujuan.getSelectedItem() == "Medan" ) {
            tfjam.setText("13.00");
            tfperkiraan.setText("18.00");
            tfhd.setText("600000");
            tfha.setText("400000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Domestik" && cbmaskapai.getSelectedItem() == "Citylink" && cbkelas.getSelectedItem() == "Ekonomi" && cbtujuan.getSelectedItem() == "Makasar" ) {
            tfjam.setText("03.30");
            tfperkiraan.setText("09.30");
            tfhd.setText("800000");
            tfha.setText("400000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Domestik" && cbmaskapai.getSelectedItem() == "Citylink" && cbkelas.getSelectedItem() == "First Class" && cbtujuan.getSelectedItem() == "Makasar" ) {
            tfjam.setText("05.00");
            tfperkiraan.setText("11.00");
            tfhd.setText("900000");
            tfha.setText("450000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Domestik" && cbmaskapai.getSelectedItem() == "Sriwijaya Air" && cbkelas.getSelectedItem() == "Ekonomi" && cbtujuan.getSelectedItem() == "Makasar" ) {
            tfjam.setText("00.15");
            tfperkiraan.setText("06.15");
            tfhd.setText("850000");
            tfha.setText("350000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Domestik" && cbmaskapai.getSelectedItem() == "Sriwijaya Air" && cbkelas.getSelectedItem() == "First Class" && cbtujuan.getSelectedItem() == "Makasar" ) {
            tfjam.setText("13.00");
            tfperkiraan.setText("19.00");
            tfhd.setText("950000");
            tfha.setText("450000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Internasional" && cbmaskapai.getSelectedItem() == "Garuda Indonesia" && cbkelas.getSelectedItem() == "Ekonomi" && cbtujuan.getSelectedItem() == "Singapore" ) {
            tfjam.setText("10.00");
            tfperkiraan.setText("11.30");
            tfhd.setText("1500000");
            tfha.setText("550000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Internasional" && cbmaskapai.getSelectedItem() == "Garuda Indonesia" && cbkelas.getSelectedItem() == "First Class" && cbtujuan.getSelectedItem() == "Singapore" ) {
            tfjam.setText("12.00");
            tfperkiraan.setText("13.30");
            tfhd.setText("1800000");
            tfha.setText("650000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Internasional" && cbmaskapai.getSelectedItem() == "Air Asia" && cbkelas.getSelectedItem() == "Ekonomi" && cbtujuan.getSelectedItem() == "Singapore" ) {
            tfjam.setText("15.00");
            tfperkiraan.setText("16.30");
            tfhd.setText("1300000");
            tfha.setText("500000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Internasional" && cbmaskapai.getSelectedItem() == "Air Asia" && cbkelas.getSelectedItem() == "First Class" && cbtujuan.getSelectedItem() == "Singapore" ) {
            tfjam.setText("17.00");
            tfperkiraan.setText("18.30");
            tfhd.setText("1500000");
            tfha.setText("550000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Internasional" && cbmaskapai.getSelectedItem() == "Garuda Indonesia" && cbkelas.getSelectedItem() == "Ekonomi" && cbtujuan.getSelectedItem() == "Bangkok" ) {
            tfjam.setText("10.00");
            tfperkiraan.setText("11.30");
            tfhd.setText("3200000");
            tfha.setText("1600000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Internasional" && cbmaskapai.getSelectedItem() == "Garuda Indonesia" && cbkelas.getSelectedItem() == "First Class" && cbtujuan.getSelectedItem() == "Bangkok" ) {
            tfjam.setText("12.00");
            tfperkiraan.setText("13.30");
            tfhd.setText("3400000");
            tfha.setText("1700000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Internasional" && cbmaskapai.getSelectedItem() == "Air Asia" && cbkelas.getSelectedItem() == "Ekonomi" && cbtujuan.getSelectedItem() == "Bangkok" ) {
            tfjam.setText("15.00");
            tfperkiraan.setText("16.30");
            tfhd.setText("3250000");
            tfha.setText("1650000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Internasional" && cbmaskapai.getSelectedItem() == "Air Asia" && cbkelas.getSelectedItem() == "First Class" && cbtujuan.getSelectedItem() == "Bangkok" ) {
            tfjam.setText("17.00");
            tfperkiraan.setText("18.30");
            tfhd.setText("3600000");
            tfha.setText("1800000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Internasional" && cbmaskapai.getSelectedItem() == "Garuda Indonesia" && cbkelas.getSelectedItem() == "Ekonomi" && cbtujuan.getSelectedItem() == "Seoul" ) {
            tfjam.setText("10.00");
            tfperkiraan.setText("11.30");
            tfhd.setText("5200000");
            tfha.setText("2600000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Internasional" && cbmaskapai.getSelectedItem() == "Garuda Indonesia" && cbkelas.getSelectedItem() == "First Class" && cbtujuan.getSelectedItem() == "Seoul" ) {
            tfjam.setText("12.00");
            tfperkiraan.setText("13.30");
            tfhd.setText("5600000");
            tfha.setText("2300000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Internasional" && cbmaskapai.getSelectedItem() == "Air Asia" && cbkelas.getSelectedItem() == "Ekonomi" && cbtujuan.getSelectedItem() == "Seoul" ) {
            tfjam.setText("15.00");
            tfperkiraan.setText("16.30");
            tfhd.setText("5350000");
            tfha.setText("2120000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Internasional" && cbmaskapai.getSelectedItem() == "Air Asia" && cbkelas.getSelectedItem() == "First Class" && cbtujuan.getSelectedItem() == "Seoul" ) {
            tfjam.setText("17.00");
            tfperkiraan.setText("18.30");
            tfhd.setText("5500000");
            tfha.setText("2750000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Internasional" && cbmaskapai.getSelectedItem() == "Garuda Indonesia" && cbkelas.getSelectedItem() == "Ekonomi" && cbtujuan.getSelectedItem() == "Tokyo" ) {
            tfjam.setText("10.00");
            tfperkiraan.setText("11.30");
            tfhd.setText("6000000");
            tfha.setText("3000000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Internasional" && cbmaskapai.getSelectedItem() == "Garuda Indonesia" && cbkelas.getSelectedItem() == "First Class" && cbtujuan.getSelectedItem() == "Tokyo" ) {
            tfjam.setText("12.00");
            tfperkiraan.setText("13.30");
            tfhd.setText("6300000");
            tfha.setText("3150000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Internasional" && cbmaskapai.getSelectedItem() == "Air Asia" && cbkelas.getSelectedItem() == "Ekonomi" && cbtujuan.getSelectedItem() == "Tokyo" ) {
            tfjam.setText("15.00");
            tfperkiraan.setText("16.30");
            tfhd.setText("6400000");
            tfha.setText("3200000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }

        if (cbJenis.getSelectedItem() == "Internasional" && cbmaskapai.getSelectedItem() == "Air Asia" && cbkelas.getSelectedItem() == "First Class" && cbtujuan.getSelectedItem() == "Tokyo" ) {
            tfjam.setText("17.00");
            tfperkiraan.setText("18.30");
            tfhd.setText("6500000");
            tfha.setText("3250000");
            hdewasa = Integer.parseInt(tfhd.getText());
            hanak = Integer.parseInt(tfha.getText());
            dewasa = Integer.parseInt(tfdewasa.getText());
            anak = Integer.parseInt(tfanak.getText());
            total = (hdewasa * dewasa) + (hanak * anak);
            tftotal.setText(String.valueOf(total));
            a = this.formatRp(hdewasa);
            b = this.formatRp(hanak);
            c = this.formatRp(total);
            tfhd.setText(a);
            tfha.setText(b);
            tftotal.setText(c);
            tftotal.setForeground(Color.RED);
        }
    }
    }

import java.awt.*;
import javax.swing.*;

public class Cadastro extends JFrame {
    //Declaração dos componentes
    private JLabel tipoLabel, cpfLabel, fornecedorLabel, nomeLabel, rgLabel, orgaoexLabel, emailLabel, cepLabel, paisLabel, ufLabel, municipioLabel, logradouroLabel, numeroLabel,complementoLabel, bairroLabel, telefoneLabel, situacaoLabel;
    private JTextField cpfField, nomeField, rgField, orgaoexField, emailField, cepField, paisField, ufField1, ufField2, municipioField, logradouroField, numeroField, complementoField, bairroField, telefoneField;
    private JComboBox<String> tipoCombo;
    private JCheckBox fornecedorCheck;
    private JRadioButton ativoButton, inativoButton;
    private ButtonGroup situacaoGroup;
    private JButton confirmarButton, excluirButton, limparButton;
    private JPanel painel;
    private JTextField[] fieldList = {
        cpfField, nomeField, rgField, orgaoexField, emailField, cepField, paisField, ufField1, ufField2, municipioField, logradouroField, numeroField, complementoField, bairroField, telefoneField        
    };

    public Cadastro(){
        super("Formulário de Cadastro");
        initialization();
        fieldList = new JTextField[] {
            cpfField, nomeField, rgField, orgaoexField, emailField, cepField, paisField, ufField1, ufField2, municipioField, logradouroField, numeroField, complementoField, bairroField, telefoneField
        };
    }

    private void initialization() {
        painel = new JPanel();
        painel.setLayout(null);

        //Tipo
        tipoLabel = new JLabel("Tipo");
        tipoLabel.setBounds(30,110,170,30);
        String[] tipos = {"Física", "Jurídica"};
        tipoCombo = new JComboBox<>(tipos);
        tipoCombo.setBounds(210,110,170,30);
        tipoLabel.setVerticalAlignment(JLabel.CENTER);
        tipoLabel.setHorizontalAlignment(JLabel.CENTER);

        //CPF/CPNPJ
        cpfLabel = new JLabel("CPF/CNPJ ...");
        cpfLabel.setBounds(390,110,170,30);
        cpfField = new JTextField();
        cpfField.setBounds(580,110,200,30);
        cpfLabel.setVerticalAlignment(JLabel.CENTER);
        cpfLabel.setHorizontalAlignment(JLabel.CENTER);

        //Fornecedor
        fornecedorLabel = new JLabel("Fornecedor");
        fornecedorLabel.setBounds(800,110,170,30);
        fornecedorCheck = new JCheckBox();
        fornecedorCheck.setBounds(1000,110,140,30);
        fornecedorLabel.setVerticalAlignment(JLabel.CENTER);
        fornecedorLabel.setHorizontalAlignment(JLabel.CENTER);

        //Nome
        nomeLabel = new JLabel("Nome");
        nomeLabel.setBounds(30,150,170,30);
        nomeField = new JTextField();
        nomeField.setBounds(210,150,840,30);
        nomeLabel.setVerticalAlignment(JLabel.CENTER);
        nomeLabel.setHorizontalAlignment(JLabel.CENTER);

        //RG
        rgLabel = new JLabel("RG/Inscrição Estadual");
        rgLabel.setBounds(30,190,170,30);
        rgField = new JTextField();
        rgField.setBounds(210,190,170,30);
        rgLabel.setVerticalAlignment(JLabel.CENTER);
        rgLabel.setHorizontalAlignment(JLabel.CENTER);
        

        //Órgão Expedidor
        orgaoexLabel = new JLabel("Órgão Expedidor");
        orgaoexLabel.setBounds(390,190,170,30);
        orgaoexField = new JTextField();
        orgaoexField.setBounds(580,190,170,30);
        orgaoexLabel.setVerticalAlignment(JLabel.CENTER);
        orgaoexLabel.setHorizontalAlignment(JLabel.CENTER);

        //Email
        emailLabel = new JLabel("Email");
        emailLabel.setBounds(30,230,170,30);
        emailField = new JTextField();
        emailField.setBounds(210,230,351,30);
        emailLabel.setVerticalAlignment(JLabel.CENTER);
        emailLabel.setHorizontalAlignment(JLabel.CENTER);

        //CEP
        cepLabel = new JLabel("CEP");
        cepLabel.setBounds(580,230,170,30);
        cepField = new JTextField();
        cepField.setBounds(770,230,283,30);
        cepLabel.setVerticalAlignment(JLabel.CENTER);
        cepLabel.setHorizontalAlignment(JLabel.CENTER);

        //País
        paisLabel = new JLabel("País");
        paisLabel.setBounds(30,270,170,30);
        paisField = new JTextField();
        paisField.setBounds(210,270,351,30);
        paisLabel.setVerticalAlignment(JLabel.CENTER);
        paisLabel.setHorizontalAlignment(JLabel.CENTER);

        //UF
        ufLabel = new JLabel("UF...");
        ufLabel.setBounds(580,270,170,30);
        ufField1 = new JTextField();
        ufField1.setBounds(770,270,75,30);
        ufField2 = new JTextField();
        ufField2.setBounds(860,270,192,30);
        ufLabel.setVerticalAlignment(JLabel.CENTER);
        ufLabel.setHorizontalAlignment(JLabel.CENTER);

        //Município
        municipioLabel = new JLabel("Município");
        municipioLabel.setBounds(30,310,170,30);
        municipioField = new JTextField();
        municipioField.setBounds(210,310,844,30);
        municipioLabel.setVerticalAlignment(JLabel.CENTER);
        municipioLabel.setHorizontalAlignment(JLabel.CENTER);

        //Logradouro
        logradouroLabel = new JLabel("Logradouro");
        logradouroLabel.setBounds(30,350,170,30);
        logradouroField = new JTextField();
        logradouroField.setBounds(210,350,844,30);
        logradouroLabel.setVerticalAlignment(JLabel.CENTER);
        logradouroLabel.setHorizontalAlignment(JLabel.CENTER);

        //Número
        numeroLabel = new JLabel("Número");
        numeroLabel.setBounds(30,390,170,30);
        numeroField = new JTextField();
        numeroField.setBounds(210,390,170,30);
        numeroLabel.setVerticalAlignment(JLabel.CENTER);
        numeroLabel.setHorizontalAlignment(JLabel.CENTER);

        //Complemento
        complementoLabel = new JLabel("Complemento");
        complementoLabel.setBounds(390,390,170,30);
        complementoField = new JTextField();
        complementoField.setBounds(580,390,476,30);
        complementoLabel.setVerticalAlignment(JLabel.CENTER);
        complementoLabel.setHorizontalAlignment(JLabel.CENTER);

        //Bairro
        bairroLabel = new JLabel("Bairro");
        bairroLabel.setBounds(30,430,170,30);
        bairroField = new JTextField();
        bairroField.setBounds(210,430,170,30);
        bairroLabel.setVerticalAlignment(JLabel.CENTER);
        bairroLabel.setHorizontalAlignment(JLabel.CENTER);

        //Telefone
        telefoneLabel = new JLabel("Telefone");
        telefoneLabel.setBounds(390,430,170,30);
        telefoneField = new JTextField();
        telefoneField.setBounds(580,430,170,30);
        telefoneLabel.setVerticalAlignment(JLabel.CENTER);
        telefoneLabel.setHorizontalAlignment(JLabel.CENTER);

        //Situação
        situacaoLabel = new JLabel("Situação");
        situacaoLabel.setBounds(770,430,130,30);
        ativoButton = new JRadioButton("Ativo");
        ativoButton.setBounds(920,430,70,30);
        inativoButton = new JRadioButton("Inativo");
        inativoButton.setBounds(990,430,77,30);
        situacaoGroup = new ButtonGroup();
        situacaoGroup.add(ativoButton);
        situacaoGroup.add(inativoButton);
        situacaoLabel.setVerticalAlignment(JLabel.CENTER);
        situacaoLabel.setHorizontalAlignment(JLabel.CENTER);

        //Confirmar
        confirmarButton = new JButton("Confirmar");
        confirmarButton.setBounds(30,490,140,30);
        confirmarButton.setBackground(Color.orange);
        confirmarButton.setVerticalAlignment(JLabel.CENTER);
        confirmarButton.setHorizontalAlignment(JLabel.CENTER);
        confirmarButton.addActionListener(e -> Confirmar());

        //Excluir
        excluirButton = new JButton("Excluir");
        excluirButton.setBounds(180,490,140,30);
        excluirButton.setBackground(Color.orange);
        excluirButton.setVerticalAlignment(JLabel.CENTER);
        excluirButton.setHorizontalAlignment(JLabel.CENTER);
        excluirButton.addActionListener(e -> Excluir());

        //Limpar
        limparButton = new JButton("Limpar");
        limparButton.setBounds(330,490,140,30);
        limparButton.setVerticalAlignment(JLabel.CENTER);
        limparButton.setHorizontalAlignment(JLabel.CENTER);
        limparButton.addActionListener(e -> Limpar());

        //Adiciona componentes ao painel
        painel.add(tipoLabel);
        painel.add(tipoCombo);
        painel.add(cpfLabel);
        painel.add(cpfField);
        painel.add(fornecedorLabel);
        painel.add(fornecedorCheck);
        painel.add(nomeLabel);
        painel.add(nomeField);
        painel.add(rgLabel);
        painel.add(rgField);
        painel.add(orgaoexLabel);
        painel.add(orgaoexField);
        painel.add(emailLabel);
        painel.add(emailField);
        painel.add(cepLabel);
        painel.add(cepField);
        painel.add(paisLabel);
        painel.add(paisField);
        painel.add(ufLabel);
        painel.add(ufField1);
        painel.add(ufField2);
        painel.add(municipioLabel);
        painel.add(municipioField);
        painel.add(logradouroLabel);
        painel.add(logradouroField);
        painel.add(numeroLabel);
        painel.add(numeroField);
        painel.add(complementoLabel);
        painel.add(complementoField);
        painel.add(bairroLabel);
        painel.add(bairroField);
        painel.add(telefoneLabel);
        painel.add(telefoneField);
        painel.add(situacaoLabel);
        painel.add(ativoButton);
        painel.add(inativoButton);
        painel.add(confirmarButton);
        painel.add(excluirButton);
        painel.add(limparButton);

        //Configurações do frame
        this.setContentPane(painel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1130,600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void Confirmar() {
        JOptionPane.showMessageDialog(null, "Cadastro concluído", "Parabéns", JOptionPane.INFORMATION_MESSAGE);
        Limpar();
    }

    private void Excluir() {
        JOptionPane.showMessageDialog(null, "Cadastro excluído com sucesso", "Deletado", JOptionPane.INFORMATION_MESSAGE);
        Limpar();
    }

    private void Limpar() {
        for (JTextField field : fieldList) {
            field.setText("");
        }
    }
    public static void main(String[] args){
        new Cadastro();
    }

}
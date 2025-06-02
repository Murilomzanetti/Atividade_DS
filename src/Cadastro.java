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

    public Cadastro(){
        super("Formulário de Cadastro");
        initialization();
    }

    private void initialization() {
        painel = new JPanel();
        painel.setLayout(null);

        //Tipo
        tipoLabel = new JLabel("Tipo");
        tipoLabel.setBounds(30, 30, 40, 25);
        String[] tipos = {"Física", "Jurídica"};
        tipoCombo = new JComboBox<>(tipos);
        tipoCombo.setBounds(70, 30, 100, 25);

        //CPF/CPNPJ
        cpfLabel = new JLabel("CPF/CNPJ ...");
        cpfLabel.setBounds(180, 30, 80, 25);
        cpfField = new JTextField();
        cpfField.setBounds(280, 30, 150, 25);

        //Fornecedor
        fornecedorLabel = new JLabel("Fornecedor");
        fornecedorLabel.setBounds(450, 30, 120, 25);
        fornecedorCheck = new JCheckBox();
        fornecedorCheck.setBounds(540, 30, 100, 25);

        //Nome
        nomeLabel = new JLabel("Nome");
        nomeLabel.setBounds(30, 70, 50, 25);
        nomeField = new JTextField();
        nomeField.setBounds(70, 70, 500, 25);

        //RG
        rgLabel = new JLabel("RG/Inscrição Estadual");
        rgLabel.setBounds(30, 100, 150, 25);
        rgField = new JTextField();
        rgField.setBounds(70, 100, 100, 25);

        //Órgão Expedidor
        orgaoexLabel = new JLabel("Órgão Expedidor");
        orgaoexLabel.setBounds(180, 100, 120, 25);
        orgaoexField = new JTextField();
        orgaoexField.setBounds(280, 100, 150, 25);

        //Email
        emailLabel = new JLabel("Email");
        emailLabel.setBounds(30, 130, 50, 25);
        emailField = new JTextField();
        emailField.setBounds(70, 130, 200, 25);

        //CEP
        cepLabel = new JLabel("CEP");
        cepLabel.setBounds(280, 130, 40, 25);
        cepField = new JTextField();
        cepField.setBounds(320, 130, 100, 25);

        //País
        paisLabel = new JLabel("País");
        paisLabel.setBounds(30, 150, 40, 25);
        paisField = new JTextField();
        paisField.setBounds(70, 130, 80, 25);

        //UF
        ufLabel = new JLabel("UF...");
        ufLabel.setBounds(280, 150, 30, 25);
        ufField1 = new JTextField();
        ufField1.setBounds(320, 150, 30, 25);
        ufField2 = new JTextField();
        ufField2.setBounds(630, 150, 50, 25);

        //Município
        municipioLabel = new JLabel("Município");
        municipioLabel.setBounds(30, 170, 70, 25);
        municipioField = new JTextField();
        municipioField.setBounds(70, 170, 500, 25);

        //Logradouro
        logradouroLabel = new JLabel("Logradouro");
        logradouroLabel.setBounds(30, 200, 80, 25);
        logradouroField = new JTextField();
        logradouroField.setBounds(70, 200, 200, 25);

        //Número
        numeroLabel = new JLabel("Número");
        numeroLabel.setBounds(30, 230, 60, 25);
        numeroField = new JTextField();
        numeroField.setBounds(70, 230, 100, 25);

        //Complemento
        complementoLabel = new JLabel("Complemento");
        complementoLabel.setBounds(180, 230, 100, 25);
        complementoField = new JTextField();
        complementoField.setBounds(280, 230, 200, 25);

        //Bairro
        bairroLabel = new JLabel("Bairro");
        bairroLabel.setBounds(30, 260, 50, 25);
        bairroField = new JTextField();
        bairroField.setBounds(70, 100, 200, 25);

        //Telefone
        telefoneLabel = new JLabel("Telefone");
        telefoneLabel.setBounds(180, 260, 60, 25);
        telefoneField = new JTextField();
        telefoneField.setBounds(280, 260, 150, 25);

        //Situação
        situacaoLabel = new JLabel("Situação");
        situacaoLabel.setBounds(520, 260, 60, 25);
        ativoButton = new JRadioButton("Ativo");
        ativoButton.setBounds(580, 260, 60, 25);
        inativoButton = new JRadioButton("Inativo");
        inativoButton.setBounds(640, 260, 80, 25);
        situacaoGroup = new ButtonGroup();
        situacaoGroup.add(ativoButton);
        situacaoGroup.add(inativoButton);

        //Confirmar
        confirmarButton = new JButton("Confirmar");
        confirmarButton.setBounds(30, 290, 100, 30);

        //Excluir
        excluirButton = new JButton("Excluir");
        excluirButton.setBounds(140, 290, 100, 30);

        //Limpar
        limparButton = new JButton("Limpar");
        limparButton.setBounds(250, 290, 100, 30);

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
        this.setSize(600, 320);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public static void main(String[] args){
        new Cadastro();
    }

}
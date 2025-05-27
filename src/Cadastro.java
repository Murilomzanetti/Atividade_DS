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
        tipoLabel.setBounds(20, 20, 100, 25);
        String[] tipos = {"Física", "Jurídica"};
        tipoCombo = new JComboBox<>(tipos);
        tipoCombo.setBounds(124, 20, 100, 25);

        //CPF/CPNPJ
        cpfLabel = new JLabel("CPF/CNPJ ...");
        cpfLabel.setBounds(228, 20, 100, 25);
        cpfField = new JTextField();
        cpfField.setBounds(332, 20, 200, 25);

        //Fornecedor
        fornecedorLabel = new JLabel("Fornecedor");
        fornecedorLabel.setBounds(536, 20, 100, 25);
        fornecedorCheck = new JCheckBox();
        fornecedorCheck.setBounds(640, 20, 100, 25);

        //Nome
        nomeLabel = new JLabel("Nome");
        nomeLabel.setBounds(20, 29, 100, 25);
        nomeField = new JTextField();
        nomeField.setBounds(124, 29, 640, 25);

        //RG
        rgLabel = new JLabel("RG/Inscrição Estadual");
        rgLabel.setBounds(20, 33, 100, 25);
        rgField = new JTextField();
        rgField.setBounds(124, 33, 100, 25);

        //Órgão Expedidor
        orgaoexLabel = new JLabel("Órgão Expedidor");
        orgaoexLabel.setBounds(228, 33, 100, 25);
        orgaoexField = new JTextField();
        orgaoexField.setBounds(332, 33, 100, 25);

        //Email
        emailLabel = new JLabel("Email");
        emailLabel.setBounds(20, 37, 100, 25);
        emailField = new JTextField();
        emailField.setBounds(124, 37, 200, 25);

        //CEP
        cepLabel = new JLabel("CEP");
        cepLabel.setBounds(328, 37, 100, 25);
        cepField = new JTextField();
        cepField.setBounds(432, 37, 200, 25);

        //País
        paisLabel = new JLabel("País");
        paisLabel.setBounds(20, 41, 100, 25);
        paisField = new JTextField();
        paisField.setBounds(124, 44, 204, 25);

        //UF
        ufLabel = new JLabel("UF...");
        ufLabel.setBounds(328, 44, 100, 25);
        ufField1 = new JTextField();
        ufField1.setBounds(432, 44, 25, 25);
        ufField2 = new JTextField();
        ufField2.setBounds(461, 44, 200, 25);

        //Município
        municipioLabel = new JLabel("Município");
        municipioLabel.setBounds(20, 48, 100, 25);
        municipioField = new JTextField();
        municipioField.setBounds(124, 48, 300, 25);

        //Logradouro
        logradouroLabel = new JLabel("Logradouro");
        logradouroLabel.setBounds(20, 52, 100, 25);
        logradouroField = new JTextField();
        logradouroField.setBounds(124, 48, 300, 25);

        //Número
        numeroLabel = new JLabel("Número");
        numeroLabel.setBounds(20, 56, 100, 25);
        numeroField = new JTextField();
        numeroField.setBounds(124, 56, 100, 25);

        //Complemento
        complementoLabel = new JLabel("Complemento");
        complementoLabel.setBounds(228, 56, 100, 25);
        complementoField = new JTextField();
        complementoField.setBounds(332, 56, 300, 25);

        //Bairro
        bairroLabel = new JLabel("Bairro");
        bairroLabel.setBounds(20, 60, 100, 25);
        bairroField = new JTextField();
        bairroField.setBounds(124, 60, 100, 25);

        //Telefone
        telefoneLabel = new JLabel("Telefone");
        telefoneLabel.setBounds(228, 60, 100, 25);
        telefoneField = new JTextField();
        telefoneField.setBounds(332, 60, 100, 25);

        //Situação
        situacaoLabel = new JLabel("Situação");
        situacaoLabel.setBounds(436, 60, 100, 25);
        ativoButton = new JRadioButton("Ativo");
        ativoButton.setBounds(540, 60, 50, 25);
        inativoButton = new JRadioButton("Inativo");
        inativoButton.setBounds(590, 60, 50, 25);
        situacaoGroup = new ButtonGroup();
        situacaoGroup.add(ativoButton);
        situacaoGroup.add(inativoButton);

        //Confirmar
        confirmarButton = new JButton("Confirmar");
        confirmarButton.setBounds(20, 68, 85, 25);

        //Excluir
        excluirButton = new JButton("Excluir");
        excluirButton.setBounds(109, 68, 85, 25);

        //Limpar
        limparButton = new JButton("Limpar");
        limparButton.setBounds(198, 68, 85, 25);

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
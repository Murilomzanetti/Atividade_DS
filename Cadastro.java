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
        tipoCombo.setBounds(104,20, 100, 25);

        //CPF/CPNPJ
        cpfLabel = new JLabel("CPF/CNPJ ...");
        cpfLabel.setBounds(108, 20, 100, 25);
        cpfField = new JTextField();
        cpfField.setBounds(212, 20, 200, 25);

        //Fornecedor
        fornecedorLabel = new JLabel("Fornecedor");
        fornecedorLabel.setBounds(416, 20, 100, 25);
        fornecedorCheck = new JCheckBox();
        fornecedorCheck.setBounds(520, 20, 100, 25);

        //Nome
        nomeLabel = new JLabel("Nome");
        nomeLabel.setBounds(20, 29, 100, 25);
        nomeField = new JTextField();
        nomeField.setBounds(104, 29, 520, 25);

        //RG
        rgLabel = new JLabel("RG/Inscrição Estadual");
        rgLabel.setBounds(20, 33, 100, 25);
        rgField = new JTextField();
        rgField.setBounds(104, 33, 100, 25);

    }

}
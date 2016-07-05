package models;

import com.avaje.ebean.Model;
import play.data.format.Formats;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Colaborador extends Model {

    @Id
    private Long id;

    private String nome;

    private String cpf;

    private String pis;

    @Formats.DateTime(pattern="dd-MM-yyyy")
    private Date dataNascimento;

    private String localNascimento;

    private String ufNascimento;

    private String estadoCivil;

    private String nomeConjugue;

    private String nomePai;

    private String nomeMae;

    private Genero genero;

    private String rg;

    private String orgaoRG;

    private String ufRg;

    @Formats.DateTime(pattern="dd-MM-yyyy")
    private Date dataRgEmissao;

    private Cargo cargo;

    private Area area;

    @Formats.DateTime(pattern="dd-MM-yyyy")
    private Date dataAdmissão;

    @Formats.DateTime(pattern="dd-MM-yyyy")
    private Date dataDesligamento;

    private String endereco;

    private String bairro;

    private String cidade;

    private String uf;

    private String cep;

    private String ddd;

    private String email;

    private Escolaridade escolaridade;

    private Float salario;

    private String contaBanco;

    private String contaAgencia;

    private String contaNumero;

    private String contaDigito;

    private Beneficio beneficios;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    public String getUfNascimento() {
        return ufNascimento;
    }

    public void setUfNascimento(String ufNascimento) {
        this.ufNascimento = ufNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNomeConjugue() {
        return nomeConjugue;
    }

    public void setNomeConjugue(String nomeConjugue) {
        this.nomeConjugue = nomeConjugue;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgaoRG() {
        return orgaoRG;
    }

    public void setOrgaoRG(String orgaoRG) {
        this.orgaoRG = orgaoRG;
    }

    public String getUfRg() {
        return ufRg;
    }

    public void setUfRg(String ufRg) {
        this.ufRg = ufRg;
    }

    public Date getDataRgEmissao() {
        return dataRgEmissao;
    }

    public void setDataRgEmissao(Date dataRgEmissao) {
        this.dataRgEmissao = dataRgEmissao;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Date getDataAdmissão() {
        return dataAdmissão;
    }

    public void setDataAdmissão(Date dataAdmissão) {
        this.dataAdmissão = dataAdmissão;
    }

    public Date getDataDesligamento() {
        return dataDesligamento;
    }

    public void setDataDesligamento(Date dataDesligamento) {
        this.dataDesligamento = dataDesligamento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public String getContaBanco() {
        return contaBanco;
    }

    public void setContaBanco(String contaBanco) {
        this.contaBanco = contaBanco;
    }

    public String getContaAgencia() {
        return contaAgencia;
    }

    public void setContaAgencia(String contaAgencia) {
        this.contaAgencia = contaAgencia;
    }

    public String getContaNumero() {
        return contaNumero;
    }

    public void setContaNumero(String contaNumero) {
        this.contaNumero = contaNumero;
    }

    public String getContaDigito() {
        return contaDigito;
    }

    public void setContaDigito(String contaDigito) {
        this.contaDigito = contaDigito;
    }

    public Beneficio getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(Beneficio beneficios) {
        this.beneficios = beneficios;
    }
}

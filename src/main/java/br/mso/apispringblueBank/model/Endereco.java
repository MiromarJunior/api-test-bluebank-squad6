package br.mso.apispringblueBank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "enderecos")
public class Endereco {

	/*
	 * CREATE TABLE `Endereco` ( `endereco_id` int NOT NULL, `rua` varchar(45) NOT
	 * NULL, `bairro` varchar(45) NOT NULL, `numero` varchar(45) NOT NULL, `cep`
	 * varchar(45) NOT NULL, `cidade` varchar(45) DEFAULT NULL, `estado` varchar(45)
	 * DEFAULT NULL, `pais` varchar(45) DEFAULT NULL, `complemento` varchar(45)
	 * DEFAULT NULL,
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "endereco_id")
	private Long enderecoId;

	@NotNull
	@Column(nullable = false, length = 45)
	private String rua;

	@NotNull
	@Column(nullable = false, length = 45)
	private String bairro;

	@NotNull
	@Column(nullable = false, length = 20)
	private String numero;

	@NotNull
	@Column(nullable = false, length = 12)
	private String cep;

	@NotNull
	@Column(nullable = false, length = 45)
	private String cidade;

	@Column(nullable = false, length = 2)
	private String uf;

	@NotNull
	@Column(nullable = false, length = 45)
	private String pais;

	@Column(length = 200)
	private String complemento;

	

	public Long getEnderecoId() {
		return enderecoId;
	}

	public void setEnderecoId(Long enderecoId) {
		this.enderecoId = enderecoId;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}

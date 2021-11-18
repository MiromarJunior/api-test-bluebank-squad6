package br.mso.apispringblueBank.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;


@Entity
@Table(name = "contas")
public class Conta {
	
	/*
	 * CREATE TABLE `Conta` (
  `conta_id` int NOT NULL,
  `numero_conta` varchar(45) NOT NULL,
  `agencia` varchar(45) NOT NULL,
  `status` varchar(45) NOT NULL,
  `saldo` float NOT NULL,
  `senha` varchar(45) NOT NULL,
  `Cliente_cliente_id` int NOT NULL,
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "conta_id")
	private Long id;
	
	@NotNull
	@Column(name = "numero_conta",nullable = false, length = 45)
	private String numeroConta;
	
	@NotNull
	@Column(nullable = false, length = 45)
	private String agencia;
	
	
	@NotNull
	@Column(nullable = false, length = 45)
	private Boolean status;
	
	@NotNull
	@NumberFormat(style = Style.CURRENCY, pattern = "#.###00,00")
	@Column(name = "saldo", nullable = false, columnDefinition = "DECIMAL(9,2) DEFAULT 0.00")
	private BigDecimal saldo;
	//
	//
	
	
	@NotNull
	@Column(nullable = false, length = 45)
	private String senha;
	
	
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public BigDecimal getSaldo() {
		
		
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
	

}

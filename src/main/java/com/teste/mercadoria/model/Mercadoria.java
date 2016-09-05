package com.teste.mercadoria.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "mercadoria")
public class Mercadoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	
	@NotNull(message = "Tipo Mercadoria é um campo obrigatório")
	@Enumerated(EnumType.STRING)
	private TipoMercadoria tipo;
	
	@NotBlank(message = "Nome da Mercadoria é um campo obrigatório")
	private String nome;
	
	@NotNull(message = "Quantidade da Mercadoria é um campo obrigatório")
	private int quantidade;
	
	@NotNull(message = "Preço da Mercadoria é um campo obrigatório")
	private BigDecimal preco;
	
	@NotNull(message = "Tipo do Negócio é um campo obrigatório")
	private String Negocio;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public TipoMercadoria getTipo() {
		return tipo;
	}

	public void setTipo(TipoMercadoria tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getNegocio() {
		return Negocio;
	}

	public void setNegocio(String negocio) {
		Negocio = negocio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Negocio == null) ? 0 : Negocio.hashCode());
		result = prime * result + (int) (codigo ^ (codigo >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		result = prime * result + quantidade;
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mercadoria other = (Mercadoria) obj;
		if (Negocio != other.Negocio)
			return false;
		if (codigo != other.codigo)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		if (quantidade != other.quantidade)
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}
	
}

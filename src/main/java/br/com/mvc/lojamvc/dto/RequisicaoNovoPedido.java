package br.com.mvc.lojamvc.dto;

import javax.validation.constraints.NotBlank;

import br.com.mvc.lojamvc.model.Pedido;
import br.com.mvc.lojamvc.model.StatusPedido;

public class RequisicaoNovoPedido 
{
	@NotBlank
	private String nomeProduto;
	@NotBlank
	private String urlProduto;
	@NotBlank
	private String urlImagemProduto;
	private String descricaoProduto;
	
	public String getNomeProduto() { return nomeProduto; }
	
	public void setNomeProduto(String nomeProduto) { this.nomeProduto = nomeProduto; }
	
	public String getUrlProduto() { return urlProduto; }
	
	public void setUrlProduto(String urlProduto) { this.urlProduto = urlProduto; }
		
	public String getDescricaoProduto() { return descricaoProduto; }
	
	public void setDescricaoProduto(String descricaoProduto) { this.descricaoProduto = descricaoProduto; }

	public String getUrlImagemProduto() { return urlImagemProduto; }

	public void setUrlImagemProduto(String urlImagemProduto) { this.urlImagemProduto = urlImagemProduto; }

	public Pedido toPedido() 
	{
		Pedido pedido = new Pedido();
		pedido.setNomeProduto(nomeProduto);
		pedido.setUrlProduto(urlProduto);
		pedido.setUrlImagem(urlImagemProduto);
		pedido.setDescricao(descricaoProduto);
		pedido.setStatus(StatusPedido.AGUARDANDO);
		return pedido;
	}
}

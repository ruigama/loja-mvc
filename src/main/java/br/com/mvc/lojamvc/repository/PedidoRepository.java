package br.com.mvc.lojamvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mvc.lojamvc.model.Pedido;
import br.com.mvc.lojamvc.model.StatusPedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>
{

	List<Pedido> findByStatus(StatusPedido status);
	
}

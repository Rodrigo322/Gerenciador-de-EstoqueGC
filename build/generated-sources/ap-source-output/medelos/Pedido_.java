package medelos;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import medelos.Cliente;
import medelos.Pagamento;
import medelos.PedidoProduto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-20T19:23:31")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Cliente> cliente;
    public static volatile ListAttribute<Pedido, PedidoProduto> pedido_produto;
    public static volatile SingularAttribute<Pedido, Pagamento> pagamento;
    public static volatile SingularAttribute<Pedido, Integer> id_pedido;
    public static volatile SingularAttribute<Pedido, Double> valor_total_pedido;
    public static volatile SingularAttribute<Pedido, String> descricao;

}
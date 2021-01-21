package medelos;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import medelos.Pedido;
import medelos.Produto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-20T19:23:31")
@StaticMetamodel(PedidoProduto.class)
public class PedidoProduto_ { 

    public static volatile SingularAttribute<PedidoProduto, Produto> produto;
    public static volatile SingularAttribute<PedidoProduto, Pedido> pedido;
    public static volatile SingularAttribute<PedidoProduto, Integer> quantidade_pedido_produto;
    public static volatile SingularAttribute<PedidoProduto, Integer> id_pedido_prdouto;

}
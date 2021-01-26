package medelos;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import medelos.PedidoProduto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-26T00:31:40")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, String> descricao_produto;
    public static volatile ListAttribute<Produto, PedidoProduto> pedidoProduto;
    public static volatile SingularAttribute<Produto, Integer> estoque_produto;
    public static volatile SingularAttribute<Produto, Integer> id_produto;
    public static volatile SingularAttribute<Produto, Double> preco_venda_produto;
    public static volatile SingularAttribute<Produto, Double> preco_custo_produto;

}
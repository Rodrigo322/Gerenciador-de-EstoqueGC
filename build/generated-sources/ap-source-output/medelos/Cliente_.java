package medelos;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import medelos.Pedido;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-20T23:55:29")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Integer> id_cliente;
    public static volatile SingularAttribute<Cliente, String> cpf_cliente;
    public static volatile SingularAttribute<Cliente, String> nome_cliente;
    public static volatile ListAttribute<Cliente, Pedido> pedidos;

}
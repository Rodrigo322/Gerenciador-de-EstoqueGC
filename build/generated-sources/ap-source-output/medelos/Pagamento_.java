package medelos;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import medelos.Pedido;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-20T23:55:29")
@StaticMetamodel(Pagamento.class)
public class Pagamento_ { 

    public static volatile SingularAttribute<Pagamento, String> tipo_pagamento;
    public static volatile ListAttribute<Pagamento, Pedido> pedidos;
    public static volatile SingularAttribute<Pagamento, Long> id_pagamento;

}
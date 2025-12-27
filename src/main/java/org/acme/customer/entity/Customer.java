package org.acme.customer.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.smallrye.common.constraint.NotNull;
import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer extends PanacheEntity {

    @NotNull
    @Column(nullable = false)
    public String name;

    @NotNull
    @Column(name = "document_id", nullable = false, unique = true)
    public String documentId;

    @NotNull
    @Column(nullable = false, unique = true)
    public String email;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    public CustomerStatus status;
}

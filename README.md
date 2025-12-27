# Customer Service – Quarkus

Microservicio desarrollado con **Quarkus**.

---

## Arquitectura

- Microservicio independiente
- Exposición de endpoints REST
- Seguridad basada en **JWT (RS256)**
- Observabilidad con **Health Checks** y **Métricas Prometheus**
- Persistencia con **Hibernate ORM + Panache**

---

## Tecnologías

- Java 21
- Quarkus
- Hibernate ORM with Panache
- SmallRye JWT
- MicroProfile Metrics
- PostgreSQL
- Maven

---

## Funcionalidad Implementada (RF1)

### RF1: Consulta de Clientes

✔ Endpoint REST para obtener un cliente por ID  
✔ Validación de existencia del cliente  
✔ Manejo de excepciones personalizado  
✔ Uso de DTOs y Mappers  
✔ Métricas personalizadas  
✔ Endpoint protegido con JWT  
✔ Health check habilitado

---

## Endpoints Disponibles

### Obtener cliente por ID
```http
GET http://localhost:8081/customers/{id}
```

### Validar cliente por ID
```http
GET http://localhost:8081/customers/{id}/validate
```

### Health Check
```http
GET http://localhost:8081/q/health
```

### Obtener metricas
```http
GET http://localhost:8081/q/metrics
```


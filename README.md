# realtimehub

Ejemplo de orquestador usando Spring Boot y Spring AI con una arquitectura hexagonal.

## Modulos

- **boot**: arranque de la aplicación.
- **api-rest**: controladores REST.
- **application**: lógica de aplicación.
- **domain**: entidades y puertos del dominio.
- **infrastructure**: integraciones externas (OpenAI).

Para compilar y ejecutar el proyecto:

```bash
./gradlew boot:bootRun
```

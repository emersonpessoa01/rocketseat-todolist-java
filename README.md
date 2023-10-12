# Rocketseat :rocket: To-Do List Java

---

### Evento Java da Rocketseat utilizando o framework Springboot configurado dentro do VSCODE.

&#10004; Aula01, foi realizado a "Construção do backend de uma aplicação To-Do List.

&#10004;  Aula02, "Integração com o Banco de Dados", no caso, utilizando o H2 Database.

&#10004; Aula03, "Implementando segurança nos dados do Usuário".
Na aula4, "Atualizando tarefas e validação de rotas" utilizando o testador de API Apidog.

&#10004; Aula04, atualizando tarefas e validação de rotas.

### Dependências:

<!-- lombok -->
&#10003; Lombok

        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.30</version>
            <scope>provided</scope>
        </dependency>

&#10003; h2 Database Engine
<!-- h2 Database Engine  -->

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <scope>runtime</scope>
        </dependency>


        
&#10003; bcrypt

        <dependency>
            <groupId>at.favre.lib</groupId>
            <artifactId>bcrypt</artifactId>
            <version>0.10.2</version>
        </dependency>

&#10003; Adicionado dentro `application.properties`
~~~
    spring.datasource.url=jdbc:h2:mem:todolist
    spring.datasource.driverClassName=org.h2.Driver
    spring.datasource.username=admin
    spring.datasource.password=admin
    spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
    spring.h2.console.enabled=true
~~~
## Estrutura do projeto:

<!-- []() -->

<div align="center"><img src="img/README.png" width=auto>
</div>

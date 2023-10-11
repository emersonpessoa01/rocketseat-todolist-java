package br.com.emersonpessoa.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserModel, UUID> {
    /* permite fazer um select */
    UserModel findByUsername(String username);

}

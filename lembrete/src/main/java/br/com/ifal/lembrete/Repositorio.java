package br.com.ifal.lembrete;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositorio extends CrudRepository<Lembrete, Integer>{

}
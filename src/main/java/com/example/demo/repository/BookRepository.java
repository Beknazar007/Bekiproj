package com.example.demo.repository;

import com.example.demo.model.BookModel;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository  extends CrudRepository<BookModel, Integer> {
    BookModel findById(int id);
    List<BookModel> findAll();
    void deleteById(int id);

}

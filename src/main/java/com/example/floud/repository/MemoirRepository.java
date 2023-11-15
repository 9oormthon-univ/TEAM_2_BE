package com.example.floud.repository;

import com.example.floud.entity.Memoir;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemoirRepository extends JpaRepository<Memoir, Long> {

    Optional<Memoir> findByMemoirId(Long memoirId);
    List<Memoir> findAll();
    void deleteByMemoirId(Long memoirId);

}

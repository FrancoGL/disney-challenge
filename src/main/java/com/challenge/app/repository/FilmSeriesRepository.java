package com.challenge.app.repository;

import com.challenge.app.model.entity.FilmSeries;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmSeriesRepository extends JpaRepository<FilmSeries, Long> {

  Boolean existsByTitle(String title);

  Optional<FilmSeries> findById(Long id);

  Page<FilmSeries> findAll(Specification<FilmSeries> specification, Pageable pageable);
}

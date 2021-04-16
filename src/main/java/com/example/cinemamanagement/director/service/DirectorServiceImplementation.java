package com.example.cinemamanagement.director.service;

import com.example.cinemamanagement.director.model.Director;
import com.example.cinemamanagement.director.repository.DirectorRepository;
import com.example.cinemamanagement.shared.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DirectorServiceImplementation implements BaseService<Director>, DirectorService {

    private final DirectorRepository directorRepository;

    @Override
    public Page<Director> findAllContainsParameter(int page, int size, String column, Sort.Direction direction, String parameter) {
        Sort sort = Sort.by(new Sort.Order(direction, column));
        return this.directorRepository.findAllByFirstNameOrLastNameContains(parameter, PageRequest.of(page, size, sort));
    }

    @Override
    public Page<Director> getAll(int page, int size, String column, Sort.Direction direction) {
        Sort sort = Sort.by(new Sort.Order(direction, column));
        return this.directorRepository.findAll(PageRequest.of(page, size, sort));
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_UNCOMMITTED)
    public boolean update(Long id, Director entity) {
        if (isExists(id)) {
            Director director = this.directorRepository.getOne(id);

            director.setFirstName(entity.getFirstName());
            director.setLastName(entity.getLastName());
            director.setDateOfBirth(entity.getDateOfBirth());
            director.setFilms(entity.getFilms());

            return true;
        } else return false;
    }

    @Override
    public boolean delete(Long id) {
        if (isExists(id)) {
            this.directorRepository.deleteById(id);
            return true;
        } else return false;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_UNCOMMITTED)
    public Director save(Director entity) {
        return this.directorRepository.save(entity);
    }

    @Override
    public Director getById(Long id) {
        if (isExists(id))
            return this.directorRepository.getOne(id);
        else
            return null;
    }

    @Override
    public boolean isExists(Long id) {
        return this.directorRepository.existsById(id);
    }
}

package com.example.cinemamanagement.producer.service;

import com.example.cinemamanagement.producer.model.Producer;
import com.example.cinemamanagement.producer.repository.ProducerRepository;
import com.example.cinemamanagement.shared.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProducerServiceImplementation implements ProducerService, BaseService<Producer> {

    private final ProducerRepository producerRepository;

    @Override
    public Page<Producer> findAllContainsParameter(int page, int size, String column, Sort.Direction direction, String parameter) {
        Sort sort = Sort.by(new Sort.Order(direction, column));
        return this.producerRepository.findAllByNameContains(parameter, PageRequest.of(page, size, sort));
    }

    @Override
    public Page<Producer> getAll(int page, int size, String column, Sort.Direction direction) {
        Sort sort = Sort.by(new Sort.Order(direction, column));
        return this.producerRepository.findAll(PageRequest.of(page, size, sort));
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_UNCOMMITTED)
    public boolean update(Long id, Producer entity) {
        if (isExists(id)) {
            Producer producer = this.producerRepository.getOne(id);

            producer.setName(entity.getName());
            producer.setFilms(entity.getFilms());

            return true;
        } else return false;
    }

    @Override
    public boolean delete(Long id) {
        if (isExists(id)) {
            this.producerRepository.deleteById(id);
            return true;
        } else return false;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_UNCOMMITTED)
    public Producer save(Producer entity) {
        return this.producerRepository.save(entity);
    }

    @Override
    public Producer getById(Long id) {
        if (isExists(id))
            return this.producerRepository.getOne(id);
        else
            return null;
    }

    @Override
    public boolean isExists(Long id) {
        return this.producerRepository.existsById(id);
    }
}

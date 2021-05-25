package com.example.cinemamanagement.producer.controller;

import com.example.cinemamanagement.producer.converter.ProducerConverter;
import com.example.cinemamanagement.producer.converter.ProducerShowConverter;
import com.example.cinemamanagement.producer.dto.ProducerDto;
import com.example.cinemamanagement.producer.dto.ProducerShowDto;
import com.example.cinemamanagement.producer.model.Producer;
import com.example.cinemamanagement.producer.service.ProducerService;
import com.example.cinemamanagement.shared.BaseController;
import com.example.cinemamanagement.shared.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/producer")
public class ProducerController extends BaseController<Producer> {

    private final ProducerConverter producerConverter;

    private final ProducerShowConverter producerShowConverter;

    private final ProducerService producerService;


    public ProducerController(BaseService<Producer> service, ProducerConverter producerConverter, ProducerShowConverter producerShowConverter, ProducerService producerService) {
        super(service);
        this.producerConverter = producerConverter;
        this.producerShowConverter = producerShowConverter;
        this.producerService = producerService;
    }

    /* GET */
    @GetMapping("")
    public ResponseEntity<Page<ProducerShowDto>> getAll(@RequestParam(defaultValue = "0") final int page,
                                                        @RequestParam(defaultValue = "10") final int size,
                                                        @RequestParam(defaultValue = "id") final String column,
                                                        @RequestParam(defaultValue = "ASC") final String direction,
                                                        @RequestParam(defaultValue = "") final String parameter) {
        if (parameter.equals(""))
            return super.getAll(page, size, column, direction, this.producerShowConverter.toDto());
        else {
            Sort.Direction sortDirection = direction.equals("DESC") ? Sort.Direction.DESC : Sort.Direction.ASC;
            Page<Producer> entityPage = this.producerService.findAllContainsParameter(page, size, column, sortDirection, parameter);
            return ResponseEntity.ok(entityPage.map(this.producerShowConverter.toDto()));
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProducerShowDto> getOne(@PathVariable final Long id) {
        return super.getOne(id, this.producerShowConverter.toDto());
    }

    /* POST */
    @Secured(value = "ROLE_EMPLOYEE")
    @PostMapping("")
    public ResponseEntity<Void> create(@RequestBody @Valid Producer producer) {
        return super.create(producer);
    }

    /* PUT */
    @Secured(value = "ROLE_EMPLOYEE")
    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable final Long id, @RequestBody @Valid final ProducerDto dto) {
        return super.update(id, this.producerConverter.toEntity().apply(dto));
    }

    /* DELETE */
    @Secured(value = "ROLE_ADMIN")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable final Long id) {
        return super.delete(id);
    }
}

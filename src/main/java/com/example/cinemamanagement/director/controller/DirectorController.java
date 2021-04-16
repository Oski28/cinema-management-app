package com.example.cinemamanagement.director.controller;

import com.example.cinemamanagement.director.converter.DirectorConverter;
import com.example.cinemamanagement.director.converter.DirectorShowConverter;
import com.example.cinemamanagement.director.dto.DirectorDto;
import com.example.cinemamanagement.director.dto.DirectorShowDto;
import com.example.cinemamanagement.director.model.Director;
import com.example.cinemamanagement.director.service.DirectorService;
import com.example.cinemamanagement.shared.BaseController;
import com.example.cinemamanagement.shared.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/director")
public class DirectorController extends BaseController<Director> {

    private final DirectorConverter directorConverter;

    private final DirectorShowConverter directorShowConverter;

    private final DirectorService directorService;

    public DirectorController(BaseService<Director> service,
                              DirectorConverter directorConverter,
                              DirectorShowConverter directorShowConverter, DirectorService directorService) {
        super(service);
        this.directorConverter = directorConverter;
        this.directorShowConverter = directorShowConverter;
        this.directorService = directorService;
    }

    /* GET */
    @GetMapping("")
    public ResponseEntity<Page<DirectorShowDto>> getAll(@RequestParam(defaultValue = "0") final int page,
                                                        @RequestParam(defaultValue = "10") final int size,
                                                        @RequestParam(defaultValue = "id") final String column,
                                                        @RequestParam(defaultValue = "ASC") final String direction,
                                                        @RequestParam(defaultValue = "") final String parameter) {
        if (parameter.equals(""))
            return super.getAll(page, size, column, direction, this.directorShowConverter.toDto());
        else {
            Sort.Direction sortDirection = direction.equals("DESC") ? Sort.Direction.DESC : Sort.Direction.ASC;
            Page<Director> entityPage = this.directorService.findAllContainsParameter(page, size, column, sortDirection, parameter);
            return ResponseEntity.ok(entityPage.map(this.directorShowConverter.toDto()));
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<DirectorShowDto> getOne(@PathVariable final Long id) {
        return super.getOne(id, this.directorShowConverter.toDto());
    }

    /* POST */
    @Secured(value = "ROLE_EMPLOYEE")
    @PostMapping("")
    public ResponseEntity<Void> create(@RequestBody @Valid Director director) {
        return super.create(director);
    }

    /* PUT */
    @Secured(value = "ROLE_EMPLOYEE")
    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable final Long id, @RequestBody @Valid final DirectorDto dto) {
        System.out.println(dto);
        return super.update(id, this.directorConverter.toEntity().apply(dto));
    }

    /* DELETE */
    @Secured(value = "ROLE_ADMIN")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable final Long id) {
        return super.delete(id);
    }
}

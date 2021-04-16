package com.example.cinemamanagement.shared;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public abstract class BaseConverter<E, DTO> {

    protected <U> void convertIfNotNull(Consumer<U> consumer, Supplier<U> supplier) {
        U u = supplier.get();
        if (u != null)
            consumer.accept(u);
    }

    public abstract Function<DTO, E> toEntity();

    public abstract Function<E, DTO> toDto();
}

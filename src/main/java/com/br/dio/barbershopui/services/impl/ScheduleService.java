package com.br.dio.barbershopui.services.impl;

import com.br.dio.barbershopui.entity.ScheduleEntity;
import com.br.dio.barbershopui.repository.IScheduleRepository;
import com.br.dio.barbershopui.services.IScheduleService;
import com.br.dio.barbershopui.services.query.IScheduleQueryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ScheduleService implements IScheduleService {

    private final IScheduleRepository repository;
    private final IScheduleQueryService queryService;

    @Override
    public ScheduleEntity save(final ScheduleEntity entity) {
        queryService.verifyIfScheduleExists(entity.getStartAt(), entity.getEndAt());

        return repository.save(entity);
    }

    @Override
    public void delete(final long id) {
        queryService.findById(id);
        repository.deleteById(id);
    }
}

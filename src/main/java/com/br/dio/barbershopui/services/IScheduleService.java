package com.br.dio.barbershopui.services;

import com.br.dio.barbershopui.entity.ScheduleEntity;

public interface IScheduleService {

    ScheduleEntity save(final ScheduleEntity entity);

    void delete(final long id);

}
package com.br.dio.barbershopui.services;

import com.br.dio.barbershopui.entity.ClientEntity;

public interface IClientService {

    ClientEntity save(final ClientEntity entity);

    ClientEntity update(final ClientEntity entity);

    void delete(final long id);

}
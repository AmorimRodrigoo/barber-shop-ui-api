package com.br.dio.barbershopui.controller.response;

public record ListClientResponse(
        Long id,
        String name,
        String email,
        String phone
) {}

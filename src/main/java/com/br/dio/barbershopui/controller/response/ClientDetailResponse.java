package com.br.dio.barbershopui.controller.response;

public record ClientDetailResponse(
        Long id,
        String name,
        String email,
        String phone
) {}
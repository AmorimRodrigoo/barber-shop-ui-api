package com.br.dio.barbershopui.controller.response;

public record ClientScheduleAppointmentDetailResponse(
        Long id,
        String name,
        String email,
        String phone
) {}
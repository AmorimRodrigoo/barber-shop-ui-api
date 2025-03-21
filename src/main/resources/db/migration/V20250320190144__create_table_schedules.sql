CREATE TABLE SCHEDULES (
                           id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                           start_in TIMESTAMP NOT NULL,
                           end_in TIMESTAMP NOT NULL,
                           client_id BIGINT NOT NULL,
                           CONSTRAINT UK_SCHEDULE_INTERVAL UNIQUE (start_in, end_in),
                           CONSTRAINT FK_CLIENTS_SCHEDULES FOREIGN KEY (client_id) REFERENCES CLIENTS(id)
);
CREATE DATABASE IF NOT EXISTS db_calificaciones;
USE db_calificaciones;

CREATE TABLE IF NOT EXISTS calificacion (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_estudiante BIGINT NOT NULL,
    id_curso BIGINT NOT NULL,
    id_evaluacion BIGINT NOT NULL,
    nota DOUBLE,
    fecha_calificacion DATE
);

INSERT INTO calificacion (id_estudiante, id_curso, id_evaluacion, nota, fecha_calificacion)
VALUES 
(1, 2, 3, 6.5, '2025-06-22'),
(2, 2, 3, 5.9, '2025-06-20');

SELECT * FROM calificacion;

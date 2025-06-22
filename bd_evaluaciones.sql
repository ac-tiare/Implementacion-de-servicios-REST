INSERT INTO evaluaciones (curso_id, titulo) VALUES
(1, 'Evaluación de Java'),
(2, 'Evaluación de Base de Datos'),
(3, 'Evaluación de HTML y CSS'),
(4, 'Evaluación de Spring Boot'),
(5, 'Evaluación de Git y GitHub');

INSERT INTO pregunta (pregunta, respuesta_correcta, evaluacion_id) VALUES
('¿Qué es una clase en Java?', 'Una plantilla para objetos', 1),
('¿Qué palabra clave se usa para heredar?', 'extends', 1),
('¿Qué estructura permite tomar decisiones?', 'if', 1),

('¿Qué es una clave primaria?', 'Un identificador único', 2),
('¿Qué comando se usa para ver todas las tablas?', 'SHOW TABLES', 2),
('¿Qué tipo de dato almacena texto?', 'VARCHAR', 2),

('¿Qué etiqueta se usa para un párrafo?', '<p>', 3),
('¿Qué atributo se usa para el color de fondo?', 'background-color', 3),
('¿Qué etiqueta crea un enlace?', '<a>', 3),

('¿Qué es Spring Boot?', 'Un framework para crear aplicaciones Java rápidamente', 4),
('¿Qué archivo contiene las dependencias?', 'pom.xml', 4),
('¿Qué anotación se usa para inyectar dependencias?', '@Autowired', 4),

('¿Qué es Git?', 'Un sistema de control de versiones', 5),
('¿Qué comando guarda los cambios?', 'git commit', 5),
('¿Qué comando crea un repositorio?', 'git init', 5);

INSERT INTO pregunta_opciones (pregunta_id, opciones) VALUES
(1, 'Una función'), (1, 'Una estructura de control'), (1, 'Una plantilla para objetos'),
(2, 'implements'), (2, 'extends'), (2, 'inherits'),
(3, 'switch'), (3, 'if'), (3, 'for'),

(4, 'Una llave de seguridad'), (4, 'Un identificador único'), (4, 'Un índice'),
(5, 'SELECT *'), (5, 'SHOW TABLES'), (5, 'DESCRIBE'),
(6, 'INT'), (6, 'VARCHAR'), (6, 'BOOLEAN'),

(7, '<a>'), (7, '<p>'), (7, '<div>'),
(8, 'color'), (8, 'background-color'), (8, 'font-style'),
(9, '<link>'), (9, '<ul>'), (9, '<a>'),

(10, 'Un plugin'), (10, 'Un framework para crear aplicaciones Java rápidamente'), (10, 'Una base de datos'),
(11, 'pom.xml'), (11, 'config.xml'), (11, 'application.js'),
(12, '@Autowired'), (12, '@Injectable'), (12, '@Bean'),

(13, 'Un lenguaje de programación'), (13, 'Un sistema de control de versiones'), (13, 'Un sistema operativo'),
(14, 'git push'), (14, 'git commit'), (14, 'git merge'),
(15, 'git create'), (15, 'git init'), (15, 'git start');

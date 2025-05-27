@echo off
cd /d "C:\Users\tiaaa\OneDrive\Escritorio\Evaluacion2_FullStack"

echo Iniciando microservicios EduTech...

start cmd /k "cd usuarios && mvn spring-boot:run"
start cmd /k "cd cursos && mvn spring-boot:run"
start cmd /k "cd inscripciones && mvn spring-boot:run"

echo Todos los microservicios están iniciándose...
pause


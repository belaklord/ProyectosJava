/*1. Hallar un listado de alumnos con nombre y apellidos (los dos) ordenado por apellido1
* (0,2 pt)*/
 select nombre, apellido1,apellido2
    from alumno order by apellido1;

/*2. Hallar un listado de asignaturas con codigo de asignatura, cod_interno, descripcion, nHoras
* ordenado por numero de horas de mayor a menor
* (0,2 pt)*/

select cod_asignatura,cod_interno,descripcion,nHoras from asignatura order by nHoras;

/*3. Hallar un listado de asignaturas con codigo de asignatura, cod_interno, descripcion, nHoras
* que tenga relación con la palabra datos
* (0,2 pt)*/


/*4. Hallar el dni y la edad actual (en años) de cada alumno
* (0,4 pt)*/



/*5.  Hallar dni, nombre y apellidos de aquellos alumnos que 
*residan en la población de Murcia'
*(0,4 pt)*/
select dni,nombre,apellido1,apellido2 from alumno, codigopostal where alumno.cp = codigopostal.cp and codigopostal.provincia = 'Murcia';

/*6. Hallar el numero de alumnos diferentes matriculados en el año 2010
*(0,4 pt)*/
select count(distinct(alumno.nre)) from alumno,matricula where alumno.nre = matricula.nre and anyo = '2010';

/*7. Hallar el nombre, apellidos, y nombre de departamento donde trabaja cada profesor 
*(0,4 pt)*/
select p1.nombre,p1.apellido1,p1.apellido2, d1.nombre from profesor p1, departamento d1  where p1.cod_departamento = d1.cod_departamento;

/*8. Hallar los nombres y apellidos de los alumnos, junto con 
el nombre de asignaturas y notas obtenidas en éstas
ordenalo por apellido1
(0,5 pt)*/
select alumno.nombre,alumno.apellido1,alumno.apellido2,asignatura.descripcion,matricula.nota from alumno, matricula,asignatura where alumno.nre = matricula.nre order by apellido1;


/*9. Hallar codigo de asignatura y descripcion de aquellas asignaturas que
se impartieron en el Edificio A en el año 2010 utiliza al menos 
una subconsulta para la reunión de dos tablas
(0,6 pt)*/
select cod_asignatura,descripcion from asignatura, imparte where asignatura.cod_asignatura in (select i1.cod_asig from imparte i1, edificio E1 where E1.nombre = 'Edificio A' and i1.anyo = '2010');

 
/*10. Hallar cuantos alumnos diferentes han obtenido en 2010 una calificación (en cualquier asignatura) 
superior a la media de calificaciones de todas las matriculas de ese mismo año 2010
(0,7 pt)*/

select count(distinct(alumno.nre)) from alumno, matricula where alumno.nre = matricula.nre and anyo = '2010' and matricula.nota > (select avg(nota) from matricula where anyo ='2010');


/*11. Hallar para cada asignatura el nombre, apellidos, descripcion de asignatura y nota de 
los alumnos que más nota han obtenido de dicha asignatura. Ordenalo por apellido1
(1 pt) */

select nombre, apellido1, apellido2, descripcion, nota from alumno a1, matricula m1, asignatura asi1 where a1.nre = m1.nre and m1.nota = (select max(nota) from matricula m2  where m2.nre = m1.nre order by apellido1);

/*12. Hallar nombre y apellidos de aquellos alumnos que hayan obtenido alguna vez
en alguna asignatura una calificación exactamente igual a la calificación media
para dicha asignatura, sin duplicados.
(1 pt)*/



/*13. Hallar nombre y apellidos y edad en años de aquellos alumnos 
que han obtenio la máxima nota en cada asignatura. Incluye solo
los que sean mayores de 30 años, incluye duplicados si existen.
(1 pt)*/ 


/*14. Hallar para cada departamento el nombre del departamento
nombre y apellidos y edad en años del profesor de mayor
edad para ese departamento
(1 pt)*/


/*15. Hallar para cada departamento nombre, apellidos del/los profesores que hayan calificado 
alguna vez alumnos con la maxima nota para ese departamento. Adjunta también el nombre de departamento
, el nre del estudiante que obtuvo la nota y la nota en sí/
(1 pt)*/


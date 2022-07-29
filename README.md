# Backend tabla maestra Brillantemente


Proyecto APi REST de brillantemente, aquí encontraras varios de los enpoints del aplicativo con su funcionamiento.



## Tecnologias

- [Java] - JavaSprintBoot
- [Java] - Java

## Instalacion
```

Creacion de tablas
```sh
CREATE TABLE generos(
	generos_id INTEGER PRIMARY KEY AUTO_INCREMENT,
	nombre VARCHAR(40) NOT NULL
);

CREATE TABLE tipo_usuarios(
	tipo_usuarios_id INTEGER PRIMARY KEY AUTO_INCREMENT,
	nombre VARCHAR(40) NOT NULL
);

CREATE TABLE tipo_identificaciones(
	tipo_identificaciones_id INTEGER PRIMARY KEY AUTO_INCREMENT,
	nombre VARCHAR(40) NOT NULL
);

CREATE TABLE info_usuarios(
	info_usuarios_id INTEGER PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(80) NOT NULL,
    apellido VARCHAR(80) NOT NULL,
    edad VARCHAR(2) NOT NULL,
    identificacion VARCHAR(12) NOT NULL,
    fk_tipo_usuarios_id INTEGER NOT NULL,
    fk_generos_id INTEGER NOT NULL,
    fk_tipo_identificaciones_id INTEGER NOT NULL,
    FOREIGN KEY (fk_tipo_usuarios_id) REFERENCES tipo_usuarios(tipo_usuarios_id),
    FOREIGN KEY (fk_generos_id) REFERENCES tipo_usuarios(generos_id),
    FOREIGN KEY (fk_tipo_identificaciones_id) REFERENCES tipo_usuarios(tipo_identificaciones_id)
);
```

## Servicios (Endpoints)

POST - Agregar usuarios
```sh
http://localhost:8585/api/usuarios
```

Body - Parametros
```sh
{
    "nombre": "Oscar",
    "apellido": "Mesa",
    "edad": "27",
    "identificacion": "0000000",
    "fk_tipo_usuarios_id": 1,
    "fk_generos_id": 1,
    "fk_tipo_identificaciones_id": 1
}
```

PUT - Editar usuarios
```sh
http://localhost:8585/api/usuarios/1
```

Body - Parametros
```sh
{
    "nombre": "Oscar",
    "apellido": "perez",
    "edad": "25",
    "identificacion": "15444444",
    "fk_tipo_usuarios_id": 1,
    "fk_generos_id": 1,
    "fk_tipo_identificaciones_id": 1
}
```

GET - Obtener un solo usuario
```sh
http://localhost:8585/api/usuarios/1
```

GET - Obtener todos los usuarios
```sh
http://localhost:8585/api/usuarios
```

DELETE - Eliminar usuarios
```sh
http://localhost:8585/api/usuarios/1
```


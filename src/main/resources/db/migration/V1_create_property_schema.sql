CREATE TABLE direccion (
    id BIGINT NOT NULL AUTO_INCREMENT,
    tipo_via VARCHAR(255) NOT NULL,
    nombre_via VARCHAR(255) NOT NULL,
    numero VARCHAR(255) NOT NULL,
    ciudad VARCHAR(255) NOT NULL,
    provincia VARCHAR(255) NOT NULL,
    codigo_postal VARCHAR(20) NOT NULL,
    pais VARCHAR(255) NOT NULL,
    fecha_creacion TIMESTAMP(6) NULL,
    fecha_actualizacion TIMESTAMP(6) NULL,

    CONSTRAINT pk_direccion PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci;

CREATE TABLE inmueble (
    id BIGINT NOT NULL AUTO_INCREMENT,
    referencia_catastral VARCHAR(30) NOT NULL,
    clasificacion_inmueble VARCHAR(255) NULL,
    codigo_inmueble VARCHAR(255) NULL,
    fecha_creacion TIMESTAMP(6) NULL,
    fecha_actualizacion TIMESTAMP(6) NULL,

    CONSTRAINT pk_inmueble PRIMARY KEY (id),

    CONSTRAINT uk_inmueble_referencia_catastral
    UNIQUE (referencia_catastral)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci;

CREATE TABLE direccion_inmueble (
    id BIGINT NOT NULL AUTO_INCREMENT,
    direccion_id BIGINT NOT NULL,
    inmueble_id BIGINT NOT NULL,
    es_principal BOOLEAN NOT NULL DEFAULT FALSE,
    fecha_creacion TIMESTAMP(6) NULL,
    fecha_actualizacion TIMESTAMP(6) NULL,

    inmueble_principal_id BIGINT GENERATED ALWAYS AS ( CASE WHEN es_principal = TRUE THEN inmueble_id ELSE NULL END ) STORED,

    CONSTRAINT pk_direccion_inmueble PRIMARY KEY (id),
    CONSTRAINT uk_direccion_inmueble UNIQUE (direccion_id, inmueble_id),
    CONSTRAINT uk_inmueble_direccion_principal UNIQUE (inmueble_principal_id),
    CONSTRAINT fk_direccion_inmueble_inmueble FOREIGN KEY (inmueble_id) REFERENCES inmueble(id),
    CONSTRAINT fk_direccion_inmueble_direccion FOREIGN KEY (direccion_id) REFERENCES direccion(id)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci;

CREATE TABLE piso (
    id BIGINT NOT NULL AUTO_INCREMENT,
    planta VARCHAR(20) NOT NULL,
    puerta VARCHAR(20) NOT NULL,
    inmueble_id BIGINT NOT NULL,
    metros_cuadrados DECIMAL(12, 2) NOT NULL,
    precio DECIMAL(12, 2) NOT NULL,
    descripcion VARCHAR(255) NOT NULL,
    estado VARCHAR(255) NOT NULL,
    fecha_creacion TIMESTAMP(6) NULL,
    fecha_actualizacion TIMESTAMP(6) NULL,
    numero_habitaciones INT NOT NULL,
    numero_banos INT NOT NULL,
    tipo_piso VARCHAR(255) NOT NULL,
    imagen_url VARCHAR(255),

    CONSTRAINT pk_piso PRIMARY KEY (id),

    CONSTRAINT fk_piso_inmueble
    FOREIGN KEY (inmueble_id) REFERENCES inmueble(id)

) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci;

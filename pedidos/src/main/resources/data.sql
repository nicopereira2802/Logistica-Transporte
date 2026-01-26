-- ====================
-- CIUDADES
-- ====================
INSERT INTO ciudad (latitud_ciudad, longitud_ciudad, nombre_ciudad) VALUES
  (-31.4167, -64.1833, 'Córdoba'),
  (-32.9500, -60.6667, 'Rosario'),
  (-32.8908, -68.8272, 'Mendoza'),
  (-34.6037, -58.3816, 'Buenos Aires'),
  (-24.7829, -65.4232, 'Salta');

-- ====================
-- CLIENTES
-- ====================
INSERT INTO cliente (nombre, email, contrasena) VALUES
  ('Juan Pérez', 'juan@example.com', '1234'),
  ('Ana Gómez', 'ana@example.com', 'abcd'),
  ('Carlos Díaz', 'carlos@example.com', 'pass123'),
  ('Laura Torres', 'laura@example.com', 'secure456');

-- ====================
-- CAMIONES
-- ====================
INSERT INTO camion (capacidad_peso, capacidad_volumen, disponible) VALUES
  (12000.0, 90.0, TRUE),
  (15000.0, 100.0, FALSE),
  (8000.0, 60.0, TRUE),
  (2000.0, 1000.0, TRUE);

-- ====================
-- ESTADOS
-- ====================
INSERT INTO estado (nombre) VALUES
  ('Retirado de origen'),
  ('Entregado en depósito'),
  ('Retirado de depósito'),
  ('Entregado en destino'),
  ('Pendiente de despacho');

-- ====================
-- CONTENEDORES
-- ====================
INSERT INTO contenedor (peso, volumen, estado_id, cliente_id) VALUES
  (500.0, 4.0, 1, 1),
  (800.0, 6.5, 2, 2),
  (1200.0, 8.0, 3, 3),
  (700.0, 5.0, 1, 4),
  (900.0, 200000.0, 1, 2),
  (1000000.0, 400.0, 1, 1),
  (1300.0, 9.0, 4, 1),
  (950.0, 6.8, 4, 2),
  (620.0, 4.0, 5, 1),
  (10.0, 10.0, 5, 1);

-- ====================
-- DEPÓSITOS
-- ====================
INSERT INTO deposito (ciudad_id, direccion, latitud_deposito, longitud_deposito) VALUES
  (1, 'Av. Siempre Viva 123', -31.4201, -64.1888),
  (2, 'Calle Falsa 456', -32.9511, -60.6677),
  (3, 'Ruta 7 km 102', -32.8915, -68.8279),
  (4, 'Av. Corrientes 2400', -34.6045, -58.3821),
  (5, 'Mitre 321', -24.7850, -65.4238);

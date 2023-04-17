INSERT INTO
  specie (name)
VALUES
  ("mamifero");

INSERT INTO
  specie (name)
VALUES
  ("ave");

INSERT INTO
  specie (name)
VALUES
  ("reptil");

INSERT INTO
  specie (name)
VALUES
  ("ranas");

INSERT INTO
  specie (name)
VALUES
  ("sapos");

INSERT INTO
  breed (id_specie, name)
VALUES
  (1, "Husky");

INSERT INTO
  breed (id_specie, name)
VALUES
  (1, "Persa");

INSERT INTO
  breed (id_specie, name)
VALUES
  (2, "Aromobatidae");

INSERT INTO
  breed (id_specie, name)
VALUES
  (3, "Bufo bufo");

INSERT INTO
  breed (id_specie, name)
VALUES
  (4, "Geck");

INSERT INTO
  breed (id_specie, name)
VALUES
  (5, "Gallina domestica");

INSERT INTO
  gender (name)
VALUES
  ("Hombre");

INSERT INTO
  gender (name)
VALUES
  ("Mujer");

INSERT INTO
  gender (name)
VALUES
  ("Macho");

INSERT INTO
  gender (name)
VALUES
  ("Hembra");

INSERT INTO
  email_client (email)
VALUES
  ("amanteGatos3999@gmail.com");

INSERT INTO
  email_client (email)
VALUES
  ("donramon@gmail.com");

INSERT INTO
  email_client (email)
VALUES
  ("tangiro@gmail.com");

INSERT INTO
  email_client (email)
VALUES
  ("tomioka@gmail.com");

INSERT INTO
  email_client (email)
VALUES
  ("saitama@gmail.com");

INSERT INTO
  email_client (email)
VALUES
  ("nina_tucker@gmail.com");

INSERT INTO
  email_client (email)
VALUES
  ("hajimenoippo@gmail.com");

INSERT INTO
  email_employee (email)
VALUES
  ("trabajador1@trabajo1.com");

INSERT INTO
  email_employee (email)
VALUES
  ("trabajador2@trabajo2.com");

INSERT INTO
  email_employee (email)
VALUES
  ("trabajador3@trabajo3.com");

INSERT INTO
  email_employee (email)
VALUES
  ("trabajador4@trabajo4.com");

INSERT INTO
  email_employee (email)
VALUES
  ("trabajador5@trabajo5.com");

INSERT INTO
  email_brand (email)
VALUES
  ("curaTodoanimales@gmail.com");

INSERT INTO
  email_brand (email)
VALUES
  ("thorfinn@gmail.com");

INSERT INTO
  email_brand (email)
VALUES
  ("zoro@gmail.com");

INSERT INTO
  email_brand (email)
VALUES
  ("chopper@gmail.com");

INSERT INTO
  email_laboratory (email)
VALUES
  ("laboratoryHirilukChopper@onepiece.com");

INSERT INTO
  email_laboratory (email)
VALUES
  ("serena@sailorscout.com");

INSERT INTO
  email_laboratory (email)
VALUES
  ("tokyorevenger@tokyorevenger.com");

INSERT INTO
  email_laboratory (email)
VALUES
  ("drstone@onepiece.com");

INSERT INTO
  email_laboratory (email)
VALUES
  ("greatexplosionmurderdynamight@bokunohero.com");

INSERT INTO
  rol (name)
VALUES
  ("conserje");

INSERT INTO
  rol (name)
VALUES
  ("cajero");

INSERT INTO
  rol (name)
VALUES
  ("veterinario");

INSERT INTO
  rol (name)
VALUES
  ("jefe");

INSERT INTO
  rol (name)
VALUES
  ("zoro");

INSERT INTO
  medication_form (name) VALUE("solidas");

INSERT INTO
  medication_form (name) VALUE("semisolidas");

INSERT INTO
  medication_form (name) VALUE("liquidas");

INSERT INTO
  medication_form (name) VALUE("gaseosas");

INSERT INTO
  via_administration (id_medication_form, name) VALUE(1, "oral");

INSERT INTO
  via_administration (id_medication_form, name) VALUE(1, "rectal");

INSERT INTO
  via_administration (id_medication_form, name) VALUE(2, "topica");

INSERT INTO
  via_administration (id_medication_form, name) VALUE(3, "rectal");

INSERT INTO
  via_administration (id_medication_form, name) VALUE(3, "oral");

INSERT INTO
  via_administration (id_medication_form, name) VALUE(3, "topical");

INSERT INTO
  via_administration (id_medication_form, name) VALUE(4, "oral");

INSERT INTO
  country (name)
VALUES
  ("Mexico");

INSERT INTO
  country (name)
VALUES
  ("Estados Unidos");

INSERT INTO
  country (name)
VALUES
  ("Colombia");

INSERT INTO
  state_country (id_country, name)
VALUES
  (1, "Baja California Norte");

INSERT INTO
  state_country (id_country, name)
VALUES
  (1, "Ciudad de México");

INSERT INTO
  state_country (id_country, name)
VALUES
  (2, "California");

INSERT INTO
  state_country (id_country, name)
VALUES
  (3, "Cundimarca");

INSERT INTO
  municipality (id_state_country, name)
VALUES
  (1, "Tijuana");

INSERT INTO
  municipality (id_state_country, name)
VALUES
  (3, "Los Angeles");

INSERT INTO
  municipality (id_state_country, name)
VALUES
  (2, "Azcapotzalco");

INSERT INTO
  municipality (id_state_country, name)
VALUES
  (4, "Bogota");

INSERT INTO
  colony (id_municipality, name)
VALUES
  (1, "Zona Centro");

INSERT INTO
  colony (id_municipality, name)
VALUES
  (4, " El Recreo");

INSERT INTO
  colony (id_municipality, name)
VALUES
  (2, "Little Tokyo");

INSERT INTO
  street(id_colony, name)
VALUES
  (1, "Avenida Constitucion tercera y cuarta");

INSERT INTO
  street(id_colony, name)
VALUES
  (1, "5 y 10, Burger King");

INSERT INTO
  address(
    id_street,
    reference,
    postal_code,
    num_int,
    num_ext
  )
VALUES
  (
    1,
    "Donde se quemo la plaza constitución, en waldos",
    22000,
    910,
    1
  );

INSERT INTO
  address(
    id_street,
    reference,
    postal_code,
    num_int,
    num_ext
  )
VALUES
  (1, "Ningún lugar", 23000, 13, NULL);

INSERT INTO
  type_telephone (name)
VALUES
  ("Casa");

INSERT INTO
  type_telephone (name)
VALUES
  ("Trabajo");

INSERT INTO
  type_telephone (name)
VALUES
  ("Familiar");

INSERT INTO
  type_telephone (name)
VALUES
  ("Conocido");

INSERT INTO
  client(
    first_name,
    last_name,
    second_last_name,
    id_email_client,
    id_gender,
    id_address
  )
VALUES
  (
    "Josue",
    "Sandoval",
    "Villarreal",
    1,
    1,
    1
  );

INSERT INTO
  client(
    first_name,
    last_name,
    second_last_name,
    id_email_client,
    id_gender,
    id_address
  )
VALUES
  (
    "Getsemani",
    "Sandoval",
    "Villarreal",
    4,
    1,
    1
  );

INSERT INTO
  client(
    first_name,
    last_name,
    second_last_name,
    id_email_client,
    id_gender,
    id_address
  )
VALUES
  (
    "Evelyn ",
    "Romero",
    "Audifred",
    5,
    2,
    1
  );
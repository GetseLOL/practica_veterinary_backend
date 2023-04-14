-- Active: 1681162059539@@localhost@3306@veterinarydb
CREATE TABLE specie(
                     id BIGINT PRIMARY KEY AUTO_INCREMENT,
                     name VARCHAR(45) NOT NULL UNIQUE
);

CREATE TABLE breed (
                     id BIGINT PRIMARY KEY AUTO_INCREMENT,
                     name VARCHAR(45) NOT NULL UNIQUE,
                     id_specie BIGINT NOT NULL,
                     FOREIGN KEY (id_specie) REFERENCES specie(id) ON DELETE RESTRICT
);

CREATE TABLE gender(
                     id BIGINT PRIMARY KEY AUTO_INCREMENT,
                     name VARCHAR(50) NOT NULL UNIQUE
);

#EMAILS
CREATE TABLE email_client(
                           id BIGINT AUTO_INCREMENT PRIMARY KEY,
                           email VARCHAR(60) NOT NULL UNIQUE
);

CREATE TABLE email_employee(
                             id BIGINT AUTO_INCREMENT PRIMARY KEY,
                             email VARCHAR(60) NOT NULL UNIQUE
);

CREATE TABLE email_brand (
                           id BIGINT PRIMARY KEY AUTO_INCREMENT,
                           email VARCHAR(200) NOT NULL UNIQUE
);

CREATE TABLE email_laboratory (
                                id BIGINT PRIMARY KEY AUTO_INCREMENT,
                                email VARCHAR(200) NOT NULL UNIQUE
);

#SOCIAL NETWORKS
CREATE TABLE social_network(
                             id int PRIMARY KEY AUTO_INCREMENT,
                             name varchar(60) UNIQUE NOT NULL
);

#ROL
CREATE TABLE rol(
                  id BIGINT PRIMARY KEY AUTO_INCREMENT,
                  name varchar(45) UNIQUE NOT NULL
);

#MEDICATION FORM
CREATE TABLE medication_form (
                               id INT PRIMARY KEY AUTO_INCREMENT,
                               name VARCHAR(50) NOT NULL UNIQUE
);

#via administration
CREATE TABLE via_administration(
                                 id INT PRIMARY KEY AUTO_INCREMENT,
                                 name VARCHAR(50) NOT NULL,
                                 id_medication_form INT NOT NULL,
                                 FOREIGN KEY (id_medication_form) REFERENCES medication_form(id)
);

#BATCH CODE
CREATE TABLE batch_code(
                         id VARCHAR(50) PRIMARY KEY,
                         amount INT NOT NULL,
                         date_receive DATE NOT NULL,
                         expiration_date DATE NOT NULL
);

#COUNTRIES
CREATE TABLE country (
                       id INT PRIMARY KEY AUTO_INCREMENT,
                       name varchar(60) NOT NULL UNIQUE
);

CREATE TABLE state_country(
                            id BIGINT PRIMARY KEY AUTO_INCREMENT,
                            name varchar(60) NOT NULL UNIQUE,
                            id_country INT NOT NULL,
                            FOREIGN KEY (id_country) REFERENCES country(id) ON DELETE RESTRICT
);

CREATE TABLE municipality (
                            id BIGINT PRIMARY KEY AUTO_INCREMENT,
                            name varchar(60) NOT NULL,
                            id_state_country BIGINT NOT NULL,
                            FOREIGN KEY (id_state_country) REFERENCES state_country(id) ON DELETE RESTRICT
);

CREATE TABLE colony (
                      id BIGINT PRIMARY KEY AUTO_INCREMENT,
                      name varchar(60) NOT NULL,
                      id_municipality BIGINT NOT NULL,
                      FOREIGN KEY (id_municipality) REFERENCES municipality(id) ON DELETE RESTRICT
);

CREATE TABLE street(
                     id BIGINT PRIMARY KEY AUTO_INCREMENT,
                     name varchar(60) NOT NULL,
                     id_colony BIGINT NOT NULL,
                     FOREIGN KEY (id_colony) REFERENCES colony(id) ON DELETE RESTRICT
);

CREATE TABLE address (
                       id BIGINT PRIMARY KEY AUTO_INCREMENT,
                       id_street BIGINT NOT NULL,
                       reference varchar(250),
                       postal_code varchar(25) NOT NULL,
                       num_int varchar(25) NOT NULL,
                       num_ext varchar(25),
                       FOREIGN KEY (id_street) REFERENCES street(id) ON DELETE RESTRICT
);

#type telephone
CREATE TABLE type_telephone(
                             id BIGINT PRIMARY KEY AUTO_INCREMENT,
                             name VARCHAR(100) NOT NULL UNIQUE
);

#client
CREATE TABLE client (
                      id BIGINT PRIMARY KEY AUTO_INCREMENT,
                      first_name VARCHAR(25) NOT NULL,
                      last_name VARCHAR(25) NOT NULL,
                      second_last_name VARCHAR(25),
                      id_email_client BIGINT NOT NULL UNIQUE,
                      id_gender BIGINT NOT NULL,
                      id_address BIGINT NOT NULL,
                      FOREIGN KEY (id_email_client) REFERENCES email_client (id) ON DELETE RESTRICT,
                      FOREIGN KEY (id_gender) REFERENCES gender (id) ON DELETE RESTRICT,
                      FOREIGN KEY (id_address) REFERENCES address (id) ON DELETE RESTRICT
);

CREATE TABLE telephones_clients (
                                id BIGINT PRIMARY KEY AUTO_INCREMENT,
                                id_client BIGINT NOT NULL,
                                id_type_telephone BIGINT NOT NULL,
                                phone_number VARCHAR(30) NOT NULL,
                                FOREIGN KEY (id_client) REFERENCES client (id) ON DELETE RESTRICT,
                                FOREIGN KEY (id_type_telephone) REFERENCES type_telephone (id) ON DELETE RESTRICT
);

CREATE TABLE social_networks_clients(
                                    id BIGINT PRIMARY KEY AUTO_INCREMENT,
                                    id_client BIGINT NOT NULL,
                                    id_social_network INT NOT NULL,
                                    url VARCHAR(250) NOT NULL UNIQUE,
                                    FOREIGN KEY (id_client) REFERENCES client (id) ON DELETE RESTRICT,
                                    FOREIGN KEY (id_social_network) REFERENCES social_network (id) ON DELETE CASCADE
);

#patient
CREATE TABLE patient (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    id_client BIGINT NOT NULL,
    name VARCHAR (50) NOT NULL,
    year_old SMALLINT,
    age_month VARCHAR(30),
    weight VARCHAR(30) NOT NULL,
    height VARCHAR(30) NOT NULL,
    id_breed BIGINT NOT NULL,
    id_gender BIGINT NOT NULL,
    num_visits INT NOT NULL,
    FOREIGN KEY (id_breed) REFERENCES breed (id) ON DELETE RESTRICT,
    FOREIGN KEY (id_gender) REFERENCES gender (id) ON DELETE RESTRICT,
    FOREIGN KEY (id_client) REFERENCES client (id) ON DELETE RESTRICT
);

CREATE TABLE allergy(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(60) NOT NULL UNIQUE
);

CREATE TABLE allergies_patients(
    id_patient BIGINT NOT NULL,
    id_allergy BIGINT NOT NULL,
    FOREIGN KEY (id_patient) REFERENCES patient (id) ON DELETE RESTRICT,
    FOREIGN KEY (id_allergy) REFERENCES allergy (id) ON DELETE RESTRICT
);

CREATE TABLE social_networks_patients(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    id_patient BIGINT NOT NULL,
    id_social_network INT NOT NULL,
    url VARCHAR(250) NOT NULL UNIQUE,
    FOREIGN KEY (id_patient) REFERENCES patient (id) ON DELETE RESTRICT,
    FOREIGN KEY (id_social_network) REFERENCES social_network (id) ON DELETE CASCADE
);

#employee
CREATE TABLE employee (
                        id BIGINT PRIMARY KEY AUTO_INCREMENT,
                        first_name VARCHAR(25) NOT NULL,
                        last_name VARCHAR(25) NOT NULL,
                        second_last_name VARCHAR(25),
                        salary DECIMAL NOT NULL,
                        id_email_employee BIGINT,
                        id_gender BIGINT,
                        id_address BIGINT NOT NULL,
                        id_rol BIGINT NOT NULL,
                        FOREIGN KEY (id_email_employee) REFERENCES email_employee (id) ON DELETE RESTRICT,
                        FOREIGN KEY (id_gender) REFERENCES gender (id) ON DELETE RESTRICT,
                        FOREIGN KEY (id_address) REFERENCES address (id) ON DELETE RESTRICT,
                        FOREIGN KEY (id_rol) REFERENCES rol (id) ON DELETE RESTRICT
);

CREATE TABLE veterinary (
                          id BIGINT PRIMARY KEY AUTO_INCREMENT,
                          id_employee BIGINT NOT NULL UNIQUE,
                          identification_card VARCHAR(100) NOT NULL UNIQUE,
                          university VARCHAR(40) NOT NULL,
                          career VARCHAR(40) NOT NULL,
                          graduate TIMESTAMP,
                          FOREIGN KEY (id_employee) REFERENCES employee (id) ON DELETE RESTRICT
);

CREATE TABLE speciality (
                          id BIGINT PRIMARY KEY AUTO_INCREMENT,
                          name VARCHAR(50) NOT NULL,
                          id_veterinary BIGINT NOT NULL,
                          FOREIGN KEY (id_veterinary) REFERENCES veterinary (id) ON DELETE CASCADE
);

CREATE TABLE telephones_employees (
                                  id BIGINT PRIMARY KEY AUTO_INCREMENT,
                                  id_employee BIGINT NOT NULL,
                                  id_type_telephone BIGINT NOT NULL,
                                  phone_number VARCHAR(30) NOT NULL UNIQUE,
                                  FOREIGN KEY (id_employee) REFERENCES employee (id) ON DELETE RESTRICT,
                                  FOREIGN KEY (id_type_telephone) REFERENCES type_telephone (id) ON DELETE RESTRICT
);

CREATE TABLE social_networks_veterinaries(
                                        id BIGINT PRIMARY KEY AUTO_INCREMENT,
                                        id_veterinary BIGINT NOT NULL,
                                        id_social_network INT NOT NULL,
                                        url varchar(250) NOT NULL UNIQUE,
                                        FOREIGN KEY (id_veterinary) REFERENCES veterinary (id) ON DELETE RESTRICT,
                                        FOREIGN KEY (id_social_network) REFERENCES social_network (id) ON DELETE CASCADE
);

##medical appointment
CREATE TABLE medical_appointment(
                                  id VARCHAR(60) PRIMARY KEY,
                                  id_veterinary BIGINT NOT NULL,
                                  id_patient BIGINT NOT NULL,
                                  consultation_date TIMESTAMP NOT NULL,
                                  community_service BOOLEAN NOT NULL,
                                  payment DECIMAL NOT NULL,
                                  FOREIGN KEY (id_veterinary) REFERENCES veterinary (id) ON DELETE RESTRICT,
                                  FOREIGN KEY (id_patient) REFERENCES patient (id) ON DELETE RESTRICT
);

#CONSULTATION
CREATE TABLE medical_consultation(
                                   id VARCHAR(60) PRIMARY KEY,
                                   id_medical_appointment VARCHAR(60) NOT NULL,
                                   description LONGTEXT NOT NULL,
                                   consultation_date TIMESTAMP NOT NULL,
                                   next_consultation TIMESTAMP,
                                   FOREIGN KEY (id_medical_appointment) REFERENCES medical_appointment (id) ON DELETE RESTRICT
);

#LABORATORY
CREATE TABLE laboratory(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    laboratory_code VARCHAR(30) UNIQUE ,
    name VARCHAR(100) NOT NULL UNIQUE,
    rfc VARCHAR(13) NOT NULL UNIQUE,
    id_country INT NOT NULL,
    id_email_laboratory BIGINT NOT NULL,
    FOREIGN KEY(id_country) REFERENCES country(id),
    FOREIGN KEY(id_email_laboratory) REFERENCES email_laboratory(id)
);

CREATE TABLE telephones_laboratory(
                                   id BIGINT PRIMARY KEY AUTO_INCREMENT,
                                   id_type_telephone BIGINT NOT NULL,
                                   id_laboratory BIGINT NOT NULL,
                                   phone_number VARCHAR(30) UNIQUE NOT NULL,
                                   FOREIGN KEY (id_type_telephone) REFERENCES type_telephone (id) ON DELETE CASCADE,
                                   FOREIGN KEY (id_laboratory) REFERENCES laboratory (id) ON DELETE CASCADE
);

CREATE TABLE social_networks_laboratory(
                                        id BIGINT PRIMARY KEY AUTO_INCREMENT,
                                        id_social_network INT NOT NULL,
                                        id_laboratory BIGINT NOT NULL,
                                        url VARCHAR(250) UNIQUE NOT NULL,
                                        FOREIGN KEY (id_social_network) REFERENCES social_network(id) ON DELETE CASCADE,
                                        FOREIGN KEY (id_laboratory) REFERENCES laboratory (id) ON DELETE CASCADE
);

#BRAND
CREATE TABLE brand(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    rfc VARCHAR(13),
    name VARCHAR(50) NOT NULL UNIQUE,
    registration DATE NOT NULL,
    id_country INT NOT NULL,
    id_email_brand BIGINT NOT NULL,
    FOREIGN KEY(id_country) REFERENCES country(id),
    FOREIGN KEY(id_email_brand) REFERENCES email_brand(id)
);



CREATE TABLE social_networks_brands(
                                   id BIGINT PRIMARY KEY AUTO_INCREMENT,
                                   id_social_network INT NOT NULL,
                                   id_brand BIGINT NOT NULL,
                                   URL VARCHAR(250) UNIQUE NOT NULL,
                                   FOREIGN KEY (id_social_network) REFERENCES social_network(id) ON DELETE CASCADE,
                                   FOREIGN KEY (id_brand) REFERENCES brand (id) ON DELETE CASCADE
);

CREATE TABLE telephones_brands(
                              id BIGINT PRIMARY KEY AUTO_INCREMENT,
                              id_type_telephone BIGINT NOT NULL,
                              id_brand BIGINT NOT NULL,
                              phone_number VARCHAR(30) UNIQUE NOT NULL,
                              FOREIGN KEY (id_type_telephone) REFERENCES type_telephone (id) ON DELETE CASCADE,
                              FOREIGN KEY (id_brand) REFERENCES brand (id) ON DELETE CASCADE
);

CREATE TABLE laboratory_brand (
                                  id_brand BIGINT NOT NULL,
                                  id_laboratory BIGINT NOT NULL,
                                  FOREIGN KEY (id_brand) REFERENCES brand (id) ON DELETE CASCADE,
                                  FOREIGN KEY (id_laboratory) REFERENCES laboratory (id) ON DELETE CASCADE
);


#MEDICINE
CREATE TABLE medicine (
                        id BIGINT PRIMARY KEY AUTO_INCREMENT,
                        name VARCHAR(200) NOT NULL,
                        id_generic_name BIGINT NOT NULL,
                        id_batch_code VARCHAR(50) NOT NULL,
                        id_brand BIGINT NOT NULL,
                        dose VARCHAR(200),
                        FOREIGN KEY (id_batch_code) REFERENCES batch_code (id) ON DELETE CASCADE,
                        FOREIGN KEY (id_brand) REFERENCES brand (rfc) ON DELETE CASCADE,
                        FOREIGN KEY (id_generic_name) REFERENCES generic_name (id) ON DELETE CASCADE
);

CREATE TABLE generic_name(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(200) NOT NULL,
    id_breed BIGINT NOT NULL,
    id_via_administration INT NOT NULL,
    FOREIGN KEY (id_breed) REFERENCES breed (id) ON DELETE CASCADE,
    FOREIGN KEY (id_via_administration) REFERENCES via_administration (id) ON DELETE CASCADE
);

#PRODUCT
CREATE TABLE product(
    id VARCHAR(50) PRIMARY KEY,
    description LONGTEXT,
    type ENUM('medicine') NOT NULL,
    unit_price DECIMAL NOT NULL
);

CREATE TABLE product_medicine(
    id_product BIGINT NOT NULL,
    id_medicine BIGINT NOT NULL,
    FOREIGN KEY (id_product) REFERENCES product(id),
    FOREIGN KEY (id_medicine) REFERENCES medicine(id)
);
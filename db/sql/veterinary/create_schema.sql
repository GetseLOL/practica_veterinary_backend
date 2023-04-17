-- Active: 1681162059539@@localhost@3306@veterinarydb
CREATE TABLE specie(
                       id BIGINT PRIMARY KEY AUTO_INCREMENT,
                       name VARCHAR(45) NOT NULL UNIQUE
);

CREATE TABLE breed (
                       id BIGINT PRIMARY KEY AUTO_INCREMENT,
                       name VARCHAR(45) NOT NULL UNIQUE,
                       id_specie BIGINT NOT NULL,
                       FOREIGN KEY (id_specie) REFERENCES specie(id)
);

CREATE TABLE gender(
                       id BIGINT PRIMARY KEY AUTO_INCREMENT,
                       name VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE allergy(
                        id BIGINT PRIMARY KEY AUTO_INCREMENT,
                        name VARCHAR(60) NOT NULL UNIQUE
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
                                   FOREIGN KEY (id_medication_form) REFERENCES medication_form(id) ON DELETE CASCADE ON UPDATE CASCADE
);

#BATCH CODE
CREATE TABLE batch_code(
                           id VARCHAR(36) PRIMARY KEY,
                           amount INT NOT NULL,
                           date_receive DATE NOT NULL
);

CREATE TABLE expiration(
                           id BIGINT PRIMARY KEY,
                           expiration_date_time TIMESTAMP NOT NULL,
                           id_batch_code VARCHAR(36) NOT NULL,
                           FOREIGN KEY (id_batch_code) REFERENCES batch_code(id)
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
                              FOREIGN KEY (id_country) REFERENCES country(id)
);

CREATE TABLE municipality (
                              id BIGINT PRIMARY KEY AUTO_INCREMENT,
                              name varchar(60) NOT NULL,
                              id_state_country BIGINT NOT NULL,
                              FOREIGN KEY (id_state_country) REFERENCES state_country(id)
);

CREATE TABLE colony (
                        id BIGINT PRIMARY KEY AUTO_INCREMENT,
                        name varchar(60) NOT NULL,
                        id_municipality BIGINT NOT NULL,
                        FOREIGN KEY (id_municipality) REFERENCES municipality(id)
);

CREATE TABLE street(
                       id BIGINT PRIMARY KEY AUTO_INCREMENT,
                       name varchar(60) NOT NULL,
                       id_colony BIGINT NOT NULL,
                       FOREIGN KEY (id_colony) REFERENCES colony(id) ON UPDATE CASCADE
);

CREATE TABLE address (
                         id BIGINT PRIMARY KEY AUTO_INCREMENT,
                         id_street BIGINT NOT NULL,
                         reference varchar(250),
                         postal_code varchar(25) NOT NULL,
                         num_int varchar(25) NOT NULL,
                         num_ext varchar(25),
                         FOREIGN KEY (id_street) REFERENCES street(id) ON UPDATE CASCADE
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

##UNIVERSITY
CREATE TABLE university(
                           id INT AUTO_INCREMENT PRIMARY KEY,
                           name VARCHAR(40) NOT NULL UNIQUE
);

CREATE TABLE career (
                        id BIGINT PRIMARY KEY,
                        name VARCHAR(40) NOT NULL,
                        id_university INT NOT NULL,
                        FOREIGN KEY(id_university) REFERENCES university(id)
);

#patient
CREATE TABLE patient (
                         id BIGINT PRIMARY KEY AUTO_INCREMENT,
                         id_client BIGINT NOT NULL,
                         name VARCHAR (50) NOT NULL,
                         date_of_birth DATE,
                         year_old SMALLINT,
                         age_month VARCHAR(30),
                         weight FLOAT NOT NULL,
                         height FLOAT NOT NULL,
                         id_breed BIGINT NOT NULL,
                         id_gender BIGINT NOT NULL,
                         num_visits INT NOT NULL,
                         FOREIGN KEY (id_breed) REFERENCES breed (id) ON DELETE RESTRICT,
                         FOREIGN KEY (id_gender) REFERENCES gender (id) ON DELETE RESTRICT,
                         FOREIGN KEY (id_client) REFERENCES client (id) ON DELETE RESTRICT
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
                          id_gender BIGINT NOT NULL,
                          id_address BIGINT NOT NULL,
                          id_rol BIGINT NOT NULL,
                          FOREIGN KEY (id_email_employee) REFERENCES email_employee (id) ON DELETE RESTRICT,
                          FOREIGN KEY (id_gender) REFERENCES gender (id) ON DELETE RESTRICT,
                          FOREIGN KEY (id_address) REFERENCES address (id) ON DELETE RESTRICT,
                          FOREIGN KEY (id_rol) REFERENCES rol (id) ON DELETE RESTRICT
);

CREATE TABLE speciality (
                            id BIGINT PRIMARY KEY AUTO_INCREMENT,
                            name VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE veterinary (
                            id BIGINT PRIMARY KEY AUTO_INCREMENT,
                            id_employee BIGINT NOT NULL UNIQUE,
                            identification_card VARCHAR(100) NOT NULL UNIQUE,
                            id_speciality BIGINT NOT NULL,
                            id_career BIGINT NOT NULL,
                            graduate TIMESTAMP,
                            FOREIGN KEY (id_employee) REFERENCES employee (id) ON DELETE RESTRICT,
                            FOREIGN KEY (id_speciality) REFERENCES speciality (id) ON DELETE RESTRICT,
                            FOREIGN KEY (id_career) REFERENCES career (id) ON DELETE RESTRICT
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
                                             FOREIGN KEY (id_social_network) REFERENCES social_network (id) ON DELETE RESTRICT
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
                                     start_time TIMESTAMP NOT NULL,
                                     end_time TIMESTAMP,
                                     next_consultation TIMESTAMP,
                                     FOREIGN KEY (id_medical_appointment) REFERENCES medical_appointment (id)
);

#LABORATORY
CREATE TABLE laboratory(
                           id BIGINT PRIMARY KEY AUTO_INCREMENT,
                           laboratory_code VARCHAR(30) UNIQUE NOT NULL,
                           name VARCHAR(100) NOT NULL UNIQUE,
                           rfc VARCHAR(13) NOT NULL UNIQUE,
                           id_country INT NOT NULL,
                           id_email_laboratory BIGINT NOT NULL,
                           FOREIGN KEY(id_country) REFERENCES country(id),
                           FOREIGN KEY(id_email_laboratory) REFERENCES email_laboratory(id)
);

CREATE TABLE telephones_laboratories(
                                        id BIGINT PRIMARY KEY AUTO_INCREMENT,
                                        id_type_telephone BIGINT NOT NULL,
                                        id_laboratory BIGINT NOT NULL,
                                        phone_number VARCHAR(30) UNIQUE NOT NULL,
                                        FOREIGN KEY (id_type_telephone) REFERENCES type_telephone (id),
                                        FOREIGN KEY (id_laboratory) REFERENCES laboratory (id)
);

CREATE TABLE social_networks_laboratories(
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
                      rfc VARCHAR(13) UNIQUE,
                      name VARCHAR(50) NOT NULL,
                      registration DATE NOT NULL,
                      id_country INT NOT NULL,
                      id_email_brand BIGINT NOT NULL UNIQUE,
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

CREATE TABLE generic_name(
                             id BIGINT PRIMARY KEY AUTO_INCREMENT,
                             name VARCHAR(200) NOT NULL,
                             id_breed BIGINT NOT NULL,
                             FOREIGN KEY (id_breed) REFERENCES breed (id) ON DELETE CASCADE
);

#CATEGORY
CREATE TABLE category (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(200) NOT NULL UNIQUE
);

#MEDICINE
CREATE TABLE medicine (
                          id BIGINT PRIMARY KEY AUTO_INCREMENT,
                          name VARCHAR(200) NOT NULL,
                          indication LONGTEXT,
                          duration INTEGER NOT NULL,
                          unit_price DECIMAL NOT NULL,
                          id_generic_name BIGINT NOT NULL,
                          id_category BIGINT NOT NULL,
                          id_batch_code VARCHAR(50) NOT NULL,
                          id_brand BIGINT NOT NULL,
                          FOREIGN KEY (id_category) REFERENCES category (id) ON DELETE CASCADE ON UPDATE CASCADE,
                          FOREIGN KEY (id_batch_code) REFERENCES batch_code (id),
                          FOREIGN KEY (id_brand) REFERENCES brand (id) ON UPDATE CASCADE ON DELETE CASCADE,
                          FOREIGN KEY (id_generic_name) REFERENCES generic_name (id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE generic_name_via_administration(
                                                id_generic_name BIGINT NOT NULL,
                                                id_via_administration INT NOT NULL,
                                                FOREIGN KEY (id_via_administration) REFERENCES via_administration (id) ON DELETE CASCADE ON UPDATE CASCADE,
                                                FOREIGN KEY (id_generic_name) REFERENCES generic_name (id) ON DELETE CASCADE ON UPDATE CASCADE
);
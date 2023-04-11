-- Active: 1681162059539@@localhost@3306@veterinarydb
CREATE TABLE specie(
                     id_specie BIGINT PRIMARY KEY AUTO_INCREMENT,
                     name VARCHAR(45) NOT NULL UNIQUE
);

CREATE TABLE breed (
                     id_breed BIGINT PRIMARY KEY AUTO_INCREMENT,
                     name VARCHAR(45) NOT NULL UNIQUE,
                     id_specie BIGINT NOT NULL,
                     FOREIGN KEY (id_specie) REFERENCES specie(id_specie) ON DELETE RESTRICT
);

CREATE TABLE gender(
                     id_gender BIGINT PRIMARY KEY AUTO_INCREMENT,
                     name VARCHAR(50) NOT NULL UNIQUE
);

#EMAILS
CREATE TABLE email_client(
                           id_email_client BIGINT AUTO_INCREMENT PRIMARY KEY,
                           email VARCHAR(60) NOT NULL UNIQUE
);

CREATE TABLE email_employee(
                             id_email_employee BIGINT AUTO_INCREMENT PRIMARY KEY,
                             email VARCHAR(60) NOT NULL UNIQUE
);

CREATE TABLE email_brand (
                           id_email_brand BIGINT PRIMARY KEY AUTO_INCREMENT,
                           email VARCHAR(200) NOT NULL UNIQUE
);

CREATE TABLE email_laboratory (
                                id_email_laboratory BIGINT PRIMARY KEY AUTO_INCREMENT,
                                email VARCHAR(200) NOT NULL UNIQUE
);

#SOCIAL NETWORKS
CREATE TABLE social_network(
                             id_social_network int PRIMARY KEY AUTO_INCREMENT,
                             name varchar(60) UNIQUE NOT NULL
);

#ROL
CREATE TABLE rol(
                  id_rol BIGINT PRIMARY KEY AUTO_INCREMENT,
                  name varchar(45) UNIQUE NOT NULL
);

#MEDICATION FORM
CREATE TABLE medication_form (
                               id_medication_form INT PRIMARY KEY AUTO_INCREMENT,
                               name VARCHAR(50) NOT NULL UNIQUE
);

#via administration
CREATE TABLE via_administration(
                                 id_via_administration INT PRIMARY KEY AUTO_INCREMENT,
                                 name VARCHAR(50) NOT NULL,
                                 id_medication_form INT NOT NULL,
                                 FOREIGN KEY (id_medication_form) REFERENCES medication_form(id_medication_form)
);

#BATCH CODE
CREATE TABLE batch_code(
                         id_batch_code VARCHAR(50) PRIMARY KEY,
                         amount INT NOT NULL,
                         date_receibe DATE NOT NULL,
                         expiration_date DATE NOT NULL
);

#COUNTRIES
CREATE TABLE country (
                       id_country INT PRIMARY KEY AUTO_INCREMENT,
                       name varchar(60) NOT NULL UNIQUE
);

CREATE TABLE state_country(
                            id_state_country BIGINT PRIMARY KEY AUTO_INCREMENT,
                            name varchar(60) NOT NULL UNIQUE,
                            id_country INT,
                            FOREIGN KEY (id_country) REFERENCES country(id_country) ON DELETE RESTRICT
);

CREATE TABLE municipality (
                            id_municipality BIGINT PRIMARY KEY AUTO_INCREMENT,
                            name varchar(60) NOT NULL,
                            id_state_country BIGINT,
                            FOREIGN KEY (id_state_country) REFERENCES state_country(id_state_country) ON DELETE RESTRICT
);

CREATE TABLE colony (
                      id_colony BIGINT PRIMARY KEY AUTO_INCREMENT,
                      name varchar(60) NOT NULL,
                      id_municipality BIGINT NOT NULL,
                      FOREIGN KEY (id_municipality) REFERENCES municipality(id_municipality) ON DELETE RESTRICT
);

CREATE TABLE street(
                     id_street BIGINT PRIMARY KEY AUTO_INCREMENT,
                     name varchar(60) NOT NULL,
                     id_colony BIGINT NOT NULL,
                     FOREIGN KEY (id_colony) REFERENCES colony(id_colony) ON DELETE RESTRICT
);

CREATE TABLE address (
                       id_address BIGINT PRIMARY KEY AUTO_INCREMENT,
                       id_street BIGINT NOT NULL,
                       reference varchar(250),
                       postal_code varchar(25) NOT NULL,
                       num_int varchar(25) NOT NULL,
                       num_ext varchar(25),
                       FOREIGN KEY (id_street) REFERENCES street(id_street) ON DELETE RESTRICT
);

#type telephone
CREATE TABLE type_telephone(
                             id_type_telephone BIGINT PRIMARY KEY AUTO_INCREMENT,
                             name VARCHAR(100) NOT NULL UNIQUE
);

#client
CREATE TABLE client (
                      id_client BIGINT PRIMARY KEY AUTO_INCREMENT,
                      first_name VARCHAR(25) NOT NULL,
                      last_name VARCHAR(25) NOT NULL,
                      second_last_name VARCHAR(25),
                      id_email_client BIGINT UNIQUE,
                      id_gender BIGINT NOT NULL,
                      id_address BIGINT NOT NULL,
                      FOREIGN KEY (id_email_client) REFERENCES email_client (id_email_client) ON DELETE RESTRICT,
                      FOREIGN KEY (id_gender) REFERENCES gender (id_gender) ON DELETE RESTRICT,
                      FOREIGN KEY (id_address) REFERENCES address (id_address) ON DELETE RESTRICT
);

CREATE TABLE telephone_client (
                                id_telephone_client BIGINT PRIMARY KEY AUTO_INCREMENT,
                                id_client BIGINT NOT NULL,
                                id_type_telephone BIGINT NOT NULL,
                                FOREIGN KEY (id_client) REFERENCES client (id_client) ON DELETE RESTRICT,
                                FOREIGN KEY (id_type_telephone) REFERENCES type_telephone (id_type_telephone) ON DELETE RESTRICT
);

CREATE TABLE social_network_client(
                                    id_client_social_network BIGINT PRIMARY KEY AUTO_INCREMENT,
                                    id_client BIGINT NOT NULL,
                                    id_social_network INT NOT NULL,
                                    url VARCHAR(250) NOT NULL UNIQUE,
                                    FOREIGN KEY (id_client) REFERENCES client (id_client) ON DELETE RESTRICT,
                                    FOREIGN KEY (id_social_network) REFERENCES social_network (id_social_network) ON DELETE CASCADE
);

#patient
CREATE TABLE patient (
                       id_patient BIGINT PRIMARY KEY AUTO_INCREMENT,
                       id_client BIGINT NOT NULL,
                       name VARCHAR (50) NOT NULL,
                       year_old SMALLINT,
                       age_month VARCHAR(30),
                       weight VARCHAR(30) NOT NULL,
                       height VARCHAR(30) NOT NULL,
                       id_breed BIGINT NOT NULL,
                       id_gender BIGINT NOT NULL,
                       num_visits INT NOT NULL,
                       FOREIGN KEY (id_breed) REFERENCES breed (id_breed) ON DELETE RESTRICT,
                       FOREIGN KEY (id_gender) REFERENCES gender (id_gender) ON DELETE RESTRICT,
                       FOREIGN KEY (id_client) REFERENCES client (id_client) ON DELETE RESTRICT
);

CREATE TABLE allergy(
                      id_allergy BIGINT PRIMARY KEY AUTO_INCREMENT,
                      name VARCHAR(60) NOT NULL UNIQUE
);

CREATE TABLE allergy_patient(
                              id_allergy_patient BIGINT PRIMARY KEY AUTO_INCREMENT,
                              id_patient BIGINT NOT NULL,
                              id_allergy BIGINT NOT NULL,
                              FOREIGN KEY (id_patient) REFERENCES patient (id_patient) ON DELETE RESTRICT,
                              FOREIGN KEY (id_allergy) REFERENCES allergy (id_allergy) ON DELETE RESTRICT
);

CREATE TABLE social_network_patient(
                                     id_social_network_patient BIGINT PRIMARY KEY AUTO_INCREMENT,
                                     id_patient BIGINT NOT NULL,
                                     id_social_network INT NOT NULL,
                                     url VARCHAR(250) NOT NULL UNIQUE,
                                     FOREIGN KEY (id_patient) REFERENCES patient (id_patient) ON DELETE RESTRICT,
                                     FOREIGN KEY (id_social_network) REFERENCES social_network (id_social_network) ON DELETE CASCADE
);

#employee
CREATE TABLE employee (
                        id_employee BIGINT PRIMARY KEY AUTO_INCREMENT,
                        first_name VARCHAR(25) NOT NULL,
                        last_name VARCHAR(25) NOT NULL,
                        second_last_name VARCHAR(25),
                        salary DECIMAL NOT NULL,
                        id_email_employee BIGINT,
                        id_gender BIGINT,
                        id_address BIGINT NOT NULL,
                        id_rol BIGINT NOT NULL,
                        FOREIGN KEY (id_email_employee) REFERENCES email_employee (id_email_employee) ON DELETE RESTRICT,
                        FOREIGN KEY (id_gender) REFERENCES gender (id_gender) ON DELETE RESTRICT,
                        FOREIGN KEY (id_address) REFERENCES address (id_address) ON DELETE RESTRICT,
                        FOREIGN KEY (id_rol) REFERENCES rol (id_rol) ON DELETE RESTRICT
);

CREATE TABLE veterinary (
                          id_veterinary BIGINT PRIMARY KEY AUTO_INCREMENT,
                          id_employee BIGINT NOT NULL UNIQUE,
                          identifacion_card VARCHAR(100) NOT NULL UNIQUE,
                          university VARCHAR(40) NOT NULL,
                          carreer VARCHAR(40) NOT NULL,
                          graduate TIMESTAMP,
                          FOREIGN KEY (id_employee) REFERENCES employee (id_employee) ON DELETE RESTRICT
);

CREATE TABLE speciality (
                          id_speciality BIGINT PRIMARY KEY AUTO_INCREMENT,
                          name VARCHAR(50) NOT NULL,
                          id_veterinary BIGINT NOT NULL,
                          FOREIGN KEY (id_veterinary) REFERENCES veterinary (id_veterinary) ON DELETE CASCADE
);

CREATE TABLE telephone_employee (
                                  id_telephone_employee BIGINT PRIMARY KEY AUTO_INCREMENT,
                                  id_employee BIGINT NOT NULL,
                                  id_type_telephone BIGINT NOT NULL,
                                  FOREIGN KEY (id_employee) REFERENCES employee (id_employee) ON DELETE RESTRICT,
                                  FOREIGN KEY (id_type_telephone) REFERENCES type_telephone (id_type_telephone) ON DELETE RESTRICT
);

CREATE TABLE social_network_veterinary(
                                        id_social_network_veterinary BIGINT PRIMARY KEY AUTO_INCREMENT,
                                        id_veterinary BIGINT NOT NULL,
                                        id_social_network INT NOT NULL,
                                        url varchar(250) NOT NULL UNIQUE,
                                        FOREIGN KEY (id_veterinary) REFERENCES veterinary (id_veterinary) ON DELETE RESTRICT,
                                        FOREIGN KEY (id_social_network) REFERENCES social_network (id_social_network) ON DELETE CASCADE
);

##medical appointment
CREATE TABLE medical_appointment(
                                  id_medical_appointment VARCHAR(60) PRIMARY KEY,
                                  id_veterinary BIGINT NOT NULL,
                                  id_client BIGINT NOT NULL,
                                  id_patient BIGINT NOT NULL,
                                  consultation_date TIMESTAMP NOT NULL,
                                  community_service BOOLEAN NOT NULL,
                                  payment DECIMAL NOT NULL,
                                  FOREIGN KEY (id_veterinary) REFERENCES veterinary (id_veterinary) ON DELETE RESTRICT,
                                  FOREIGN KEY (id_client) REFERENCES client (id_client) ON DELETE RESTRICT,
                                  FOREIGN KEY (id_patient) REFERENCES patient (id_patient) ON DELETE RESTRICT
);

#CONSULTATION
CREATE TABLE medical_consultation(
                                   id_medical_consultation VARCHAR(60) PRIMARY KEY,
                                   id_medical_appointment VARCHAR(60) NOT NULL,
                                   id_veterinary BIGINT NOT NULL,
                                   id_client BIGINT NOT NULL,
                                   id_patient BIGINT NOT NULL,
                                   description LONGTEXT NOT NULL,
                                   consultation_date TIMESTAMP NOT NULL,
                                   next_consultation TIMESTAMP,
                                   FOREIGN KEY (id_medical_appointment) REFERENCES medical_appointment (id_medical_appointment) ON DELETE RESTRICT,
                                   FOREIGN KEY (id_veterinary) REFERENCES veterinary (id_veterinary) ON DELETE RESTRICT,
                                   FOREIGN KEY (id_client) REFERENCES client (id_client) ON DELETE RESTRICT,
                                   FOREIGN KEY (id_patient) REFERENCES patient (id_patient) ON DELETE RESTRICT
);

#LABORATORY
CREATE TABLE laboratory(
                         id_laboratory BIGINT PRIMARY KEY AUTO_INCREMENT,
                         name VARCHAR(100) NOT NULL UNIQUE,
                         laboratory_code VARCHAR(100) NOT NULL UNIQUE,
                         id_country INT NOT NULL,
                         id_email_laboratory BIGINT NOT NULL,
                         FOREIGN KEY(id_country) REFERENCES country(id_country),
                         FOREIGN KEY(id_email_laboratory) REFERENCES email_laboratory(id_email_laboratory)
);

CREATE TABLE telephone_laboratory(
                                   id_telephone_laboratory BIGINT PRIMARY KEY AUTO_INCREMENT,
                                   id_type_telephone BIGINT NOT NULL,
                                   id_laboratory BIGINT NOT NULL,
                                   id_email_laboratory BIGINT NOT NULL,
                                   phone_number VARCHAR(100) UNIQUE NOT NULL,
                                   FOREIGN KEY (id_type_telephone) REFERENCES type_telephone (id_type_telephone) ON DELETE CASCADE,
                                   FOREIGN KEY (id_laboratory) REFERENCES laboratory (id_laboratory) ON DELETE CASCADE,
                                   FOREIGN KEY (id_laboratory) REFERENCES laboratory (id_laboratory) ON DELETE CASCADE
);

CREATE TABLE social_network_laboratory(
                                        id_social_network_laboratory BIGINT PRIMARY KEY AUTO_INCREMENT,
                                        id_social_network INT NOT NULL,
                                        id_laboratory BIGINT NOT NULL,
                                        url VARCHAR(250) UNIQUE NOT NULL,
                                        FOREIGN KEY (id_social_network) REFERENCES social_network(id_social_network) ON DELETE CASCADE,
                                        FOREIGN KEY (id_laboratory) REFERENCES laboratory (id_laboratory) ON DELETE CASCADE
);

#BRAND
CREATE TABLE brand(
                    id_brand BIGINT PRIMARY KEY AUTO_INCREMENT,
                    name VARCHAR(50) NOT NULL UNIQUE,
                    registration DATE NOT NULL,
                    id_laboratory BIGINT NOT NULL,
                    id_country INT NOT NULL,
                    id_email_brand BIGINT NOT NULL,
                    FOREIGN KEY (id_laboratory) REFERENCES laboratory(id_laboratory),
                    FOREIGN KEY(id_country) REFERENCES country(id_country),
                    FOREIGN KEY(id_email_brand) REFERENCES email_brand(id_email_brand)
);

CREATE TABLE social_network_brand(
                                   id_social_network_brand BIGINT PRIMARY KEY AUTO_INCREMENT,
                                   id_social_network INT NOT NULL,
                                   id_brand BIGINT NOT NULL,
                                   URL VARCHAR(250) UNIQUE NOT NULL,
                                   FOREIGN KEY (id_social_network) REFERENCES social_network(id_social_network) ON DELETE CASCADE,
                                   FOREIGN KEY (id_brand) REFERENCES brand (id_brand) ON DELETE CASCADE
);

CREATE TABLE telephone_brand(
                              id_telephone_brand BIGINT PRIMARY KEY AUTO_INCREMENT,
                              id_type_telephone BIGINT NOT NULL,
                              id_brand BIGINT NOT NULL,
                              phone_number VARCHAR(100) UNIQUE NOT NULL,
                              FOREIGN KEY (id_type_telephone) REFERENCES type_telephone (id_type_telephone) ON DELETE CASCADE,
                              FOREIGN KEY (id_brand) REFERENCES brand (id_brand) ON DELETE CASCADE
);

#MEDICINE
CREATE TABLE medicine (
                        id_medicine BIGINT PRIMARY KEY AUTO_INCREMENT,
                        name VARCHAR(200) NOT NULL,
                        id_breed BIGINT NOT NULL,
                        id_via_administration INT NOT NULL,
                        id_batch_code VARCHAR(50) NOT NULL,
                        id_brand BIGINT NOT NULL,
                        dose VARCHAR(200),
                        FOREIGN KEY (id_breed) REFERENCES breed (id_breed) ON DELETE CASCADE,
                        FOREIGN KEY (id_via_administration) REFERENCES via_administration (id_via_administration) ON DELETE CASCADE,
                        FOREIGN KEY (id_batch_code) REFERENCES batch_code (id_batch_code) ON DELETE CASCADE,
                        FOREIGN KEY (id_brand) REFERENCES brand (id_brand) ON DELETE CASCADE
);

#PRODUCT
CREATE TABLE product(
                      id_product VARCHAR(50) PRIMARY KEY,
                      description LONGTEXT,
                      id_medicine BIGINT NOT NULL,
                      unit_price DECIMAL NOT NULL,
                      FOREIGN KEY (id_medicine) REFERENCES medicine (id_medicine) ON DELETE CASCADE
);
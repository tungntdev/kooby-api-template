CREATE TABLE IF NOT EXISTS patient_request (
                                               id INT AUTO_INCREMENT,
                                               number_order INT NULL,
                                               patient_number VARCHAR(10) NULL,
                                               medicine_code VARCHAR(15) NULL,
                                               patient_name VARCHAR(255) NULL,
                                               department VARCHAR(10) NULL,
                                               save_number INT DEFAULT 0 NULL,
                                               in_date DATE NULL,
                                               out_date DATE NULL,
                                               reception_date DATETIME NULL,
                                               appointment_patient_date DATE NULL,
                                               copy_quantity INT DEFAULT 1 NULL,
                                               copy_cost INT NULL,
                                               note MEDIUMTEXT NULL,
                                               done_patient_date DATETIME NULL,
                                               sign_date DATETIME NULL,
                                               state INT NULL,
                                               status INT NULL,
                                               created_at DATETIME NULL,
                                               created_by INT NULL,
                                               updated_at DATETIME NULL,
                                               updated_by INT NULL,
                                               PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS approvals (
                                         id INT AUTO_INCREMENT,
                                         id_patient_request INT NOT NULL,
                                         id_user INT NOT NULL,
                                         role VARCHAR(255) NULL,
                                         approval_date DATETIME NULL,
                                         status TINYINT DEFAULT 0 NULL,
                                         comment VARCHAR(4000) NULL,
                                         PRIMARY KEY (id),
                                         CONSTRAINT fk_approvals_id_patient_request
                                             FOREIGN KEY (id_patient_request) REFERENCES patient_request (id)
);

CREATE TABLE IF NOT EXISTS assignments (
                                           id INT AUTO_INCREMENT,
                                           id_patient_request INT NULL,
                                           id_copy_user INT NULL,
                                           appointment_date DATE NULL,
                                           completion_date DATETIME NULL,
                                           status TINYINT DEFAULT 1 NULL,
                                           PRIMARY KEY (id),
                                           CONSTRAINT fk_assignments_id_patient_request
                                               FOREIGN KEY (id_patient_request) REFERENCES patient_request (id)
);

CREATE TABLE IF NOT EXISTS deliveries (
                                          id INT AUTO_INCREMENT,
                                          id_patient_request INT NOT NULL,
                                          order_number INT NULL,
                                          year_of_order INT NULL,
                                          address VARCHAR(4000) NULL,
                                          phone VARCHAR(15) NULL,
                                          id_province INT NULL,
                                          id_district INT NULL,
                                          cost INT NULL,
                                          delivery_date DATE NULL,
                                          created_at DATETIME NULL,
                                          updated_at DATETIME NULL,
                                          status INT NULL,
                                          PRIMARY KEY (id),
                                          CONSTRAINT fk_deliveries_id_patient_request
                                              FOREIGN KEY (id_patient_request) REFERENCES patient_request (id)
);

CREATE TABLE IF NOT EXISTS province (
                                        id INT AUTO_INCREMENT,
                                        name VARCHAR(255) NULL,
                                        status TINYINT DEFAULT 1 NULL,
                                        PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS district (
                                        id INT AUTO_INCREMENT,
                                        id_province INT NULL,
                                        name VARCHAR(255) NULL,
                                        status TINYINT DEFAULT 1 NULL,
                                        PRIMARY KEY (id),
                                        CONSTRAINT fk_district_id_province
                                            FOREIGN KEY (id_province) REFERENCES province (id)
);

CREATE TABLE IF NOT EXISTS delivery_fee (
                                            id INT AUTO_INCREMENT,
                                            id_district INT NULL,
                                            fee INT NULL,
                                            status TINYINT DEFAULT 1 NULL,
                                            PRIMARY KEY (id),
                                            CONSTRAINT fk_delivery_fee_id_district
                                                FOREIGN KEY (id_district) REFERENCES district (id)
);

CREATE TABLE IF NOT EXISTS roles (
                                     id INT AUTO_INCREMENT,
                                     name VARCHAR(40) NULL,
                                     descriptions VARCHAR(255) NULL,
                                     status TINYINT DEFAULT 1 NULL,
                                     created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
                                     created_by BIGINT NULL,
                                     updated_at DATETIME DEFAULT CURRENT_TIMESTAMP,
                                     updated_by BIGINT NULL,
                                     PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS state_history (
                                             id INT AUTO_INCREMENT,
                                             id_patient_request INT NULL,
                                             state TINYINT NULL,
                                             change_date DATETIME NULL,
                                             PRIMARY KEY (id),
                                             CONSTRAINT fk_state_history_id_patient_request
                                                 FOREIGN KEY (id_patient_request) REFERENCES patient_request (id)
);

CREATE TABLE IF NOT EXISTS village (
                                       id INT AUTO_INCREMENT,
                                       id_district INT NULL,
                                       name VARCHAR(255) NULL,
                                       status TINYINT DEFAULT 1 NULL,
                                       PRIMARY KEY (id),
                                       CONSTRAINT fk_village_id_district
                                           FOREIGN KEY (id_district) REFERENCES district (id)
);

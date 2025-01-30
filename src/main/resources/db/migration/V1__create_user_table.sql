CREATE TABLE IF NOT EXISTS users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    enabled TINYINT NOT NULL DEFAULT 1
);

INSERT INTO users (username, password, enabled)
VALUES ( 
    'admin', 
    '$2a$10$PUqZh.//CpRl5snoKhziI.C3Q1TAWnVP8YmQLV4BLSe/kGZTu8Q7u', -- EpocaDeSeca4050
    1
);
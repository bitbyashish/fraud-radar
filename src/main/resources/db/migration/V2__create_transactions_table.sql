CREATE TABLE transactions (
    id VARCHAR(36) PRIMARY KEY,
    user_id VARCHAR(36) NOT NULL,
    amount DECIMAL(19,4) NOT NULL,
    currency VARCHAR(10) NOT NULL,
    merchant_id VARCHAR(255) NOT NULL,
    merchant_category VARCHAR(255),
    ip_address VARCHAR(50) NOT NULL,
    device_id VARCHAR(255),
    country VARCHAR(100),
    status VARCHAR(50) NOT NULL,
    created_at TIMESTAMP NOT NULL
);
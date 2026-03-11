CREATE TABLE fraud_alerts (
    id VARCHAR(36) PRIMARY KEY,
    transaction_id VARCHAR(36) NOT NULL REFERENCES transactions(id),
    user_id VARCHAR(36) NOT NULL,
    risk_score INTEGER NOT NULL,
    rules_triggered VARCHAR(500) NOT NULL,
    severity VARCHAR(50) NOT NULL,
    status VARCHAR(50) NOT NULL,
    notes TEXT,
    created_at TIMESTAMP NOT NULL,
    resolved_at TIMESTAMP
);
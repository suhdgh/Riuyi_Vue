-- 创建用户表，存储用户信息
CREATE TABLE user (
    user_id INT AUTO_INCREMENT PRIMARY KEY COMMENT '唯一标识ID',
    user_name VARCHAR(255) NOT NULL UNIQUE COMMENT '用户名',
    password VARCHAR(255) NOT NULL COMMENT '密码，经过哈希处理',
    wx VARCHAR(255) COMMENT '微信',
    status VARCHAR(50) COMMENT '身份信息',
    email VARCHAR(255) UNIQUE COMMENT '电子邮件',
    registration_date DATE COMMENT '注册日期',
    phone_number VARCHAR(15) COMMENT '手机号码'
) COMMENT '用户信息表';

INSERT INTO user (user_id, user_name, password, wx, status, email, registration_date, phone_number)
VALUES
    (1001, 'user1', '1234', 'wechat1', 'user', 'user1@example.com', '2023-11-01', '1234567890'),
    (1002, 'user2', '12345', 'wechat2', 'admin', 'admin1@example.com', '2023-11-01', '9876543210'),
    (1003, 'user3', '123456', 'wechat3', 'user', 'user3@example.com', '2023-11-01', '5555555555');


# -- API数据表
# CREATE TABLE api_data (
#     api_id INT AUTO_INCREMENT PRIMARY KEY COMMENT 'API的唯一标识符',
#     api_name VARCHAR(255) NOT NULL COMMENT 'API的名称',
#     api_description TEXT COMMENT 'API的描述或说明',
#     endpoint_url VARCHAR(255) NOT NULL COMMENT 'API的终端点URL',
#     http_method VARCHAR(10) NOT NULL COMMENT 'HTTP请求方法 (GET, POST, PUT, DELETE, 等)',
#     request_parameters JSON COMMENT '请求参数的JSON表示',
#     response_schema JSON COMMENT 'API响应的数据结构',
#     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT 'API创建日期',
#     user_id INT COMMENT '与用户关联的外键，指示API属于哪个用户',
#     FOREIGN KEY (user_id) REFERENCES user(user_id)
# );

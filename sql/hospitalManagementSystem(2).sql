-- 1.创建用户管理表
DROP TABLE IF EXISTS user_management;
CREATE TABLE user_management
(
    user_id  VARCHAR(20) PRIMARY KEY COMMENT '用户id',     -- 用户ID，使用 VARCHAR 类型作为主键
    username VARCHAR(50) NOT NULL COMMENT '用户名', -- 用户名，使用 VARCHAR 类型，限制最大长度为 50 个字符，并设置为非空字段
    password VARCHAR(50) NOT NULL COMMENT '密码',  -- 密码，使用 VARCHAR 类型，限制最大长度为 50 个字符，并设置为非空字段
    role     VARCHAR(20) NOT NULL COMMENT '角色'   -- 角色，使用 VARCHAR 类型，限制最大长度为 20 个字符，并设置为非空字段
);

-- 插入数据
INSERT INTO user_management (user_id, username, password, role) VALUES
('1', 'admin', 'admin123', 'admin'),
('2', 'doctor1', 'doctor123', 'doctor'),
('3', 'nurse1', 'nurse123', 'nurse');

-- 2.创建患者管理表
DROP TABLE IF EXISTS patient_management;

CREATE TABLE patient_management
(
    patient_id VARCHAR(20) PRIMARY KEY COMMENT '患者id',                  -- 患者ID，使用 VARCHAR 类型作为主键
    full_name  VARCHAR(100)            NOT NULL comment '患者姓名', -- 姓名，使用 VARCHAR 类型，限制最大长度为 100 个字符，并设置为非空字段
    gender     ENUM ('Male', 'Female') NOT NULL comment '患者性别', -- 性别，使用 ENUM 类型，限定值为 'Male' 或 'Female'，并设置为非空字段
    age        INT                     NOT NULL comment '患者年龄', -- 年龄，使用 INT 类型，并设置为非空字段
    contact    VARCHAR(50)             NOT NULL comment '患者联系方式'-- 联系方式，使用 VARCHAR 类型，限制最大长度为 50 个字符，并设置为非空字段
);

-- 插入数据
INSERT INTO patient_management (patient_id, full_name, gender, age, contact) VALUES
('100001', '张三', 'Male', 30, '1234567890'),
('100002', '李四', 'Female', 45, '9876543210'),
('100003', '王五', 'Male', 50, '4567891230');

-- 关联表1-医生患者关联表
DROP TABLE IF EXISTS patient_doctor_relationship;
CREATE TABLE patient_doctor_relationship
(
    relationship_id VARCHAR(20) PRIMARY KEY COMMENT '关联ID' comment '关联ID',
    patient_id_f    VARCHAR(20) COMMENT '患者ID' comment '患者id',
    doctor_id_f     VARCHAR(20) COMMENT '医生ID' comment '医生ID',
    FOREIGN KEY (patient_id_f) REFERENCES patient_management (patient_id),
    FOREIGN KEY (doctor_id_f) REFERENCES doctor_management (doctor_id)
);

-- 3.创建医生管理表
DROP TABLE IF EXISTS doctor_management;

CREATE TABLE doctor_management
(
    doctor_id     VARCHAR(20) PRIMARY KEY comment '医生id',       -- 医生ID，使用 VARCHAR 类型作为主键
    full_name     VARCHAR(100) NOT NULL comment '医生姓名', -- 姓名，使用 VARCHAR 类型，限制最大长度为 100 个字符，并设置为非空字段
    specialty     VARCHAR(100) NOT NULL comment '医生专业', -- 专业，使用 VARCHAR 类型，限制最大长度为 100 个字符，并设置为非空字段
    qualification VARCHAR(100) NOT NULL comment '医生资质'  -- 资质，使用 VARCHAR 类型，限制最大长度为 100 个字符，并设置为非空字段
);

-- 插入数据
INSERT INTO doctor_management (doctor_id, full_name, specialty, qualification) VALUES
('110001', '王医生', '内科', '主任医师'),
('110002', '李医生', '外科', '副主任医师'),
('110003', '张医生', '儿科', '医师');

-- 关联表2-医生排班关联表
CREATE TABLE doctor_schedule_relationship
(
    relationship_id VARCHAR(20) PRIMARY KEY COMMENT '关联ID',
    doctor_id_f     VARCHAR(20) COMMENT '医生ID',
    schedule_id_f   VARCHAR(20) COMMENT '排班ID',
    FOREIGN KEY (doctor_id_f) REFERENCES doctor_management (doctor_id),
    FOREIGN KEY (schedule_id_f) REFERENCES schedule_management (schedule_id)
);

-- 4.创建护士管理表
DROP TABLE IF EXISTS nurse_management;

CREATE TABLE nurse_management
(
    nurse_id      VARCHAR(20) PRIMARY KEY COMMENT '护士ID',       -- 护士ID，使用 VARCHAR 类型作为主键
    full_name     VARCHAR(100) NOT NULL COMMENT '护士姓名', -- 姓名，使用 VARCHAR 类型，限制最大长度为 100 个字符，并设置为非空字段
    specialty     VARCHAR(100) NOT NULL COMMENT '护士专业', -- 专业，使用 VARCHAR 类型，限制最大长度为 100 个字符，并设置为非空字段
    qualification VARCHAR(100) NOT NULL COMMENT '护士资质'  -- 资质，使用 VARCHAR 类型，限制最大长度为 100 个字符，并设置为非空字段
);

-- 插入数据
INSERT INTO nurse_management (nurse_id, full_name, specialty, qualification) VALUES
('210001', '王护士', '内科', '高级护士'),
('210002', '李护士', '外科', '护士长'),
('210003', '张护士', '儿科', '护士');

-- 关联表3-护士患者关联表
CREATE TABLE nurse_patient_relationship
(
    relationship_id VARCHAR(20) PRIMARY KEY COMMENT '关联ID',
    nurse_id_f      VARCHAR(20) COMMENT '护士ID',
    patient_id_f    VARCHAR(20) COMMENT '患者ID',
    FOREIGN KEY (nurse_id_f) REFERENCES nurse_management (nurse_id),
    FOREIGN KEY (patient_id_f) REFERENCES patient_management (patient_id)
);


-- 关联表4-护士排班关联表
CREATE TABLE doctor_nurse_relationship
(
    relationship_id VARCHAR(20) PRIMARY KEY COMMENT '关联ID',
    doctor_id_f     VARCHAR(20) COMMENT '医生ID',
    nurse_id_f      VARCHAR(20) COMMENT '护士ID',
    FOREIGN KEY (doctor_id_f) REFERENCES doctor_management (doctor_id),
    FOREIGN KEY (nurse_id_f) REFERENCES nurse_management (nurse_id)
);


-- 5.创建药品管理表
DROP TABLE IF EXISTS medication_management;

CREATE TABLE medication_management
(
    medication_id  VARCHAR(20) PRIMARY KEY COMMENT '药品ID',       -- 药品ID，使用 VARCHAR 类型作为主键
    name           VARCHAR(100) NOT NULL COMMENT '药品名称', -- 药品名称，使用 VARCHAR 类型，限制最大长度为 100 个字符，并设置为非空字段
    specification  VARCHAR(100) NOT NULL COMMENT '药品规格', -- 药品规格，使用 VARCHAR 类型，限制最大长度为 100 个字符，并设置为非空字段
    stock_quantity INT          NOT NULL COMMENT '库存量',  -- 库存量，使用 INT 类型，并设置为非空字段
    price          DECIMAL(10, 2) NOT NULL COMMENT '价格'           -- 药品的价格，使用DECIMAL(10, 2)类型，表示最多10位数，其中2位为小数。
);

-- 插入数据
INSERT INTO medication_management (medication_id, name, specification, stock_quantity, price) VALUES
('900001', '药品A', '规格A', 100, 10.99),
('900002', '药品B', '规格B', 50, 5.99),
('900003', '药品C', '规格C', 200, 15.99);

-- 关联表5-药品就诊关联表
CREATE TABLE medical_medication_relationship
(
    relationship_id VARCHAR(20) PRIMARY KEY COMMENT '关联ID',
    record_id_f     VARCHAR(20) COMMENT '记录ID',
    medication_id_f VARCHAR(20) COMMENT '药品ID',
    FOREIGN KEY (record_id_f) REFERENCES medical_records (record_id),
    FOREIGN KEY (medication_id_f) REFERENCES medication_management (medication_id)
);


-- 6.创建病房管理表
DROP TABLE IF EXISTS ward_management;

CREATE TABLE ward_management
(
    ward_id     VARCHAR(20) PRIMARY KEY COMMENT '病房号',       -- 病房号，使用 VARCHAR 类型作为主键
    bed_count   INT         NOT NULL COMMENT '床位数量', -- 床位数量，使用 INT 类型，并设置为非空字段
    ward_status VARCHAR(50) NOT NULL COMMENT '病房状态'  -- 病房状态，使用 VARCHAR 类型，限制最大长度为 50 个字符，并设置为非空字段
);

-- 插入数据
INSERT INTO ward_management (ward_id, bed_count, ward_status) VALUES
('600001', 4, '空闲'),
('600002', 3, '占用'),
('600003', 4, '维修');

-- 7.创建就诊记录表
DROP TABLE IF EXISTS medical_records;

CREATE TABLE medical_records
(
    record_id        VARCHAR(20) PRIMARY KEY COMMENT '记录ID', -- 记录ID，使用 VARCHAR 类型作为主键
    patient_id       VARCHAR(20) NOT NULL COMMENT '患者ID',    -- 患者ID，使用 VARCHAR 类型，并设置为非空字段
    doctor_id        VARCHAR(20) NOT NULL COMMENT '医生ID',    -- 医生ID，使用 VARCHAR 类型，并设置为非空字段
    diagnosis_result TEXT COMMENT '诊断结果',            -- 诊断结果，使用 TEXT 类型
    prescription     TEXT COMMENT '处方药物'             -- 处方药物，使用 TEXT 类型
);

-- 修改就诊记录表定义
ALTER TABLE medical_records
ADD CONSTRAINT fk_medical_records_patient
FOREIGN KEY (patient_id) REFERENCES patient_management (patient_id),
ADD CONSTRAINT fk_medical_records_doctor
FOREIGN KEY (doctor_id) REFERENCES doctor_management (doctor_id);

-- 插入数据
INSERT INTO medical_records (record_id, patient_id, doctor_id, diagnosis_result, prescription)
VALUES
('700001', '100001', '110001', '感冒', '药物A, 药物B'),
('700002', '100002', '110002', '发烧', '药物C, 药物D'),
('700003', '100003', '110001', '头痛', '药物E, 药物F');

-- 关联表6-就诊费用关联表
CREATE TABLE medical_billing_relationship
(
    relationship_id VARCHAR(20) PRIMARY KEY COMMENT '关联ID',
    record_id_f     VARCHAR(20) COMMENT '记录ID',
    billing_id_f    VARCHAR(20) COMMENT '费用ID',
    FOREIGN KEY (record_id_f) REFERENCES medical_records (record_id),
    FOREIGN KEY (billing_id_f) REFERENCES billing_management (billing_id)
);


-- 8.创建排班管理表
DROP TABLE IF EXISTS schedule_management;

CREATE TABLE schedule_management
(
    schedule_id   VARCHAR(20) PRIMARY KEY COMMENT '排班ID',      -- 排班ID，使用 VARCHAR 类型作为主键
    doctor_id     VARCHAR(20)         NOT NULL COMMENT '医生ID', -- 医生ID，使用 VARCHAR 类型，并设置为非空字段
    nurse_id      VARCHAR(20)         NOT NULL COMMENT '护士ID', -- 护士ID，使用 VARCHAR 类型，并设置为非空字段
    schedule_date DATE        NOT NULL COMMENT '日期',   -- 日期，使用 DATE 类型，并设置为非空字段
    time_slot     VARCHAR(50) NOT NULL COMMENT '时间段'   -- 时间段，使用 VARCHAR 类型，限制最大长度为 50 个字符，并设置为非空字段
);

-- 添加关联
ALTER TABLE schedule_management
ADD FOREIGN KEY (doctor_id) REFERENCES doctor_management (doctor_id);

ALTER TABLE schedule_management
ADD FOREIGN KEY (nurse_id) REFERENCES nurse_management (nurse_id);


-- 添加数据到schedule_management表
INSERT INTO schedule_management (schedule_id, doctor_id, nurse_id, schedule_date, time_slot)
VALUES ('800001', '110001', '210001', '2023-06-06', '13:00-15:00'),
       ('800002', '110002', '210002', '2023-06-07', '10:00-12:00'),
       ('800003', '110003', '210003', '2023-06-08', '16:00-18:00');


-- 9.创建费用管理表
DROP TABLE IF EXISTS billing_management;

CREATE TABLE billing_management
(
    billing_id     VARCHAR(20) PRIMARY KEY COMMENT '费用ID',         -- 费用ID，使用 VARCHAR 类型作为主键
    record_id     VARCHAR(20)            NOT NULL COMMENT '记录id', -- 记录ID，使用 VARCHAR 类型，并设置为非空字段
    amount         DECIMAL(10, 2) NOT NULL COMMENT '金额',   -- 金额，使用 DECIMAL 类型，设置总共10位数，其中小数占2位，并设置为非空字段
    payment_status VARCHAR(50)    NOT NULL COMMENT '支付状态'  -- 支付状态，使用 VARCHAR 类型，限制最大长度为 50 个字符，并设置为非空字段
);

ALTER TABLE billing_management
ADD CONSTRAINT fk_billing_patient
FOREIGN KEY (record_id) REFERENCES medical_records (record_id);


-- 插入第一行数据
INSERT INTO billing_management (billing_id, record_id, amount, payment_status)
VALUES ('400001', '700001', 50.00, 'Paid');

-- 插入第二行数据
INSERT INTO billing_management (billing_id, record_id, amount, payment_status)
VALUES ('400002', '700002', 75.50, 'Pending');

-- 插入第三行数据
INSERT INTO billing_management (billing_id, record_id, amount, payment_status)
VALUES ('400003', '700003', 120.75, 'Paid');


-- 关联表7-病房患者关联表
CREATE TABLE ward_patient_relationship
(
    relationship_id VARCHAR(20) PRIMARY KEY COMMENT '关联ID',
    ward_id_f       VARCHAR(20) COMMENT '病房号',
    patient_id_f    VARCHAR(20) COMMENT '患者ID',
    FOREIGN KEY (ward_id_f) REFERENCES ward_management (ward_id),
    FOREIGN KEY (patient_id_f) REFERENCES patient_management (patient_id)
);

# 统计患者男女比例
SELECT
    gender,
    COUNT(*) AS total_count,
    COUNT(*) * 100.0 / SUM(COUNT(*)) OVER() AS percentage
FROM
    patient_management
GROUP BY
    gender;

# 创建一个男女比例表
CREATE TABLE percentage_gender AS
SELECT
    gender ,
    COUNT(*) AS total_count,
    COUNT(*) * 100.0 / SUM(COUNT(*)) OVER() AS percentage
FROM
    patient_management
GROUP BY
    gender;

# 创建视图
CREATE view view_percentage_gender AS
SELECT
    gender ,
    COUNT(*) AS total_count,
    COUNT(*) * 100.0 / SUM(COUNT(*)) OVER() AS percentage
FROM
    patient_management
GROUP BY
    gender;

# 查询每个科室有多少护士
SELECT
    specialty,
    COUNT(*) AS nurse_count
FROM
    nurse_management
GROUP BY
    specialty;

# 创建一个护士科室表
CREATE TABLE nurse_specialty AS
SELECT
    specialty,
    COUNT(*) AS nurse_count
FROM
    nurse_management
GROUP BY
    specialty;

# 创建视图
CREATE view view_nurse_specialty AS
SELECT
    specialty,
    COUNT(*) AS nurse_count
FROM
    nurse_management
GROUP BY
    specialty;

# 年龄段对应就诊数量
SELECT
    CASE
        WHEN age < 30 THEN '30岁以下'
        WHEN age >= 30 AND age <= 50 THEN '30-50岁'
        WHEN age > 50 THEN '50岁以上'
    END AS age_group,
    COUNT(*) AS record_count
FROM
    medical_records
JOIN
    patient_management ON medical_records.patient_id = patient_management.patient_id
GROUP BY
    age_group;

# 创建年龄就诊表
CREATE TABLE age_num AS
    SELECT
    CASE
        WHEN age < 30 THEN '30岁以下'
        WHEN age >= 30 AND age <= 50 THEN '30-50岁'
        WHEN age > 50 THEN '50岁以上'
    END AS age_group,
    COUNT(*) AS record_count
FROM
    medical_records
JOIN
    patient_management ON medical_records.patient_id = patient_management.patient_id
GROUP BY
    age_group;

# 创建年龄就诊视图
CREATE view view_age_num AS
    SELECT
    CASE
        WHEN age < 30 THEN '30岁以下'
        WHEN age >= 30 AND age <= 50 THEN '30-50岁'
        WHEN age > 50 THEN '50岁以上'
    END AS age_group,
    COUNT(*) AS record_count
FROM
    medical_records
JOIN
    patient_management ON medical_records.patient_id = patient_management.patient_id
GROUP BY
    age_group;


# 药品，规格，价格，库存量，前五名
SELECT name, stock_quantity, specification, price
FROM medication_management
ORDER BY stock_quantity DESC
LIMIT 5;

SELECT name, stock_quantity, specification, price
FROM medication_management
ORDER BY stock_quantity DESC, price DESC
LIMIT 5;

# 创建药品表
CREATE TABLE medication AS
SELECT name, stock_quantity, specification, price
FROM medication_management
ORDER BY stock_quantity DESC, price DESC
LIMIT 5;

CREATE view view_medication AS
SELECT name, stock_quantity, specification, price
FROM medication_management
ORDER BY stock_quantity DESC, price DESC
LIMIT 5;




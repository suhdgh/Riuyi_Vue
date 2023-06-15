-- 统计每个科室中医生的数量
SELECT
    d.specialty,
    COUNT(DISTINCT s.doctor_id) AS doctor_count
FROM
    schedule_management s
JOIN
    doctor_management d ON s.doctor_id = d.doctor_id
GROUP BY
    d.specialty;

-- 统计每个科室中护士的数量
SELECT
    n.specialty,
    COUNT(DISTINCT s.nurse_id) AS nurse_count
FROM
    schedule_management s
JOIN
    nurse_management n ON s.nurse_id = n.nurse_id
GROUP BY
    n.specialty;

-- 计算每个科室中医生和护士的总数和占比
SELECT
    doctor_subquery.specialty,
    doctor_count,
    nurse_count,
    doctor_count + nurse_count AS total_count,
    (doctor_count + nurse_count) * 100.0 / SUM(doctor_count + nurse_count) OVER() AS percentage
FROM
    (
        SELECT
            d.specialty,
            COUNT(DISTINCT s.doctor_id) AS doctor_count
        FROM
            schedule_management s
        JOIN
            doctor_management d ON s.doctor_id = d.doctor_id
        GROUP BY
            d.specialty
    ) doctor_subquery
JOIN
    (
        SELECT
            n.specialty,
            COUNT(DISTINCT s.nurse_id) AS nurse_count
        FROM
            schedule_management s
        JOIN
            nurse_management n ON s.nurse_id = n.nurse_id
        GROUP BY
            n.specialty
    ) nurse_subquery ON doctor_subquery.specialty = nurse_subquery.specialty
ORDER BY
    total_count DESC
LIMIT 1;

# 创建一个表，记录排班占比最多的科室
CREATE TABLE max_specialty_num (
    specialty VARCHAR(100) COMMENT '科室',
    doctor_count INT COMMENT '医生数量',
    nurse_count INT COMMENT '护士数量',
    total_count INT COMMENT '总人数',
    percentage DECIMAL(5, 2) COMMENT '百分比'
);

# 插入数据
INSERT INTO max_specialty_num (specialty, doctor_count, nurse_count, total_count, percentage)
SELECT
    doctor_subquery.specialty,
    doctor_count,
    nurse_count,
    doctor_count + nurse_count AS total_count,
    (doctor_count + nurse_count) * 100.0 / SUM(doctor_count + nurse_count) OVER() AS percentage
FROM
    (
        SELECT
            d.specialty,
            COUNT(DISTINCT s.doctor_id) AS doctor_count
        FROM
            schedule_management s
        JOIN
            doctor_management d ON s.doctor_id = d.doctor_id
        GROUP BY
            d.specialty
    ) doctor_subquery
JOIN
    (
        SELECT
            n.specialty,
            COUNT(DISTINCT s.nurse_id) AS nurse_count
        FROM
            schedule_management s
        JOIN
            nurse_management n ON s.nurse_id = n.nurse_id
        GROUP BY
            n.specialty
    ) nurse_subquery ON doctor_subquery.specialty = nurse_subquery.specialty
ORDER BY
    total_count DESC
LIMIT 1;

# 创建视图
CREATE view view_max_specialty_num as
    SELECT
    doctor_subquery.specialty,
    doctor_count,
    nurse_count,
    doctor_count + nurse_count AS total_count,
    (doctor_count + nurse_count) * 100.0 / SUM(doctor_count + nurse_count) OVER() AS percentage
FROM
    (
        SELECT
            d.specialty,
            COUNT(DISTINCT s.doctor_id) AS doctor_count
        FROM
            schedule_management s
        JOIN
            doctor_management d ON s.doctor_id = d.doctor_id
        GROUP BY
            d.specialty
    ) doctor_subquery
JOIN
    (
        SELECT
            n.specialty,
            COUNT(DISTINCT s.nurse_id) AS nurse_count
        FROM
            schedule_management s
        JOIN
            nurse_management n ON s.nurse_id = n.nurse_id
        GROUP BY
            n.specialty
    ) nurse_subquery ON doctor_subquery.specialty = nurse_subquery.specialty
ORDER BY
    total_count DESC
LIMIT 1;

# 病房占用率
SELECT
    (COUNT(*) / SUM(bed_count)) * 100.0 AS occupancy_rate
FROM
    ward_management
WHERE
    ward_status = '占用';

# 创建病房表记录病房占用率
CREATE TABLE ward AS
SELECT
    (COUNT(*) / SUM(bed_count)) * 100.0 AS occupancy_rate
FROM
    ward_management
WHERE
    ward_status = '占用';

# 创建视图
CREATE view view_ward AS
SELECT
    (COUNT(*) / SUM(bed_count)) * 100.0 AS occupancy_rate
FROM
    ward_management
WHERE
    ward_status = '占用';

# 完成付款占比
CREATE TABLE paid AS
SELECT
    (COUNT(*) / (SELECT COUNT(*) FROM billing_management)) * 100 AS percentage
FROM
    billing_management
WHERE
    payment_status = 'Paid';


# 创建视图
CREATE view view_paid AS
SELECT
    (COUNT(*) / (SELECT COUNT(*) FROM billing_management)) * 100 AS percentage
FROM
    billing_management
WHERE
    payment_status = 'Paid';


# 未支付占比
CREATE TABLE pending AS
SELECT
    (COUNT(*) / (SELECT COUNT(*) FROM billing_management)) * 100 AS percentage
FROM
    billing_management
WHERE
    payment_status = 'Pending';

# 创建视图
CREATE view view_pending AS
SELECT
    (COUNT(*) / (SELECT COUNT(*) FROM billing_management)) * 100 AS percentage
FROM
    billing_management
WHERE
    payment_status = 'Pending';

# 就诊患者排名前五的科室
CREATE TABLE medical_num AS
SELECT d.specialty, COUNT(*) AS patient_count
FROM medical_records r
JOIN doctor_management d ON r.doctor_id = d.doctor_id
GROUP BY d.specialty
ORDER BY patient_count DESC
LIMIT 5;

# 创建视图

CREATE view view_medical_num AS
SELECT d.specialty, COUNT(*) AS patient_count
FROM medical_records r
JOIN doctor_management d ON r.doctor_id = d.doctor_id
GROUP BY d.specialty
ORDER BY patient_count DESC
LIMIT 5;


# 各科室就诊人数，分男女两条
CREATE TABLE mail_femail_medical AS
SELECT dm.specialty,
       SUM(CASE WHEN pm.gender = 'Male' THEN 1 ELSE 0 END) AS male_patient_count,
       SUM(CASE WHEN pm.gender = 'Female' THEN 1 ELSE 0 END) AS female_patient_count
FROM medical_records mr
JOIN doctor_management dm ON mr.doctor_id = dm.doctor_id
JOIN patient_management pm ON mr.patient_id = pm.patient_id
GROUP BY dm.specialty
ORDER BY (male_patient_count + female_patient_count) DESC
LIMIT 5;


CREATE view view_mail_femail_medical AS
SELECT dm.specialty,
       SUM(CASE WHEN pm.gender = 'Male' THEN 1 ELSE 0 END) AS male_patient_count,
       SUM(CASE WHEN pm.gender = 'Female' THEN 1 ELSE 0 END) AS female_patient_count
FROM medical_records mr
JOIN doctor_management dm ON mr.doctor_id = dm.doctor_id
JOIN patient_management pm ON mr.patient_id = pm.patient_id
GROUP BY dm.specialty
ORDER BY (male_patient_count + female_patient_count) DESC
LIMIT 5;




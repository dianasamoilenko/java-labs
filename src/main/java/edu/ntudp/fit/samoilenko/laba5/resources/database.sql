CREATE DATABASE IF NOT EXISTS StudentDB;

USE StudentDB;

CREATE TABLE IF NOT EXISTS students
(
    id               INT PRIMARY KEY AUTO_INCREMENT,
    firstName        VARCHAR(255) NOT NULL,
    lastName         VARCHAR(255) NOT NULL,
    patronymic       VARCHAR(255) NOT NULL,
    birthDate        DATE         NOT NULL,
    recordBookNumber INT          NOT NULL
);

INSERT INTO students (lastName,
                                     firstName,
                                     patronymic,
                                     birthDate,
                                     recordBookNumber)
VALUES ('Бережний', 'Микита', 'Анатолійович', '2000-01-12', 12345),
       ('Болобов', 'Артем', 'Васильович', '2003-02-23', 23456),
       ('Гречук', 'Діана', 'Вадимівна', '2003-03-18', 34567),
       ('Димарьова', 'Марія', 'Костянтинівна', '2003-04-20', 45678),
       ('Заблуда', 'Максим', 'Євгенович', '2003-04-15', 56789),
       ('Карпенко', 'Іван', 'Сергійович', '2003-10-09', 67891),
       ('Корбань', 'Антон', 'Юрійович', '2003-08-03', 78912),
       ('Коротун', 'Сергій', 'Володимирович', '2003-07-28', 89123),
       ('Лєвін', 'Єгор', 'Геннадійович', '2003-05-17', 91234),
       ('Манахін', 'Михайло', 'Олександрович', '2003-09-29', 54321),
       ('Музичук', 'Денис', 'Сергійович', '2003-11-11', 65432),
       ('Ольховик', 'Дмитро', 'Володимирович', '2003-12-25', 76543),
       ('Пирогов', 'Олександр', 'Олександрович', '2003-05-05', 87654),
       ('Полісніченко', 'Тарас', 'Юрійович', '2003-07-07', 98765),
       ('Самойленко', 'Діана', 'Дмитрівна', '2003-02-16', 52632),
       ('Титаренко', 'Гліб', 'Олександрович', '2003-11-22', 18001),
       ('Топал', 'Данило', 'Романович', '2003-09-21', 99887),
       ('Трохименко', 'Валентин', 'Вікторович', '2003-12-10', 10101),
       ('Чекушкін', 'Нікіта', 'Дмитрович', '2003-01-19', 29844),
       ('Шаповалов', 'Євген', 'Вікторович', '2003-10-24', 94001)
;

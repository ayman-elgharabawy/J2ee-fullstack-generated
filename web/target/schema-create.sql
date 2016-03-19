
    create table MY010_CUSTOMER (
        ID BIGINT not null auto_increment,
        FIRST_NAME VARCHAR(255) BINARY not null,
        LAST_NAME VARCHAR(255) BINARY not null,
        MIDDLE_NAME VARCHAR(255) BINARY not null,
        IDENTITY_NUMBER INTEGER,
        INSURANCE_NUMBER INTEGER,
        ADDRESS VARCHAR(255) BINARY not null,
        MOBILE_NUMBER BIGINT,
        TELEPHONE_NUMBER INTEGER,
        NATIONALITY VARCHAR(255) BINARY,
        TYPE VARCHAR(255) BINARY,
        primary key (ID)
    );

    create table RED_PLANE_SERVICE (
        ID INTEGER not null auto_increment,
        MSISDN VARCHAR(255) BINARY not null,
        primary key (ID)
    );


    create table CUSTOMER (
        ID BIGINT not null auto_increment,
        NAME VARCHAR(255) BINARY not null,
        ADDRESS BIGINT,
        ACCOUNTID VARCHAR(255) BINARY not null,
        primary key (ID)
    );

    create table ITEM (
        ID BIGINT not null auto_increment,
        NAME VARCHAR(255) BINARY not null,
        CODE VARCHAR(255) BINARY not null,
        DESCRIPTION VARCHAR(255) BINARY not null,
        CATEGORY VARCHAR(255) BINARY not null,
        primary key (ID)
    );

    create table PHYSICAL_COUNTING (
        ID BIGINT not null auto_increment,
        PDATE TIMESTAMP not null,
        PLANNED_QNTY VARCHAR(255) BINARY not null,
        ACTUAL_QNTY VARCHAR(255) BINARY not null,
        primary key (ID)
    );

    create table PRICE_PLAN (
        ID BIGINT not null auto_increment,
        ITEMCODE VARCHAR(255) BINARY not null,
        PRICE INTEGER,
        primary key (ID)
    );

    create table R_F_I_D (
        ID BIGINT not null auto_increment,
        CODE VARCHAR(255) BINARY not null,
        STATUS VARCHAR(255) BINARY not null,
        TRANSACTIONID VARCHAR(255) BINARY,
        primary key (ID)
    );

    create table SALES_RECUSITION (
        ID BIGINT not null auto_increment,
        REC_STARTDATE TIMESTAMP not null,
        REC_DUEDATE TIMESTAMP not null,
        ITEM_CODE VARCHAR(255) BINARY not null,
        LENGTH INTEGER,
        WEIGHT INTEGER,
        CUSTOMER_ID BIGINT,
        PRICE_PLANE_ID BIGINT,
        primary key (ID)
    );

    create table STORE (
        ID BIGINT not null auto_increment,
        NAME VARCHAR(255) BINARY not null,
        ADDRESS VARCHAR(255) BINARY not null,
        CODE VARCHAR(255) BINARY not null,
        ACCOUNT_ADD INTEGER,
        ACCOUNT_ISSUE INTEGER,
        primary key (ID)
    );

    create table SUPPLIER (
        ID BIGINT not null auto_increment,
        NAME VARCHAR(255) BINARY not null,
        ACCOUNTID VARCHAR(255) BINARY not null,
        primary key (ID)
    );

    create table TRANSACTION (
        ID BIGINT not null auto_increment,
        TDATE TIMESTAMP not null,
        RFID VARCHAR(255) BINARY not null,
        ITEM_CODE VARCHAR(255) BINARY not null,
        QNTY VARCHAR(255) BINARY not null,
        LENGTH VARCHAR(255) BINARY not null,
        COLOR VARCHAR(255) BINARY not null,
        COST BIGINT,
        SUPPLIERID BIGINT,
        TYPE VARCHAR(255) BINARY not null,
        primary key (ID)
    );

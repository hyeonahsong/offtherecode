DROP TABLE TBL_WIKI_MEMBER CASCADE CONSTRAINTS;

CREATE TABLE TBL_WIKI_MEMBER(
                                WIKI_MEMBER_PNO NUMBER(10) PRIMARY KEY,
                                WIKI_MEMBER_WIKI_FNO NUMBER(10) NOT NULL,
                                WIKI_MEMBER_USER_FNO NUMBER(10) NOT NULL,
                                WIKI_MEMBER_CONTENT VARCHAR2(2000)NOT NULL,
                                WIKI_MEMBER_DATE DATE DEFAULT SYSDATE,
                                CONSTRAINT WIKI_MEMBER_WIKI_FNO FOREIGN KEY (WIKI_MEMBER_WIKI_FNO) REFERENCES TBL_WIKI(WIKI_PNO) ON DELETE CASCADE,
                                CONSTRAINT WIKI_MEMBER_USER_FNO FOREIGN KEY (WIKI_MEMBER_USER_FNO) REFERENCES TBL_USER(USER_PNO) ON DELETE CASCADE
);

DROP SEQUENCE SEQ_WIKI_MEMBER;

CREATE SEQUENCE SEQ_WIKI_MEMBER START WITH 1 INCREMENT BY 1;
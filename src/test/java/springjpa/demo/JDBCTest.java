package springjpa.demo;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;

@Slf4j
public class JDBCTest {
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2~/test";
    static final String USER = "sa";
    static final String Pass = "";
    static final String DROP_TABLE_SQL = "DROP TABLE customers IF EXISTS";
    static final String CREATE_TABLE_SQL = "CREATE TABLE customers (id SERIAL, first_name VARCHAR(255), last_name VARCHAR(255)";
    static final String INSERT_SQL = "INSERT INTO customers (id , first_name ,last_name) VALUES (1, 'honggu', 'kang')";

    @Test
    void jdbc_sample(){
        try {
            //어떤 드라이버를 사용할지 명시해야한다
            Class.forName(JDBC_DRIVER);
        }
    }



}

package cursoUdemyNelio.exerciciosFixacao.jdbc.jdbc1.src.application;


import cursoUdemyNelio.exerciciosFixacao.jdbc.jdbc1.src.db.DB;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {

        Connection connection = DB.getConnection();
        DB.closeConnection();

    }


}

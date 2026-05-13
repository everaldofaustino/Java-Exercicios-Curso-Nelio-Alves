package application;

import db.DB;

import java.sql.*;
import java.time.format.DateTimeFormatter;


public class Program {
    static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement st = null;

        try{
            conn = DB.getConnection();
/*
            st = conn.prepareStatement("INSERT INTO seller " + "(Name, Email, BirthDate, BaseSalary, DepartmentID)"
                    + "VALUES " +"(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS );

            st.setString(1, "Carl Purple");
            st.setString(2,"Carl@gmail.com");
            // LocalDate NÃO lança exceção verificada
            LocalDate birthDate = LocalDate.parse("22/04/1985", fmt);
            st.setDate(3, java.sql.Date.valueOf(birthDate));


            st.setDouble(4, 3000.0);
            st.setInt(5,4); */

            st = conn.prepareStatement("insert into department (Name) values ('D1'),('D2')", Statement.RETURN_GENERATED_KEYS);

            int rowsAffected = st.executeUpdate();

            if(rowsAffected >0) {
                ResultSet rs = st.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Done! Id= "+ id);

                }
            }
            else{

                System.out.println("No rown affected!");
            }



        }

        catch (SQLException e){
            e.printStackTrace();
        }

        finally{

            DB.closeStatement(st);
            DB.closeConnection();
        }




    }


}


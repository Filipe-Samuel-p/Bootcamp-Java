package DataBase_JDBC.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program2 {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection connection = null;
        PreparedStatement st = null;
        try{
            connection = DB.getConnection();
            st = connection.prepareStatement(
                    "INSERT INTO seller"
                    + "(Name,Email,BirthDate, BaseSalary,DepartmentId) "
                    + "VALUES "
                    + "(?, ?, ?, ? ,?)" );
            st.setString(1,"Filipe Samuel");
            st.setString(2,"Eduarda Dias");
            st.setDate(3,new java.sql.Date(sdf.parse("24/05/2024").getTime()));
            st.setDouble(4,3000.0);
            st.setInt(5,4);

            int rowsAffected = st.executeUpdate();
            System.out.println("Done! " + rowsAffected);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        catch (ParseException e){
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }

}

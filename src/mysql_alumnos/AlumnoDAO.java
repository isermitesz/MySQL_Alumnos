/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql_alumnos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author iserm
 */
public class AlumnoDAO {
    
    public void agregarAlumno(Alumno al) {
        DBConec conn = new DBConec();
        
        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql = "INSERT INTO alumnos VALUES('" + al.getNoControl() + "', '" +
                    al.getNombre() + "', '" + al.getApellidoP() + "', '" + al.getApellidoM() + "', " +
                    al.getSemestre() + ")";
            consulta.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Se ha registrado el alumno");
            consulta.close();
            conn.desconectar();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No se registro la persona " + e);
        }
    }
    
    public ArrayList<Alumno> obtenAlumnos() {
        ArrayList <Alumno> arrAlumno = new ArrayList<Alumno>();
        DBConec conn = new DBConec();
        String sql = "SELECT * FROM alumnos";
        
        try {
            PreparedStatement st = conn.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                Alumno al = new Alumno(
                    rs.getString("noControl"),
                    rs.getString("nombre"),
                    rs.getString("apellidoP"),
                    rs.getString("apellidoM"),
                    rs.getInt("semestre")
                );
                arrAlumno.add(al);
            }
            rs.close();
            st.close();
            conn.desconectar();
            
        } catch(Exception e) {
            
        }
        return arrAlumno;
    }
}

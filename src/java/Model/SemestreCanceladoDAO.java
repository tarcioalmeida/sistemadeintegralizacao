/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author apmagalhaes
 */
public class SemestreCanceladoDAO {

    public SemestreCanceladoDAO() {
    }
    
    public void incluir(SemestreCancelado sc){
        int n=0;
        Connection con = ConnectionFactory.getConnection();
        try{
        Statement stm = con.createStatement();
        String sql = "insert into sonaes.semestrecancelado (ano, semestre) values ("+sc.getAno()+","+sc.getSemestre()+")";
        n= stm.executeUpdate(sql);
        }
        catch(SQLException e){
           System.out.println(e.getMessage());
       }
        //finally{
        //    return n;
        //}    

    }
    
    public void ContultaTodos(SemestreCancelado[] todos){
        Connection con = ConnectionFactory.getConnection();
      try{
        SemestreCancelado obj;  
        int i=0;
        Statement stm = con.createStatement();
        ResultSet res = stm.executeQuery("select * from sonaes.semestrecancelado");
        while (res.next()){
          obj = new SemestreCancelado(res.getInt("id"),res.getInt("ano"), res.getInt("semestre"));
          todos[i] = obj;
          i++;
        }
        res.close();
        con.close();
      }
      catch (SQLException e){
          System.out.println(e.getMessage());
      }

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaly;


import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */
public class TablaDatos extends DefaultTableModel{
    
    public TablaDatos(Object[][] data, Object[] columnNames){
        super(data, columnNames);
    }
    
    Class[] types = new Class[]{
        java.lang.Object.class,java.lang.Object.class,java.lang.Boolean.class
    };
    
    
    public Class getColumnClass(int columnIndex){
        return types[columnIndex];
    }
        
}
  
package Catedratico;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oem
 */
public class Catedraticos extends javax.swing.JFrame {
    
    

    Connection con = null;
    Statement stmt = null;
    String var, var2;
    public Catedraticos() {
        initComponents();
        this.setTitle("Módulo catedrático");
        this.setLocation(335, 220);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        Campo = new javax.swing.JLabel();
        Campo1 = new javax.swing.JLabel();
        Campo2 = new javax.swing.JLabel();
        Campo3 = new javax.swing.JLabel();
        Campo4 = new javax.swing.JLabel();
        Campo5 = new javax.swing.JLabel();
        Campo6 = new javax.swing.JLabel();
        Campo_Nombre = new javax.swing.JTextField();
        Campo_Apellidos = new javax.swing.JTextField();
        Campo_Direccion = new javax.swing.JTextField();
        Campo_Telefono = new javax.swing.JTextField();
        Campo_Fecha = new javax.swing.JTextField();
        Campo_Sexo = new javax.swing.JComboBox<>();
        Campo_Etnia = new javax.swing.JComboBox<>();
        Boton_Aceptar = new javax.swing.JButton();
        Boton_Datos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Campo7 = new javax.swing.JLabel();
        Campo_Id = new javax.swing.JTextField();
        Campo8 = new javax.swing.JLabel();
        Campo_Municipio = new javax.swing.JComboBox<>();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Catedrático");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        Campo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Campo.setForeground(new java.awt.Color(255, 255, 255));
        Campo.setText("Nombres:");
        getContentPane().add(Campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        Campo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Campo1.setForeground(new java.awt.Color(255, 255, 255));
        Campo1.setText("Apellidos:");
        getContentPane().add(Campo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        Campo2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Campo2.setForeground(new java.awt.Color(255, 255, 255));
        Campo2.setText("Dirección:");
        getContentPane().add(Campo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, 20));

        Campo3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Campo3.setForeground(new java.awt.Color(255, 255, 255));
        Campo3.setText("Teléfono:");
        getContentPane().add(Campo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, 20));

        Campo4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Campo4.setForeground(new java.awt.Color(255, 255, 255));
        Campo4.setText("DPI:");
        getContentPane().add(Campo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, -1, -1));

        Campo5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Campo5.setForeground(new java.awt.Color(255, 255, 255));
        Campo5.setText("Sexo:");
        getContentPane().add(Campo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        Campo6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Campo6.setForeground(new java.awt.Color(255, 255, 255));
        Campo6.setText("Etnia:");
        getContentPane().add(Campo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, -1));

        Campo_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_NombreActionPerformed(evt);
            }
        });
        Campo_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Campo_NombreKeyTyped(evt);
            }
        });
        getContentPane().add(Campo_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 190, -1));

        Campo_Apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Campo_ApellidosKeyTyped(evt);
            }
        });
        getContentPane().add(Campo_Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 190, -1));
        getContentPane().add(Campo_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 190, -1));

        Campo_Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Campo_TelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(Campo_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 190, -1));
        getContentPane().add(Campo_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 170, -1));

        Campo_Sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));
        getContentPane().add(Campo_Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 170, -1));

        Campo_Etnia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maya", "Ladina", "Xinca", "Garifuna" }));
        getContentPane().add(Campo_Etnia, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 170, -1));

        Boton_Aceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton_Aceptar.setText("Aceptar");
        Boton_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AceptarActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 160, 60));

        Boton_Datos.setText("Mostrar datos");
        Boton_Datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_DatosActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 120, 30));

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 120, 30));

        jButton2.setText("Modificar datos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        Campo7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Campo7.setForeground(new java.awt.Color(255, 255, 255));
        Campo7.setText("Id:");
        getContentPane().add(Campo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        Campo_Id.setEditable(false);
        Campo_Id.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(Campo_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 60, -1));

        Campo8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Campo8.setForeground(new java.awt.Color(255, 255, 255));
        Campo8.setText("Municipio:");
        getContentPane().add(Campo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, -1));

        Campo_Municipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quetzaltenango" }));
        getContentPane().add(Campo_Municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 170, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Catedratico/Imagenes/pizarra.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -11, 800, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void actualizar() {
        
        String cadena1,cadena2,cadena3,cadena4,cadena5,cadena6,cadena7, cadena8;
     
       cadena1 = Campo_Id.getText();
       cadena2 = Campo_Nombre.getText();
       cadena3 = Campo_Apellidos.getText();
       cadena4 = Campo_Direccion.getText();
       cadena5 = Campo_Telefono.getText();
       cadena6 = Campo_Fecha.getText();
       cadena7 = Campo_Sexo.getSelectedItem().toString();
       cadena8 = Campo_Etnia.getSelectedItem().toString();
     
    
     if (Campo_Nombre.getText().equals("")) {
         
         javax.swing.JOptionPane.showMessageDialog(this,"1-. Consulte el nombre del cliente\n 2-. Actualice el dato deseado en el campo correspondiente","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
     }
     else {   
     
     try { 
                  String url = "jdbc:mysql://localhost:3306/mydb"; 
                  String usuario = "root"; 
                  String contraseña = "6148"; 
                  
                  Class.forName("com.mysql.jdbc.Driver").newInstance(); 
                  con = DriverManager.getConnection(url,usuario,contraseña); 
                  if ( con != null ) 
                    System.out.println("Se ha establecido una conexión a la base de datos " +  
                                       "\n " + url ); 
  
                  stmt = con.createStatement(); 
                  stmt.executeUpdate("update ignore catedratico set IdCatedratico= '"+cadena1+"' , Nombres = '"+cadena2+"',Apellidos = '"+cadena3+"',Direccion = '"+cadena4+"', Telefono = '"+cadena5+"', Nacimiento = '"+cadena6+"', Sexo = '"+cadena7+ "' , Etnia = '"+cadena8+
                          "' where IdCatedratico = '"+Campo_Id.getText()+"' || Nombres = '"+Campo_Nombre.getText()+"' || Apellidos = '"+Campo_Apellidos.getText()+"' || Direccion = '"+Campo_Direccion.getText()+"' || Telefono = '"+Campo_Telefono.getText()+"' || Nacimiento = '"+Campo_Fecha.getText()+"' || Sexo = '"+Campo_Sexo.getSelectedItem()+"' || Etnia = '"+Campo_Etnia.getSelectedItem()+"'"); 
                  System.out.println("Los valores han sido Actualizados"); 
                  } 
                  catch( SQLException e ) { 
                      e.printStackTrace(); 
                  } catch (ClassNotFoundException ex) { 
            Logger.getLogger(Catedraticos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Catedraticos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Catedraticos.class.getName()).log(Level.SEVERE, null, ex);
        } 
  
              finally { 
                  if ( con != null ) { 
                      try    { 
                          con.close(); 
                          stmt.close(); 
                      } catch( Exception e ) { 
                          System.out.println( e.getMessage()); 
                      } 
                  } 
     }
     javax.swing.JOptionPane.showMessageDialog(this,"Actualizado correctamente!","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
     } 
        this.Campo_Id.setText("");
        this.Campo_Nombre.setText("");
        this.Campo_Apellidos.setText("");
        this.Campo_Telefono.setText("");
        this.Campo_Direccion.setText("");
        this.Campo_Fecha.setText("");
    }

    
    public void consulta() {
        String cap="";
        ResultSet rs = null;
        var2 = var;
        String sql2="Select idCatedratico, Nombres, Apellidos, Direccion, Telefono, Nacimiento, Sexo, Etnia FROM catedratico where Nombres = '"+var2+"'";
            
   try { 
       
                  String url = "jdbc:mysql://localhost:3306/mydb"; 
                  String usuario = "root"; 
                  String contraseña = "6148";
                  
     Class.forName("com.mysql.jdbc.Driver").newInstance(); 
     
     
     con = DriverManager.getConnection(url,usuario,contraseña); 

     if ( con != null ) 
	   System.out.println("Se ha establecido una conexión a la base de datos " + 
	                                       "\n " + url ); 
	  
	stmt = con.createStatement(); 
	rs = stmt.executeQuery(sql2); 
        
	int i=1; 
	   while ( rs.next() ) { 
               
	           String id = rs.getString("IdCatedratico");
	           String nombre = rs.getString("Nombres"); 
	           String apellidos = rs.getString("Apellidos"); 
                   String direccion = rs.getString("Direccion"); 
                   String telefono = rs.getString("Telefono"); 
                   String nacimiento = rs.getString("Nacimiento");
                   String sexo = rs.getString("Sexo");
                   String etnia = rs.getString("Etnia"); 
	           /*System.out.println("Sitio Web "+ (i++) + ":\n" 
	                     
                           + id + "\n"
                           + inom + "\n" 
                           + idom + "\n" 
                           + itel + "\n"
	                   + inick + "\n"
                           + ipass + "\n"
                           + itipo + "\n\n"); */
                   Campo_Id.setText(id);
                   Campo_Nombre.setText(nombre);
                   Campo_Apellidos.setText(apellidos);
                   Campo_Direccion.setText(direccion);
                   Campo_Telefono.setText(telefono);
                   Campo_Fecha.setText(nacimiento);
                  // Campo_Sexo.setText(sexo);
                   //Campo_Etnia.setText(etnia);
                   Campo_Sexo.setSelectedItem(sexo);
                   Campo_Etnia.setSelectedItem(etnia);
                  
	         } 
	        } 
                  catch( SQLException ex ) { 
                      ex.printStackTrace(); 
	                  } catch (InstantiationException ex) { 
            Logger.getLogger(Catedraticos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Catedraticos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Catedraticos.class.getName()).log(Level.SEVERE, null, ex);
        } 
	  
	              finally { 
	                  if ( rs != null ) { 
	                      try    { 
	                          rs.close(); 
	                      } catch( SQLException ex ) { 
	                          System.out.println( ex.getMessage()); 
	                          ex.printStackTrace(); 
	                      } 
	                  } 
	                  if ( stmt != null ) { 
	                      try    { 
	                          stmt.close(); 
	                      } catch( SQLException ex ) { 
	                          System.out.println( ex.getMessage()); 
	                          ex.printStackTrace(); 
	                      } 
	                  } 
	                  if ( con != null ) { 
	                      try    { 
	                          con.close(); 
	                      } catch( SQLException ex ) { 
	                          System.out.println( ex.getMessage()); 
	                          ex.printStackTrace(); 
         } 
       }
     }    
    }

    private void Campo_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_NombreActionPerformed

    }//GEN-LAST:event_Campo_NombreActionPerformed

    private void Campo_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Campo_NombreKeyTyped
         char letra = evt.getKeyChar();
         if((letra<'a'||letra>'z')&&(letra<'A'||letra>'z')&&(letra<' ' || letra>' ')) evt.consume();
        
    }//GEN-LAST:event_Campo_NombreKeyTyped

    private void Campo_ApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Campo_ApellidosKeyTyped
         char letra = evt.getKeyChar();
         if((letra<'a'||letra>'z')&&(letra<'A'||letra>'z')&&(letra<' ' || letra>' ')) evt.consume();
    }//GEN-LAST:event_Campo_ApellidosKeyTyped

    private void Campo_TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Campo_TelefonoKeyTyped
         char letra = evt.getKeyChar();
         if((letra<'0'||letra>'9')) evt.consume();
    }//GEN-LAST:event_Campo_TelefonoKeyTyped

    private void Boton_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AceptarActionPerformed
        String cadena2,cadena3,cadena4,cadena5,cadena6,cadena7,cadena8;
        
        cadena2 = Campo_Nombre.getText();
        cadena3 = Campo_Apellidos.getText();
        cadena4 = Campo_Direccion.getText();
        cadena5 = Campo_Telefono.getText();
        cadena6 = Campo_Fecha.getText();
        cadena7 = Campo_Sexo.getSelectedItem().toString();
        cadena8 = Campo_Etnia.getSelectedItem().toString();
        
        if (Campo_Nombre.getText().equals("") || (Campo_Apellidos.getText().equals("")) || (Campo_Direccion.getText().equals("")) || (Campo_Fecha.getText().equals(""))
           || (Campo_Telefono.getText().equals("")) || (Campo_Sexo.getSelectedItem().equals(null)) || (Campo_Etnia.getSelectedItem().equals(null)) ) {
            
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","ERROR",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            Campo_Nombre.requestFocus();
        }
                else {
        try {
           
            String url = "jdbc:mysql://localhost:3306/sbd_inebxela"/*?zeroDateTimeBehavior=convertToNull"*/;
            String usuario = "root";
            String contraseña = "6148";
            
             Class.forName("com.mysql.jdbc.Driver").newInstance(); 
             con = DriverManager.getConnection(url,usuario,contraseña); 
             if ( con != null ) 
                    System.out.println("Se ha establecido una conexión a la base de datos " +  
                                       "\n " + url ); 
             
                  stmt = con.createStatement();
                   
                  stmt.executeUpdate("INSERT INTO catedratico (Nombres,Apellidos,Direccion,DPI, Sexo, Etnia) VALUES('"+cadena2+"','"+cadena3+"','"+cadena4+"','"+cadena6+"','"+cadena7+"','"+cadena8+"')");
                  System.out.println("Los valores han sido agregados a la base de datos ");
                 
                   
        } catch (InstantiationException ex) {
           Logger.getLogger(Catedraticos.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           Logger.getLogger(Catedraticos.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(Catedraticos.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(Catedraticos.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        finally {
            if (con != null) {
                try {
                    con.close();
                    stmt.close();
                } catch ( Exception e ) { 
                         System.out.println( e.getMessage());
                }
            }
        }
         javax.swing.JOptionPane.showMessageDialog(this,"Registro exitoso! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        this.Campo_Id.setText("");
        this.Campo_Nombre.setText("");
        this.Campo_Apellidos.setText("");
        this.Campo_Direccion.setText("");
        this.Campo_Telefono.setText("");
        this.Campo_Fecha.setText("");  


    }//GEN-LAST:event_Boton_AceptarActionPerformed

    private void Boton_DatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_DatosActionPerformed

        this.dispose();
        Datos_Catedraticos Ventana = new Datos_Catedraticos();
        Ventana.setVisible(true);
    }//GEN-LAST:event_Boton_DatosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      //  String cap="";
        ResultSet rs = null; 
         var = javax.swing.JOptionPane.showInputDialog(this,"Nombres  del catedratico a modificar","Datos catedrático",javax.swing.JOptionPane.QUESTION_MESSAGE);
        String sql="SELECT* FROM catedratico WHERE Nombres = '"+var+"'";
        if(var == null)  
        javax.swing.JOptionPane.showMessageDialog(this,"La accion fue cancelada","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
      else {   
        if (var.equals("")) {
            javax.swing.JOptionPane.showMessageDialog(this,"Ingrese el nombre del catedratico\nque desea consultar","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
         else {
        try {
            
            String url = "jdbc:mysql://localhost:3306/mydb";
            String usuario = "root";
            String contraseña = "6148";
            
             Class.forName("com.mysql.jdbc.Driver").newInstance(); 
             con = DriverManager.getConnection(url,usuario,contraseña); 
             if ( con != null ) 
                    System.out.println("Se ha establecido una conexión a la base de datos " +  
                                       "\n " + url ); 
  
                  stmt = con.createStatement(); 
                  rs = stmt.executeQuery(sql);
                        
          while(rs.next()) {
              
               //cap = rs.getString("tipousuario"); 
                  
          //if (cap.equals("invitado") || cap.equals("administrador") || cap.equals("manager") || cap.equals("servidor")) {
               
              consulta();           
          //}
         }   // fin del bucle While
         
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
           Logger.getLogger(Catedraticos.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        finally {
            if (con != null) {
                try {
                    con.close();
                    stmt.close();
                } catch ( Exception e ) { 
                         System.out.println( e.getMessage());
                }
              }
            }
          /* if (!cap.equals("Nombres") ) {
              javax.swing.JOptionPane.showMessageDialog(this,"El usuario no fue encontrado\n","ERROR!", javax.swing.JOptionPane.ERROR_MESSAGE);
             
          }*/
        }
      }  


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        actualizar();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Catedraticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catedraticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catedraticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catedraticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catedraticos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Aceptar;
    private javax.swing.JButton Boton_Datos;
    private javax.swing.JLabel Campo;
    private javax.swing.JLabel Campo1;
    private javax.swing.JLabel Campo2;
    private javax.swing.JLabel Campo3;
    private javax.swing.JLabel Campo4;
    private javax.swing.JLabel Campo5;
    private javax.swing.JLabel Campo6;
    private javax.swing.JLabel Campo7;
    private javax.swing.JLabel Campo8;
    private javax.swing.JTextField Campo_Apellidos;
    private javax.swing.JTextField Campo_Direccion;
    private javax.swing.JComboBox<String> Campo_Etnia;
    private javax.swing.JTextField Campo_Fecha;
    private javax.swing.JTextField Campo_Id;
    private javax.swing.JComboBox<String> Campo_Municipio;
    private javax.swing.JTextField Campo_Nombre;
    private javax.swing.JComboBox<String> Campo_Sexo;
    private javax.swing.JTextField Campo_Telefono;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}

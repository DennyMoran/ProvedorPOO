package proyectojavauno;
/* Estos son los atributos de la clase Cliente*/


public class Proveedor {
         private int idProveedor;
         private String nombreProveedor;
         private String direcciónProveedor;
         private String teléfonoProveedor;
         private String paginaWeb;

    
   /* Metodos dentro de la clase Cliente*/
    
    /*Metodo Set...*/
         
    public void setIdProveedor(int idProveedor){
    this.idProveedor = idProveedor;    
    }
    
    public void setNombreProveedor(String nombreProveedor){
    this.nombreProveedor = nombreProveedor;    
    }
    
    public void setDirecciónProveedor(String direcciónProveedor){
    this.direcciónProveedor = direcciónProveedor;    
    }
    
    public void setTeléfonoProveedor(String teléfonoProveedor){
    this.teléfonoProveedor = teléfonoProveedor;    
    }
    
    public void setPaginaWeb(String paginaWeb){
    this.paginaWeb = paginaWeb;
    }
    
    /* Metodo Get...*/
    public int getIdProveedor(){
    return idProveedor;
    }
         
       
    public String getNombreProveedor(){
    return nombreProveedor;
    }    
     
         
         
     public String getDirecciónProveedor(){
     return direcciónProveedor;
     }
     
     public String getTeléfonoProveedor(){
     return teléfonoProveedor;
     }
         
     public String getPaginaWeb(){
     return paginaWeb;
    
    }    
}

package proyectojavauno;


public class ProyectoJavaUno {
    
     public static void main(String[] args) {
      //Creo objeto en base a la clase
      
      Proveedor prov1 = new Proveedor();  
      Proveedor prov2 = new Proveedor();
      Proveedor prov3 = new Proveedor();
      
      prov1.setIdProveedor ('9');
      prov1.setNombreProveedor("Julieta Andrea");
      prov1.setDirecciónProveedor("Medium city #10, House");
      prov1.setTeléfonoProveedor("456-889-6587");
      prov1.setPaginaWeb("www.fb.com");
      
      
      prov2.setIdProveedor ('8');
      prov2.setNombreProveedor("Bonsua Kity");
      prov2.setDirecciónProveedor("Big city #6, House");
      prov2.setTeléfonoProveedor("876-466-7669");
      prov2.setPaginaWeb("www.xvideos.com");
      
      prov3.setIdProveedor ('7');
      prov3.setNombreProveedor("Lovigg Ugg");
      prov3.setDirecciónProveedor("Little city #20, House");
      prov3.setTeléfonoProveedor("946-323-6548");
      prov3.setPaginaWeb("www.avast.com");
      
      
        System.out.println(prov1.getIdProveedor());
        System.out.println(prov1.getNombreProveedor());
        System.out.println(prov1.getDirecciónProveedor());
        System.out.println(prov1.getTeléfonoProveedor());
         System.out.println(prov1.getPaginaWeb());
      
        System.out.println(prov2.getIdProveedor());
        System.out.println(prov2.getNombreProveedor());
        System.out.println(prov2.getDirecciónProveedor());
        System.out.println(prov2.getTeléfonoProveedor());
        System.out.println(prov2.getPaginaWeb());
              
        System.out.println(prov3.getIdProveedor());
        System.out.println(prov3.getNombreProveedor());
        System.out.println(prov3.getDirecciónProveedor());
        System.out.println(prov3.getTeléfonoProveedor());
        System.out.println(prov3.getPaginaWeb());
      

               
               
            
   
    }
    
}
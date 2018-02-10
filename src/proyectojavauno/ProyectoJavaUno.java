package proyectojavauno;


public class ProyectoJavaUno {
    
     public static void main(String[] args) {
      //Creo objeto en base a la clase
      
      Proveedor prov1 = new Proveedor();  
      Proveedor prov2 = new Proveedor();
      Proveedor prov3 = new Proveedor();
      
      prov1.setIdProveedor ('5');
      prov1.setNombreProveedor("Armando Estrella");
      prov1.setDirecciónProveedor("Maximo Gomez #34");
      prov1.setTeléfonoProveedor("809-654-4585");
      prov1.setWeb("Prodacom.com.do");
      
      
      prov2.setIdProveedor ('6');
      prov2.setNombreProveedor("Acero Estrella");
      prov2.setDirecciónProveedor("Av. Autopista Duarto #87");
      prov2.setTeléfonoProveedor("809-200-1400");
      prov2.setWeb("www.AceroEstrella.com");
      
      prov3.setIdProveedor ('7');
      prov3.setNombreProveedor("El Mundo Del Juguete");
      prov3.setDirecciónProveedor("Av. Bartolome Colon");
      prov3.setTeléfonoProveedor("809-221-2000");
      prov3.setWeb("www.elmundodeljuguete.com");
      
      
        System.out.println(prov1.getIdProveedor());
        System.out.println(prov1.getNombreProveedor());
        System.out.println(prov1.getDirecciónProveedor());
        System.out.println(prov1.getTeléfonoProveedor());
        System.out.println(prov1.getWeb());
      
        System.out.println(prov2.getIdProveedor());
        System.out.println(prov2.getNombreProveedor());
        System.out.println(prov2.getDirecciónProveedor());
        System.out.println(prov2.getTeléfonoProveedor());
        System.out.println(prov2.getWeb());
              
        System.out.println(prov3.getIdProveedor());
        System.out.println(prov3.getNombreProveedor());
        System.out.println(prov3.getDirecciónProveedor());
        System.out.println(prov3.getTeléfonoProveedor());
        System.out.println(prov3.getWeb());
      

    }
    
}
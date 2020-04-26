package data;

import Estructuras_de_datos.*;
import java.io.*;

public class DataBase implements Serializable {
    //IMPORTANTE
    //Para poder usar la base de datos deben poner el Users(nombre del usuario en su pc) y el disco local y carpeta donde guardaron el archivo del proyecto
    //Direccion sebastian: C:\\Users\\Sebastian\\Documents\\NetBeansProjects\\Proyecto_Estructuras\\src\\Basededatos.txt
    //Dirección David: C:\\Users\\USUARIO\\Desktop\\Estructuras de Datos\\Proyecto\\src\\Basededatos.txt
    //Guarda los datos separados por ; si tiene una lista dentro de alguna clase, esta se debe guardar
    //seperada por * y el numero de variables va al inicio seperada por &.
    public static String localDatabase = "C:\\Users\\USUARIO\\Desktop\\Estructuras de Datos\\Proyecto\\src\\";
    public static SinglyLinkedList<User> singlyLinkedListUser = new SinglyLinkedList<User>();
    public static SinglyLinkedList<RawMaterial> singlyLinkedRawMaterial = new SinglyLinkedList<RawMaterial>();
    public static SinglyLinkedList<String> singlyLinkedRawMaterialname = new SinglyLinkedList<String>();
    public static SinglyLinkedList<Integer> singlyLinkedRawDeleteMaterial = new SinglyLinkedList<Integer>();

    public static void WriteArchive() {
        String nametxt = "";

        try {
            nametxt=localDatabase;
            nametxt = nametxt+"Materiales2";
            File file = new File(nametxt + ".txt");
            FileWriter flwriter = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            
            int size = singlyLinkedRawMaterial.getSize();
            for (int i = 0; i < size; i++) {
                String write = singlyLinkedRawMaterial.getFront().toString();
                String size2 = String.valueOf(5 + singlyLinkedRawMaterial.getFront().getParametrosCalidad().getSize() * 4);
                bfwriter.write(size2 + "$" + write);
                for (int j = 0; j < singlyLinkedRawMaterial.getFront().getParametrosCalidad().getSize(); j++) {
                    write = singlyLinkedRawMaterial.getFront().getParametrosCalidad().getItem(j).toString();
                    bfwriter.write("*" + write);
                }
                singlyLinkedRawMaterial.popFront();
                bfwriter.write(";\n");
            }
            
            nametxt=localDatabase;
            nametxt = nametxt+"DatosborradosMateriales";
            File file2 = new File(nametxt + ".txt");
            FileWriter flwriter2 = new FileWriter(file2);
            BufferedWriter bfwriter2 = new BufferedWriter(flwriter2);
            for (int i = 0; i < singlyLinkedRawDeleteMaterial.getSize(); i++) {
                bfwriter2.write(String.valueOf(singlyLinkedRawDeleteMaterial.getItem(i)) + "\n");
            }

            bfwriter.close();
            bfwriter2.close();
        } catch (IOException e) {
            System.out.println("Error al guardar datos");
        }
    }

    public static void LoadArchive() {

        try { 
           loadDeleteMaterial("");           
           loadNameMaterial("");
         //  loadNameMaterial("2");
           
        } catch (IOException e) {
            System.out.println("Error al cargar archivo");
        }

    }
    
    
    public static void loadDeleteMaterial(String numbertxt) throws IOException{
            String url=localDatabase;
            FileReader fileStremx = new FileReader(url+"DatosborradosMateriales"+numbertxt+ ".txt");
            BufferedReader os = new BufferedReader(fileStremx);
            String loadData = os.readLine();
            while (loadData != null) {
                singlyLinkedRawDeleteMaterial.pushBack(Integer.parseInt(loadData));               
                loadData = os.readLine();
            }
             os.close();
   }
    
    public static void loadNameMaterial(String numbertxt) throws IOException{
            String url=localDatabase;
            FileReader fileStremx2 = new FileReader(url+"Materiales"+numbertxt+ ".txt");            
            BufferedReader os2 = new BufferedReader(fileStremx2);
            String loadData2 = os2.readLine();
            int count = 0;            
            while (loadData2 != null) {
                
                for (int i = 0; i < loadData2.length(); i++) {
                    if (loadData2.charAt(i) == ';') {
                        
                        if (singlyLinkedRawDeleteMaterial.isListed(count)) {
                             singlyLinkedRawMaterialname.pushBack("!");  
                            
                             break;
                         }else{
                            singlyLinkedRawMaterialname.pushBack(loadData2.substring(2, i));
                            break;
                        }
                        
                    }
                }

                loadData2 = os2.readLine();
                count++;
            }
            os2.close();
   }

    public static void reachMaterial(String buscarBD) throws IOException {
        
        int i = singlyLinkedRawMaterialname.getIndex(buscarBD);     
        
        if(i!=-1){
        FileReader fileStremx = new FileReader(localDatabase + "Materiales" + ".txt");
        BufferedReader os = new BufferedReader(fileStremx);
       
       
        for (int j = 0; j < i; j++) {
            os.readLine();
        }

        String loadData = os.readLine();
        String load[] = new String[Integer.parseInt(String.valueOf(loadData.charAt(0)))];
        int j = 0;
        int k = 2;
        int z = 0;
        for (int o = 0; o < loadData.length(); o++) {
            if (loadData.charAt(o) == ';') {
                load[j] = loadData.substring(k, o);
                k = o + 1;
                j++;
            } else if (loadData.charAt(o) == '*') {
                load[j] = loadData.substring(k, o);
                j++;
                k = o + 1;
                z++;
            }
        }
        MyArrayList<Parameter> parametrosCalidad = new MyArrayList<>();
        Parameter parameter;
        RawMaterial rawMaterial;
        int a = 0;
        for (int o = 0; o < z; o++) {
            parameter = new Parameter(load[5 + a], Double.parseDouble(load[6 + a]), Double.parseDouble(load[7 + a]), Double.parseDouble(load[8 + a]));
            a = a + 4;
            parametrosCalidad.pushBack(parameter);

        }
        rawMaterial = new RawMaterial(load[0], load[1], load[2], load[3], load[4], parametrosCalidad);
        singlyLinkedRawMaterial.pushBack(rawMaterial);
        singlyLinkedRawDeleteMaterial.pushBack(i);
        }else{
            System.out.println("El material no existe");
        }
       
    }
}
     
package data;

import Estructuras_de_datos.*;
import java.io.*;

public class DataBase implements Serializable {

    //Direccion sebastian: C:\\Users\\Sebastian\\Documents\\NetBeansProjects\\Proyecto_Estructuras\\src\\
    //Dirección David: C:\\Users\\USUARIO\\Desktop\\Estructuras de Datos\\Proyecto\\src\\
    private static String localDatabase = "";
    
    public static MyArrayList<Production> myArrayListProduction = new MyArrayList<Production>();
    public static SinglyLinkedList<String> sLnameP = new SinglyLinkedList<String>();
    
    public static SinglyLinkedList<User> singlyLinkedListUser = new SinglyLinkedList<User>();
    public static SinglyLinkedList<String> sLnameU = new SinglyLinkedList<String>();

    public static ArrayQueue<RawMaterial> arrayQueueRawMaterial;
    public static MyArrayList<Stage> myArrayListStage;


//WRITE
    public static void WriteArchive() {
        try {
            if (sLnameU.getSize() == 0) {
                CreateArchive("Usuarios", true);
            }
            if (sLnameP.getSize() == 0) {
                CreateArchive("Informe", true);
            }

            for (int i = 0; i < singlyLinkedListUser.getSize(); i++) {
                
                if (sLnameU.getIndex(singlyLinkedListUser.getItem(i).getUser())==-1) {
                    Write("Usuarios", "Usuarios", i);
                }

            }

            for (int k = 0; k < myArrayListProduction.getSize(); k++) {
                String nameA = myArrayListProduction.getItem(k).getName();

                llenarArchive(nameA, k);
            }

        } catch (IOException e) {
            System.out.println("Error al guardar datos");
        }
    }

    public static void CreateArchive(String name, Boolean new1) throws IOException {//Crea un archivo de nombre name
        String nametxt = localDatabase;
        nametxt = nametxt + name;
        File file = new File(nametxt + ".txt");
        FileWriter flwriter = new FileWriter(file.getAbsoluteFile(), new1);

        flwriter.close();

    }

    public static void llenarArchive(String nameA, int i) throws IOException {//Llena los archivos de producciones
        CreateArchive(nameA, false);
        Write(nameA, "Producciones", i);
        Write(nameA, "Materiales", i);
        Write(nameA, "Stage", i);
        informeArchive(nameA,true);
    }

    public static void eliminar(String nameA) throws IOException {//Elimina un archivo

        String nametxt = localDatabase;
        nametxt = nametxt + nameA;
        File file = new File(nametxt + ".txt");
        if (file.delete()) {
            System.out.println("El archivo" + nameA + "ha sido borrado satisfactoriamente");
        } else {
            System.out.println("El archivo" + nameA + "no puedo ser borrado satisfactoriamente");
        }
        
         sLnameP.removeItem(nameA);
         informeArchive("Eliminar",false);
    }

    public static void Write(String nameA, String name, int number) throws IOException {//Escribe el archivo dependiendo lo que vaya a escribir

        String nametxt = localDatabase;

        nametxt = nametxt + nameA;
        File file = new File(nametxt + ".txt");
        FileWriter flwriter = new FileWriter(file.getAbsoluteFile(), true);
        BufferedWriter bfwriter = new BufferedWriter(flwriter);

        if (name.equalsIgnoreCase("Materiales")) {
            arrayQueueRawMaterial = myArrayListProduction.getItem(number).getRawMaterials();
            bfwriter.write("3.Materiales;\n");
            int size=arrayQueueRawMaterial.getSize();
            for (int index = 0; index < size; index++) {
                String write = arrayQueueRawMaterial.getTail().toString(); //debe ser la cabeza, "corregir"
                String size2 = String.valueOf(5 + arrayQueueRawMaterial.getTail().getParameterList().getSize() * 4);
                bfwriter.write(size2 + "$" + write);
                for (int j = 0; j < arrayQueueRawMaterial.getTail().getParameterList().getSize(); j++) {
                    write = arrayQueueRawMaterial.getTail().getParameterList().getItem(j).toString();
                    bfwriter.write("*" + write);
                }
                 arrayQueueRawMaterial.dequeue();
                bfwriter.write(";\n");
            }

        } else if (name.equalsIgnoreCase("Usuarios") && singlyLinkedListUser.getSize() != 0) {
            String write = "";
            write = singlyLinkedListUser.getItem(number).toString();
            bfwriter.write("5" + "$" + write + ";\n");

        } else if (name.equalsIgnoreCase("Producciones") && myArrayListProduction.getSize() != 0) {
            String write = myArrayListProduction.getItem(number).getName();
            bfwriter.write("1.Nombre: " + write + ";\n");

            write = myArrayListProduction.getItem(number).getDescription();
            bfwriter.write("2.Descripcion" + ";\n" + write + ";\n");
        } else if (name.equalsIgnoreCase("Stage")) {
            bfwriter.write("4.Stage;\n");

            myArrayListStage = myArrayListProduction.getItem(number).getStages();

            for (int index = 0; index < myArrayListStage.getSize(); index++) {

                String write = myArrayListStage.getItem(index).toString();

                String size2 = String.valueOf(5 + myArrayListStage.getItem(index).getParameterList().getSize() * 4);

                bfwriter.write(size2 + "$" + write);

                for (int j = 0; j < myArrayListStage.getItem(index).getParameterList().getSize(); j++) {
                    write = myArrayListStage.getItem(index).getParameterList().getItem(j).toString();
                    bfwriter.write("*" + write);
                }

                bfwriter.write(";\n");
            }

        }

        bfwriter.close();
    }

    public static void informeArchive(String name, Boolean neww) throws IOException { //Actualiza la lista de procesos
        String nametxt = localDatabase;
        nametxt = nametxt + "Informe";
        File file = new File(nametxt + ".txt");
        FileWriter flwriter = new FileWriter(file.getAbsoluteFile(), neww);
        try (BufferedWriter bfwriter = new BufferedWriter(flwriter)) {
            if(name.equals("Eliminar")){
                   for(int i=0; i<sLnameP.getSize(); i++){
                       bfwriter.write(sLnameP.getItem(i)+ ";" + "\n");
                   }
                  
            }else{
                  if (sLnameP.getSize() != 0) {
            
                if (sLnameP.getIndex(name)==-1) {
                    bfwriter.write(name + ";" + "\n");
                }
            } else {
                bfwriter.write(name + ";" + "\n");

            }
            }     

        }
    }

//Load    
    public static void loadArchive() {
        try {
            load("", "Informe");
            load("", "Usuarios");
        } catch (IOException e) {
            System.out.println("Error al cargar archivos");
        }
    }

    public static void load(String numbertxt, String name) throws IOException { //Enlista los procesos guardados
        String url = localDatabase;
        BufferedReader os2;
        try {
            FileReader fileStremx2 = new FileReader(url + name + numbertxt + ".txt");
            os2 = new BufferedReader(fileStremx2);

            if (name.equalsIgnoreCase("Informe")) {

                String loadData2 = os2.readLine();
                while (loadData2 != null) {
                    for (int i = 0; i < loadData2.length(); i++) {
                        if (loadData2.charAt(i) == ';') {
                            sLnameP.pushBack(loadData2.substring(0, i));
                        }
                        break;
                    }
                    loadData2 = os2.readLine();
                }
            } else if (name.equalsIgnoreCase("Usuarios")) {
                String loadData2 = os2.readLine();
                while (loadData2 != null) {
                    for (int i = 0; i < loadData2.length(); i++) {
                        if (loadData2.charAt(i) == ';') {
                            sLnameU.pushBack(loadData2.substring(0, i));
                        }
                        break;
                    }
                    loadData2 = os2.readLine();
                }
            }
        } catch (IOException e) {

        }
    }
//Busca el nombre proceso o el nombre de usuario y luego lo carga al sistema con todos sus datos
    public static Boolean reach(String buscarBD, String tip) throws IOException {
        int i = -1;
        if (tip.equals("Usuarios")) {
            i = sLnameU.getIndex(buscarBD);
        } else if (tip.equals("Informe")) {
           
            i = sLnameP.getIndex(buscarBD);
        }
        if (i != -1 && tip.equals("Informe")) {
            FileReader fileStremx = new FileReader(localDatabase + buscarBD + ".txt");

            BufferedReader os = new BufferedReader(fileStremx);
            String loadData = os.readLine();
            String name = loadData.substring(10, loadData.length() - 1);

            os.readLine();
            loadData = os.readLine();
            String descripcion = loadData.substring(0, loadData.length() - 1);

            os.readLine();
            arrayQueueRawMaterial = new  ArrayQueue<>();
            while (!(loadData = os.readLine()).equals("4.Stage;")) {
                int tam = 0;
                for (int o = 0; o < loadData.length(); o++) {
                    if (loadData.charAt(o) == '$') {
                        tam = Integer.parseInt(loadData.substring(0, o));
                    }
                }
                String load[] = new String[tam];
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
                arrayQueueRawMaterial.enqueue(rawMaterial);
            }
            os.readLine();
            myArrayListStage = new MyArrayList<>();
            while ((loadData = os.readLine()) != null) {
                int tam = 0;
                for (int o = 0; o < loadData.length(); o++) {
                    if (loadData.charAt(o) == '$') {
                        tam = Integer.parseInt(loadData.substring(0, o));
                    }
                }
                String load[] = new String[tam];
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
                Stage stage;
                int a = 0;
                for (int o = 0; o < z; o++) {
                    parameter = new Parameter(load[5 + a], Double.parseDouble(load[6 + a]), Double.parseDouble(load[7 + a]), Double.parseDouble(load[8 + a]));
                    a = a + 4;
                    parametrosCalidad.pushBack(parameter);

                }
                stage = new Stage(parametrosCalidad, load[0], load[1], load[2], load[3], load[4]);
                myArrayListStage.pushBack(stage);
            }

            Production production = new Production(name, descripcion, arrayQueueRawMaterial, myArrayListStage);
            myArrayListProduction.pushBack(production);
            os.close();
            return true;
        } else if (i != -1 && tip.equals("Usuarios")) {
            FileReader fileStremx = new FileReader(localDatabase + "Usuarios" + ".txt");
            BufferedReader os = new BufferedReader(fileStremx);
            for (int j = 0; j < i; j++) {
                os.readLine();
            }
            String loadData = os.readLine();
            int tam = 0;
            for (int o = 0; o < loadData.length(); o++) {
                if (loadData.charAt(o) == '$') {
                    tam = Integer.parseInt(loadData.substring(0, o));
                }
            }
            String load[] = new String[tam];
            int j = 0;
            int k = 2;
            int z = 0;
            for (int o = 0; o < loadData.length(); o++) {
                if (loadData.charAt(o) == ';') {
                    load[j] = loadData.substring(k, o);
                    k = o + 1;
                    j++;
                }
            }

            User user;
            Boolean ad = true;
            if (load[4].equals("0")) {
                ad = false;
            }
            user = new User(load[2], Integer.valueOf(load[1]), load[0], load[3], ad);
            singlyLinkedListUser.pushBack(user);
            return true;
        }
        return false;
    }
}

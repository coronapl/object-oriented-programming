/*******************************************************************************
*    Author: coronapl
*    Class: Deserialization
*    Description:
*    Read serialized object from text file and deserialized it.
*******************************************************************************/

import java.io.*;

public class Deserialization {

    public void deserialization () {

        try {

            // Read serialized object
            FileInputStream fileInput = new FileInputStream(new File("student.txt"));
            ObjectInputStream objectInput = new ObjectInputStream(fileInput);

            // Convert object to a Student instance
            Student student = (Student) objectInput.readObject();

            // Close file input stream and object input stream
            objectInput.close();
            fileInput.close();

            System.out.print(student.getData());

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

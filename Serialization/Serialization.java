/*******************************************************************************
*    Author: coronapl
*    Class: Serialization
*    Description:
*    Write serialized object to text file.
*******************************************************************************/

import java.io.*;

public class Serialization {

    public void serialization(Student student) {

        try {

            // Create objects for writing
            FileOutputStream file = new FileOutputStream(new File("student.txt"));
            ObjectOutputStream object = new ObjectOutputStream(file);

            // Write object to file
            object.writeObject(student);
            object.close();
            file.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }
}

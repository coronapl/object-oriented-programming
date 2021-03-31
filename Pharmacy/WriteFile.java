/*******************************************************************************
*    Author: coronapl
*    Class: WriteFile
*    Description:
*    Write string to a text file.
*******************************************************************************/

import java.io.*;
import java.util.*;

public class WriteFile {

    public void writeFile(String information) {

        FileWriter writer = null;

        try {
            // Write string
            writer = new FileWriter("output.txt");
            writer.write(information);

            // Close the file
            writer.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}

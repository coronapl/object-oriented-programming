/*******************************************************************************
*    Author: coronapl
*    Class: TestSerialization
*    Description:
*    Test Serialization class.
*******************************************************************************/

class TestSerialization {

    public static void main (String args[]) {

        Serialization writer = new Serialization();
        Student student = new Student("Hugo", 19, "Market street 236, San Francisco, CA 12456");

        System.out.println(student.getData());
        writer.serialization(student);

    }
}

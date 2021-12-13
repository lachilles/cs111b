/* Record class for Exercise for Final Exam Review in CS 111B, Craig Persiko
   Represents any bank record that needs a unique ID number. 

   DO NOT CHANGE THIS FILE.
*/

abstract class Record
{
    private static int nextNumber = 1;
    private int recordNumber;

    public Record()
    {
        recordNumber = nextNumber;
        nextNumber++;
    }

    public int getId()
    {
        return recordNumber;
    }
}

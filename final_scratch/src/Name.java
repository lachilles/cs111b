/* Name class, to store a person's first and last name.
   Written by Craig Persiko
   DO NOT CHANGE THIS FILE
*/

class Name implements Comparable<Name>
{
    protected String fName, lName;

    public Name(String f, String l)
    {
        fName = f;
        lName = l;
    }

    // Compare two names: last names take precedence, so sorting is by last name.
    // The FullName class doesn't need to override this method.
    // (Middle names don't have to affect sorting.)
    @Override
    public int compareTo(Name other)
    {
        int lastNameCompareToResult = lName.compareTo(other.lName);
        // The String class implements Comparable, so it has .compareTo defined
        // already, so use that.
        if(lastNameCompareToResult == 0) // if last names are same
            return fName.compareTo(other.fName); // sort on first name
        else  // last names are different, so sort on them:
            return lastNameCompareToResult;
    }
}

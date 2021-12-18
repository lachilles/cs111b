class FullName extends Name {

    // declare instance variables
    protected String mName;

    //constructor definitions
    public FullName(String f, String m, String l) {
        super(f, l);
        this.mName = m;
    }

    @Override
    public String toString()
    {
        return fName + " " + mName + " " + lName;
    }
}

public class Name {
    private String name;


    public Name(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getCharacte()
    {
        int x= name.length();
        return x;
    }
    public String getReturnCharacte(){
        String ReturnCharacte= "";
        for (int a = name.length() - 1; a >= 0; a--)
        {
            ReturnCharacte+= name.charAt(a);
        }
        return ReturnCharacte;
    }
    public String getLetters(){
        String nametext = name.toUpperCase();
        return nametext;
    }
}
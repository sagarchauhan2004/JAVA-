package day11;

public class student {

    private int id;
    private String name;

    // abstracting : wrapping of data into a single unit.
    // : hiding the data .
    // : by using private specifier .\
    /*
     * void setid(int x) // void setid(int id)
     * { // {
     * id = x ; // this.id = id
     * } // }
     * int getId()
     * {
     * return id;
     * }
     * void setName(String name)
     * {
     * this.name = name;
     * }
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

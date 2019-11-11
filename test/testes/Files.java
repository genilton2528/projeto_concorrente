package testes;

/**
 *
 * @author genilton
 */
public class Files implements Comparable{
    private String name;
    private String size;

    public Files(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public Files() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return name + ", " + size;
    }        

    @Override
    public int compareTo(Object o) {
        Files file = (Files)o;
        
//        if (Convert.retunrNumbers(this.name) < Convert.returnNumbers(file.getName())) {
//            return -1;
//        }
//        if (this.age > person.age) {
//            return 1;
//        }
        return 0;
    }           
}

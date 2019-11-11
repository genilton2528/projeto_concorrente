package projeto_concorrente;

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
    public int compareTo(Object o) {
        Files file = (Files)o;
        
        if (Convert.returnNumbers(this.name) < Convert.returnNumbers(file.getName())) {
            return -1;
        }
        if (Convert.returnNumbers(this.name) > Convert.returnNumbers(file.getName())) {
            return 1;
        }
        return 0;
    }           
}

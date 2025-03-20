public class Encapulation {
    private String name; // Atribut private
    
    // Getter
    public String getName() {
        return name;
    }
    
    // Setter
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
}
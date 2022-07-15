public class MensClothingItem {
    private TypeOfClothes kind;
    private String name;

   // public MensClothingItem() {
   // }
    public MensClothingItem(String name, TypeOfClothes kind) {
        this.kind = kind;
        this.name = name;
    }
    public TypeOfClothes getKind() {
        return kind;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setKind(TypeOfClothes kind) {
        this.kind = kind;
    }



}

public class Car implements Vehicle{
    private DatabaseOperation databaseOperation;
    private String brand;

    public Car(DatabaseOperation databaseOperation, String brand) {
        this.databaseOperation = databaseOperation;
        this.brand = brand;
    }

    @Override
    public void saveIntoDB() {
        this.databaseOperation.saveToDatabase("car",this.brand);
    }
}

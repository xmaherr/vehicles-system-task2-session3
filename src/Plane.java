public class Plane implements Vehicle{
    private DatabaseOperation databaseOperation;
    private String brand;

    public void setDatabaseOperation(DatabaseOperation databaseOperation) {
        this.databaseOperation = databaseOperation;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void saveIntoDB() {
        this.databaseOperation.saveToDatabase("plane",this.brand);
    }
}

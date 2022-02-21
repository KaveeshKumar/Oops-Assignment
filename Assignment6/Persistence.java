abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
        return "File is persisted";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
        return "Data is persisted";
    }
}


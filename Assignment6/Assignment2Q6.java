public class Assignment2Q6 {
    public static void main(String[] args) {
        DatabasePersistence i = new DatabasePersistence();
        FilePersistence j = new FilePersistence();
        System.out.println(i.persist());
        System.out.println(j.persist());
    }

}
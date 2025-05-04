package LibraryManagement;

public class Member {
    private String name;
    private int memberId;

    // Constructor
    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    // Display member info
    public void displayInfo() {
        System.out.println("Member: " + name + " (ID: " + memberId + ")");
    }
}

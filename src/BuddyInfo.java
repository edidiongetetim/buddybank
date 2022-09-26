public class BuddyInfo {

    private String name;
    private String address;
    private String phone;

    public BuddyInfo() {
        name = "";
        address = "";
        phone = "";
    }

    public BuddyInfo(String name,String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
        System.out.println("Hello" + " " + name);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }


    public static void main(String[] args) {
        BuddyInfo buddyinfo = new BuddyInfo("Homer", "1233 Colonel By Drive", "3435665444");

        System.out.println("Hello world!");
    }
}

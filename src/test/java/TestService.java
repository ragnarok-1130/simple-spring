
public class TestService {

    private String str;

    public TestService() {
        System.out.println("无参数的构造");
    }

    public TestService(String str) {
        System.out.println("有参数的构造: " + str);
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}

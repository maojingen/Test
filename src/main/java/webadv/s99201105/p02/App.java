package webadv.s99201105.p02;

/**
 * Hello world!
 *
 */
import org.apache.commons.codec.digest.DigestUtils;
import java.util.*;
public class App {
    public static void main(String[] args) {
	App ap = new App();
        Scanner user= new Scanner(System.in);
        String zhang = user.next();
        Scanner password = new Scanner(System.in);
        String pass= password.next();
	String expected = "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92";
	if(zhang.equals("17204219毛敬恩")&&expected.equals(App.sha256hex(pass))){
		System.out.println("登录成功");
	}else{
		System.out.println("用户名或密码错误，登录失败");
	}
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}
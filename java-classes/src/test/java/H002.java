/**
 * @author shenjie
 * @version 1.0
 */
public class H002 {
    public static void main(String[] args) {
        String name = "jack";
        String ps = "123456";
        String mail = "12@.3456";
        try {
            userRe(name,ps,mail);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }



    public static void userRe(String name,String ps ,String mail){

        if(!(name.length()>=2 && name.length() <= 4)){
            throw new RuntimeException("name长度不对");
        } else {
            new Integer(ps);
        }

        if(!(mail.indexOf('@')>=0 && mail.indexOf('.') >= 0 && mail.indexOf('.') -mail.indexOf('@') >0)){
            throw new RuntimeException("邮箱格式不对");
        } else {
            System.out.println("正确");
        }

    }


}

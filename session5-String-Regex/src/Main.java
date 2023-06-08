// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //String
        String string = "Rikkei Academy";
        // khởi tạo đối tượng
        String str = new String("Hello");
        System.out.println(string);
        System.out.println(str);

        //độ dài chuỗi
        System.out.println("Độ dài của chuỗi là " + string.length());
        System.out.println("kí tự tại vị trí thứ 5 : " + string.charAt(5));
        String newstring = string.concat(" để nông dân biết code");
        System.out.println(newstring);
        String checkStr = string.concat(null);
        System.out.println(checkStr);
        // gọi phương thức changeString
//        String newString = changeString(string);
//        System.out.println("chuỗi cũ : " + string);
//        System.out.println("chuỗi mới :" + newString);
        //lớp StringBulder // sửa đổi chuỗi linh hoạt

    }

    public static String changeString(String oldStr) {
        oldStr = "new" + oldStr;
        return oldStr;
    }
}
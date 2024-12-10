public class App {
    public static void main(String[] args) throws Exception {
        String str = null;
        
        try{
        System.out.println(str.length());
        
        }catch (NullPointerException e){
            System.out.println("NullPointerException が発生しました");
            System.out.println("例外メッセージ："+ e.getMessage());
        }
    }
}

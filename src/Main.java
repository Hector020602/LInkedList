import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("1111111");
        stack.push("2222222");
        stack.push("3333333");
        try {
            Object obj = stack.pop();
            System.out.println("Popped object = " + obj);
        } catch (EmptyListException ex) {
            System.err.println("The list was empty");
        }catch (ObjectNotFoundException e) {
            e.printStackTrace();
        }
        stack.print();






    }


}

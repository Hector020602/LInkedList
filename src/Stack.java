public class Stack {
    private LinkedList list;

    public Stack() {
        list = new LinkedList();
    }

    public void push(Object object) {
        list.insertLast(object);

    }

    public Object pop() throws EmptyListException, ObjectNotFoundException {
        Object object = list.getLastObject();
        list.removeObject(object);
        return object;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void empty() {
        list.empty();
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public void print() {
        System.out.println(toString());
    }


}


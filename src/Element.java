public class Element {
    private Object object;
    private Element next;

    public Element(Object newObject) {
        this.object = newObject;
        next = null;
    }
    public void setNext(Element element) {
        next = element;
    }
    public Object getObject() {
        return object;
    }

    public Element getNext() {
        return next;
    }

    public void setObject(Object object) {
        this.object = object;
    }


    public void delete() {
        object = null;
        object = null;
    }
}

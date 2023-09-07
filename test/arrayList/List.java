package arrayList;

public interface List {

    public void add(Object element);
    public void remove(Object element);
    public Object getElements();
    public boolean isEmpty();
    public boolean isFull();
    public void expandCollection();
}

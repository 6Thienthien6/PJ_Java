package DSAList.Arraylist;

public class MyList<E> {
    public int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList() {

        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        if (size >= elements.length) {
            int newSize = elements.length * 2;
//            elements = Arrays.copyOf(elements, newSize);
            Object[] newElements = new Object[newSize];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
    }

    public void add(int index, E e) {
        if (index > size || index < 0) {
            System.out.println("Index invalid");
            return;
        }
        if (size == elements.length)
            ensureCapa();
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = e;
        size += 1;
    }

    public int size() {
        return this.size;
    }

    public E remove(int index) {
        int j = 0;
        E element = null;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                element = (E) elements[i];
                continue;
            }
            elements[j] = elements[i];
            j++;
        }
        size--;
        return element;
    }

    public boolean contains(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (o.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public E get(int index) {
        return (E)elements[index];
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

}





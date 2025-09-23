public class HashFunction {
    int[] arr;
    int cap, size;

    public HashFunction(int c) {
        cap = c;
        size = 0;
        arr = new int[cap];
        for (int i = 0; i < cap; i++) {
            arr[i] = -1;
        }
    }

    int hash(int key) {
        return key % cap;
    }

    boolean search(int key) {
        int h = hash(key);
        int i = h;
        while (arr[i] != -1) {
            if (arr[i] == key)
                return true;
            i = (i + 1) % cap;
            if (i == h)
                return false;
        }
        return false;
    }

    boolean insert(int key) {
        if (size == cap) {
            return false;
        }
        int i = hash(key);
        while (arr[i] != -1 && arr[i] != -2 && arr[i] != key) {
            i = (i + 1) % cap;
        }
        if (arr[i] == key) {
            return false;
        } else {
            arr[i] = key;
            size++;
            return true;
        }
    }

    boolean erase(int key) {
        int h = hash(key);
        int i = h;
        while (arr[i] != -1) {
            if (arr[i] == key) {
                arr[i] = -2;
                return true;
            }
            i = (i + 1) % cap;
            if (i == h)
                return false;
        }
        return false;
    }
    public static void main(String[] args) {
        HashFunction h = new HashFunction(7);

        System.out.println(h.insert(49));
        System.out.println(h.insert(56));
        System.out.println(h.insert(72));

        System.out.println(h.search(56));
        System.out.println(h.erase(56)); 
        System.out.println(h.search(56));

        System.out.println(h.insert(56));
    }
}

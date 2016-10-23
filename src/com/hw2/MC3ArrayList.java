package com.hw2;

/**
 * Created by aaron on 10/23/2016.
 */
public class MC3ArrayList {
    // Much of this program is based on the StringLog found in Section 2.3
    Object[] data;
    int lastIndex = -1;
    static final int INITIAL_CAPACITY = 10;

    public MC3ArrayList() {
        data = new Object[INITIAL_CAPACITY];
    }
    public MC3ArrayList(Object[] o){
        data = o;
        lastIndex= o.length-1;
    }
    public MC3ArrayList(int initialCapacity){
        data = new Object[initialCapacity];
    }
    public void add(Object o){

        if (lastIndex+1<data.length){
            lastIndex++;
            data[lastIndex]=o;
        }else {
            ensureCapacity(data.length+1);
            lastIndex++;
            data[lastIndex]=o;
        }

    }

    public void clear(){
        for (int i=0; i<= lastIndex;i++){
            data[i]=null;
        }
        lastIndex = -1;
    }

    public void ensureCapacity(int minCapacity){
        if (minCapacity>data.length){

            Object[] temp = new Object[minCapacity];

            for (int i=0; i<data.length;i++){
                temp[i]=data[i];
            }

            data = temp;
        }
    }


    public int indexOf(Object o){

        for (int i=0; i<data.length;i++){
            if (data[i]==o){
                return i;
            }
        }
        return -1;

    }


    public boolean isEmpty(){
        if (lastIndex ==  -1) {
            return true;
        } else {
            return false;
        }
    }

    public Object remove(int index){
        Object temp=data[index];
        data[index]=null;
        for (int i = index; i < data.length - 1; i++){
            data[i]=data[i+1];
        }
        data[lastIndex]=null;
        lastIndex--;
        return temp;
    }

    public Object get(int index){
        return data[index];
    }

    public Object set(int index, Object o){

        if (lastIndex+1<data.length){
            Object[] temp = new Object[data.length];
            for (int i=0; i<data.length;i++){
                temp[i]=data[i];
            }
            for (int i = index; i<=lastIndex;i++){
                data[i+1]=temp[i];
            }
            data[index] = o;
            lastIndex++;
            return data;
        }else {
            ensureCapacity(data.length+1);
            Object[] temp = new Object[data.length];
            for (int i=0; i<data.length;i++){
                temp[i]=data[i];
            }
            for (int i = index; i<=lastIndex;i++){
                data[i+1]=temp[i];
            }
            data[index] = o;
            lastIndex++;
            return data;
        }
    }

    public int size(){
        return lastIndex +1;
    }

    public String toString(){
        String stringify = "";
        for (int i = 0; i <= lastIndex; i++){
            stringify=stringify+(i)+". "+data[i]+"\n";
        }
        return stringify;
    }
}

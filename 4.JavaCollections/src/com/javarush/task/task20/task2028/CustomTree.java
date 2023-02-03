package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.security.KeyStore;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;

/* 
Построй дерево(1)
*/

public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {
    @Override
    public String get(int index) {

        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {

        return 0;
    }
    public String set(int index, String element){
        throw new UnsupportedOperationException();
    }
    public void add(int index, String element){
        throw new UnsupportedOperationException();
    }
    public String remove(int index){
        throw new UnsupportedOperationException();
    }
    public List<String> subList(int fromIndex, int toIndex){
        throw new UnsupportedOperationException();
    }
    protected void removeRange(int fromIndex, int toIndex){
        throw new UnsupportedOperationException();
    }
    public boolean addAll(int index, Collection<? extends String> c){
        throw new UnsupportedOperationException();
    }

    private transient ArrayList<KeyStore.Entry<String>> queue;
    KeyStore.Entry<String> root;
    public CustomTree() {
        root = new Entry<String>(null);
        root.newLineRootElement = true;
        root.lineNumber = 0;

     static class  Entry<T> implements Serializable {
            String elementName;
            boolean availableToAddLeftChildren, availableToAddRightChildren;
            Entry<T> parent, leftChild, rightChild;

         Entry (String name){
            elementName = name;
            availableToAddLeftChildren = true;
            availableToAddRightChildren = true;
        }

        boolean isAvailableToAddChildren (){
            return this.availableToAddLeftChildren || this.availableToAddRightChildren;
        }
    }


}

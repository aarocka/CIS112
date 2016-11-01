package com.hw3;


/**
 * Created by aaron on 10/23/2016.
 *
 */




public class MC3ArrayList  {
    protected LLObjectNode log;

    public MC3ArrayList() {
        log = null;
    }

    public MC3ArrayList(Object[] o){
        //increment through the array and call add() for each element
        for (Object i: o) {
            add(i);
        }
    }

    public void add(Object o) {
        //only run if there are no nodes in the list
        if (isEmpty()==true) {
            LLObjectNode newNode = new LLObjectNode(o);
            newNode.setLink(log);
            log = newNode;
        }else {
            //create a node with the passed data
            LLObjectNode newNode = new LLObjectNode(o);
            //find the end of the list and set it to lastNode
            LLObjectNode currNode = log;
            while (currNode.getLink() != null){
              currNode=currNode.getLink();
            }
            //set lastNode.link = newNode
            currNode.setLink(newNode);
        }


    }


    public void clear() {
        log = null;
        //Add code to dealloc the objects im no longer linking to
    }


    public int indexOf(Object o) {
        LLObjectNode currNode = log;
        int currentNode=0;
        while (currNode != null){

            if (o == currNode.getInfo())
                return currentNode;
            else
                currNode = currNode.getLink();
                currentNode++;
        }
        return -1;
    }


    public boolean isEmpty() {
        if (size()==0)
            return true;
        else
            return false;
    }


    public Object remove(int index) {

        if (index == 0){
            LLObjectNode deletionNode=log;
            log = log.getLink();
            deletionNode.setLink(null);
            return deletionNode;
        }
        else {
            //Traverse the list to the proper node
            LLObjectNode deletionNode = log;
            for (int i = 0; i < index; i++) {
                deletionNode = deletionNode.getLink();
            }

            //Traverse the list to the previous node
            LLObjectNode currNode = log;
            for (int i = 0; i < index-1; i++) {
                currNode = currNode.getLink();
            }
            //remove node
            currNode.setLink(currNode.getLink().getLink());
            deletionNode.setLink(null);
            return deletionNode;
        }

    }


    public Object get(int index) {
        LLObjectNode currNode = log;
        for (int i = 1; i <= index; i++) {
            currNode = currNode.getLink();
        }
        return currNode.getInfo();
    }


    public Object set(int index, Object o) {
        //Create a new node for insertion
        LLObjectNode insertionNode = new LLObjectNode(o);
        if(index == 0){
            insertionNode.setLink(log);
            log = insertionNode;
        }
        else if (index > size()-1){
            add(o);
        }
        else {
            //Traverse the list to the proper node
            LLObjectNode currNode = log;
            for (int i = 0; i < index - 1; i++) {
                currNode = currNode.getLink();
            }
            //Find the next node in the list
            LLObjectNode nextNode = log;
            for (int i = 0; i < index; i++) {
                nextNode = nextNode.getLink();
            }
            //set the link attrib of currNode to = insertionNode
            //Set the link attrib of insertionNode to = nextNode
            currNode.setLink(insertionNode);
            insertionNode.setLink(nextNode);
        }
        return o;
    }

    public int size() {
        int count = 0;
        LLObjectNode node;
        node = log;
        while (node != null){
            count ++;
            node = node.getLink();
        }
        return  count;
    }

    @Override
    public String toString() {
        return "MC3ArrayList{" +
                "log=" + log +
                '}';
    }
}
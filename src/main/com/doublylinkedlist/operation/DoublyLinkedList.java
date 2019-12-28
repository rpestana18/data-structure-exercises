package com.doublylinkedlist.operation;

import com.doublylinkedlist.model.Product;

public class DoublyLinkedList {

    private MemberOfList firstMember;
    private MemberOfList lastMember;

    public DoublyLinkedList()
    {
        firstMember = null;
        lastMember = null;
    }

    public boolean isEmpty()
    { return firstMember ==null; }

    /*
    * To insert at the beginning of the doubly linked list we need to create a reference of this new member
    * with the first member of the list and set the attribute firstMember with this new member
    * */
    public void insertAtTheBeginning(Product product)
    {
        MemberOfList newMember = new MemberOfList(product);

        if(isEmpty())
            lastMember = newMember;
        else
            firstMember.previousMember = newMember;

        newMember.nextMember = firstMember;
        firstMember = newMember;
    }

    /*
     * To insert at the end of the doubly linked list we need to create a reference of this new member
     * with the last member of the list and set the attribute previousMember of this new Member with the lastMember.
     * At the end we need to set lastMember with this new Member
     * */
    public void insertAtTheEnd(Product product)
    {
        MemberOfList newMember = new MemberOfList(product);

        if(isEmpty())
            firstMember = newMember;
        else
        {
            lastMember.nextMember = newMember;
            newMember.previousMember = lastMember;
        }
        lastMember = newMember;
    }

    /**
     * To remove at the beginning we need to identify if there is more than one Member on the list. In case of no, we just need to set the lastMember attritute to null
     * and set the firstMember attribute with this value (now null).
     * In case of to have more than one Member, we need to erase the firstMember reference of the second Member before to set the firstMember attribute.
     * */
    public MemberOfList removeAtTheBeginning()
    {
        MemberOfList temp = firstMember;

        if(firstMember.nextMember == null)
            lastMember = null;
        else
            firstMember.nextMember.previousMember = null;

        firstMember = firstMember.nextMember;
        return temp;
    }

    public MemberOfList removeAtTheEnd()
    {
        MemberOfList temp = lastMember;

        if(firstMember.nextMember == null)
            firstMember = null;
        else
            lastMember.previousMember.nextMember = null;

        lastMember = lastMember.previousMember;
        return temp;
    }

    public boolean insertAfterMember(int code, Product product)
    {
        MemberOfList current = firstMember;
        while(current.product.getCode() != code)
        {
            current = current.nextMember;
            if(current == null)
                return false;
        }
        MemberOfList newMember = new MemberOfList(product);

        if(current== lastMember)
        {
            newMember.nextMember = null;
            lastMember = newMember;
        }
        else
        {
            newMember.nextMember = current.nextMember;

            current.nextMember.previousMember = newMember;
        }
        newMember.previousMember = current;
        current.nextMember = newMember;
        return true;
    }

    public MemberOfList removeByKey(int code)
    {
        MemberOfList current = firstMember;
        while(current.product.getCode() != code)
        {
            current = current.nextMember;
            if(current == null)
                return null;
        }
        if(current== firstMember)
            firstMember = current.nextMember;
        else

            current.previousMember.nextMember = current.nextMember;

        if(current== lastMember)
            lastMember = current.previousMember;
        else

            current.nextMember.previousMember = current.previousMember;
        return current;
    }

    public void showListAtTheBeginning()
    {
        System.out.println("List (beginning --> end): ");
        MemberOfList current = firstMember;
        while(current != null)
        {
            current.showMember();
            current = current.nextMember;
        }
        System.out.println("");
    }

    public void showListAtTheEnd()
    {
        System.out.println("List (end --> beginning): ");
        MemberOfList current = lastMember;
        while(current != null)
        {
            current.showMember();
            current = current.previousMember;
        }
        System.out.println("");
    }

}

package com.doublylinkedlist.operation;

import com.doublylinkedlist.model.Product;

public class MemberOfList {

    public Product product;
    public MemberOfList previousMember;
    public MemberOfList nextMember;

    public MemberOfList(Product product)
    { this.product= product; }

    public void showMember()
    { System.out.print(product.toString()); }

}

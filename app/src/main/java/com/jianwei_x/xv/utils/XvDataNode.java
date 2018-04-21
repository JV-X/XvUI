package com.jianwei_x.xv.utils;

/**
 * Created by jianwei-x on 4/21/2018.
 * <p>
 * <p>
 * -_-||
 */

public class XvDataNode {


    private XvDataNode previous = null;

    private XvDataNode next = null;

    private XvDataNode firstChild = null;

    public XvDataNode getPrevious() {
        return previous;
    }

    public XvDataNode getNext() {
        return next;
    }

    public XvDataNode getFirstChild() {
        return firstChild;
    }

    public static XvDataNode build() {
        return null;
    }
}

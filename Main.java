package com.company;

import static com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.XmlToken.Name;

public class Main extends MySelf {

    public void MyIdPrint() {
        super.MyId("Ali",47);
        System.out.println("This is my subclass");
        System.out.println("My Name is Ali" + " & myage is 47");
    }
    public static void main(String[] args) {
	// write your code here
        Main obj = new Main();
        obj.MyIdPrint();

    }
}

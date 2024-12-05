package com.quest.assignment_Vars;

public class Modifiers {


private String privateVar = "Private Access";
String defaultVar = "Default Access";
protected String protectedVar = "Protected Access";
public String publicVar = "Public Access";


private void showPrivate() {
    System.out.println(privateVar);
}

void showDefault() {
    System.out.println(defaultVar);
}

protected void showProtected() {
    System.out.println(protectedVar);
}

public void showPublic() {
    System.out.println(publicVar);
}


public void accessAll() {
    showPrivate();
    showDefault();
    showProtected();
    showPublic();
}
}

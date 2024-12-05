package com.quest.assignment_Vars;

public class Main {
    public static void main(String[] args) {
        Modifiers modifiers = new Modifiers();

        System.out.println(modifiers.defaultVar);
        modifiers.showDefault();

        System.out.println(modifiers.protectedVar);
        modifiers.showProtected();

        System.out.println(modifiers.publicVar);
        modifiers.showPublic();

//        System.out.println(modifiers.privateVar);
//         modifiers.showPrivate();

    }
}

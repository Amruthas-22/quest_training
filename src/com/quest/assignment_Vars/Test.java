package com.quest.assignment_Vars;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Amrutha");
        if(name.isPresent()){
            System.out.println("Name:" +name);
        }
        Optional<String> empty = Optional.ofNullable(null);
//        String name2 = empty.orElse("hlo");
//        System.out.println(" name2 :" +name2);
        System.out.println(empty);

    }
}

package com.quest.customException;
@FunctionalInterface
public interface BookFilter {
    boolean filter(Book book);
}

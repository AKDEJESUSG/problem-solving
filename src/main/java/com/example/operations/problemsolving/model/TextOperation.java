package com.example.operations.problemsolving.model;

import java.util.List;

import lombok.Data;

@Data
public class TextOperation {
    
    private String text;
    private int limit;
    private List<String> textList;
}

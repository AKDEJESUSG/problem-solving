package com.example.operations.problemsolving.service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class TextOperationServiceImpl implements TextOperationService{

    @Override
    public String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    @Override
    public String piramid(int num) {
        StringBuilder piramid = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            piramid.append(String.valueOf(' ').repeat(num-i));
            piramid.append(String.valueOf('#').repeat(i)+'\n');
        }
        return piramid.toString();
    }

    @Override
    public Map<String, Long> countWords(String text) {
        List<String> words = Arrays.asList(text.split(" "));
        return words.stream().collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting()));
    }

    @Override
    public Boolean validPass(String text) {
        String regex="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[-!@#$%^&()+ ])[A-Za-z\\d-!@#$%^&()+ ]{7,}$";
        return text.matches(regex);
    }

    @Override
    public List<String> orderList(List<String> list) {
        list.sort(Comparator.naturalOrder());
        return list;
    }

    @Override
    public Boolean isDuplicate(List<String> list) {
        return list.stream().distinct().toList().size()<list.size();
    }

    @Override
    public String removePairs(String text) {
        String ns =text;
		boolean t = true;
		int index = 0;
		while(t){
			if(index<ns.length() || index>ns.length()){
				ns = ns.replace(ns.charAt(index)+""+ns.charAt(index), "");
				if(ns.equals(text))
					index++;
				else{
					index=0;
					text=ns;
				}
			}else{
				t=false;
			}
		}
        return ns.equals("")?"Empty String":ns;
    }
    
}
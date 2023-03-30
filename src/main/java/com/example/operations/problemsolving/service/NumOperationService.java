package com.example.operations.problemsolving.service;

import java.util.List;
import java.util.Map;

public interface NumOperationService {
    
    public List<Long> getFibo(int fibo);

    public Long getSum(List<Integer> list);

    public Long getfact(int fact);

    public Boolean isDuplicate(List<Integer> list);

    public Map<Integer,Long> countDuplicate(List<Integer> list);

    public String getMinMaxSum(List<Integer> list);

    public Map<Integer, Long> getPosNegZer(List<Integer> list);
}

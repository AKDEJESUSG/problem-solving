package com.example.operations.problemsolving.service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.LongSupplier;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

import org.springframework.stereotype.Service;

@Service
public class NumOperationServiceImpl implements NumOperationService{

    @Override
    public List<Long> getFibo(int limit) {
        return LongStream.generate(new LongSupplier() {
            long prev = 0;
            long curr = 1;
            @Override
            public long getAsLong() {
                long next = prev + curr;
                prev = curr;
                curr = next;
                return prev;
            }
        }).limit(limit).boxed().collect(Collectors.toList());
    }

    @Override
    public Long getSum(List<Integer> list) {
        return list.stream().collect(Collectors.summingLong(Long::valueOf));
    }

    @Override
    public Long getfact(int fact) {
        return LongStream.rangeClosed(2, fact).reduce((a,b)->a*b).getAsLong();
    }

    @Override
    public Boolean isDuplicate(List<Integer> list) {
        return list.stream().distinct().count() < list.size();
    }

    @Override
    public Map<Integer, Long> countDuplicate(List<Integer> list) {
        return list.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
    }

    @Override
    public String getMinMaxSum(List<Integer> list) {
        list.sort(Comparator.naturalOrder());
        Long sum = list.stream().collect(Collectors.summingLong(Long::valueOf));
        Long minsum = sum - list.get(list.size()-1);
        Long maxsum = sum - list.get(0);
        StringBuilder result = new StringBuilder();
        result.append("Min sum: "+ minsum +"\n");
        result.append("Max sum: "+ maxsum);
        return result.toString();
    }

    @Override
    public Map<Integer, Long> getPosNegZer(List<Integer> list) {
        return list.stream().collect(Collectors.groupingBy(Integer::signum,Collectors.counting()));
    }
}

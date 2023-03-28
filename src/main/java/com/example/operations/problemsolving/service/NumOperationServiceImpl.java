package com.example.operations.problemsolving.service;

import java.util.List;
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
    
}

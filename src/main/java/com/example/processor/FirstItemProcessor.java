package com.example.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class FirstItemProcessor implements ItemProcessor<Integer , Long> {
    // <I, O> ->
    // I -> Input (It is basically the output of the InputReader
    // O -> Output (It is basically the input given to OutputWriter)

    @Override
    public Long process(Integer integer) throws Exception {
        return (long) (integer + 20);
    }
}

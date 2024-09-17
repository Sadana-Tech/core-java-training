package com.training.java8.funcintr;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class DemoConsumerInter {
	
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	public static void main(String[] args) {

		//Consumer
		Consumer<Integer> consumer = (value) -> System.out.println(value);
		consumer.accept(10);

		BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println(x + y);
		biConsumer.accept(2, 3);

		//Predicate
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> collect = list.stream().filter(x-> (x>4)).collect(Collectors.toList());

		System.out.println(collect);
		
		//Function
		Function<Integer, Double> half = a -> a/2.0;
		System.out.println(half.apply(5));
		
		//Supplier

		Supplier<String> s = () -> dtf.format(LocalDateTime.now());
		System.out.println(s.get());
		
		
	}

}

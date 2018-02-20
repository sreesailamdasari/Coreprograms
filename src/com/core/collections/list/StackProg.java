package com.core.collections.list;

import java.util.Stack;

public class StackProg {
	public static void main(String[] args) {
		// Last in first out
		// index starts from 1-n
		// push(add),pop(remove the stack element),search,
		// peek(returns top of the element),empty(it will empty the stack)
		Stack<Object> stack = new Stack<>();
		stack.add("abc");
		System.out.println(stack.pop());
		stack.push("bcd");
		stack.push("cde");
		stack.push("def");
		stack.push("efg");
		stack.push("fgh");
		stack.push("ghi");
		System.out.println(stack);
		System.out.println(stack.peek());//
		// LIFO
		System.out.println(stack.search("bcd"));

	}
}

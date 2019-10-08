package com.core.java.design.pattern014.visitor;

public interface Router {

	void sendData(char[] data);

	void acceptData(char[] data);

	void accept(RouterVisitor v);

}
package br.com.erick.teste;

import org.junit.Test;

import br.gov.frameworkdemoiselle.behave.controller.BehaveContext;

public class MyTest {

	private BehaveContext eng = BehaveContext.getInstance();

	public MyTest() {
		eng.addSteps(new MySteps());
		eng.addStoriesReuse("/reuse/cenariosDeReuso.story");
	}
	

	@Test
	public void testAllStories() throws Throwable {
		eng.run("/stories/logar.story");
	}

}
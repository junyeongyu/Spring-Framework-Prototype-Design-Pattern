package com.junyeong.yu.prototype.design_pattern.file;

public class Main {
	public static void main(String args[]) throws Exception {
		/*Car sorento = new Car();
		sorento.setSetCount(5);
		sorento = new Car();
		System.out.println(sorento.getSetCount());*/
		
		System.out.println(FileComponent.getName());
		
		// 익명내부클래스
		FileComponent fileComponent = new FileComponent();
		System.out.println(fileComponent.getContent("text/abc.txt"/*, new FileReadStatement() {
			@Override
			public void appendText(StringBuffer sb, int i) {
				sb.append((char)i);
			}
		}*/));
		
		// 내부클래스
		FileComponent fileComponent2 = new FileComponent();
		@SuppressWarnings("unused")
		class Plus1Statement implements FileReadStatement{
			@Override
			public void appendText(StringBuffer sb, int i) {
				sb.append((char)i);
			}
			
		}
		System.out.println(fileComponent2.getContent("text/abc.txt"/*, new Plus1Statement()*/));
		
		//System.out.println(fileComponent2.methodCallCount);
	}
}
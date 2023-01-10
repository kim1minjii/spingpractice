package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {
	// 생성자를 통해서 물려 받음
	private Exam exam;

	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("| total  |  avg |");
		System.out.println("|ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ |");
		System.out.printf("|   %3d  | %3.2f |\n", exam.total(), exam.avg());
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}

}

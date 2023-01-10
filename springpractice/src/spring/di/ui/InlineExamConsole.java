package spring.di.ui;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	// 생성자를 통해서 물려 받음
	private Exam exam;

	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.printf("total is %d, avgis %f\n", exam.total(), exam.avg());

	}

}

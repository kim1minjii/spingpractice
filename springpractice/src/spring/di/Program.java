package spring.di;

import javax.security.auth.login.AppConfigurationEntry;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
//import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
		/* 스프링에게 지시하는 방법으로 코드를 변경
		// Exam:참조 //NewlecExam:객체
		Exam exam = new NewlecExam();
		ExamConsole console = new GridExamConsole();
		
		console.setExam(exam)
		*/
		
		// Inline 한줄로
		ExamConsole console = new InlineExamConsole(exam); // Di : InlineExamConsole이 exam을 조립하고 있다.

		// Grid 격자로
		// ExamConsole console = new GridExamConsole(exam);
		console.print();
	}

}

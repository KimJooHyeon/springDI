package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		/* 스프링에게 지시하는 방법으로 코드를 변경
			Exam exam = new testExam();
			Exam exam = new testExam(10, 10, 10, 10);
			ExamConsole console = new GridExamConsole();
			
			console.setExam(exam);
		*/
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
//		ExamConsole console = (ExamConsole) context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
		
		console.print();
		// total is 100, avg is 25.000000
		
//		Exam exam = context.getBean(Exam.class);
		
//		System.out.println(exam.toString());
		// testExam [kor=10, eng=20, math=40, com=30]
	}

}

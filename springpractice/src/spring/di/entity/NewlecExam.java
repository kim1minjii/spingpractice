package spring.di.entity;

public class NewlecExam implements Exam {

	// 과목
	private int kor;
	private int eng;
	private int math;
	private int com;
	
	@Override
	public int total() {
		return kor+eng+math+com;
	}

	@Override
	public float avg() {
		// total값 가져와서 평균내서 소수점으로 반환하는 값
		return total() / 4.0f;
	}

}

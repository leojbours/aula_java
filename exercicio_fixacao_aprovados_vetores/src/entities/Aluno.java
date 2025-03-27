package entities;

public class Aluno {
	
	private String name;
	private double firstGrade;
	private double secondGrade;
	
	public Aluno (String name, double firstGrade, double secondGrade) {
		this.name = name;
		this.firstGrade = firstGrade;
		this.secondGrade = secondGrade;
	}
	
	public String getName() {
		return name;
	}
	
	public double getFirstGrade() {
		return firstGrade;
	}
	
	public void setFirstGrade(double firstGrade) {
		this.firstGrade = firstGrade;
	}
	
	public double getSecondGrade() {
		return secondGrade;
	}
	
	public void setSecondGrade(double secondGrade) {
		this.secondGrade = secondGrade;
	}
	
	public double media() {
		return (firstGrade + secondGrade) / 2;
	}
}

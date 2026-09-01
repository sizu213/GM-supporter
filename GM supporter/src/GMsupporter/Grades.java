package GMsupporter;

public class Grades {
	private int id;
	private String name;
	private String subject;
	private int score;

	public Grades(int id, String name, String subject, int score) {
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}

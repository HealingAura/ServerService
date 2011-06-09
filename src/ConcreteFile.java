import java.util.Date;


public class ConcreteFile extends File {

	private Date subjectState;

	public ConcreteFile(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void GetState(){

	}

}
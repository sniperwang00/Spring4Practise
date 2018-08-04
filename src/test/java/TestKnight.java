import com.luke.knights.BraveKnight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestKnight {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:knights.xml");
		BraveKnight braveKnight = (BraveKnight) context.getBean("knight");
		braveKnight.embarkOnQuest();
	}
}

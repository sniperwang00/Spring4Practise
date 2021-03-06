package spitter.data;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import spitter.Spitter;
import spitter.Spittle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class SpittlerRepositoryImpl implements SpittlerRepository{
	public List<Spittle> findSpittles(long max, int count) {
		Spittle spittle = new Spittle("message", new Date(), 12.3, 22.4);
		List<Spittle> list = new ArrayList<Spittle>();
		list.add(spittle);
		return list;
	}

	public List<Spittle> findById(long id) {
		Spittle spittle = new Spittle("findbyId", new Date(), 12.3, 22.4);
		List<Spittle> list = new ArrayList<Spittle>();
		list.add(spittle);
		return list;
	}

	public void save(Spitter spitter) {

	}

	public Spitter findByUserName(String username) {
		Spitter spitter = new Spitter("aaa", "bbb", "ccc", "ddd");
		return spitter;
	}
}

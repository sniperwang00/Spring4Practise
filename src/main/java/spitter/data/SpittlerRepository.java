package spitter.data;

import spitter.Spitter;
import spitter.Spittle;

import java.util.List;

public interface SpittlerRepository {
	List<Spittle> findSpittles(long max, int count);

	List<Spittle> findById(long id);

	void save(Spitter spitter);

	Spitter findByUserName(String username);
}

package spitter.data;

import spitter.Spittle;

import java.util.List;

public interface SpittlerRepository {
	List<Spittle> findSpittles(long max, int count);
}

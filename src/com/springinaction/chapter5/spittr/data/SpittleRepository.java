/**
 * 
 */
package com.springinaction.chapter5.spittr.data;

import java.util.List;

import com.springinaction.chapter5.spittr.entity.Spittle;

/**
 * @author MonkGirl
 *
 */
public interface SpittleRepository {
	List<Spittle> findSpittles(long max, int count);
	
	Spittle findOne(long id);
}

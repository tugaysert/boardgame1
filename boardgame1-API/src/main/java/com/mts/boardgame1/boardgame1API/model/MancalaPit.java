package com.mts.boardgame1.boardgame1API.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MancalaPit {
	
	private Integer id;
	private Integer stones;
	
	
	@JsonIgnore
	public Boolean isEmpty() {
		return this.stones == 0 ;
	}
	
	public void clear() {
		this.stones = 0;
	}
	
	public void sow() {
		this.stones++;
	}
	
	public void addStones (Integer stones) {
		this.stones+=stones;
	}
	
	@Override
	public String toString() {
		return id.toString() + ":" + stones.toString();
	}
	
}

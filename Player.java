package com.gl.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Player {
		int pno;
		String pname;
		String teams[];
		List captains;
		Map<String,Integer> centuries;
		
		public Player() {
			System.out.println("constructor called");
		}
		public Player(int pno, String pname, String[] teams) {
			super();
			this.pno = pno;
			this.pname = pname;
			this.teams = teams;
		}
		public int getPno() {
			return pno;
		}
		public void setPno(int pno) {
			this.pno = pno;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public String[] getTeams() {
			return teams;
		}
		public void setTeams(String[] teams) {
			this.teams = teams;
		}
		
		
		public List getCaptains() {
			return captains;
		}
		public void setCaptains(List captains) {
			this.captains = captains;
		}
		
		
		
		public Map<String, Integer> getCenturies() {
			return centuries;
		}
		public void setCenturies(Map<String, Integer> centuries) {
			this.centuries = centuries;
		}
		@Override
		public String toString() {
			return "Player [pno=" + pno + ", pname=" + pname + ", teams=" + Arrays.toString(teams) + ", captains="
					+ captains + ", centuries=" + centuries + "]";
		}
		
		@PostConstruct
		public void abc(){
			System.out.println("Before Destroyed");
			
		}
		
		@PreDestroy
		public void xyz() {
		System.out.println("After Constructor Call");	
		}
		
//singleton scope
//constructor called
//After Constructor Call
//hi		
//true
		
//Before Destroyed
//Before Destroyed

		
		
		
}

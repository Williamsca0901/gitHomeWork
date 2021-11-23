package com.syntas.class13;

public class Task6 {
	//Create class student that will have method getGrade
	//your method should accept the score of a student and 
	//return a grade: 
	//score>90=A, score>80=B, score>70=D, score>50=D,score<50=F
char getGrade(int score) {
	char grade;
	if(score>90) {
		grade='A';
	}else if (score>80) {
			grade='B';
	}else if(score>70) {
				grade='C';
	}else if(score>50) {
		grade='D';
	}else {
		grade='F';
	}
	return grade;
				
			}
		}
	



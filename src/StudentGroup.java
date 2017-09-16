package com.example.demo;

import java.util.Arrays;
import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		
			if(students.length==0)
				return null;
			else 
				return Arrays.copyOf(students, students.length);
		
	}

	@Override
	public void setStudents(Student[] students) {
		
	/*	int id;
		String fullName;
		Date birthDate;
		double avgMark;
	*/
		
		
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		/*int id;
		String fullName;
		Date birthDate;
		double avgMark;*/
		if(index <0 || index > students.length)
			return ;
		else{
			this.students[index]=student;
		}
		
	}

	@Override
	public void addFirst(Student student) {
		int len=this.students.length;
		int i;
		for(i=len;i>0;i++)
			this.students[i]=this.students[i-1];
			
		  this.students[0]=student;
		  this.students[i+1]=null;
		  
		  
	}

	@Override
	public void addLast(Student student) {
		int len=this.students.length;
		 this.students[len]=student;
		 this.students[len+1]=null;
		 
	}

	@Override
	public void add(Student student, int index) {
		int len=this.students.length;
		if(index<len && index>=0){
			for(int i=len;i<index;i++)
				this.students[i]=this.students[i-1];
			
				this.students[index]=student;
				this.students[len+1]=null;
				
				
				
			}
			
		
	}

	@Override
	public void remove(int index) {
		int l=this.students.length;
		for(int i=index;i<l;i++){
			
				this.students[i]=this.students[i+1];
				this.students[l+1]=null;
				
			}
		
	}

	@Override
	public void remove(Student student) {
		int i,k;
		int len=this.students.length;
		for(i=0;i<len;i++){
			if(this.students[i].equals(student)== true){
			      break;
				
			}
		}
		for( k=i;k<len;k++){
				this.students[k]=this.students[k+1];
				
			}
		this.students[len+1]=null;
		
		
	}

	@Override
	public void removeFromIndex(int index) {
		int len=this.students.length;
		this.students[index+1]=null;
				
				
			
	}

	@Override
	public void removeFromElement(Student student) {
		int len=this.students.length;
		int j;
		for(j=0;j<len;j++){
			if(this.students[j].equals(student))
				break;
		}
		this.students[j+1]=null;

	}

	@Override
	public void removeToIndex(int index) {
		//int len=this.students.length;
		
	}

	@Override
	public void removeToElement(Student student) {
		 int len=this.students.length;
		 
	}

	@Override
	public void bubbleSort() {
		 Student temp = null;
		 
		int i,j,l=this.students.length;
		for(i=0;i<l;i++){
			for(j=0;j<l-1;j++){
				if(this.students[i].compareTo(this.students[j])>0) 
					temp=this.students[j];
				    this.students[j]=this.students[i];
				    this.students[i]=temp;
				
			}
			
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		if(this.students==null)
			return null;
		else{
			int len=this.students.length;
			for(int i=0;i<len;i++){
				if((this.students[i].equals(student))==true)
					return this.students[i+1];
			}
		}
		return null;
	}
}


package lab_SI_01;

public class algoritmos {
	
	public int maxInArray(int[] array){
		int maxValueInArray = 0;
			for(int control=0; control<array.length; control++){
				if(array[control]>maxValueInArray){
					maxValueInArray = array[control];
				}
			}
		return maxValueInArray;
	}
	
	public int minInArray(int[] array){
		int minValueInArray = array[0];
			for(int control=1; control<array.length; control++){
				if(array[control]<minValueInArray){
					minValueInArray = array[control];
				}
			}
		return minValueInArray;
	}

}

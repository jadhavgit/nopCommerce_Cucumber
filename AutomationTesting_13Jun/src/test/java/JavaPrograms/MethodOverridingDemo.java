package JavaPrograms;

class Bank{   //parent
	int getRateOfInerest(){
		return 0;
	}
}

class SBI extends Bank { //child class
	int getRateOfInerest(){
		return 8;
}
}
class ICICI extends Bank{ //child class
	int getRateOfInerest(){
		return 9;
}


}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		SBI sbi=new SBI();
		System.out.println("SBI rate of interest : "+sbi.getRateOfInerest());

		ICICI icici=new ICICI();
		System.out.println("ICICI rate of Interest: "+icici.getRateOfInerest());
	}

}

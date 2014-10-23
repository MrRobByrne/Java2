class MyInteger{
  private int number;

  public MyInteger(){
    number = 0;
  }

  public MyInteger(int number){
    this.number = number;
  }

  public String toString(){
    String temp;
    temp = String.valueOf(number);
    return temp;
  }

  public boolean isEven(){
    if (number % 2 == 0)
      return true;
    else if (number % 2 == 1);
      return false;
  }

  public boolean isOdd(){
    if (number % 2 == 1)
      return true;
    else if (number % 2 == 0);
      return false;
  }

  public boolean isPrime(){
    if (number == 2) return true;
    if (number % 2 == 0) return false;
    for (int i = 3; i < number; i=i+2){
        if (number % i == 0) return false;
  }
    return true;
}



  public boolean isPerfect() {
    int sum = 0;

    for(int divisor=1; divisor<number; divisor++){
      if ((number%divisor)==0){
	sum = sum + divisor;
      }	
    }
      if (sum==number) return true; {
      }
	return false;
  }

  public boolean isPerfectSquare() {
    int i;

    for(i=0;i<number/2;i++) {
      if(i*i==number) return true; {
      }
    }
  return false;
  }

  public boolean isPrime(int p){
    int count = 0;
	for (int i = 1; i <=p; i++){
		 if (p % i == 0)
 			 count++;
	}
;
	if (count == 2)
		return true;
	else 
		return false;

}

  public void primefactors() {
    int p = 2;
    int temp = number; 

    while(temp  != 1) {
	
 	if (temp % p == 0) {
 		
		temp = temp / p;
	}
 	else {
		p++;System.out.println(number);
		while(!isPrime(p)) {
			System.out.print(p + " ");
 			p++;
		}
	}
  }
}

  public void print(){
    System.out.println("Prime:" + isPrime());
    System.out.println("Even:" + isEven());
    System.out.println("Odd:" + isOdd());
    System.out.println("Perfect:" + isPerfect());
    System.out.println("Perfect Square:" + isPerfectSquare());

  }
}
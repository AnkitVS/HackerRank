public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		age=initialAge;// Add some more code to run some checks on initialAge
	}

	public void amIOld() {
  		if (age<0)
          {
              System.out.println("Age is not valid, setting age to 0.");
              age=0;
          }
          if(age>=0 && age<13)
          System.out.print("You are young.");
          else if(age>=13 && age<18)
          System.out.print("You are a teenager.");
          else
          System.out.print("You are old.");
          // Write code determining if this person's age is old and print the correct statement:
        System.out.println();
	}

	public void yearPasses() {
  		age=age+1;// Increment this person's age.
	}


package homework.Hillel;

	public class University {
		private int Buildings = 20;
		private int Labs = 200;
		static Library lib;
		
		public University(int Buildings; int Labs, Library lib) {
			this.Buildings = Buildings;
			this.Labs = Library;
		
		}
		
		public int getBuildings() {
			return Buildings;
		
		}
		
		public int getLabs() {
			return Labs;
			
		}
		
		public static void main(String args[]) {
			University uni = new University(20, 200, lib);
			Library libr = new Library("Biological", 100);
			
			Student st[] = new Student[2];
			{
				st[0] = new Student("Kravchenko", "Igor", 17, "Electric Steam Power Station", 1);
				st[1] = new Student("Kernitsky", "Nikolay", 18, "Information Technologies", 1);
			}
			System.out.println("The number of Buildings: " + uni.getBuildings());
			System.out.println("The number of Labs: " + uni.getLabs());
			System.out.println("The amount of books: " + libr.getBooksAmount());
			System.out.println("Book shelf - " + libr.getBookshelf());
			
			for (Student stud : st) {
				System.out.println(stud.getFirstName() + " " + stud.getLastName() + ": Age: " + stud.getAge());
				System.out.println("Faculty: " + studFaculty() + ". Coursee: " + stud.getCourse());
				
			}
			
		}
		
	}
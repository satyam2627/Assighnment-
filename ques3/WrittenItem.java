package ques3;

public abstract class WrittenItem extends Item{
		private String author;

		public WrittenItem(int itemnum, String title, int numcopy, String author) {
			super(itemnum, title, numcopy);
			this.setAuthor(author);
		}
		
		

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}
		
		public void print() {
			System.out.println(toString()+" Author : " +author); 
		}
}

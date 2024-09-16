package ques3;

public abstract class Item {
private int itemnum;
private String title;
private int numcopy;


public Item(int itemnum, String title, int numcopy) {
	super();
	this.itemnum = itemnum;
	this.title = title;
	this.numcopy = numcopy;
}



public int getItemnum() {
	return itemnum;
}
public void setItemnum(int itemnum) {
	this.itemnum = itemnum;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getNumcopy() {
	return numcopy;
}
public void setNumcopy(int numcopy) {
	this.numcopy = numcopy;
}

public void print() {
};
public  void checkout() {
	numcopy--;
}
public  void checkin() {
	numcopy++;
}



@Override
public String toString() {
	return "Item [itemnum=" + itemnum + ", title=" + title + ", numcopy=" + numcopy + "]";
};


}


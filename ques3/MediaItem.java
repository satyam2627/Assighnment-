package ques3;

public abstract class MediaItem extends Item {
private int runtime;
public MediaItem(int itemnum, String title, int numcopy,int runtime){
	super(itemnum,title,numcopy);
	this.setruntime(runtime);
}
public int getruntime() {
	return runtime;
}
public void setruntime(int runtime) {
	this.runtime = runtime;
}






}

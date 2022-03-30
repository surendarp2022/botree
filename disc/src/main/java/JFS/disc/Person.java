package JFS.disc;

import java.util.ArrayList;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person {


@Id

private int pid;
private String name;

//@OneToOne
@OneToMany

private List<Ipair> ipair=new ArrayList<Ipair>();
//private Ipair ipair;
public Person() {
	super();
	this.pid = pid;
	this.name = name;
	this.ipair = ipair;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Ipair> getIpair() {
	return ipair;
}
public void setIpair(List<Ipair> ipair) {
	this.ipair = ipair;
}
@Override
public String toString() {
	return "person [pid=" + pid + ", name=" + name + ", ipair=" + ipair + "]";
}












}

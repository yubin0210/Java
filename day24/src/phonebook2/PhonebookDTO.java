package phonebook2;

//	create table phonebook (
//	    idx         number          default phonebook_seq.nextval primary key,
//	    name        varchar2(100)   unique not null,
//	    pnum        varchar2(20)    not null,
//	    age         number          check (age >= 0),
//	    favorite    char(1)         check (favorite in ('Y', 'N'))
//	);

public class PhonebookDTO {

	private int idx;
	private String name;
	private String pnum;
	private int age;
	private String favorite;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFavorite() {
		return favorite;
	}
	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}
	
	
}

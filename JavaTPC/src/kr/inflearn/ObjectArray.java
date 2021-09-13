package kr.inflearn;

public class ObjectArray {
	private int count;
	private	Object[] arr;
	
	// 만약 아무런 인자가 안주어진다면 기본으로 10개의 크기를 가진 배열 생성해주기
	public ObjectArray() {
		this(10);
	}
	
	public ObjectArray(int init) {
		arr = new Object[init];
	}
	
	public void add(Object data) {
		arr[count++] = data;
	}
	
	public Object get(int index) {
		return arr[index];
	}
	
	public int size() {
		return count;
	}
}

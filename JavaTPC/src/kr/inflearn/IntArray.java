package kr.inflearn;

// 배열처럼 동작하는 API
public class IntArray {
	private int count;
	private	int[] arr;
	
	// 만약 아무런 인자가 안주어진다면 기본으로 10개의 크기를 가진 배열 생성해주기
	public IntArray() {
		this(10);
	}
	
	public IntArray(int init) {
		arr = new int[init];
	}
	
	public void add(int data) {
		arr[count++] = data;
	}
	
	public int get(int index) {
		return arr[index];
	}
	
	public int size() {
		return count;
	}
	
}

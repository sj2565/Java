package pkg05;

public class PlayingCard {
	int kind;
	int num;
	
	static int width;
	static int height;
	
	PlayingCard(int k, int n){
		kind = k;
		num = n;
	}
}

// PlayingCard 클래스를 이용하여 객체를 3개 만든다면
// 인스턴스 변수 : 6개
// static 변수 : 2개

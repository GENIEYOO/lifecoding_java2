package Interface;

public class Zookeeper {
	public void feed(Predator predator) {
		System.out.println("feed" + predator.getFood());
	}

	
	
	public static void main(String[] args) {
		Zookeeper zookeeper = new Zookeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		zookeeper.feed(tiger);
		zookeeper.feed(lion);
	}

}
////클래스의 기준과 상관없이 인터페이스를 기준으로 중요 클래스를 시작해야만한다.
//ZooKeeper클래스가 동물들의 종류에 의존적인 클래스에서 동물들의 종류와 상관없는 독립적인 클래스가 되었다는 점이다.
//바로 이 점이 인터페이스의 핵심이다.
//컴퓨터의 USB포트같은 

//컴퓨터	ZooKeeper
//USB 포트	Predator
//하드디스크, 디지털카메라,...	Tiger, Lion, Crocodile,...
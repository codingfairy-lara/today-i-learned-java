package member.model.vo;

public class Vip extends Member {

	public Vip() {
	}

	public Vip(String name, String grade, int point) {
		super(name, grade, point);
	}

	public double getVipPoint() {
		return super.getPoint() * 0.1;
	}

	@Override
	public int buy(int price) {
		return (int) (price * (1 - 0.1));
	}
}
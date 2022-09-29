package member.model.vo;

public class Silver extends Member {

	public Silver() {
	}

	public Silver(String name, String grade, int point) {
		super(name, grade, point);
	}

	@Override
	public double getEjapoint() {
		return getSilverPoint();
	}

	public double getSilverPoint() {
		return super.getPoint() * 0.02;
	}

	@Override
	public int buy(int price) {
		return (int) (price * (1 - 0.02));
	}
}
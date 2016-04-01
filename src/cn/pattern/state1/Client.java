package cn.pattern.state1;
class Client {
	public static void main(String args[]) {
		Screen screen = new Screen();
		screen.onClick();
		screen.onClick();
		screen.onClick();
	}
}
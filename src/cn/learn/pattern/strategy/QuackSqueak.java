package cn.learn.pattern.strategy;

//"squeak"µÄ¡°½Ð¡±
public class QuackSqueak implements QuackBehavior{
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("The duck squeak..");
	}
}

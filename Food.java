package Snake_Food_Game;
public class Food extends GameObject {
	public Food(char symbol) {
		setSymbol(symbol);
	}
	public void addRandomFood(GameScreen screen, Food food) {
		screen.setObjectOnLocation(food, (int) Math.ceil(Math.random() * (screen.getScreenWidth() - 1)),
				(int) Math.ceil(Math.random() * (screen.getScreenHeight() - 1)));
	}
}

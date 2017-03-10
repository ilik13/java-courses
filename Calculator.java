public class Calculator{
	// переменная с результатом вычисления
	private int result;
	// суммирование аргументов
	public void add(int ...params){
		for (Integer param : params) {
			this.result += param;
		}
	}

	//метод получить результат
	public int getResult() {
		return this.result;
	}

	public void cleanResult() {
		this.result = 0;
	}

}
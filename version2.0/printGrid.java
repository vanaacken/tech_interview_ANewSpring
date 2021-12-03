public class printGrid {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
	public printGrid(int grid[][], config conf)
	{
		// System.out.print("\033[H\033[2J");
		// System.out.flush(); 
		String output = "";
		for(int i = 1; i <= conf.getSize(); i++){

			for(int j = 1; j <= conf.getSize(); j++){
				switch(grid[i-1][j-1]){
					case 0:
					output += ANSI_WHITE + ANSI_WHITE_BACKGROUND + grid[i-1][j-1];
					break;
					case 1:
					output += ANSI_RED + ANSI_RED_BACKGROUND + grid[i-1][j-1];
					break;
					case 2:
					output += ANSI_BLACK + ANSI_BLACK_BACKGROUND + grid[i-1][j-1];
					break;
					case 3:
					output += ANSI_GREEN + ANSI_GREEN_BACKGROUND + grid[i-1][j-1];
					break;
				}
				int nl = 0;
				if (j == conf.getSize()){
					nl = 1;
				}
				switch(nl){
					case 1:
					output +=  ANSI_RESET + '\n';
					break;
					default:
					output += ' ';		
				}
			}
		}
		System.out.print(output);

		try {
			Thread.sleep(500);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
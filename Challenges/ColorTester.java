public class ColorTester {

	public static void main( String [] args ) {

		Color newRed = new Color(255, 153, 204); // light pink
		Color surpriseColor = new Color();
        Color favoriteColor = new Color("#abedeb"); // HEX light blue

		System.out.println("Red Color:" + newRed);
		System.out.println("Surprise Color:" + surpriseColor);
        System.out.println("Favorite Color:" + favoriteColor);

        System.out.println("");

		newRed.lighten(20);
		surpriseColor.darken(20);

		System.out.println("Lightened Red Color:" + newRed);
        System.out.println("Darkened Surprise Color:" + surpriseColor);

        System.out.println("");
        
        newRed.darken(40);
        surpriseColor.lighten(40);
        
        System.out.println("Darkened Red Color:" + newRed);
        System.out.println("Lightened Surprise Color:" + surpriseColor);

        System.out.println("");

        // new color
        newRed.setBlue(45);
        surpriseColor.setRed(155);

        
        System.out.println("New Red Color:" + newRed);
        System.out.println("New Surprise Color:" + surpriseColor);
        
        System.out.println("");
        
        // new hex blended with favorite color from HEX number

		
		System.out.println("Hex Color Blended with Favorite Color: [" + favoriteColor.getRed() + ", " + favoriteColor.getRed() + ", " + favoriteColor.getRed() + "]"); 
        
        
        


	}


}
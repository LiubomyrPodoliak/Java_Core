package pt2;

public enum Color {

    RED, WHITE, YELLOW;

    public static Color getColorInEnum(String inputColor) throws ColorException {

//        inputColor = Main.scanner.next();

        switch (inputColor) {
            case "red": {
                return Color.RED;

            }
            case "white": {
                return Color.WHITE;

            }
            case "yellow": {
                return Color.YELLOW;

            }

            default: {
                throw new ColorException("You enter not exist color");
            }
        }
    }

}

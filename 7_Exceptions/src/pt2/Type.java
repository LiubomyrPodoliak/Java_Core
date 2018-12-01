package pt2;

public enum Type {
    ROSE, TULIP, CHAMOMILE;

    public static Type getTypeInEnum(String inputType) throws TypeException {

//        inputType = Main.scanner.next();

        switch (inputType) {
            case "rose": {
                return Type.ROSE;

            }
            case "tulip": {
                return Type.TULIP;

            }
            case "chamomile": {
                return Type.CHAMOMILE;

            }

            default: {
                throw new TypeException("You enter not exist type");
            }
        }
    }

}

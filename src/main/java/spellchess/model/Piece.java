package main.java.spellchess.model;

public class Piece {
    private Type type;
    private Position position;

    public Piece(Type type, Position position){
        this.type = type;
        this.position = position;
    }

    public Type getType(){
        return type;
    }

    public Position getPosition(){
        return position;
    }

}

package generyki;

public abstract class GenericCup <T extends Drink> {
    abstract void add(T drink);
}

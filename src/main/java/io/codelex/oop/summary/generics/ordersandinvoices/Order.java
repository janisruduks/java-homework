package io.codelex.oop.summary.generics.ordersandinvoices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Order {

    private final List<SellableThing> itemList;

    public Order() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(SellableThing item) throws BadFoodException {
        if (item instanceof FoodItem && ((FoodItem) item).getBestBefore().isBefore(LocalDate.now())) {
            throw new BadFoodException("ERROR: " + ((FoodItem) item).getName() + " has expired!");
        }
        itemList.add(item);
    }

    public List<SellableThing> getItemList() {
        return itemList;
    }

    public String itemsToString() {
        return IntStream.range(0, itemList.size())
                .mapToObj(index -> (index + 1) + ". " + itemList.get(index).getFullInfo())
                .collect(Collectors.joining("\n"));
    }
}

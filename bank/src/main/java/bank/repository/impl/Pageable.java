package bank.repository.impl;

import java.util.List;

public class Pageable<T> {

    private final List<T> items;
    private final int params;
    private final int itemsNumberPerPage;
    private final int maxPageNumber;

    public Pageable(List<T> items, int params, int itemsNumberPerPage, int maxPageNumber) {
        this.items = items;
        this.params = params;
        this.itemsNumberPerPage = itemsNumberPerPage;
        this.maxPageNumber = maxPageNumber;
    }

    public List<T> getItems() {
        return items;
    }

    public int getParams() {
        return params;
    }

    public int getItemsNumberPerPage() {
        return itemsNumberPerPage;
    }

    public int getMaxPageNumber() {
        return maxPageNumber;
    }
}

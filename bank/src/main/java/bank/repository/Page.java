package bank.repository;

public class Page {
    private final int pageNum;
    private final int itemsPerPage;


    public Page(int pageNum, int itemsPerPage) {
        this.pageNum = pageNum;
        this.itemsPerPage = itemsPerPage;


    }

    public int getPageNum() {
        return pageNum;
    }

    public int getItemsPerPage() {
        return itemsPerPage;
    }


}

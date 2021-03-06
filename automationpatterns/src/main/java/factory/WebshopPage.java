package factory;



public class WebshopPage {
    public SearchBar searchBar() {
        return new SearchBar();
    }

    public ResultList resultList() {
        return new ResultList();
    }
}

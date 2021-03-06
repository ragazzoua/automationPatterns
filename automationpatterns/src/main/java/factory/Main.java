package factory;


import static factory.ComponentFactory.getComponent;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("FACTORY PATTERN");
        System.out.println("===============");

        getComponent("SearchBar");
        WebshopPage webshopPage = new WebshopPage();
        webshopPage.searchBar().search("Berlin");
    }
}

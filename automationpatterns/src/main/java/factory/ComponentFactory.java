package factory;

public class ComponentFactory {
    public static Component getComponent(String componentName) throws Exception {
        System.out.println("Creating " + componentName + "...");

        // Create a component instance for the passed in component name.
        Component component;
        if ("SearchBar".equals(componentName)) {
            component = new SearchBar();
        } else if ("ResultList".equals(componentName)) {
            component = new ResultList();
        } else {
            throw new Exception(componentName + " unknown.");
        }
        System.out.println("Component created: " + component.getClass().getName());
        component.initialize();
        return component;
    }
}

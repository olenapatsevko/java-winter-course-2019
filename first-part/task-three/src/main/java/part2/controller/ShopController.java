package part2.controller;

import part2.model.Shop;
import part2.view.ShopView;

public class ShopController {

    private Shop shop = new Shop();

    public void start() {
        ShopView.print("Put the shop name");
        shop.setName(ShopView.scan());
        for (; ; ) {
            ShopView.printMenu();
            try {
                switch (Integer.parseInt(ShopView.scan())) {
                    case 1: {
                        ShopView.print(shop.toString());
                        break;
                    }
                    case 2: {
                        shop.addDepartment(ShopView.createDepartment());
                        
                        break;
                    }
                    case 3: {
                        shop.addProductToDepartment(shop.findDepartment(ShopView.scan("Enter name"), ShopView.scan("Enter location")), ShopView.createProduct());

                        break;
                    }
                    case 4: {
                        shop.removeDepartment(ShopView.scan("Enter name "), ShopView.scan("Enter location"));
                        break;
                    }
                    case 5: {
                        shop.sortDepartment();
                        ShopView.print(shop.toString());
                        break;
                    }
                    case 6: {
                        return;
                    }
                    default: {
                        break;
                    }

                }
            } catch (Exception ignored) {
                ShopView.print("Incorrect data");
            }
        }

    }
}

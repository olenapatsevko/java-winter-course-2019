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
                        
                        break;
                    }
                    case 3: {

                        break;
                    }
                    case 4: {

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
            }
        }

    }
}

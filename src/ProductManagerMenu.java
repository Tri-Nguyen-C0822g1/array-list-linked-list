import java.util.Scanner;

public class ProductManagerMenu {
    public void displayMenu(){
        System.out.println("Product Manager Menu: ");
        System.out.println("1. Add. ");
        System.out.println("2. Update. ");
        System.out.println("3. Remove. ");
        System.out.println("4. Display all. ");
        System.out.println("5. Search product by Id. ");
        System.out.println("6. Sort by name. ");
    }
    public void menu(){
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        while (true){
            displayMenu();
            int choice = scanner.nextInt(); scanner.nextLine();
            switch (choice){
                case 1:
                    productManager.add(new Product());
                    break;
                case 2:
                    Product productToUpdate = new Product();
                    productManager.update(productToUpdate.getId(),productToUpdate);
                    break;
                case 3:
                    System.out.println("Nhap id muon xoa:");
                    int productToRemove = scanner.nextInt();scanner.nextLine();
                    productManager.remove(productToRemove);
                case 4:
                    productManager.displayAll();
                    break;
                case 5:
                    System.out.println("Nhap id muon tim:");
                    int idToSearch = scanner.nextInt();scanner.nextLine();
                    productManager.searchById(idToSearch);
                    break;
                case 6:
                    System.out.println("Nhap name muon tim:");
                    productManager.sortByName();
                    break;
                default:
                    System.exit(0);


            }
        }
    }

}

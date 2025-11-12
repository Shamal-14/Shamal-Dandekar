
class FoodDeliverySystem {
    String appName;
    String founder;
    int availableCities;

    FoodDeliverySystem()
    {
        this.appName = "Generic Food App";
        this.founder = "Unknown";
        this.availableCities = 0;
    }

    FoodDeliverySystem(String appName, String founder, int availableCities)
    {
        this.appName = appName;
        this.founder = founder;
        this.availableCities = availableCities;
    }

    String getAppName()
    {
        return appName;
    }

    void setAppName(String appName)
    {
        this.appName = appName;
    }

    String getFounder()
    {
        return founder;
    }

    void setFounder(String founder)
    {
        this.founder = founder;
    }

    int getAvailableCities()
    {
        return availableCities;
    }

    void setAvailableCities(int availableCities)
    {
        this.availableCities = availableCities;
    }

    void display()
    {
        System.out.println("App Name : " + this.appName);
        System.out.println("Founder : " + this.founder);
        System.out.println("Available Cities : " + this.availableCities);
    }
}

// Subclass 1: Swiggy
class Swiggy extends FoodDeliverySystem {
    int totalOrders;
    int activeDeliveryPartners;
    double monthlyRevenue;
    double averageDeliveryTime;

    Swiggy()
    {
        super();
        this.totalOrders = 0;
        this.activeDeliveryPartners = 0;
        this.monthlyRevenue = 0.0;
        this.averageDeliveryTime = 0.0;
    }

    Swiggy(String appName, String founder, int availableCities, int totalOrders, int activeDeliveryPartners, double monthlyRevenue, double averageDeliveryTime)
    {
        super(appName, founder, availableCities);
        this.totalOrders = totalOrders;
        this.activeDeliveryPartners = activeDeliveryPartners;
        this.monthlyRevenue = monthlyRevenue;
        this.averageDeliveryTime = averageDeliveryTime;
    }

    int getTotalOrders()
    {
        return totalOrders;
    }

    void setTotalOrders(int totalOrders)
    {
        this.totalOrders = totalOrders;
    }

    int getActiveDeliveryPartners()
    {
        return activeDeliveryPartners;
    }

    void setActiveDeliveryPartners(int activeDeliveryPartners)
    {
        this.activeDeliveryPartners = activeDeliveryPartners;
    }

    double getMonthlyRevenue()
    {
        return monthlyRevenue;
    }

    void setMonthlyRevenue(double monthlyRevenue)
    {
        this.monthlyRevenue = monthlyRevenue;
    }

    double getAverageDeliveryTime()
    {
        return averageDeliveryTime;
    }

    void setAverageDeliveryTime(double averageDeliveryTime)
    {
        this.averageDeliveryTime = averageDeliveryTime;
    }

    void display()
    {
        super.display();
        System.out.println("Total Orders : " + this.totalOrders);
        System.out.println("Active Delivery Partners : " + this.activeDeliveryPartners);
        System.out.println("Monthly Revenue : ₹" + this.monthlyRevenue);
        System.out.println("Average Delivery Time : " + this.averageDeliveryTime + " minutes");
    }
}

// Subclass 2: Zomato
class Zomato extends FoodDeliverySystem {
    int premiumMembers;
    int totalReviews;
    int restaurantPartners;
    double averageRating;

    Zomato()
    {
        super();
        this.premiumMembers = 0;
        this.totalReviews = 0;
        this.restaurantPartners = 0;
        this.averageRating = 0.0;
    }

    Zomato(String appName, String founder, int availableCities, int premiumMembers, int totalReviews, int restaurantPartners, double averageRating)
    {
        super(appName, founder, availableCities);
        this.premiumMembers = premiumMembers;
        this.totalReviews = totalReviews;
        this.restaurantPartners = restaurantPartners;
        this.averageRating = averageRating;
    }

    int getPremiumMembers()
    {
        return premiumMembers;
    }

    void setPremiumMembers(int premiumMembers)
    {
        this.premiumMembers = premiumMembers;
    }

    int getTotalReviews()
    {
        return totalReviews;
    }

    void setTotalReviews(int totalReviews)
    {
        this.totalReviews = totalReviews;
    }

    int getRestaurantPartners()
    {
        return restaurantPartners;
    }

    void setRestaurantPartners(int restaurantPartners)
    {
        this.restaurantPartners = restaurantPartners;
    }

    double getAverageRating()
    {
        return averageRating;
    }

    void setAverageRating(double averageRating)
    {
        this.averageRating = averageRating;
    }

    void display()
    {
        super.display();
        System.out.println("Premium Members : " + this.premiumMembers);
        System.out.println("Total Reviews : " + this.totalReviews);
        System.out.println("Restaurant Partners : " + this.restaurantPartners);
        System.out.println("Average Rating : " + this.averageRating);
    }
}

// Subclass 3: Blinkit
class Blinkit extends FoodDeliverySystem {
    int totalGroceriesDelivered;
    boolean isInstantDeliveryAvailable;

    Blinkit()
    {
        super();
        this.totalGroceriesDelivered = 0;
        this.isInstantDeliveryAvailable = false;
    }

    Blinkit(String appName, String founder, int availableCities, int totalGroceriesDelivered, boolean isInstantDeliveryAvailable)
    {
        super(appName, founder, availableCities);
        this.totalGroceriesDelivered = totalGroceriesDelivered;
        this.isInstantDeliveryAvailable = isInstantDeliveryAvailable;
    }

    int getTotalGroceriesDelivered()
    {
        return totalGroceriesDelivered;
    }

    void setTotalGroceriesDelivered(int totalGroceriesDelivered)
    {
        this.totalGroceriesDelivered = totalGroceriesDelivered;
    }

    boolean getIsInstantDeliveryAvailable()
    {
        return isInstantDeliveryAvailable;
    }

    void setIsInstantDeliveryAvailable(boolean isInstantDeliveryAvailable)
    {
        this.isInstantDeliveryAvailable = isInstantDeliveryAvailable;
    }

    void display()
    {
        super.display();
        System.out.println("Total Groceries Delivered : " + this.totalGroceriesDelivered);
        System.out.println("Is Instant Delivery Available : " + this.isInstantDeliveryAvailable);
    }
}

// Main Class
class FoodDeliveryMain {
    public static void main(String[] args)
    {
        Swiggy s = new Swiggy("Swiggy", "Sriharsha Majety", 500, 1200000, 50000, 25000000.75, 32.5);
        Zomato z = new Zomato("Zomato", "Deepinder Goyal", 600, 150000, 5000000, 200000, 4.3);
        Blinkit b = new Blinkit("Blinkit", "Albinder Dhindsa", 300, 2500000, true);

        System.out.println("---SWIGGY DETAILS ---");
        s.display();
        

        System.out.println("---ZOMATO DETAILS ---");
        z.display();
        

        System.out.println("---BLINKIT DETAILS---");
        b.display();
    }
}


class RideSharingApp {
    String appName;
    String founder;
    int totalDrivers;
    int availableCities;

    RideSharingApp()
    {
        this.appName = "Generic Ride App";
        this.founder = "Unknown";
        this.totalDrivers = 0;
        this.availableCities = 0;
    }

    RideSharingApp(String appName, String founder, int totalDrivers, int availableCities)
    {
        this.appName = appName;
        this.founder = founder;
        this.totalDrivers = totalDrivers;
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

    int getTotalDrivers()
    {
        return totalDrivers;
    }

    void setTotalDrivers(int totalDrivers)
    {
        this.totalDrivers = totalDrivers;
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
        System.out.println("Total Drivers : " + this.totalDrivers);
        System.out.println("Available Cities : " + this.availableCities);
    }
}

// Subclass 1
class Uber extends RideSharingApp {
    int uberPassUsers;
    double averageWaitTime;
    double ratingSystem;
    double driverEarnings;

    Uber()
    {
        super();
        this.uberPassUsers = 0;
        this.averageWaitTime = 0.0;
        this.ratingSystem = 0.0;
        this.driverEarnings = 0.0;
    }

    Uber(String appName, String founder, int totalDrivers, int availableCities, int uberPassUsers, double averageWaitTime, double ratingSystem, double driverEarnings)
    {
        super(appName, founder, totalDrivers, availableCities);
        this.uberPassUsers = uberPassUsers;
        this.averageWaitTime = averageWaitTime;
        this.ratingSystem = ratingSystem;
        this.driverEarnings = driverEarnings;
    }

    int getUberPassUsers()
    {
        return uberPassUsers;
    }

    void setUberPassUsers(int uberPassUsers)
    {
        this.uberPassUsers = uberPassUsers;
    }

    double getAverageWaitTime()
    {
        return averageWaitTime;
    }

    void setAverageWaitTime(double averageWaitTime)
    {
        this.averageWaitTime = averageWaitTime;
    }

    double getRatingSystem()
    {
        return ratingSystem;
    }

    void setRatingSystem(double ratingSystem)
    {
        this.ratingSystem = ratingSystem;
    }

    double getDriverEarnings()
    {
        return driverEarnings;
    }

    void setDriverEarnings(double driverEarnings)
    {
        this.driverEarnings = driverEarnings;
    }

    void display()
    {
        super.display();
        System.out.println("Uber Pass Users : " + this.uberPassUsers);
        System.out.println("Average Wait Time : " + this.averageWaitTime + " min");
        System.out.println("Rating System : " + this.ratingSystem);
        System.out.println("Driver Earnings : ₹" + this.driverEarnings);
    }
}

// Subclass 2
class Ola extends RideSharingApp {
    int totalCabs;
    int dailyBookings;
    int offersActive;

    Ola()
    {
        super();
        this.totalCabs = 0;
        this.dailyBookings = 0;
        this.offersActive = 0;
    }

    Ola(String appName, String founder, int totalDrivers, int availableCities, int totalCabs, int dailyBookings, int offersActive)
    {
        super(appName, founder, totalDrivers, availableCities);
        this.totalCabs = totalCabs;
        this.dailyBookings = dailyBookings;
        this.offersActive = offersActive;
    }

    int getTotalCabs()
    {
        return totalCabs;
    }

    void setTotalCabs(int totalCabs)
    {
        this.totalCabs = totalCabs;
    }

    int getDailyBookings()
    {
        return dailyBookings;
    }

    void setDailyBookings(int dailyBookings)
    {
        this.dailyBookings = dailyBookings;
    }

    int getOffersActive()
    {
        return offersActive;
    }

    void setOffersActive(int offersActive)
    {
        this.offersActive = offersActive;
    }

    void display()
    {
        super.display();
        System.out.println("Total Cabs : " + this.totalCabs);
        System.out.println("Daily Bookings : " + this.dailyBookings);
        System.out.println("Offers Active : " + this.offersActive);
    }
}

// Subclass 3
class Rapido extends RideSharingApp {
    int totalBikes;
    int completedTrips;
    int deliveryPartners;

    Rapido()
    {
        super();
        this.totalBikes = 0;
        this.completedTrips = 0;
        this.deliveryPartners = 0;
    }

    Rapido(String appName, String founder, int totalDrivers, int availableCities, int totalBikes, int completedTrips, int deliveryPartners)
    {
        super(appName, founder, totalDrivers, availableCities);
        this.totalBikes = totalBikes;
        this.completedTrips = completedTrips;
        this.deliveryPartners = deliveryPartners;
    }

    int getTotalBikes()
    {
        return totalBikes;
    }

    void setTotalBikes(int totalBikes)
    {
        this.totalBikes = totalBikes;
    }

    int getCompletedTrips()
    {
        return completedTrips;
    }

    void setCompletedTrips(int completedTrips)
    {
        this.completedTrips = completedTrips;
    }

    int getDeliveryPartners()
    {
        return deliveryPartners;
    }

    void setDeliveryPartners(int deliveryPartners)
    {
        this.deliveryPartners = deliveryPartners;
    }

    void display()
    {
        super.display();
        System.out.println("Total Bikes : " + this.totalBikes);
        System.out.println("Completed Trips : " + this.completedTrips);
        System.out.println("Delivery Partners : " + this.deliveryPartners);
    }
}

// Main Class
class RideSharingMain {
    public static void main(String[] args)
    {
        Uber u = new Uber("Uber", "Travis Kalanick", 100000, 500, 50000, 4.5, 4.7, 2500.50);
        Ola o = new Ola("Ola", "Bhavish Aggarwal", 80000, 300, 60000, 150000, 5);
        Rapido r = new Rapido("Rapido", "Aravind Sanka", 50000, 200, 40000, 2500000, 12000);

        
        u.display();
        

        
        o.display();
        

        
        r.display();
    }
}

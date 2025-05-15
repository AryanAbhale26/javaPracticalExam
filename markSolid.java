interface AnalyticsService {
    void analyzeData();
}

interface MarketingService {
    void handleMarketingData();
}
class BasicAnalyticsService implements AnalyticsService {
    @Override
    public void analyzeData() {
        System.out.println("Analyzing data for analytics team...");
    }
}
class BasicMarketingService implements MarketingService {
    @Override
    public void handleMarketingData() {
        System.out.println("Handling marketing requirements...");
    }
}

class EmailMarketingService implements MarketingService {
    @Override
    public void handleMarketingData() {
        System.out.println("Handling email marketing...");
    }
}

class AdAgencyService {
    private AnalyticsService analyticsService;
    private MarketingService marketingService;

    public AdAgencyService(AnalyticsService analyticsService, MarketingService marketingService) {
        this.analyticsService = analyticsService;
        this.marketingService = marketingService;
    }

    public void executeAnalytics() {
        analyticsService.analyzeData();
    }

    public void executeMarketing() {
        marketingService.handleMarketingData();
    }
}

public class markSolid
 {
    public static void main(String[] args) {
        AnalyticsService analyticsService = new BasicAnalyticsService();
        MarketingService marketingService = new BasicMarketingService();

        AdAgencyService adAgencyService = new AdAgencyService(analyticsService, marketingService);
        adAgencyService.executeAnalytics();
        adAgencyService.executeMarketing();
    }
}

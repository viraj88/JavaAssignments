import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WebCrawler implements Runnable {
    private final String url;

    public WebCrawler(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        try {
            // Connect to the website and retrieve its HTML content
            Document document = Jsoup.connect(url).get();

            // Parse and process the HTML content
            processHtml(document);

        } catch (IOException e) {
            System.err.println("Error crawling " + url + ": " + e.getMessage());
        }
    }

    private void processHtml(Document document) {
        // Example: Extract and print all the links from the page
        Elements links = document.select("a[href]");
        for (Element link : links) {
            System.out.println("Thread: " + Thread.currentThread().getId() + " - Found link: " + link.attr("href"));
        }
    }
}

public class ConcurrentWebCrawler {
    public static void main(String[] args) {
        // List of websites to crawl
        String[] websites = {
                "https://example.com",
                "https://example.org",
                // Add more websites as needed
        };

        // Create an ExecutorService with a fixed number of threads
        int numberOfThreads = 5;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);

        // Submit tasks for each website to the ExecutorService
        for (String website : websites) {
            executorService.submit(new WebCrawler(website));
        }

        // Shut down the ExecutorService once all tasks are submitted
        executorService.shutdown();
    }
}

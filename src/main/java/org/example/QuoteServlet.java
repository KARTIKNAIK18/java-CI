package com.example;

import java.io.IOException;
import java.util.Random;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class QuoteServlet extends HttpServlet {
    private final String[] quotes = {
            "The best way to get started is to quit talking and begin doing.",
            "Don’t let yesterday take up too much of today.",
            "It’s not whether you get knocked down, it’s whether you get up.",
            "If you are working on something exciting, it will keep you motivated.",
            "Success is not in what you have, but who you are.",
            "Your limitation—it’s only your imagination.",
            "Push yourself, because no one else is going to do it for you.",
            "Great things never come from comfort zones.",
            "Dream it. Wish it. Do it.",
            "Success doesn’t just find you. You have to go out and get it.",
            "The harder you work for something, the greater you’ll feel when you achieve it.",
            "Dream bigger. Do bigger.",
            "Don’t stop when you’re tired. Stop when you’re done.",
            "Wake up with determination. Go to bed with satisfaction.",
            "Do something today that your future self will thank you for.",
            "Little things make big days.",
            "It’s going to be hard, but hard does not mean impossible.",
            "Don’t wait for opportunity. Create it.",
            "Sometimes we’re tested not to show our weaknesses, but to discover our strengths.",
            "The key to success is to focus on goals, not obstacles."
    };


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        Random random = new Random();
        String randomQuote = quotes[random.nextInt(quotes.length)];

        resp.setContentType("text/html");
        resp.getWriter().println("<html><head><title>Quote of the Day</title>");
        resp.getWriter().println("<style>");
        resp.getWriter().println("body { font-family: Arial; text-align: center; background: #f9f9f9; padding-top: 50px; }");
        resp.getWriter().println(".quote-box { background: white; padding: 20px; border-radius: 10px; display: inline-block; box-shadow: 0 2px 10px rgba(0,0,0,0.1); }");
        resp.getWriter().println(".quote { font-size: 20px; color: #333; }");
        resp.getWriter().println("</style></head><body>");
        resp.getWriter().println("<div class='quote-box'><p class='quote'>" + randomQuote + "</p></div>");
        resp.getWriter().println("</body></html>");
    }
}

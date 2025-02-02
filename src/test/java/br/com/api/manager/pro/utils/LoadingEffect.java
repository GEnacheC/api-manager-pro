package br.com.api.manager.pro.utils;

/**
 * <h3>Handle with loading effects prints</h3>
 */
public class LoadingEffect {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_LOADING = "="; // 🔴

    
    /** 
     * <b>Print the start of test</b>
     * 
     * @param testName
     */
    public static void startTest(String testName) {
        System.out.println(ANSI_CYAN + "\n🌀 Starting test: " + ANSI_YELLOW + testName + ANSI_RESET);
        System.out.print(ANSI_BLUE + "   Progress: [");
    }

    public static void progress() {
        System.out.print(ANSI_LOADING);
        try {
            Thread.sleep(150);
        } catch (InterruptedException ignored) {
        }
    }

    public static void endTest(String testName) {
        System.out.println(ANSI_BLUE + "]\n✅ " + ANSI_GREEN + "Test finished: "
                + ANSI_YELLOW + testName + ANSI_RESET + "\n");
    }
}

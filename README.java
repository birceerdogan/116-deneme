import java.io.*;
import java.util.*;
import java.time.*;

public class FSMMain {
    private static final String VERSION = "1.0";
    private static Set<Character> symbols = new HashSet<>();
    private static Set<String> states = new HashSet<>();
    private static String initialState = null;
    private static Set<String> finalStates = new HashSet<>();
    private static Map<String, Map<Character, String>> transitions = new HashMap<>();
    private static PrintWriter logWriter = null;
    private static boolean loggingEnabled = false;
    private static String logFileName = "";

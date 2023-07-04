package ch.qos.logback.core;

import ch.qos.logback.core.util.EnvUtil;

/* loaded from: classes.dex */
public class CoreConstants {
    public static final int BYTES_PER_INT = 4;
    public static final String CAUSED_BY = "Caused by: ";
    public static final String CLF_DATE_PATTERN = "dd/MMM/yyyy:HH:mm:ss Z";
    public static final String CODES_URL = "http://logback.qos.ch/codes.html";
    public static final char COLON_CHAR = ':';
    public static final char COMMA_CHAR = ',';
    public static final String CONFIGURATION_WATCH_LIST = "CONFIGURATION_WATCH_LIST";
    public static final String CONFIGURATION_WATCH_LIST_RESET_X = "CONFIGURATION_WATCH_LIST_RESET";
    public static final String CONTEXT_NAME_KEY = "CONTEXT_NAME";
    public static final String CONTEXT_SCOPE_VALUE = "context";
    public static final int CORE_POOL_SIZE = EnvUtil.isJDK5() ? 1 : 0;
    public static final char CURLY_LEFT = '{';
    public static final char CURLY_RIGHT = '}';
    public static final String DAILY_DATE_PATTERN = "yyyy-MM-dd";
    public static final char DASH_CHAR = '-';
    public static final String DATA_DIR_KEY = "DATA_DIR";
    public static final String DEFAULT_CONTEXT_NAME = "default";
    public static final String DEFAULT_VALUE_SEPARATOR = ":-";
    public static final char DOLLAR = '$';
    public static final char DOT = '.';
    public static final char DOUBLE_QUOTE_CHAR = '\"';
    public static final String EMPTY_STRING = "";
    public static final char ESCAPE_CHAR = '\\';
    public static final String EVALUATOR_MAP = "EVALUATOR_MAP";
    public static final String EXT_DIR_KEY = "EXT_DIR";
    public static final String FA_FILENAME_COLLISION_MAP = "FA_FILENAME_COLLISION_MAP";
    public static final String HOSTNAME_KEY = "HOSTNAME";
    public static final String ISO8601_PATTERN = "yyyy-MM-dd HH:mm:ss,SSS";
    public static final String ISO8601_STR = "ISO8601";
    public static final String LEFT_ACCOLADE;
    public static final char LEFT_PARENTHESIS_CHAR = '(';
    public static final String LINE_SEPARATOR;
    public static final int LINE_SEPARATOR_LEN;
    public static final String MANUAL_URL_PREFIX = "http://logback.qos.ch/manual/";
    public static final int MAX_ERROR_COUNT = 4;
    public static final int MAX_POOL_SIZE = 32;
    public static final long MILLIS_IN_ONE_DAY = 86400000;
    public static final long MILLIS_IN_ONE_HOUR = 3600000;
    public static final long MILLIS_IN_ONE_MINUTE = 60000;
    public static final long MILLIS_IN_ONE_SECOND = 1000;
    public static final long MILLIS_IN_ONE_WEEK = 604800000;
    public static final int OOS_RESET_FREQUENCY = 70;
    public static final String PACKAGE_NAME_KEY = "PACKAGE_NAME";
    public static final String PATTERN_RULE_REGISTRY = "PATTERN_RULE_REGISTRY";
    public static final char PERCENT_CHAR = '%';
    public static final String RECONFIGURE_ON_CHANGE_TASK = "RECONFIGURE_ON_CHANGE_TASK";
    public static final String RESET_MSG_PREFIX = "Will reset and reconfigure context ";
    public static final String RFA_FILENAME_PATTERN_COLLISION_MAP = "RFA_FILENAME_PATTERN_COLLISION_MAP";
    public static final String RIGHT_ACCOLADE;
    public static final char RIGHT_PARENTHESIS_CHAR = ')';
    public static final String SAFE_JORAN_CONFIGURATION = "SAFE_JORAN_CONFIGURATION";
    public static final int SCHEDULED_EXECUTOR_POOL_SIZE = 2;
    public static final int SECONDS_TO_WAIT_FOR_COMPRESSION_JOBS = 30;
    public static final String SEE_FNP_NOT_SET = "See also http://logback.qos.ch/codes.html#tbr_fnp_not_set";
    public static final String SEE_MISSING_INTEGER_TOKEN = "See also http://logback.qos.ch/codes.html#sat_missing_integer_token";
    public static final String SHUTDOWN_HOOK_THREAD = "SHUTDOWN_HOOK";
    public static final char SINGLE_QUOTE_CHAR = '\'';
    public static final String SIZE_AND_TIME_BASED_FNATP_IS_DEPRECATED = "SizeAndTimeBasedFNATP is deprecated. Use SizeAndTimeBasedRollingPolicy instead";
    public static final String STATUS_LISTENER_CLASS = "logback.statusListenerClass";
    public static final String SUPPRESSED = "Suppressed: ";
    public static final char TAB = '\t';
    public static final int TABLE_ROW_LIMIT = 10000;
    public static final long UNBOUNDED_TOTAL_SIZE_CAP = 0;
    public static final int UNBOUND_HISTORY = 0;
    public static final String UNDEFINED_PROPERTY_SUFFIX = "_IS_UNDEFINED";
    public static final String VALUE_OF = "valueOf";
    public static final String VERSION_CODE_KEY = "VERSION_CODE";
    public static final String VERSION_NAME_KEY = "VERSION_NAME";
    public static final String WRAPPED_BY = "Wrapped by: ";
    public static final String XML_PARSING = "XML_PARSING";

    static {
        String property = System.getProperty("line.separator");
        LINE_SEPARATOR = property;
        LINE_SEPARATOR_LEN = property.length();
        LEFT_ACCOLADE = new String(new char[]{CURLY_LEFT});
        RIGHT_ACCOLADE = new String(new char[]{CURLY_RIGHT});
    }
}
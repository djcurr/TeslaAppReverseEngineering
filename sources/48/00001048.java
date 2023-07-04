package ch.qos.logback.classic.jul;

import java.util.logging.Level;
import java.util.logging.Logger;

@Deprecated
/* loaded from: classes.dex */
public class JULHelper {
    public static Level asJULLevel(ch.qos.logback.classic.Level level) {
        if (level != null) {
            int i11 = level.levelInt;
            if (i11 != Integer.MIN_VALUE) {
                if (i11 != 5000) {
                    if (i11 != 10000) {
                        if (i11 != 20000) {
                            if (i11 != 30000) {
                                if (i11 != 40000) {
                                    if (i11 == Integer.MAX_VALUE) {
                                        return Level.OFF;
                                    }
                                    throw new IllegalArgumentException("Unexpected level [" + level + "]");
                                }
                                return Level.SEVERE;
                            }
                            return Level.WARNING;
                        }
                        return Level.INFO;
                    }
                    return Level.FINE;
                }
                return Level.FINEST;
            }
            return Level.ALL;
        }
        throw new IllegalArgumentException("Unexpected level [null]");
    }

    public static Logger asJULLogger(ch.qos.logback.classic.Logger logger) {
        return asJULLogger(logger.getName());
    }

    public static Logger asJULLogger(String str) {
        return Logger.getLogger(asJULLoggerName(str));
    }

    public static String asJULLoggerName(String str) {
        return org.slf4j.Logger.ROOT_LOGGER_NAME.equals(str) ? "" : str;
    }

    public static final boolean isRegularNonRootLogger(Logger logger) {
        if (logger == null) {
            return false;
        }
        return !logger.getName().equals("");
    }

    public static final boolean isRoot(Logger logger) {
        if (logger == null) {
            return false;
        }
        return logger.getName().equals("");
    }
}
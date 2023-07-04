package ch.qos.logback.classic;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class Level implements Serializable {
    public static final int ALL_INT = Integer.MIN_VALUE;
    public static final int DEBUG_INT = 10000;
    public static final int OFF_INT = Integer.MAX_VALUE;
    public static final int TRACE_INT = 5000;
    public static final int WARN_INT = 30000;
    private static final long serialVersionUID = -814092767334282137L;
    public final int levelInt;
    public final String levelStr;
    public static final Integer OFF_INTEGER = Integer.MAX_VALUE;
    public static final int ERROR_INT = 40000;
    public static final Integer ERROR_INTEGER = Integer.valueOf((int) ERROR_INT);
    public static final Integer WARN_INTEGER = 30000;
    public static final int INFO_INT = 20000;
    public static final Integer INFO_INTEGER = Integer.valueOf((int) INFO_INT);
    public static final Integer DEBUG_INTEGER = 10000;
    public static final Integer TRACE_INTEGER = 5000;
    public static final Integer ALL_INTEGER = Integer.MIN_VALUE;
    public static final Level OFF = new Level(Integer.MAX_VALUE, "OFF");
    public static final Level ERROR = new Level(ERROR_INT, "ERROR");
    public static final Level WARN = new Level(30000, "WARN");
    public static final Level INFO = new Level(INFO_INT, "INFO");
    public static final Level DEBUG = new Level(10000, "DEBUG");
    public static final Level TRACE = new Level(5000, "TRACE");
    public static final Level ALL = new Level(Integer.MIN_VALUE, "ALL");

    private Level(int i11, String str) {
        this.levelInt = i11;
        this.levelStr = str;
    }

    public static Level fromLocationAwareLoggerInteger(int i11) {
        if (i11 != 0) {
            if (i11 != 10) {
                if (i11 != 20) {
                    if (i11 != 30) {
                        if (i11 == 40) {
                            return ERROR;
                        }
                        throw new IllegalArgumentException(i11 + " not a valid level value");
                    }
                    return WARN;
                }
                return INFO;
            }
            return DEBUG;
        }
        return TRACE;
    }

    private Object readResolve() {
        return toLevel(this.levelInt);
    }

    public static Level toLevel(int i11) {
        return toLevel(i11, DEBUG);
    }

    public static Level toLevel(int i11, Level level) {
        return i11 != Integer.MIN_VALUE ? i11 != 5000 ? i11 != 10000 ? i11 != 20000 ? i11 != 30000 ? i11 != 40000 ? i11 != Integer.MAX_VALUE ? level : OFF : ERROR : WARN : INFO : DEBUG : TRACE : ALL;
    }

    public static Level toLevel(String str) {
        return toLevel(str, DEBUG);
    }

    public static Level toLevel(String str, Level level) {
        if (str == null) {
            return level;
        }
        String trim = str.trim();
        return trim.equalsIgnoreCase("ALL") ? ALL : trim.equalsIgnoreCase("TRACE") ? TRACE : trim.equalsIgnoreCase("DEBUG") ? DEBUG : trim.equalsIgnoreCase("INFO") ? INFO : trim.equalsIgnoreCase("WARN") ? WARN : trim.equalsIgnoreCase("ERROR") ? ERROR : trim.equalsIgnoreCase("OFF") ? OFF : level;
    }

    public static int toLocationAwareLoggerInteger(Level level) {
        if (level != null) {
            int i11 = level.toInt();
            if (i11 != 5000) {
                if (i11 != 10000) {
                    if (i11 != 20000) {
                        if (i11 != 30000) {
                            if (i11 == 40000) {
                                return 40;
                            }
                            throw new IllegalArgumentException(level + " not a valid level value");
                        }
                        return 30;
                    }
                    return 20;
                }
                return 10;
            }
            return 0;
        }
        throw new IllegalArgumentException("null level parameter is not admitted");
    }

    public static Level valueOf(String str) {
        return toLevel(str, DEBUG);
    }

    public boolean isGreaterOrEqual(Level level) {
        return this.levelInt >= level.levelInt;
    }

    public int toInt() {
        return this.levelInt;
    }

    public Integer toInteger() {
        int i11 = this.levelInt;
        if (i11 != Integer.MIN_VALUE) {
            if (i11 != 5000) {
                if (i11 != 10000) {
                    if (i11 != 20000) {
                        if (i11 != 30000) {
                            if (i11 != 40000) {
                                if (i11 == Integer.MAX_VALUE) {
                                    return OFF_INTEGER;
                                }
                                throw new IllegalStateException("Level " + this.levelStr + ", " + this.levelInt + " is unknown.");
                            }
                            return ERROR_INTEGER;
                        }
                        return WARN_INTEGER;
                    }
                    return INFO_INTEGER;
                }
                return DEBUG_INTEGER;
            }
            return TRACE_INTEGER;
        }
        return ALL_INTEGER;
    }

    public String toString() {
        return this.levelStr;
    }
}
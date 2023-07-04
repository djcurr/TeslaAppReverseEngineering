package ch.qos.logback.classic.util;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;

/* loaded from: classes.dex */
public class LevelToSyslogSeverity {
    public static int convert(ILoggingEvent iLoggingEvent) {
        Level level = iLoggingEvent.getLevel();
        int i11 = level.levelInt;
        if (i11 == 5000 || i11 == 10000) {
            return 7;
        }
        if (i11 != 20000) {
            if (i11 != 30000) {
                if (i11 == 40000) {
                    return 3;
                }
                throw new IllegalArgumentException("Level " + level + " is not a valid level for a printing method");
            }
            return 4;
        }
        return 6;
    }
}
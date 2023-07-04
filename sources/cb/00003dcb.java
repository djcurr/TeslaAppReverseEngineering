package com.google.protobuf.util;

import com.google.common.base.u;
import com.google.protobuf.Duration;
import el.a;
import el.b;
import java.text.ParseException;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class Durations {
    private static final long SECONDS_PER_DAY = 86400;
    private static final long SECONDS_PER_HOUR = 3600;
    private static final long SECONDS_PER_MINUTE = 60;
    static final long DURATION_SECONDS_MIN = -315576000000L;
    public static final Duration MIN_VALUE = Duration.newBuilder().setSeconds(DURATION_SECONDS_MIN).setNanos(-999999999).build();
    static final long DURATION_SECONDS_MAX = 315576000000L;
    public static final Duration MAX_VALUE = Duration.newBuilder().setSeconds(DURATION_SECONDS_MAX).setNanos(999999999).build();
    public static final Duration ZERO = Duration.newBuilder().setSeconds(0).setNanos(0).build();

    /* loaded from: classes2.dex */
    private enum DurationComparator implements Comparator<Duration> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Duration duration, Duration duration2) {
            Durations.checkValid(duration);
            Durations.checkValid(duration2);
            int compare = Long.compare(duration.getSeconds(), duration2.getSeconds());
            return compare != 0 ? compare : Integer.compare(duration.getNanos(), duration2.getNanos());
        }
    }

    private Durations() {
    }

    public static Duration add(Duration duration, Duration duration2) {
        checkValid(duration);
        checkValid(duration2);
        return normalizedDuration(b.a(duration.getSeconds(), duration2.getSeconds()), a.a(duration.getNanos(), duration2.getNanos()));
    }

    public static Duration checkNotNegative(Duration duration) {
        u.k(!isNegative(duration), "duration (%s) must not be negative", toString(duration));
        return duration;
    }

    public static Duration checkPositive(Duration duration) {
        u.k(isPositive(duration), "duration (%s) must be positive", toString(duration));
        return duration;
    }

    public static Duration checkValid(Duration duration) {
        long seconds = duration.getSeconds();
        int nanos = duration.getNanos();
        if (isValid(seconds, nanos)) {
            return duration;
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(seconds), Integer.valueOf(nanos)));
    }

    public static Comparator<Duration> comparator() {
        return DurationComparator.INSTANCE;
    }

    public static int compare(Duration duration, Duration duration2) {
        return DurationComparator.INSTANCE.compare(duration, duration2);
    }

    public static Duration fromDays(long j11) {
        return Duration.newBuilder().setSeconds(b.b(j11, SECONDS_PER_DAY)).setNanos(0).build();
    }

    public static Duration fromHours(long j11) {
        return Duration.newBuilder().setSeconds(b.b(j11, SECONDS_PER_HOUR)).setNanos(0).build();
    }

    public static Duration fromMicros(long j11) {
        return normalizedDuration(j11 / 1000000, (int) ((j11 % 1000000) * 1000));
    }

    public static Duration fromMillis(long j11) {
        return normalizedDuration(j11 / 1000, (int) ((j11 % 1000) * 1000000));
    }

    public static Duration fromMinutes(long j11) {
        return Duration.newBuilder().setSeconds(b.b(j11, SECONDS_PER_MINUTE)).setNanos(0).build();
    }

    public static Duration fromNanos(long j11) {
        return normalizedDuration(j11 / 1000000000, (int) (j11 % 1000000000));
    }

    public static Duration fromSeconds(long j11) {
        return normalizedDuration(j11, 0);
    }

    public static boolean isNegative(Duration duration) {
        checkValid(duration);
        if (duration.getSeconds() == 0) {
            if (duration.getNanos() < 0) {
                return true;
            }
        } else if (duration.getSeconds() < 0) {
            return true;
        }
        return false;
    }

    public static boolean isPositive(Duration duration) {
        checkValid(duration);
        return (isNegative(duration) || duration.equals(ZERO)) ? false : true;
    }

    public static boolean isValid(long j11, int i11) {
        if (j11 >= DURATION_SECONDS_MIN && j11 <= DURATION_SECONDS_MAX) {
            long j12 = i11;
            if (j12 >= -999999999 && j12 < 1000000000) {
                int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                if (i12 >= 0 && i11 >= 0) {
                    return true;
                }
                if (i12 <= 0 && i11 <= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isValid(Duration duration) {
        return isValid(duration.getSeconds(), duration.getNanos());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Duration normalizedDuration(long j11, int i11) {
        long j12 = i11;
        if (j12 <= -1000000000 || j12 >= 1000000000) {
            j11 = b.a(j11, j12 / 1000000000);
            i11 = (int) (j12 % 1000000000);
        }
        if (j11 > 0 && i11 < 0) {
            i11 = (int) (i11 + 1000000000);
            j11--;
        }
        if (j11 < 0 && i11 > 0) {
            i11 = (int) (i11 - 1000000000);
            j11++;
        }
        return checkValid(Duration.newBuilder().setSeconds(j11).setNanos(i11).build());
    }

    public static Duration parse(String str) {
        boolean z11;
        String str2;
        if (!str.isEmpty() && str.charAt(str.length() - 1) == 's') {
            if (str.charAt(0) == '-') {
                str = str.substring(1);
                z11 = true;
            } else {
                z11 = false;
            }
            String substring = str.substring(0, str.length() - 1);
            int indexOf = substring.indexOf(46);
            if (indexOf != -1) {
                str2 = substring.substring(indexOf + 1);
                substring = substring.substring(0, indexOf);
            } else {
                str2 = "";
            }
            long parseLong = Long.parseLong(substring);
            int parseNanos = str2.isEmpty() ? 0 : Timestamps.parseNanos(str2);
            if (parseLong >= 0) {
                if (z11) {
                    parseLong = -parseLong;
                    parseNanos = -parseNanos;
                }
                try {
                    return normalizedDuration(parseLong, parseNanos);
                } catch (IllegalArgumentException unused) {
                    throw new ParseException("Duration value is out of range.", 0);
                }
            }
            throw new ParseException("Invalid duration string: " + str, 0);
        }
        throw new ParseException("Invalid duration string: " + str, 0);
    }

    public static Duration parseUnchecked(String str) {
        try {
            return parse(str);
        } catch (ParseException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public static Duration subtract(Duration duration, Duration duration2) {
        checkValid(duration);
        checkValid(duration2);
        return normalizedDuration(b.c(duration.getSeconds(), duration2.getSeconds()), a.b(duration.getNanos(), duration2.getNanos()));
    }

    public static long toDays(Duration duration) {
        return checkValid(duration).getSeconds() / SECONDS_PER_DAY;
    }

    public static long toHours(Duration duration) {
        return checkValid(duration).getSeconds() / SECONDS_PER_HOUR;
    }

    public static long toMicros(Duration duration) {
        checkValid(duration);
        return b.a(b.b(duration.getSeconds(), 1000000L), duration.getNanos() / 1000);
    }

    public static long toMillis(Duration duration) {
        checkValid(duration);
        return b.a(b.b(duration.getSeconds(), 1000L), duration.getNanos() / 1000000);
    }

    public static long toMinutes(Duration duration) {
        return checkValid(duration).getSeconds() / SECONDS_PER_MINUTE;
    }

    public static long toNanos(Duration duration) {
        checkValid(duration);
        return b.a(b.b(duration.getSeconds(), 1000000000L), duration.getNanos());
    }

    public static long toSeconds(Duration duration) {
        return checkValid(duration).getSeconds();
    }

    public static double toSecondsAsDouble(Duration duration) {
        checkValid(duration);
        return duration.getSeconds() + (duration.getNanos() / 1.0E9d);
    }

    public static String toString(Duration duration) {
        checkValid(duration);
        long seconds = duration.getSeconds();
        int nanos = duration.getNanos();
        StringBuilder sb2 = new StringBuilder();
        if (seconds < 0 || nanos < 0) {
            sb2.append("-");
            seconds = -seconds;
            nanos = -nanos;
        }
        sb2.append(seconds);
        if (nanos != 0) {
            sb2.append(".");
            sb2.append(Timestamps.formatNanos(nanos));
        }
        sb2.append("s");
        return sb2.toString();
    }

    public static Duration checkValid(Duration.Builder builder) {
        return checkValid(builder.build());
    }
}
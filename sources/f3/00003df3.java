package com.google.protobuf.util;

import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import el.a;
import el.b;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class Timestamps {
    static final long MICROS_PER_SECOND = 1000000;
    static final long MILLIS_PER_SECOND = 1000;
    static final long NANOS_PER_MICROSECOND = 1000;
    static final long NANOS_PER_MILLISECOND = 1000000;
    static final long NANOS_PER_SECOND = 1000000000;
    static final long TIMESTAMP_SECONDS_MIN = -62135596800L;
    public static final Timestamp MIN_VALUE = Timestamp.newBuilder().setSeconds(TIMESTAMP_SECONDS_MIN).setNanos(0).build();
    static final long TIMESTAMP_SECONDS_MAX = 253402300799L;
    public static final Timestamp MAX_VALUE = Timestamp.newBuilder().setSeconds(TIMESTAMP_SECONDS_MAX).setNanos(999999999).build();
    public static final Timestamp EPOCH = Timestamp.newBuilder().setSeconds(0).setNanos(0).build();
    private static final ThreadLocal<SimpleDateFormat> timestampFormat = new ThreadLocal<SimpleDateFormat>() { // from class: com.google.protobuf.util.Timestamps.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public SimpleDateFormat initialValue() {
            return Timestamps.access$000();
        }
    };

    /* loaded from: classes2.dex */
    private enum TimestampComparator implements Comparator<Timestamp> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Timestamp timestamp, Timestamp timestamp2) {
            Timestamps.checkValid(timestamp);
            Timestamps.checkValid(timestamp2);
            int compare = Long.compare(timestamp.getSeconds(), timestamp2.getSeconds());
            return compare != 0 ? compare : Integer.compare(timestamp.getNanos(), timestamp2.getNanos());
        }
    }

    private Timestamps() {
    }

    static /* synthetic */ SimpleDateFormat access$000() {
        return createTimestampFormat();
    }

    public static Timestamp add(Timestamp timestamp, Duration duration) {
        checkValid(timestamp);
        Durations.checkValid(duration);
        return normalizedTimestamp(b.a(timestamp.getSeconds(), duration.getSeconds()), a.a(timestamp.getNanos(), duration.getNanos()));
    }

    public static Duration between(Timestamp timestamp, Timestamp timestamp2) {
        checkValid(timestamp);
        checkValid(timestamp2);
        return Durations.normalizedDuration(b.c(timestamp2.getSeconds(), timestamp.getSeconds()), a.b(timestamp2.getNanos(), timestamp.getNanos()));
    }

    public static Timestamp checkValid(Timestamp timestamp) {
        long seconds = timestamp.getSeconds();
        int nanos = timestamp.getNanos();
        if (isValid(seconds, nanos)) {
            return timestamp;
        }
        throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(seconds), Integer.valueOf(nanos)));
    }

    public static Comparator<Timestamp> comparator() {
        return TimestampComparator.INSTANCE;
    }

    public static int compare(Timestamp timestamp, Timestamp timestamp2) {
        return TimestampComparator.INSTANCE.compare(timestamp, timestamp2);
    }

    private static SimpleDateFormat createTimestampFormat() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
        return simpleDateFormat;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String formatNanos(int i11) {
        long j11 = i11;
        return j11 % 1000000 == 0 ? String.format(Locale.ENGLISH, "%1$03d", Long.valueOf(j11 / 1000000)) : j11 % 1000 == 0 ? String.format(Locale.ENGLISH, "%1$06d", Long.valueOf(j11 / 1000)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(i11));
    }

    public static Timestamp fromDate(Date date) {
        if (date instanceof java.sql.Timestamp) {
            java.sql.Timestamp timestamp = (java.sql.Timestamp) date;
            return Timestamp.newBuilder().setSeconds(timestamp.getTime() / 1000).setNanos(timestamp.getNanos()).build();
        }
        return fromMillis(date.getTime());
    }

    public static Timestamp fromMicros(long j11) {
        return normalizedTimestamp(j11 / 1000000, (int) ((j11 % 1000000) * 1000));
    }

    public static Timestamp fromMillis(long j11) {
        return normalizedTimestamp(j11 / 1000, (int) ((j11 % 1000) * 1000000));
    }

    public static Timestamp fromNanos(long j11) {
        return normalizedTimestamp(j11 / NANOS_PER_SECOND, (int) (j11 % NANOS_PER_SECOND));
    }

    public static Timestamp fromSeconds(long j11) {
        return normalizedTimestamp(j11, 0);
    }

    public static boolean isValid(long j11, int i11) {
        return j11 >= TIMESTAMP_SECONDS_MIN && j11 <= TIMESTAMP_SECONDS_MAX && i11 >= 0 && ((long) i11) < NANOS_PER_SECOND;
    }

    public static boolean isValid(Timestamp timestamp) {
        return isValid(timestamp.getSeconds(), timestamp.getNanos());
    }

    static Timestamp normalizedTimestamp(long j11, int i11) {
        long j12 = i11;
        if (j12 <= -1000000000 || j12 >= NANOS_PER_SECOND) {
            j11 = b.a(j11, j12 / NANOS_PER_SECOND);
            i11 = (int) (j12 % NANOS_PER_SECOND);
        }
        if (i11 < 0) {
            i11 = (int) (i11 + NANOS_PER_SECOND);
            j11 = b.c(j11, 1L);
        }
        return checkValid(Timestamp.newBuilder().setSeconds(j11).setNanos(i11).build());
    }

    public static Timestamp parse(String str) {
        String str2;
        int indexOf = str.indexOf(84);
        if (indexOf != -1) {
            int indexOf2 = str.indexOf(90, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = str.indexOf(43, indexOf);
            }
            if (indexOf2 == -1) {
                indexOf2 = str.indexOf(45, indexOf);
            }
            if (indexOf2 != -1) {
                String substring = str.substring(0, indexOf2);
                int indexOf3 = substring.indexOf(46);
                if (indexOf3 != -1) {
                    String substring2 = substring.substring(0, indexOf3);
                    str2 = substring.substring(indexOf3 + 1);
                    substring = substring2;
                } else {
                    str2 = "";
                }
                long time = timestampFormat.get().parse(substring).getTime() / 1000;
                int parseNanos = str2.isEmpty() ? 0 : parseNanos(str2);
                if (str.charAt(indexOf2) == 'Z') {
                    if (str.length() != indexOf2 + 1) {
                        throw new ParseException("Failed to parse timestamp: invalid trailing data \"" + str.substring(indexOf2) + "\"", 0);
                    }
                } else {
                    long parseTimezoneOffset = parseTimezoneOffset(str.substring(indexOf2 + 1));
                    time = str.charAt(indexOf2) == '+' ? time - parseTimezoneOffset : time + parseTimezoneOffset;
                }
                try {
                    return normalizedTimestamp(time, parseNanos);
                } catch (IllegalArgumentException unused) {
                    throw new ParseException("Failed to parse timestamp: timestamp is out of range.", 0);
                }
            }
            throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
        }
        throw new ParseException("Failed to parse timestamp: invalid timestamp \"" + str + "\"", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int parseNanos(String str) {
        int i11 = 0;
        for (int i12 = 0; i12 < 9; i12++) {
            i11 *= 10;
            if (i12 < str.length()) {
                if (str.charAt(i12) >= '0' && str.charAt(i12) <= '9') {
                    i11 += str.charAt(i12) - '0';
                } else {
                    throw new ParseException("Invalid nanoseconds.", 0);
                }
            }
        }
        return i11;
    }

    private static long parseTimezoneOffset(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            return ((Long.parseLong(str.substring(0, indexOf)) * 60) + Long.parseLong(str.substring(indexOf + 1))) * 60;
        }
        throw new ParseException("Invalid offset value: " + str, 0);
    }

    public static Timestamp parseUnchecked(String str) {
        try {
            return parse(str);
        } catch (ParseException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public static Timestamp subtract(Timestamp timestamp, Duration duration) {
        checkValid(timestamp);
        Durations.checkValid(duration);
        return normalizedTimestamp(b.c(timestamp.getSeconds(), duration.getSeconds()), a.b(timestamp.getNanos(), duration.getNanos()));
    }

    public static long toMicros(Timestamp timestamp) {
        checkValid(timestamp);
        return b.a(b.b(timestamp.getSeconds(), 1000000L), timestamp.getNanos() / 1000);
    }

    public static long toMillis(Timestamp timestamp) {
        checkValid(timestamp);
        return b.a(b.b(timestamp.getSeconds(), 1000L), timestamp.getNanos() / 1000000);
    }

    public static long toNanos(Timestamp timestamp) {
        checkValid(timestamp);
        return b.a(b.b(timestamp.getSeconds(), NANOS_PER_SECOND), timestamp.getNanos());
    }

    public static long toSeconds(Timestamp timestamp) {
        return checkValid(timestamp).getSeconds();
    }

    public static String toString(Timestamp timestamp) {
        checkValid(timestamp);
        long seconds = timestamp.getSeconds();
        int nanos = timestamp.getNanos();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(timestampFormat.get().format(new Date(seconds * 1000)));
        if (nanos != 0) {
            sb2.append(".");
            sb2.append(formatNanos(nanos));
        }
        sb2.append("Z");
        return sb2.toString();
    }

    public static Timestamp checkValid(Timestamp.Builder builder) {
        return checkValid(builder.build());
    }
}
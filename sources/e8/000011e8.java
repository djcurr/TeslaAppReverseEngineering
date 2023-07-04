package ch.qos.logback.core.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class FileSize {
    private static final int DOUBLE_GROUP = 1;
    private static final Pattern FILE_SIZE_PATTERN = Pattern.compile("([0-9]+)\\s*(|kb|mb|gb)s?", 2);
    public static final long GB_COEFFICIENT = 1073741824;
    public static final long KB_COEFFICIENT = 1024;
    private static final String LENGTH_PART = "([0-9]+)";
    public static final long MB_COEFFICIENT = 1048576;
    private static final int UNIT_GROUP = 2;
    private static final String UNIT_PART = "(|kb|mb|gb)s?";
    final long size;

    public FileSize(long j11) {
        this.size = j11;
    }

    public static FileSize valueOf(String str) {
        long j11;
        Matcher matcher = FILE_SIZE_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("String value [" + str + "] is not in the expected format.");
        }
        String group = matcher.group(1);
        String group2 = matcher.group(2);
        long longValue = Long.valueOf(group).longValue();
        if (group2.equalsIgnoreCase("")) {
            j11 = 1;
        } else if (group2.equalsIgnoreCase("kb")) {
            j11 = 1024;
        } else if (group2.equalsIgnoreCase("mb")) {
            j11 = MB_COEFFICIENT;
        } else if (!group2.equalsIgnoreCase("gb")) {
            throw new IllegalStateException("Unexpected " + group2);
        } else {
            j11 = GB_COEFFICIENT;
        }
        return new FileSize(longValue * j11);
    }

    public long getSize() {
        return this.size;
    }

    public String toString() {
        long j11 = this.size;
        long j12 = j11 / 1024;
        if (j12 == 0) {
            return this.size + " Bytes";
        }
        long j13 = j11 / MB_COEFFICIENT;
        if (j13 == 0) {
            return j12 + " KB";
        }
        long j14 = j11 / GB_COEFFICIENT;
        if (j14 == 0) {
            return j13 + " MB";
        }
        return j14 + " GB";
    }
}
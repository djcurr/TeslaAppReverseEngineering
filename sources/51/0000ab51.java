package pp;

import java.util.Date;

/* loaded from: classes2.dex */
public class c {
    public static long a(Date date) {
        return (date.getTime() / 1000) + 2082844800;
    }

    public static Date b(long j11) {
        return new Date((j11 - 2082844800) * 1000);
    }
}
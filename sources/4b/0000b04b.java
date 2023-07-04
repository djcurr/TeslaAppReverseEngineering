package r7;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class f {
    public static boolean a(String str) {
        return Pattern.compile("([A-F]|[0-9]){5}\\|([A-F]|[0-9]){512}").matcher(str).find() && str.length() == 518;
    }
}
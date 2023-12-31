package w3;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* loaded from: classes.dex */
public class e {
    public static void a(AccessibilityRecord accessibilityRecord, int i11) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i11);
        }
    }

    public static void b(AccessibilityRecord accessibilityRecord, int i11) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i11);
        }
    }

    public static void c(AccessibilityRecord accessibilityRecord, View view, int i11) {
        if (Build.VERSION.SDK_INT >= 16) {
            accessibilityRecord.setSource(view, i11);
        }
    }
}
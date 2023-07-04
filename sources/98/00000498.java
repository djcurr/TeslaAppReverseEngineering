package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;

/* loaded from: classes.dex */
public final class l implements j0 {

    /* renamed from: a  reason: collision with root package name */
    private final ClipboardManager f3000a;

    public l(ClipboardManager clipboardManager) {
        kotlin.jvm.internal.s.g(clipboardManager, "clipboardManager");
        this.f3000a = clipboardManager;
    }

    @Override // androidx.compose.ui.platform.j0
    public void a(n2.a annotatedString) {
        kotlin.jvm.internal.s.g(annotatedString, "annotatedString");
        this.f3000a.setPrimaryClip(ClipData.newPlainText("plain text", m.b(annotatedString)));
    }

    public final boolean b() {
        ClipDescription primaryClipDescription = this.f3000a.getPrimaryClipDescription();
        if (primaryClipDescription == null) {
            return false;
        }
        return primaryClipDescription.hasMimeType("text/plain");
    }

    @Override // androidx.compose.ui.platform.j0
    public n2.a getText() {
        ClipData primaryClip = this.f3000a.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            return m.a(itemAt != null ? itemAt.getText() : null);
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.s.g(r2, r0)
            java.lang.String r0 = "clipboard"
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.content.ClipboardManager"
            java.util.Objects.requireNonNull(r2, r0)
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.l.<init>(android.content.Context):void");
    }
}
package androidx.compose.ui.platform;

import org.spongycastle.i18n.TextBundle;

/* loaded from: classes.dex */
public abstract class b implements g {

    /* renamed from: a  reason: collision with root package name */
    protected String f2848a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f2849b = new int[2];

    /* JADX INFO: Access modifiers changed from: protected */
    public final int[] c(int i11, int i12) {
        if (i11 < 0 || i12 < 0 || i11 == i12) {
            return null;
        }
        int[] iArr = this.f2849b;
        iArr[0] = i11;
        iArr[1] = i12;
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String d() {
        String str = this.f2848a;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.s.x(TextBundle.TEXT_ENTRY);
        return null;
    }

    public void e(String text) {
        kotlin.jvm.internal.s.g(text, "text");
        f(text);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(String str) {
        kotlin.jvm.internal.s.g(str, "<set-?>");
        this.f2848a = str;
    }
}
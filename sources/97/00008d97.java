package o2;

import android.graphics.Canvas;
import android.graphics.Path;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.s;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final d f42179a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f42180b;

    /* renamed from: c  reason: collision with root package name */
    private final Layout f42181c;

    /* renamed from: d  reason: collision with root package name */
    private final int f42182d;

    public p(CharSequence charSequence, float f11, TextPaint textPaint, int i11, TextUtils.TruncateAt truncateAt, int i12, float f12, float f13, boolean z11, int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2, d layoutIntrinsics) {
        Layout a11;
        s.g(charSequence, "charSequence");
        s.g(textPaint, "textPaint");
        s.g(layoutIntrinsics, "layoutIntrinsics");
        this.f42179a = layoutIntrinsics;
        int length = charSequence.length();
        TextDirectionHeuristic a12 = q.a(i12);
        Layout.Alignment a13 = o.f42176a.a(i11);
        boolean z12 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, q2.a.class) < length;
        BoringLayout.Metrics a14 = layoutIntrinsics.a();
        double d11 = f11;
        int ceil = (int) Math.ceil(d11);
        if (a14 == null || layoutIntrinsics.b() > f11 || z12) {
            a11 = k.f42152a.a(charSequence, (r43 & 2) != 0 ? 0 : 0, (r43 & 4) != 0 ? charSequence.length() : charSequence.length(), textPaint, ceil, (r43 & 32) != 0 ? c.f42135a.b() : a12, (r43 & 64) != 0 ? c.f42135a.a() : a13, (r43 & 128) != 0 ? Integer.MAX_VALUE : i13, (r43 & 256) != 0 ? null : truncateAt, (r43 & 512) != 0 ? ceil : (int) Math.ceil(d11), (r43 & 1024) != 0 ? 1.0f : f12, (r43 & 2048) != 0 ? 0.0f : f13, (r43 & 4096) != 0 ? 0 : i16, (r43 & PKIFailureInfo.certRevoked) != 0 ? true : z11, (r43 & 16384) != 0, (32768 & r43) != 0 ? 0 : i14, (65536 & r43) != 0 ? 0 : i15, (131072 & r43) != 0 ? null : iArr, (r43 & 262144) != 0 ? null : iArr2);
        } else {
            a11 = a.f42130a.a(charSequence, textPaint, ceil, a14, a13, z11, truncateAt, ceil);
        }
        this.f42181c = a11;
        int min = Math.min(a11.getLineCount(), i13);
        this.f42182d = min;
        this.f42180b = min >= i13 && (a11.getEllipsisCount(min + (-1)) > 0 || a11.getLineEnd(min + (-1)) != charSequence.length());
    }

    public final boolean a() {
        return this.f42180b;
    }

    public final int b() {
        if (this.f42180b) {
            return this.f42181c.getLineBottom(this.f42182d - 1);
        }
        return this.f42181c.getHeight();
    }

    public final float c(int i11) {
        return this.f42181c.getLineBaseline(i11);
    }

    public final float d(int i11) {
        return this.f42181c.getLineBottom(i11);
    }

    public final int e() {
        return this.f42182d;
    }

    public final int f(int i11) {
        return this.f42181c.getEllipsisCount(i11);
    }

    public final int g(int i11) {
        return this.f42181c.getEllipsisStart(i11);
    }

    public final int h(int i11) {
        if (this.f42181c.getEllipsisStart(i11) == 0) {
            return this.f42181c.getLineEnd(i11);
        }
        return this.f42181c.getText().length();
    }

    public final int i(int i11) {
        return this.f42181c.getLineForOffset(i11);
    }

    public final int j(int i11) {
        return this.f42181c.getLineForVertical(i11);
    }

    public final float k(int i11) {
        return this.f42181c.getLineLeft(i11);
    }

    public final float l(int i11) {
        return this.f42181c.getLineRight(i11);
    }

    public final int m(int i11) {
        return this.f42181c.getLineStart(i11);
    }

    public final float n(int i11) {
        return this.f42181c.getLineTop(i11);
    }

    public final int o(int i11) {
        if (this.f42181c.getEllipsisStart(i11) == 0) {
            return this.f42181c.getLineVisibleEnd(i11);
        }
        return this.f42181c.getEllipsisStart(i11) + this.f42181c.getLineStart(i11);
    }

    public final int p(int i11, float f11) {
        return this.f42181c.getOffsetForHorizontal(i11, f11);
    }

    public final int q(int i11) {
        return this.f42181c.getParagraphDirection(i11);
    }

    public final float r(int i11) {
        return this.f42181c.getPrimaryHorizontal(i11);
    }

    public final float s(int i11) {
        return this.f42181c.getSecondaryHorizontal(i11);
    }

    public final void t(int i11, int i12, Path dest) {
        s.g(dest, "dest");
        this.f42181c.getSelectionPath(i11, i12, dest);
    }

    public final CharSequence u() {
        CharSequence text = this.f42181c.getText();
        s.f(text, "layout.text");
        return text;
    }

    public final boolean v(int i11) {
        return this.f42181c.isRtlCharAt(i11);
    }

    public final void w(Canvas canvas) {
        s.g(canvas, "canvas");
        this.f42181c.draw(canvas);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ p(java.lang.CharSequence r21, float r22, android.text.TextPaint r23, int r24, android.text.TextUtils.TruncateAt r25, int r26, float r27, float r28, boolean r29, int r30, int r31, int r32, int r33, int[] r34, int[] r35, o2.d r36, int r37, kotlin.jvm.internal.DefaultConstructorMarker r38) {
        /*
            r20 = this;
            r0 = r37
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L9
            r5 = r2
            goto Lb
        L9:
            r5 = r22
        Lb:
            r1 = r0 & 8
            r3 = 0
            if (r1 == 0) goto L12
            r7 = r3
            goto L14
        L12:
            r7 = r24
        L14:
            r1 = r0 & 16
            r4 = 0
            if (r1 == 0) goto L1b
            r8 = r4
            goto L1d
        L1b:
            r8 = r25
        L1d:
            r1 = r0 & 32
            if (r1 == 0) goto L24
            r1 = 2
            r9 = r1
            goto L26
        L24:
            r9 = r26
        L26:
            r1 = r0 & 64
            if (r1 == 0) goto L2e
            r1 = 1065353216(0x3f800000, float:1.0)
            r10 = r1
            goto L30
        L2e:
            r10 = r27
        L30:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L36
            r11 = r2
            goto L38
        L36:
            r11 = r28
        L38:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L3f
            r1 = 1
            r12 = r1
            goto L41
        L3f:
            r12 = r29
        L41:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L4a
            r1 = 2147483647(0x7fffffff, float:NaN)
            r13 = r1
            goto L4c
        L4a:
            r13 = r30
        L4c:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L52
            r14 = r3
            goto L54
        L52:
            r14 = r31
        L54:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L5a
            r15 = r3
            goto L5c
        L5a:
            r15 = r32
        L5c:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L63
            r16 = r3
            goto L65
        L63:
            r16 = r33
        L65:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L6c
            r17 = r4
            goto L6e
        L6c:
            r17 = r34
        L6e:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L75
            r18 = r4
            goto L77
        L75:
            r18 = r35
        L77:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L89
            o2.d r0 = new o2.d
            r1 = r21
            r2 = r23
            r0.<init>(r1, r2, r9)
            r19 = r0
            goto L8f
        L89:
            r1 = r21
            r2 = r23
            r19 = r36
        L8f:
            r3 = r20
            r4 = r21
            r6 = r23
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.p.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, int, int, int, int, int[], int[], o2.d, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
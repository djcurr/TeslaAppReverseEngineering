package com.facebook.react.views.text;

import android.content.Context;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.LruCache;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.s;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class d0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12622a = "d0";

    /* renamed from: b  reason: collision with root package name */
    private static final TextPaint f12623b = new TextPaint(1);

    /* renamed from: c  reason: collision with root package name */
    private static final Object f12624c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final LruCache<ReadableMapBuffer, Spannable> f12625d = new LruCache<>(100);

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentHashMap<Integer, Spannable> f12626e = new ConcurrentHashMap<>();

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        protected int f12627a;

        /* renamed from: b  reason: collision with root package name */
        protected int f12628b;

        /* renamed from: c  reason: collision with root package name */
        protected m f12629c;

        public a(int i11, int i12, m mVar) {
            this.f12627a = i11;
            this.f12628b = i12;
            this.f12629c = mVar;
        }

        public void a(Spannable spannable, int i11) {
            int i12 = this.f12627a;
            spannable.setSpan(this.f12629c, i12, this.f12628b, ((i11 << 16) & 16711680) | ((i12 == 0 ? 18 : 34) & (-16711681)));
        }
    }

    private static void a(Context context, ReadableMapBuffer readableMapBuffer, SpannableStringBuilder spannableStringBuilder, List<a> list) {
        int count = readableMapBuffer.getCount();
        for (int i11 = 0; i11 < count; i11++) {
            ReadableMapBuffer m11 = readableMapBuffer.m(i11);
            int length = spannableStringBuilder.length();
            y b11 = y.b(m11.m(5));
            spannableStringBuilder.append((CharSequence) e0.apply(m11.o(0), b11.f12696k));
            int length2 = spannableStringBuilder.length();
            int i12 = m11.q(1) ? m11.getInt(1) : -1;
            if (m11.q(2) && m11.getBoolean(2)) {
                list.add(new a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new b0(i12, (int) com.facebook.react.uimanager.p.d(m11.getDouble(3)), (int) com.facebook.react.uimanager.p.d(m11.getDouble(4)))));
            } else if (length2 >= length) {
                if (s.d.LINK.equals(b11.f12703r)) {
                    list.add(new a(length, length2, new i(i12, b11.f12689d)));
                } else if (b11.f12687b) {
                    list.add(new a(length, length2, new k(b11.f12689d)));
                }
                if (b11.f12690e) {
                    list.add(new a(length, length2, new g(b11.f12691f)));
                }
                if (!Float.isNaN(b11.k())) {
                    list.add(new a(length, length2, new com.facebook.react.views.text.a(b11.k())));
                }
                list.add(new a(length, length2, new f(b11.f12692g)));
                if (b11.f12704s != -1 || b11.f12705t != -1 || b11.f12706u != null) {
                    list.add(new a(length, length2, new c(b11.f12704s, b11.f12705t, b11.f12707v, b11.f12706u, context.getAssets())));
                }
                if (b11.f12701p) {
                    list.add(new a(length, length2, new v()));
                }
                if (b11.f12702q) {
                    list.add(new a(length, length2, new n()));
                }
                if (b11.f12697l != BitmapDescriptorFactory.HUE_RED || b11.f12698m != BitmapDescriptorFactory.HUE_RED) {
                    list.add(new a(length, length2, new x(b11.f12697l, b11.f12698m, b11.f12699n, b11.f12700o)));
                }
                if (!Float.isNaN(b11.e())) {
                    list.add(new a(length, length2, new b(b11.e())));
                }
                list.add(new a(length, length2, new o(i12)));
            }
        }
    }

    private static Layout b(Spannable spannable, BoringLayout.Metrics metrics, float f11, com.facebook.yoga.n nVar, boolean z11, int i11, int i12) {
        int i13;
        int length = spannable.length();
        boolean z12 = nVar == com.facebook.yoga.n.UNDEFINED || f11 < BitmapDescriptorFactory.HUE_RED;
        TextPaint textPaint = f12623b;
        float desiredWidth = metrics == null ? Layout.getDesiredWidth(spannable, textPaint) : Float.NaN;
        if (metrics == null && (z12 || (!com.facebook.yoga.g.a(desiredWidth) && desiredWidth <= f11))) {
            int ceil = (int) Math.ceil(desiredWidth);
            if (Build.VERSION.SDK_INT < 23) {
                return new StaticLayout(spannable, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, BitmapDescriptorFactory.HUE_RED, z11);
            }
            return StaticLayout.Builder.obtain(spannable, 0, length, textPaint, ceil).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(BitmapDescriptorFactory.HUE_RED, 1.0f).setIncludePad(z11).setBreakStrategy(i11).setHyphenationFrequency(i12).build();
        } else if (metrics != null && (z12 || metrics.width <= f11)) {
            int i14 = metrics.width;
            if (i14 < 0) {
                String str = f12622a;
                ReactSoftExceptionLogger.logSoftException(str, new ReactNoCrashSoftException("Text width is invalid: " + metrics.width));
                i13 = 0;
            } else {
                i13 = i14;
            }
            return BoringLayout.make(spannable, textPaint, i13, Layout.Alignment.ALIGN_NORMAL, 1.0f, BitmapDescriptorFactory.HUE_RED, metrics, z11);
        } else {
            int i15 = Build.VERSION.SDK_INT;
            if (i15 < 23) {
                return new StaticLayout(spannable, textPaint, (int) f11, Layout.Alignment.ALIGN_NORMAL, 1.0f, BitmapDescriptorFactory.HUE_RED, z11);
            }
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannable, 0, length, textPaint, (int) f11).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(BitmapDescriptorFactory.HUE_RED, 1.0f).setIncludePad(z11).setBreakStrategy(i11).setHyphenationFrequency(i12);
            if (i15 >= 28) {
                hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
            }
            return hyphenationFrequency.build();
        }
    }

    private static Spannable c(Context context, ReadableMapBuffer readableMapBuffer, t tVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<a> arrayList = new ArrayList();
        a(context, readableMapBuffer.m(2), spannableStringBuilder, arrayList);
        int i11 = 0;
        for (a aVar : arrayList) {
            aVar.a(spannableStringBuilder, i11);
            i11++;
        }
        if (tVar != null) {
            tVar.a(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    public static Spannable d(Context context, ReadableMapBuffer readableMapBuffer, t tVar) {
        Object obj = f12624c;
        synchronized (obj) {
            LruCache<ReadableMapBuffer, Spannable> lruCache = f12625d;
            Spannable spannable = lruCache.get(readableMapBuffer);
            if (spannable != null) {
                return spannable;
            }
            Spannable c11 = c(context, readableMapBuffer, tVar);
            synchronized (obj) {
                lruCache.put(readableMapBuffer, c11);
            }
            return c11;
        }
    }

    public static boolean e(ReadableMapBuffer readableMapBuffer) {
        ReadableMapBuffer m11 = readableMapBuffer.m(2);
        return m11.getCount() != 0 && y.j(m11.m(0).m(5).o(21)) == 1;
    }

    public static WritableArray f(Context context, ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, float f11) {
        TextPaint textPaint = f12623b;
        Spannable d11 = d(context, readableMapBuffer, null);
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(d11, textPaint);
        int n11 = y.n(readableMapBuffer2.o(2));
        return e.a(d11, b(d11, isBoring, f11, com.facebook.yoga.n.EXACTLY, readableMapBuffer2.q(4) ? readableMapBuffer2.getBoolean(4) : true, n11, y.n(readableMapBuffer2.o(5))), textPaint, context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
        if (r12 > r21) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c1, code lost:
        if (r1 > r23) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long g(android.content.Context r18, com.facebook.react.common.mapbuffer.ReadableMapBuffer r19, com.facebook.react.common.mapbuffer.ReadableMapBuffer r20, float r21, com.facebook.yoga.n r22, float r23, com.facebook.yoga.n r24, com.facebook.react.views.text.t r25, float[] r26) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.d0.g(android.content.Context, com.facebook.react.common.mapbuffer.ReadableMapBuffer, com.facebook.react.common.mapbuffer.ReadableMapBuffer, float, com.facebook.yoga.n, float, com.facebook.yoga.n, com.facebook.react.views.text.t, float[]):long");
    }
}
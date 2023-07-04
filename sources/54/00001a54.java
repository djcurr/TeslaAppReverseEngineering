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
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.uimanager.s;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12614a = "c0";

    /* renamed from: b  reason: collision with root package name */
    private static final TextPaint f12615b = new TextPaint(1);

    /* renamed from: c  reason: collision with root package name */
    private static final Object f12616c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final LruCache<ReadableNativeMap, Spannable> f12617d = new LruCache<>(100);

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentHashMap<Integer, Spannable> f12618e = new ConcurrentHashMap<>();

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        protected int f12619a;

        /* renamed from: b  reason: collision with root package name */
        protected int f12620b;

        /* renamed from: c  reason: collision with root package name */
        protected m f12621c;

        public a(int i11, int i12, m mVar) {
            this.f12619a = i11;
            this.f12620b = i12;
            this.f12621c = mVar;
        }

        public void a(Spannable spannable, int i11) {
            int i12 = this.f12619a;
            spannable.setSpan(this.f12621c, i12, this.f12620b, ((i11 << 16) & 16711680) | ((i12 == 0 ? 18 : 34) & (-16711681)));
        }
    }

    private static void a(Context context, ReadableArray readableArray, SpannableStringBuilder spannableStringBuilder, List<a> list) {
        int i11;
        int i12 = 0;
        for (int size = readableArray.size(); i12 < size; size = i11) {
            ReadableMap map = readableArray.getMap(i12);
            int length = spannableStringBuilder.length();
            y a11 = y.a(new com.facebook.react.uimanager.e0(map.getMap("textAttributes")));
            spannableStringBuilder.append((CharSequence) e0.apply(map.getString("string"), a11.f12696k));
            int length2 = spannableStringBuilder.length();
            int i13 = map.hasKey("reactTag") ? map.getInt("reactTag") : -1;
            if (map.hasKey("isAttachment") && map.getBoolean("isAttachment")) {
                list.add(new a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new b0(i13, (int) com.facebook.react.uimanager.p.d(map.getDouble(Snapshot.WIDTH)), (int) com.facebook.react.uimanager.p.d(map.getDouble(Snapshot.HEIGHT)))));
            } else if (length2 >= length) {
                if (s.d.LINK.equals(a11.f12703r)) {
                    list.add(new a(length, length2, new i(i13, a11.f12689d)));
                } else if (a11.f12687b) {
                    list.add(new a(length, length2, new k(a11.f12689d)));
                }
                if (a11.f12690e) {
                    list.add(new a(length, length2, new g(a11.f12691f)));
                }
                if (!Float.isNaN(a11.k())) {
                    list.add(new a(length, length2, new com.facebook.react.views.text.a(a11.k())));
                }
                list.add(new a(length, length2, new f(a11.f12692g)));
                if (a11.f12704s == -1 && a11.f12705t == -1 && a11.f12706u == null) {
                    i11 = size;
                } else {
                    i11 = size;
                    list.add(new a(length, length2, new c(a11.f12704s, a11.f12705t, a11.f12707v, a11.f12706u, context.getAssets())));
                }
                if (a11.f12701p) {
                    list.add(new a(length, length2, new v()));
                }
                if (a11.f12702q) {
                    list.add(new a(length, length2, new n()));
                }
                if (a11.f12697l != BitmapDescriptorFactory.HUE_RED || a11.f12698m != BitmapDescriptorFactory.HUE_RED) {
                    list.add(new a(length, length2, new x(a11.f12697l, a11.f12698m, a11.f12699n, a11.f12700o)));
                }
                if (!Float.isNaN(a11.e())) {
                    list.add(new a(length, length2, new b(a11.e())));
                }
                list.add(new a(length, length2, new o(i13)));
                i12++;
            }
            i11 = size;
            i12++;
        }
    }

    private static Layout b(Spannable spannable, BoringLayout.Metrics metrics, float f11, com.facebook.yoga.n nVar, boolean z11, int i11, int i12) {
        int i13;
        int length = spannable.length();
        boolean z12 = nVar == com.facebook.yoga.n.UNDEFINED || f11 < BitmapDescriptorFactory.HUE_RED;
        TextPaint textPaint = f12615b;
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
                String str = f12614a;
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

    private static Spannable c(Context context, ReadableMap readableMap, t tVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<a> arrayList = new ArrayList();
        a(context, readableMap.getArray("fragments"), spannableStringBuilder, arrayList);
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

    public static void d(int i11) {
        f12618e.remove(Integer.valueOf(i11));
    }

    public static Spannable e(Context context, ReadableMap readableMap, t tVar) {
        Object obj = f12616c;
        synchronized (obj) {
            LruCache<ReadableNativeMap, Spannable> lruCache = f12617d;
            Spannable spannable = lruCache.get((ReadableNativeMap) readableMap);
            if (spannable != null) {
                return spannable;
            }
            Spannable c11 = c(context, readableMap, tVar);
            synchronized (obj) {
                lruCache.put((ReadableNativeMap) readableMap, c11);
            }
            return c11;
        }
    }

    public static boolean f(ReadableMap readableMap) {
        ReadableArray array = readableMap.getArray("fragments");
        return array.size() > 0 && y.j(array.getMap(0).getMap("textAttributes").getString("layoutDirection")) == 1;
    }

    public static WritableArray g(Context context, ReadableMap readableMap, ReadableMap readableMap2, float f11) {
        TextPaint textPaint = f12615b;
        Spannable e11 = e(context, readableMap, null);
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(e11, textPaint);
        int n11 = y.n(readableMap2.getString("textBreakStrategy"));
        return e.a(e11, b(e11, isBoring, f11, com.facebook.yoga.n.EXACTLY, readableMap2.hasKey("includeFontPadding") ? readableMap2.getBoolean("includeFontPadding") : true, n11, y.n(readableMap2.getString("android_hyphenationFrequency"))), textPaint, context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
        if (r3 > r21) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bb, code lost:
        if (r1 > r23) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0151, code lost:
        if (r6 != false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long h(android.content.Context r18, com.facebook.react.bridge.ReadableMap r19, com.facebook.react.bridge.ReadableMap r20, float r21, com.facebook.yoga.n r22, float r23, com.facebook.yoga.n r24, com.facebook.react.views.text.t r25, float[] r26) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.c0.h(android.content.Context, com.facebook.react.bridge.ReadableMap, com.facebook.react.bridge.ReadableMap, float, com.facebook.yoga.n, float, com.facebook.yoga.n, com.facebook.react.views.text.t, float[]):long");
    }

    public static void i(int i11, Spannable spannable) {
        f12618e.put(Integer.valueOf(i11), spannable);
    }
}
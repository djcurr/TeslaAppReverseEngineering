package o2;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m implements l {

    /* renamed from: a  reason: collision with root package name */
    public static final a f42154a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static boolean f42155b;

    /* renamed from: c  reason: collision with root package name */
    private static Constructor<StaticLayout> f42156c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Constructor<StaticLayout> b() {
            if (m.f42155b) {
                return m.f42156c;
            }
            m.f42155b = true;
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                m.f42156c = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            } catch (NoSuchMethodException unused) {
                m.f42156c = null;
                Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
            }
            return m.f42156c;
        }
    }

    @Override // o2.l
    public StaticLayout a(n params) {
        s.g(params, "params");
        Constructor b11 = f42154a.b();
        StaticLayout staticLayout = null;
        if (b11 != null) {
            try {
                staticLayout = (StaticLayout) b11.newInstance(params.p(), Integer.valueOf(params.o()), Integer.valueOf(params.e()), params.m(), Integer.valueOf(params.s()), params.a(), params.q(), Float.valueOf(params.k()), Float.valueOf(params.j()), Boolean.valueOf(params.g()), params.c(), Integer.valueOf(params.d()), Integer.valueOf(params.l()));
            } catch (IllegalAccessException unused) {
                f42156c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InstantiationException unused2) {
                f42156c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InvocationTargetException unused3) {
                f42156c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            }
        }
        return staticLayout != null ? staticLayout : new StaticLayout(params.p(), params.o(), params.e(), params.m(), params.s(), params.a(), params.k(), params.j(), params.g(), params.c(), params.d());
    }
}
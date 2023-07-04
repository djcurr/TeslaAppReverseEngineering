package androidx.room;

import android.content.Context;
import android.content.Intent;
import androidx.room.t0;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import v4.h;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    public final h.c f5805a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f5806b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5807c;

    /* renamed from: d  reason: collision with root package name */
    public final t0.d f5808d;

    /* renamed from: e  reason: collision with root package name */
    public final List<t0.b> f5809e;

    /* renamed from: f  reason: collision with root package name */
    public final t0.e f5810f;

    /* renamed from: g  reason: collision with root package name */
    public final List<Object> f5811g;

    /* renamed from: h  reason: collision with root package name */
    public final List<t4.a> f5812h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f5813i;

    /* renamed from: j  reason: collision with root package name */
    public final t0.c f5814j;

    /* renamed from: k  reason: collision with root package name */
    public final Executor f5815k;

    /* renamed from: l  reason: collision with root package name */
    public final Executor f5816l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f5817m;

    /* renamed from: n  reason: collision with root package name */
    public final Intent f5818n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f5819o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f5820p;

    /* renamed from: q  reason: collision with root package name */
    private final Set<Integer> f5821q;

    /* renamed from: r  reason: collision with root package name */
    public final Callable<InputStream> f5822r;

    public p(Context context, String str, h.c cVar, t0.d dVar, List<t0.b> list, boolean z11, t0.c cVar2, Executor executor, Executor executor2, Intent intent, boolean z12, boolean z13, Set<Integer> set, String str2, File file, Callable<InputStream> callable, t0.e eVar, List<Object> list2, List<t4.a> list3) {
        this.f5805a = cVar;
        this.f5806b = context;
        this.f5807c = str;
        this.f5808d = dVar;
        this.f5809e = list;
        this.f5813i = z11;
        this.f5814j = cVar2;
        this.f5815k = executor;
        this.f5816l = executor2;
        this.f5818n = intent;
        this.f5817m = intent != null;
        this.f5819o = z12;
        this.f5820p = z13;
        this.f5821q = set;
        this.f5822r = callable;
        this.f5811g = list2 == null ? Collections.emptyList() : list2;
        this.f5812h = list3 == null ? Collections.emptyList() : list3;
    }

    public boolean a(int i11, int i12) {
        Set<Integer> set;
        if ((i11 > i12) && this.f5820p) {
            return false;
        }
        return this.f5819o && ((set = this.f5821q) == null || !set.contains(Integer.valueOf(i11)));
    }
}
package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a  reason: collision with root package name */
    private UUID f6470a;

    /* renamed from: b  reason: collision with root package name */
    private e f6471b;

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f6472c;

    /* renamed from: d  reason: collision with root package name */
    private a f6473d;

    /* renamed from: e  reason: collision with root package name */
    private int f6474e;

    /* renamed from: f  reason: collision with root package name */
    private Executor f6475f;

    /* renamed from: g  reason: collision with root package name */
    private m5.a f6476g;

    /* renamed from: h  reason: collision with root package name */
    private d0 f6477h;

    /* renamed from: i  reason: collision with root package name */
    private w f6478i;

    /* renamed from: j  reason: collision with root package name */
    private j f6479j;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<String> f6480a = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public List<Uri> f6481b = Collections.emptyList();

        /* renamed from: c  reason: collision with root package name */
        public Network f6482c;
    }

    public WorkerParameters(UUID uuid, e eVar, Collection<String> collection, a aVar, int i11, Executor executor, m5.a aVar2, d0 d0Var, w wVar, j jVar) {
        this.f6470a = uuid;
        this.f6471b = eVar;
        this.f6472c = new HashSet(collection);
        this.f6473d = aVar;
        this.f6474e = i11;
        this.f6475f = executor;
        this.f6476g = aVar2;
        this.f6477h = d0Var;
        this.f6478i = wVar;
        this.f6479j = jVar;
    }

    public Executor a() {
        return this.f6475f;
    }

    public j b() {
        return this.f6479j;
    }

    public UUID c() {
        return this.f6470a;
    }

    public e d() {
        return this.f6471b;
    }

    public Network e() {
        return this.f6473d.f6482c;
    }

    public w f() {
        return this.f6478i;
    }

    public int g() {
        return this.f6474e;
    }

    public Set<String> h() {
        return this.f6472c;
    }

    public m5.a i() {
        return this.f6476g;
    }

    public List<String> j() {
        return this.f6473d.f6480a;
    }

    public List<Uri> k() {
        return this.f6473d.f6481b;
    }

    public d0 l() {
        return this.f6477h;
    }
}
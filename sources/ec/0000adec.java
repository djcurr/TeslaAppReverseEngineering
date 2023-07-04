package qf;

import android.os.Build;
import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private final s f48130a;

    /* renamed from: b  reason: collision with root package name */
    private com.facebook.imagepipeline.memory.g f48131b;

    /* renamed from: c  reason: collision with root package name */
    private c f48132c;

    /* renamed from: d  reason: collision with root package name */
    private com.facebook.imagepipeline.memory.g f48133d;

    /* renamed from: e  reason: collision with root package name */
    private com.facebook.imagepipeline.memory.e f48134e;

    /* renamed from: f  reason: collision with root package name */
    private com.facebook.imagepipeline.memory.g f48135f;

    /* renamed from: g  reason: collision with root package name */
    private pd.g f48136g;

    /* renamed from: h  reason: collision with root package name */
    private pd.j f48137h;

    /* renamed from: i  reason: collision with root package name */
    private pd.a f48138i;

    public t(s sVar) {
        this.f48130a = (s) md.k.g(sVar);
    }

    private com.facebook.imagepipeline.memory.g a() {
        if (this.f48131b == null) {
            try {
                this.f48131b = (com.facebook.imagepipeline.memory.g) AshmemMemoryChunkPool.class.getConstructor(pd.c.class, u.class, v.class).newInstance(this.f48130a.i(), this.f48130a.g(), this.f48130a.h());
            } catch (ClassNotFoundException unused) {
                this.f48131b = null;
            } catch (IllegalAccessException unused2) {
                this.f48131b = null;
            } catch (InstantiationException unused3) {
                this.f48131b = null;
            } catch (NoSuchMethodException unused4) {
                this.f48131b = null;
            } catch (InvocationTargetException unused5) {
                this.f48131b = null;
            }
        }
        return this.f48131b;
    }

    private com.facebook.imagepipeline.memory.g f(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return a();
                }
                throw new IllegalArgumentException("Invalid MemoryChunkType");
            }
            return c();
        }
        return g();
    }

    public c b() {
        if (this.f48132c == null) {
            String e11 = this.f48130a.e();
            char c11 = 65535;
            switch (e11.hashCode()) {
                case -1868884870:
                    if (e11.equals("legacy_default_params")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case -1106578487:
                    if (e11.equals("legacy")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case -404562712:
                    if (e11.equals("experimental")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case -402149703:
                    if (e11.equals("dummy_with_tracking")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 95945896:
                    if (e11.equals("dummy")) {
                        c11 = 0;
                        break;
                    }
                    break;
            }
            if (c11 == 0) {
                this.f48132c = new j();
            } else if (c11 == 1) {
                this.f48132c = new k();
            } else if (c11 == 2) {
                this.f48132c = new l(this.f48130a.b(), this.f48130a.a(), q.h(), this.f48130a.m() ? this.f48130a.i() : null);
            } else if (c11 != 3) {
                if (Build.VERSION.SDK_INT >= 21) {
                    this.f48132c = new com.facebook.imagepipeline.memory.c(this.f48130a.i(), this.f48130a.c(), this.f48130a.d(), this.f48130a.l());
                } else {
                    this.f48132c = new j();
                }
            } else {
                this.f48132c = new com.facebook.imagepipeline.memory.c(this.f48130a.i(), f.a(), this.f48130a.d(), this.f48130a.l());
            }
        }
        return this.f48132c;
    }

    public com.facebook.imagepipeline.memory.g c() {
        if (this.f48133d == null) {
            try {
                this.f48133d = (com.facebook.imagepipeline.memory.g) BufferMemoryChunkPool.class.getConstructor(pd.c.class, u.class, v.class).newInstance(this.f48130a.i(), this.f48130a.g(), this.f48130a.h());
            } catch (ClassNotFoundException unused) {
                this.f48133d = null;
            } catch (IllegalAccessException unused2) {
                this.f48133d = null;
            } catch (InstantiationException unused3) {
                this.f48133d = null;
            } catch (NoSuchMethodException unused4) {
                this.f48133d = null;
            } catch (InvocationTargetException unused5) {
                this.f48133d = null;
            }
        }
        return this.f48133d;
    }

    public com.facebook.imagepipeline.memory.e d() {
        if (this.f48134e == null) {
            this.f48134e = new com.facebook.imagepipeline.memory.e(this.f48130a.i(), this.f48130a.f());
        }
        return this.f48134e;
    }

    public int e() {
        return this.f48130a.f().f48143e;
    }

    public com.facebook.imagepipeline.memory.g g() {
        if (this.f48135f == null) {
            try {
                this.f48135f = (com.facebook.imagepipeline.memory.g) NativeMemoryChunkPool.class.getConstructor(pd.c.class, u.class, v.class).newInstance(this.f48130a.i(), this.f48130a.g(), this.f48130a.h());
            } catch (ClassNotFoundException e11) {
                nd.a.k("PoolFactory", "", e11);
                this.f48135f = null;
            } catch (IllegalAccessException e12) {
                nd.a.k("PoolFactory", "", e12);
                this.f48135f = null;
            } catch (InstantiationException e13) {
                nd.a.k("PoolFactory", "", e13);
                this.f48135f = null;
            } catch (NoSuchMethodException e14) {
                nd.a.k("PoolFactory", "", e14);
                this.f48135f = null;
            } catch (InvocationTargetException e15) {
                nd.a.k("PoolFactory", "", e15);
                this.f48135f = null;
            }
        }
        return this.f48135f;
    }

    public pd.g h() {
        return i(!jf.m.a() ? 1 : 0);
    }

    public pd.g i(int i11) {
        if (this.f48136g == null) {
            com.facebook.imagepipeline.memory.g f11 = f(i11);
            md.k.h(f11, "failed to get pool for chunk type: " + i11);
            this.f48136g = new p(f11, j());
        }
        return this.f48136g;
    }

    public pd.j j() {
        if (this.f48137h == null) {
            this.f48137h = new pd.j(k());
        }
        return this.f48137h;
    }

    public pd.a k() {
        if (this.f48138i == null) {
            this.f48138i = new com.facebook.imagepipeline.memory.f(this.f48130a.i(), this.f48130a.j(), this.f48130a.k());
        }
        return this.f48138i;
    }
}
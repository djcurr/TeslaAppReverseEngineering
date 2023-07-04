package ll;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import hl.g;
import hl.i;
import hl.j;
import hl.k;
import hl.l;
import java.io.FileNotFoundException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.ProviderException;
import ll.c;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    private static final String f37212c = "a";

    /* renamed from: a  reason: collision with root package name */
    private final hl.a f37213a;

    /* renamed from: b  reason: collision with root package name */
    private j f37214b;

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private k f37215a = null;

        /* renamed from: b  reason: collision with root package name */
        private l f37216b = null;

        /* renamed from: c  reason: collision with root package name */
        private String f37217c = null;

        /* renamed from: d  reason: collision with root package name */
        private hl.a f37218d = null;

        /* renamed from: e  reason: collision with root package name */
        private boolean f37219e = true;

        /* renamed from: f  reason: collision with root package name */
        private g f37220f = null;

        /* renamed from: g  reason: collision with root package name */
        private KeyStore f37221g = null;

        /* renamed from: h  reason: collision with root package name */
        private j f37222h;

        private j e() {
            hl.a aVar = this.f37218d;
            if (aVar != null) {
                try {
                    return j.j(i.j(this.f37215a, aVar));
                } catch (InvalidProtocolBufferException | GeneralSecurityException e11) {
                    Log.w(a.f37212c, "cannot decrypt keyset: ", e11);
                }
            }
            return j.j(hl.b.a(this.f37215a));
        }

        private j f() {
            try {
                return e();
            } catch (FileNotFoundException e11) {
                Log.w(a.f37212c, "keyset not found, will generate a new one", e11);
                if (this.f37220f != null) {
                    j a11 = j.i().a(this.f37220f);
                    j h11 = a11.h(a11.c().g().H(0).H());
                    if (this.f37218d != null) {
                        h11.c().k(this.f37216b, this.f37218d);
                    } else {
                        hl.b.b(h11.c(), this.f37216b);
                    }
                    return h11;
                }
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
        }

        private hl.a g() {
            c cVar;
            if (!a.a()) {
                Log.w(a.f37212c, "Android Keystore requires at least Android M");
                return null;
            }
            if (this.f37221g != null) {
                cVar = new c.b().b(this.f37221g).a();
            } else {
                cVar = new c();
            }
            boolean e11 = cVar.e(this.f37217c);
            if (!e11) {
                try {
                    c.d(this.f37217c);
                } catch (GeneralSecurityException | ProviderException e12) {
                    Log.w(a.f37212c, "cannot use Android Keystore, it'll be disabled", e12);
                    return null;
                }
            }
            try {
                return cVar.b(this.f37217c);
            } catch (GeneralSecurityException | ProviderException e13) {
                if (!e11) {
                    Log.w(a.f37212c, "cannot use Android Keystore, it'll be disabled", e13);
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f37217c), e13);
            }
        }

        public synchronized a d() {
            if (this.f37217c != null) {
                this.f37218d = g();
            }
            this.f37222h = f();
            return new a(this);
        }

        public b h(g gVar) {
            this.f37220f = gVar;
            return this;
        }

        public b i(String str) {
            if (str.startsWith("android-keystore://")) {
                if (this.f37219e) {
                    this.f37217c = str;
                    return this;
                }
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }

        public b j(Context context, String str, String str2) {
            if (context != null) {
                if (str != null) {
                    this.f37215a = new d(context, str, str2);
                    this.f37216b = new e(context, str, str2);
                    return this;
                }
                throw new IllegalArgumentException("need a keyset name");
            }
            throw new IllegalArgumentException("need an Android context");
        }
    }

    static /* synthetic */ boolean a() {
        return d();
    }

    private static boolean d() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public synchronized i c() {
        return this.f37214b.c();
    }

    private a(b bVar) {
        l unused = bVar.f37216b;
        this.f37213a = bVar.f37218d;
        this.f37214b = bVar.f37222h;
    }
}
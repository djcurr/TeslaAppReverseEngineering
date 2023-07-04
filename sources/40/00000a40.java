package atd.b;

import android.text.TextUtils;
import atd.a.e;
import atd.a.i;
import atd.d.i;
import atd.d.j;
import atd.e.c;
import atd.e.d;
import atd.f0.h;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a extends atd.a.a {

    /* renamed from: f  reason: collision with root package name */
    private static final int f6769f;

    /* renamed from: g  reason: collision with root package name */
    private static final int f6770g;

    /* renamed from: h  reason: collision with root package name */
    private static final Charset f6771h;

    /* renamed from: d  reason: collision with root package name */
    private final String f6772d;

    /* renamed from: e  reason: collision with root package name */
    private final atd.f0.a f6773e;

    /* renamed from: atd.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class CallableC0122a implements Callable<j> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f6774a;

        CallableC0122a(i iVar) {
            this.f6774a = iVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public j call() {
            return a.this.a(a.this.b(this.f6774a), this.f6774a);
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f6769f = (int) timeUnit.toMillis(10L);
        f6770g = (int) timeUnit.toMillis(10L);
        f6771h = com.adyen.threeds2.internal.b.f9630a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, atd.f0.a aVar) {
        this.f6772d = str;
        this.f6773e = aVar;
    }

    @Override // atd.a.a
    protected int b() {
        return f6770g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Callable<j> c(i iVar) {
        return new CallableC0122a(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j b(i iVar) {
        try {
            try {
                return a(a(a(iVar)));
            } catch (SocketTimeoutException e11) {
                throw new atd.a0.a(atd.s0.a.a(-101162323601984L), e11, c.TRANSACTION_TIMED_OUT);
            } catch (IOException e12) {
                throw new atd.a0.a(atd.s0.a.a(-101291172620864L), e12, c.SYSTEM_CONNECTION_FAILURE);
            }
        } catch (GeneralSecurityException | JSONException e13) {
            throw new RuntimeException(e13);
        }
    }

    @Override // atd.a.a
    protected int a() {
        return f6769f;
    }

    private atd.a.i a(i iVar) {
        i.a a11 = new i.a().a(this.f6772d);
        if (iVar.i()) {
            a11.a(atd.f.a.a()).a(a(a((atd.f.b) iVar)));
        } else {
            a11.a(atd.f.a.b()).a(a((atd.f.b) iVar));
        }
        return a11.a();
    }

    private JSONObject b(byte[] bArr, Charset charset) {
        if (charset == null) {
            charset = f6771h;
        }
        return new JSONObject(new String(bArr, charset));
    }

    private byte[] a(byte[] bArr) {
        return this.f6773e.a(bArr).e().getBytes(f6771h);
    }

    private byte[] a(atd.f.b bVar) {
        return bVar.a().toString().getBytes(f6771h);
    }

    private j a(atd.a.j jVar) {
        byte[] a11 = jVar.a();
        if (a11 == null || a11.length <= 0) {
            return null;
        }
        e.b a12 = e.a(jVar.b());
        e.a b11 = a12 != null ? a12.b() : null;
        Charset a13 = a12 != null ? a12.a() : null;
        boolean z11 = b11 == e.a.APPLICATION_JOSE;
        if (z11) {
            try {
                a11 = a(a11, a13);
            } catch (GeneralSecurityException e11) {
                throw new atd.a0.a(atd.s0.a.a(-101673424710208L), e11, c.DATA_DECRYPTION_FAILURE);
            }
        }
        if (!z11 && b11 != e.a.APPLICATION_JSON) {
            throw new atd.a0.a(atd.s0.a.a(-100810136283712L), c.MESSAGE_RECEIVED_INVALID);
        }
        try {
            j a14 = j.a(b(a11, a13));
            if (z11 || !a14.f()) {
                return a14;
            }
            throw new atd.a0.a(atd.s0.a.a(-100719941970496L), c.MESSAGE_RECEIVED_INVALID);
        } catch (JSONException e12) {
            throw new atd.a0.a(atd.s0.a.a(-101557460593216L), e12, c.MESSAGE_RECEIVED_INVALID);
        }
    }

    private byte[] a(byte[] bArr, Charset charset) {
        if (charset == null) {
            charset = f6771h;
        }
        return this.f6773e.a(h.a(new String(bArr, charset)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j a(j jVar, atd.d.i iVar) {
        if (jVar == null && !d.ERROR.equals(iVar.c())) {
            throw new atd.a0.a(atd.s0.a.a(-100934690335296L), c.MESSAGE_RECEIVED_INVALID);
        }
        if (jVar != null && !d.ERROR.equals(jVar.b())) {
            if (iVar.d().equals(jVar.c())) {
                if (iVar.h().equalsIgnoreCase(jVar.e())) {
                    if (iVar.b().equalsIgnoreCase(jVar.a())) {
                        if (iVar.f().equalsIgnoreCase(jVar.d())) {
                            if ((jVar instanceof atd.d.c) && iVar.e() != ((atd.d.c) jVar).g()) {
                                throw new atd.a0.a(atd.s0.a.a(-99551710865984L), c.DATA_DECRYPTION_FAILURE);
                            }
                        } else {
                            throw new atd.a0.a(atd.s0.a.a(-99663380015680L), c.TRANSACTION_ID_NOT_RECOGNIZED);
                        }
                    } else {
                        throw new atd.a0.a(atd.s0.a.a(-100359164717632L), c.TRANSACTION_ID_NOT_RECOGNIZED);
                    }
                } else {
                    throw new atd.a0.a(atd.s0.a.a(-100483718769216L), c.TRANSACTION_ID_NOT_RECOGNIZED);
                }
            } else {
                throw new atd.a0.a(String.format(atd.s0.a.a(-100251790535232L), jVar.c(), TextUtils.join(atd.s0.a.a(-100260380469824L), com.adyen.threeds2.internal.d.a())), c.MESSAGE_VERSION_NOT_SUPPORTED);
            }
        }
        return jVar;
    }
}
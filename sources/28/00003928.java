package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.iid.InstanceID;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import org.slf4j.Marker;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import qm.k;

/* loaded from: classes2.dex */
public class d0 {

    /* renamed from: a */
    private final com.google.firebase.d f16780a;

    /* renamed from: b */
    private final i0 f16781b;

    /* renamed from: c */
    private final Rpc f16782c;

    /* renamed from: d */
    private final sm.b<ln.i> f16783d;

    /* renamed from: e */
    private final sm.b<qm.k> f16784e;

    /* renamed from: f */
    private final tm.e f16785f;

    public d0(com.google.firebase.d dVar, i0 i0Var, sm.b<ln.i> bVar, sm.b<qm.k> bVar2, tm.e eVar) {
        this(dVar, i0Var, new Rpc(dVar.j()), bVar, bVar2, eVar);
    }

    public static /* synthetic */ String a(d0 d0Var, Task task) {
        return d0Var.i(task);
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private Task<String> d(Task<Bundle> task) {
        return task.continueWith(h.f16804a, new Continuation() { // from class: com.google.firebase.messaging.c0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return d0.a(d0.this, task2);
            }
        });
    }

    private String e() {
        try {
            return b(MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1).digest(this.f16780a.l().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String g(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            }
            if (string3 != null) {
                throw new IOException(string3);
            }
            Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
            throw new IOException(InstanceID.ERROR_SERVICE_NOT_AVAILABLE);
        }
        throw new IOException(InstanceID.ERROR_SERVICE_NOT_AVAILABLE);
    }

    public static boolean h(String str) {
        return InstanceID.ERROR_SERVICE_NOT_AVAILABLE.equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    public /* synthetic */ String i(Task task) {
        return g((Bundle) task.getResult(IOException.class));
    }

    private void j(String str, String str2, Bundle bundle) {
        k.a b11;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f16780a.m().c());
        bundle.putString("gmsv", Integer.toString(this.f16781b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f16781b.a());
        bundle.putString("app_ver_name", this.f16781b.b());
        bundle.putString("firebase-app-name-hash", e());
        try {
            String b12 = ((com.google.firebase.installations.f) Tasks.await(this.f16785f.a(false))).b();
            if (!TextUtils.isEmpty(b12)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b12);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e11) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e11);
        }
        bundle.putString("appid", (String) Tasks.await(this.f16785f.getId()));
        bundle.putString("cliv", "fcm-23.0.2");
        qm.k kVar = this.f16784e.get();
        ln.i iVar = this.f16783d.get();
        if (kVar == null || iVar == null || (b11 = kVar.b("fire-iid")) == k.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(b11.getCode()));
        bundle.putString("Firebase-Client", iVar.a());
    }

    private Task<Bundle> k(String str, String str2, Bundle bundle) {
        try {
            j(str, str2, bundle);
            return this.f16782c.send(bundle);
        } catch (InterruptedException | ExecutionException e11) {
            return Tasks.forException(e11);
        }
    }

    public Task<?> c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return d(k(i0.c(this.f16780a), Marker.ANY_MARKER, bundle));
    }

    public Task<String> f() {
        return d(k(i0.c(this.f16780a), Marker.ANY_MARKER, new Bundle()));
    }

    public Task<?> l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return d(k(str, "/topics/" + str2, bundle));
    }

    public Task<?> m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return d(k(str, "/topics/" + str2, bundle));
    }

    d0(com.google.firebase.d dVar, i0 i0Var, Rpc rpc, sm.b<ln.i> bVar, sm.b<qm.k> bVar2, tm.e eVar) {
        this.f16780a = dVar;
        this.f16781b = i0Var;
        this.f16782c = rpc;
        this.f16783d = bVar;
        this.f16784e = bVar2;
        this.f16785f = eVar;
    }
}
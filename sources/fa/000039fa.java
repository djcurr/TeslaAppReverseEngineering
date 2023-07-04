package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.AbtException;
import com.google.firebase.remoteconfig.internal.d;
import com.google.firebase.remoteconfig.internal.j;
import com.google.firebase.remoteconfig.internal.l;
import com.google.firebase.remoteconfig.internal.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import mn.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tm.e;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a */
    private final ql.b f17064a;

    /* renamed from: b */
    private final Executor f17065b;

    /* renamed from: c */
    private final d f17066c;

    /* renamed from: d */
    private final d f17067d;

    /* renamed from: e */
    private final d f17068e;

    /* renamed from: f */
    private final j f17069f;

    /* renamed from: g */
    private final l f17070g;

    /* renamed from: h */
    private final m f17071h;

    /* renamed from: i */
    private final e f17072i;

    public a(Context context, com.google.firebase.d dVar, e eVar, ql.b bVar, Executor executor, d dVar2, d dVar3, d dVar4, j jVar, l lVar, m mVar) {
        this.f17072i = eVar;
        this.f17064a = bVar;
        this.f17065b = executor;
        this.f17066c = dVar2;
        this.f17067d = dVar3;
        this.f17068e = dVar4;
        this.f17069f = jVar;
        this.f17070g = lVar;
        this.f17071h = mVar;
    }

    public static /* synthetic */ Task b(a aVar, Void r12) {
        return aVar.m(r12);
    }

    public static /* synthetic */ Task c(a aVar, Task task, Task task2, Task task3) {
        return aVar.k(task, task2, task3);
    }

    public static /* synthetic */ boolean d(a aVar, Task task) {
        return aVar.n(task);
    }

    private static boolean j(com.google.firebase.remoteconfig.internal.e eVar, com.google.firebase.remoteconfig.internal.e eVar2) {
        return eVar2 == null || !eVar.e().equals(eVar2.e());
    }

    public /* synthetic */ Task k(Task task, Task task2, Task task3) {
        if (task.isSuccessful() && task.getResult() != null) {
            com.google.firebase.remoteconfig.internal.e eVar = (com.google.firebase.remoteconfig.internal.e) task.getResult();
            if (task2.isSuccessful() && !j(eVar, (com.google.firebase.remoteconfig.internal.e) task2.getResult())) {
                return Tasks.forResult(Boolean.FALSE);
            }
            return this.f17067d.k(eVar).continueWith(this.f17065b, new Continuation() { // from class: mn.a
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task4) {
                    return Boolean.valueOf(com.google.firebase.remoteconfig.a.d(com.google.firebase.remoteconfig.a.this, task4));
                }
            });
        }
        return Tasks.forResult(Boolean.FALSE);
    }

    public static /* synthetic */ Task l(j.a aVar) {
        return Tasks.forResult(null);
    }

    public /* synthetic */ Task m(Void r12) {
        return e();
    }

    public boolean n(Task<com.google.firebase.remoteconfig.internal.e> task) {
        if (task.isSuccessful()) {
            this.f17066c.d();
            if (task.getResult() != null) {
                q(task.getResult().c());
                return true;
            }
            Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            return true;
        }
        return false;
    }

    static List<Map<String, String>> p(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public Task<Boolean> e() {
        final Task<com.google.firebase.remoteconfig.internal.e> e11 = this.f17066c.e();
        final Task<com.google.firebase.remoteconfig.internal.e> e12 = this.f17067d.e();
        return Tasks.whenAllComplete(e11, e12).continueWithTask(this.f17065b, new Continuation() { // from class: mn.b
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return com.google.firebase.remoteconfig.a.c(com.google.firebase.remoteconfig.a.this, e11, e12, task);
            }
        });
    }

    public Task<Void> f() {
        return this.f17069f.h().onSuccessTask(new SuccessContinuation() { // from class: mn.d
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task l11;
                l11 = com.google.firebase.remoteconfig.a.l((j.a) obj);
                return l11;
            }
        });
    }

    public Task<Boolean> g() {
        return f().onSuccessTask(this.f17065b, new SuccessContinuation() { // from class: mn.c
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return com.google.firebase.remoteconfig.a.b(com.google.firebase.remoteconfig.a.this, (Void) obj);
            }
        });
    }

    public Map<String, g> h() {
        return this.f17070g.d();
    }

    public mn.e i() {
        return this.f17071h.c();
    }

    public void o() {
        this.f17067d.e();
        this.f17068e.e();
        this.f17066c.e();
    }

    void q(JSONArray jSONArray) {
        if (this.f17064a == null) {
            return;
        }
        try {
            this.f17064a.k(p(jSONArray));
        } catch (AbtException e11) {
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e11);
        } catch (JSONException e12) {
            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e12);
        }
    }
}
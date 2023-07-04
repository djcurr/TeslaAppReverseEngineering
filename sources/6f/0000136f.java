package com.adyen.threeds2.internal;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import com.adyen.threeds2.AuthenticationRequestParameters;
import com.adyen.threeds2.ChallengeStatusReceiver;
import com.adyen.threeds2.CompletionEvent;
import com.adyen.threeds2.ProgressDialog;
import com.adyen.threeds2.ProtocolErrorEvent;
import com.adyen.threeds2.RuntimeErrorEvent;
import com.adyen.threeds2.Transaction;
import com.adyen.threeds2.exception.SDKRuntimeException;
import com.adyen.threeds2.internal.ui.activity.ChallengeActivity;
import com.adyen.threeds2.parameters.ChallengeParameters;
import java.lang.ref.WeakReference;
import java.security.cert.X509Certificate;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class i implements Transaction, com.adyen.threeds2.internal.a {

    /* renamed from: a  reason: collision with root package name */
    final List<X509Certificate> f9668a;

    /* renamed from: b  reason: collision with root package name */
    final atd.g0.a f9669b;

    /* renamed from: c  reason: collision with root package name */
    private AuthenticationRequestParameters f9670c;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<Activity> f9671d;

    /* renamed from: e  reason: collision with root package name */
    private ChallengeStatusReceiver f9672e;

    /* renamed from: f  reason: collision with root package name */
    private f f9673f;

    /* renamed from: g  reason: collision with root package name */
    private atd.o0.a f9674g;

    /* loaded from: classes.dex */
    class a implements DialogInterface.OnDismissListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i.this.f9674g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(List<X509Certificate> list, atd.g0.a aVar, AuthenticationRequestParameters authenticationRequestParameters) {
        this.f9668a = list;
        this.f9669b = aVar;
        this.f9670c = authenticationRequestParameters;
    }

    private ChallengeStatusReceiver c() {
        ChallengeStatusReceiver challengeStatusReceiver = this.f9672e;
        if (challengeStatusReceiver != null) {
            return challengeStatusReceiver;
        }
        throw atd.y.c.CHALLENGE_PRESENTATION_FAILURE.a();
    }

    private Activity d() {
        WeakReference<Activity> weakReference = this.f9671d;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private void e() {
        Activity d11 = d();
        if (d11 == null) {
            runtimeError(atd.y.b.ACTIVITY_REFERENCE_MISSING.a());
        } else if (ChallengeActivity.g()) {
        } else {
            d11.startActivity(b(d11));
        }
    }

    Intent b(Activity activity) {
        return ChallengeActivity.b(activity);
    }

    @Override // com.adyen.threeds2.ChallengeStatusReceiver
    public void cancelled() {
        b();
        ChallengeStatusReceiver c11 = c();
        if (c11 != null) {
            c11.cancelled();
        }
    }

    @Override // com.adyen.threeds2.Transaction
    public void close() {
        this.f9669b.c();
        this.f9670c = null;
        this.f9672e = null;
        WeakReference<Activity> weakReference = this.f9671d;
        if (weakReference != null) {
            weakReference.clear();
            this.f9671d = null;
        }
        f fVar = this.f9673f;
        if (fVar != null) {
            fVar.b();
            this.f9673f = null;
        }
        atd.o0.a aVar = this.f9674g;
        if (aVar != null) {
            aVar.hide();
            this.f9674g = null;
        }
    }

    @Override // com.adyen.threeds2.ChallengeStatusReceiver
    public void completed(CompletionEvent completionEvent) {
        b();
        ChallengeStatusReceiver c11 = c();
        if (c11 != null) {
            c11.completed(completionEvent);
        }
    }

    @Override // com.adyen.threeds2.Transaction
    public void doChallenge(Activity activity, ChallengeParameters challengeParameters, ChallengeStatusReceiver challengeStatusReceiver, int i11) {
        atd.r0.f.a(activity, atd.y.a.CURRENT_ACTIVITY);
        atd.y.a aVar = atd.y.a.CHALLENGE_PARAMETERS;
        atd.r0.f.a(challengeParameters, aVar);
        atd.r0.f.b(challengeParameters.getAcsTransactionID(), aVar);
        atd.r0.f.b(challengeParameters.get3DSServerTransactionID(), aVar);
        atd.r0.f.a(challengeStatusReceiver, atd.y.a.CHALLENGE_STATUS_RECEIVER);
        atd.r0.f.a(i11, 5, atd.y.a.TIMEOUT);
        this.f9671d = new WeakReference<>(activity);
        this.f9672e = challengeStatusReceiver;
        atd.g.a a11 = a(challengeParameters.getAcsSignedContent());
        atd.d.b bVar = new atd.d.b(this.f9670c.getMessageVersion(), challengeParameters.get3DSServerTransactionID(), challengeParameters.getAcsTransactionID(), this.f9670c.getSDKTransactionID(), !this.f9670c.getMessageVersion().equals(d.V2_1_0.c()) ? challengeParameters.getThreeDSRequestorAppURL() : null);
        atd.f0.a a12 = a(challengeParameters.getAcsTransactionID(), a11.a());
        f d11 = f.d();
        this.f9673f = d11;
        d11.a(a11.b(), a12, bVar, i11, this);
    }

    @Override // com.adyen.threeds2.Transaction
    public AuthenticationRequestParameters getAuthenticationRequestParameters() {
        return this.f9670c;
    }

    @Override // com.adyen.threeds2.Transaction
    public ProgressDialog getProgressView(Activity activity) {
        atd.r0.f.a(activity, atd.y.a.CURRENT_ACTIVITY);
        if (this.f9674g == null) {
            this.f9674g = new atd.o0.a(activity, new a());
        }
        return this.f9674g;
    }

    @Override // com.adyen.threeds2.ChallengeStatusReceiver
    public void protocolError(ProtocolErrorEvent protocolErrorEvent) {
        b();
        ChallengeStatusReceiver c11 = c();
        if (c11 != null) {
            c11.protocolError(protocolErrorEvent);
        }
    }

    @Override // com.adyen.threeds2.ChallengeStatusReceiver
    public void runtimeError(RuntimeErrorEvent runtimeErrorEvent) {
        b();
        ChallengeStatusReceiver c11 = c();
        if (c11 != null) {
            c11.runtimeError(runtimeErrorEvent);
        }
    }

    @Override // com.adyen.threeds2.ChallengeStatusReceiver
    public void timedout() {
        b();
        ChallengeStatusReceiver c11 = c();
        if (c11 != null) {
            c11.timedout();
        }
    }

    private void b(atd.d.a aVar) {
        Activity d11 = d();
        if (d11 == null) {
            runtimeError(atd.y.b.ACTIVITY_REFERENCE_MISSING.a());
            return;
        }
        atd.o0.a aVar2 = this.f9674g;
        if (aVar2 != null) {
            aVar2.hide();
        }
        d11.startActivity(a(d11, aVar));
    }

    @Override // com.adyen.threeds2.internal.a
    public void a() {
        e();
    }

    @Override // com.adyen.threeds2.internal.a
    public void a(atd.d.a aVar) {
        b(aVar);
    }

    Intent a(Activity activity, atd.d.a aVar) {
        return ChallengeActivity.a(activity, aVar);
    }

    Intent a(Activity activity) {
        return ChallengeActivity.a(activity);
    }

    private atd.g.a a(String str) {
        try {
            atd.h0.d a11 = atd.h0.d.a(str);
            a11.a(this.f9668a);
            return new atd.g.a(a11.a().d());
        } catch (SDKRuntimeException | JSONException e11) {
            throw atd.y.a.CHALLENGE_PARAMETERS.a(e11);
        }
    }

    private void b() {
        Activity d11 = d();
        if (d11 == null) {
            return;
        }
        d11.startActivity(a(d11));
    }

    private atd.f0.a a(String str, atd.g0.b bVar) {
        if (bVar instanceof atd.g0.a) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(atd.s0.a.a(-103000569604672L), str);
                atd.f0.f fVar = new atd.f0.f(atd.d0.g.f6844a, atd.c0.c.f6781a, jSONObject);
                atd.g0.e eVar = new atd.g0.e(null, this.f9669b.a(null, null, this.f9670c.getSDKReferenceNumber(), ((atd.g0.a) bVar).f()));
                this.f9669b.c();
                try {
                    return new atd.f0.a(fVar, fVar.f().a(fVar, eVar), eVar);
                } catch (JSONException e11) {
                    throw atd.y.c.CRYPTO_FAILURE.a(e11);
                }
            } catch (JSONException e12) {
                throw atd.y.c.CRYPTO_FAILURE.a(e12);
            }
        }
        throw atd.y.c.CRYPTO_FAILURE.a();
    }
}
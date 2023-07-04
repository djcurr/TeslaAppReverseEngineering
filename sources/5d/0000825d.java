package l5;

import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private d5.i f36610a;

    /* renamed from: b  reason: collision with root package name */
    private String f36611b;

    /* renamed from: c  reason: collision with root package name */
    private WorkerParameters.a f36612c;

    public h(d5.i iVar, String str, WorkerParameters.a aVar) {
        this.f36610a = iVar;
        this.f36611b = str;
        this.f36612c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f36610a.t().k(this.f36611b, this.f36612c);
    }
}
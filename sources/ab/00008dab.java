package o30;

import android.os.AsyncTask;
import numan.dev.videocompressor.VideoController;
import o30.i;

/* loaded from: classes5.dex */
public class h extends AsyncTask<Object, Float, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private String f42251a = "";

    /* renamed from: b  reason: collision with root package name */
    private i.a f42252b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements p30.a {
        a() {
        }

        @Override // p30.a
        public void a(float f11) {
            h.this.publishProgress(Float.valueOf(f11));
        }
    }

    public h(i.a aVar) {
        this.f42252b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b */
    public Boolean doInBackground(Object... objArr) {
        try {
            return Boolean.valueOf(VideoController.c().a((String) objArr[0], (String) objArr[1], ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue(), ((Integer) objArr[4]).intValue(), new a()));
        } catch (Throwable th2) {
            this.f42251a = th2.getClass().toString();
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: c */
    public void onPostExecute(Boolean bool) {
        super.onPostExecute(bool);
        if (this.f42252b != null) {
            if (bool.booleanValue()) {
                this.f42252b.b(true);
                return;
            }
            this.f42252b.c(this.f42251a);
            this.f42251a = "";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: d */
    public void onProgressUpdate(Float... fArr) {
        super.onProgressUpdate(fArr);
        i.a aVar = this.f42252b;
        if (aVar != null) {
            aVar.a(fArr[0].floatValue());
        }
    }

    @Override // android.os.AsyncTask
    protected void onCancelled() {
        super.onCancelled();
        this.f42252b.c("");
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        super.onPreExecute();
        i.a aVar = this.f42252b;
        if (aVar != null) {
            aVar.onStart();
        }
    }
}
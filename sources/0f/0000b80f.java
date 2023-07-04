package up;

import android.graphics.Paint;
import com.henninghall.date_picker.j;
import java.util.ArrayList;
import java.util.Calendar;

/* loaded from: classes2.dex */
public class d extends g {

    /* renamed from: f  reason: collision with root package name */
    private final com.henninghall.date_picker.e f53649f;

    public d(com.henninghall.date_picker.pickers.a aVar, j jVar) {
        super(aVar, jVar);
        this.f53649f = new com.henninghall.date_picker.e(this.f53650a);
    }

    @Override // up.g
    public String e() {
        return this.f53650a.f17498p.i() ? "h" : "HH";
    }

    @Override // up.g
    public Paint.Align l() {
        return Paint.Align.RIGHT;
    }

    @Override // up.g
    public ArrayList<String> o() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, 0, 0, 0, 0, 0);
        ArrayList<String> arrayList = new ArrayList<>();
        int i11 = this.f53650a.f17498p.i() ? 12 : 24;
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(this.f53654e.format(calendar.getTime()));
            calendar.add(11, 1);
        }
        return arrayList;
    }

    @Override // up.g
    public String t(String str) {
        return this.f53649f.b(str);
    }

    @Override // up.g
    public boolean v() {
        return this.f53650a.z() != qp.b.date;
    }

    @Override // up.g
    public boolean w() {
        return true;
    }
}
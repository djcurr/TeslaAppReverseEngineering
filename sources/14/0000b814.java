package up;

import android.graphics.Paint;
import com.henninghall.date_picker.j;
import java.util.ArrayList;
import java.util.Calendar;

/* loaded from: classes2.dex */
public class h extends g {

    /* renamed from: f  reason: collision with root package name */
    private int f53656f;

    /* renamed from: g  reason: collision with root package name */
    private int f53657g;

    public h(com.henninghall.date_picker.pickers.a aVar, j jVar) {
        super(aVar, jVar);
        this.f53656f = 1900;
        this.f53657g = 2100;
    }

    private int x() {
        if (this.f53650a.w() == null) {
            return this.f53657g;
        }
        return this.f53650a.w().get(1);
    }

    private int y() {
        if (this.f53650a.x() == null) {
            return this.f53656f;
        }
        return this.f53650a.x().get(1);
    }

    @Override // up.g
    public String e() {
        return com.henninghall.date_picker.f.h(this.f53650a.v());
    }

    @Override // up.g
    public Paint.Align l() {
        return Paint.Align.RIGHT;
    }

    @Override // up.g
    public ArrayList<String> o() {
        ArrayList<String> arrayList = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        int y11 = y();
        int x11 = x() - y11;
        calendar.set(1, y11);
        for (int i11 = 0; i11 <= x11; i11++) {
            arrayList.add(i(calendar));
            calendar.add(1, 1);
        }
        return arrayList;
    }

    @Override // up.g
    public boolean v() {
        return this.f53650a.z() == qp.b.date;
    }

    @Override // up.g
    public boolean w() {
        return false;
    }
}